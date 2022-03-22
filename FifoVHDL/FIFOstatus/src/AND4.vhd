library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_ARITH.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

entity AND4 is
port (A,B,C,D: in STD_LOGIC;
      F: out STD_LOGIC);
end AND4; 

architecture besos of AND4 is
begin
  F <= (A AND B AND C AND D);
end besos;