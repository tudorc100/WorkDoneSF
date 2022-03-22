library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.STD_LOGIC_UNSIGNED.all;
entity STATUS is
	port(CE_WR,CE_RD: in std_logic;
	CLK: in std_logic;
	EMPTY,LAST,FULL: out std_logic);
end STATUS;
architecture arhistat of FIFOstatus is
signal Q: std_logic_vector(3 downto 0);

component C4UD is
	port(CE_WR,CE_RD,CLK: in std_logic;
	Q: out std_logic_vector(3 downto 0));
end component;

component D_FF is
	PORT( D,CLOCK: in std_logic;
Q: out std_logic);
end component;


begin 
	Counter: C4UD port map (CE_WR=>CE_WR, CE_RD=>CE_RD, CLK=>CLK, Q=>Q);
	process(CLK,CE_WR,CE_RD,Q)
	variable A,C,AUX1,AUX2,AUX3,AUX4,AUX5,AUX6,AUX7: std_logic; 
	variable B,AUX_EMPTY: std_logic:='1';
	variable E,D,AUX_LAST,AUX_FULL:std_logic:='0';
	begin
		A:=(Q(0) and not(Q(2)) and not(Q(3)) and not(Q(3)));
		C:=(Q(1) and Q(2) and Q(3));
		AUX1:=(CE_RD and A); 
		AUX2:=(AUX1 or AUX_EMPTY);
		B:=(AUX2 and not(CE_WR));
		AUX3:=(CE_WR and AUX_LAST);
		AUX4:=(AUX3 or AUX_FULL);
		E:=(AUX4 and not(CE_RD));	  
		AUX5:=(AUX_LAST and not(CE_WR) and not(CE_RD));
		AUX6:=(C and CE_WR);
		AUX7:=(not(C) and AUX_LAST and CE_RD);  
		D:=(AUX5 or AUX6 or AUX7);
		if CLK'EVENT and CLK='1' then
				 AUX_EMPTY:=B;
				 AUX_LAST:=D;
				 AUX_FULL:=E;
		end if;	   
		EMPTY<=AUX_EMPTY;
		LAST<=AUX_LAST;  
		FULL<=AUX_FULL;
		end process;	
end arhistat;
