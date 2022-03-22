library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity M2_1X4 is
    Port ( PUSH : in  STD_LOGIC;
           D1   : in  STD_LOGIC_VECTOR (3 downto 0);
           D0   : in  STD_LOGIC_VECTOR (3 downto 0);
           A   : out STD_LOGIC_VECTOR (3 downto 0));
end M2_1X4;

architecture arhimux of M2_1X4 is
begin
	process(PUSH,D1,D0)
	begin
	if PUSH = '1'then
    A <= D1; 
	elsif PUSH = '0' then
		A <= D0;
	end if;
	end process;
end arhimux;
