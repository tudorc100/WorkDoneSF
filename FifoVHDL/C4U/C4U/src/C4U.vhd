 library IEEE;																																					 																											   library IEEE;
use IEEE.STD_LOGIC_1164.all; 
use IEEE.STD_LOGIC_UNSIGNED.all;   

entity C4U is
	port( CE_WR,CLK: in std_logic;
	AW: out std_logic_vector(3 downto 0));
end C4U;  

architecture arhi of C4U is	
signal aux:std_logic_vector(3 downto 0);
begin
	process(CLK,CE_WR)
	begin
		if CLK='1' and CLK'EVENT and CE_WR='1' then aux<=aux+1; 		
	   end if;
	end process;
	aw<=aux;
end arhi;
