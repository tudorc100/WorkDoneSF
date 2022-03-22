library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity OR2 is
    Port ( A : in  STD_LOGIC;   
           B : in  STD_LOGIC;    
           C : out  STD_LOGIC);  
end OR2;

architecture messi of OR2 is
begin
C <= A or B;
end messi;