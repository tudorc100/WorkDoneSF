library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;
use IEEE.STD_LOGIC_ARITH.ALL; 

entity AND2 is
port (A,B: in STD_LOGIC;
      C: out STD_LOGIC);
end AND2; 

architecture behe of AND2 is
begin
  C <= A AND B;
end behe;