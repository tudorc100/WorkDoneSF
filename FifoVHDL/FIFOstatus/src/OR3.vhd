library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity OR3 is
    Port ( A : in  STD_LOGIC;   
		   B : in  STD_LOGIC;
           C : in  STD_LOGIC;
		    D : out  STD_LOGIC);
end OR3;

architecture ronaldo of OR3 is
begin
D <= A or B or C;
end ronaldo;