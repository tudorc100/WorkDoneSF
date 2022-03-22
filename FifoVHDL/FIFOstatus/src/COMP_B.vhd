library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.STD_LOGIC_UNSIGNED.all;

entity COMP_B is
	port (CE_RD,CE_WR,CLK: in std_logic;
	Q: in std_logic_vector(3 downto 0);
	      B_OUT: out std_logic);
end COMP_B; 

architecture arhicb of COMP_B is 
signal aux:std_logic_vector(3 downto 0);
begin
	process(CE_WR,CE_RD,CLK)
	begin
		
	end process;
end arhi;