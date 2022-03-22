library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_ARITH.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

entity AND3 is
port (A,B,C: in STD_LOGIC;
      F: out STD_LOGIC);
end AND3; 

architecture behe of AND3 is
begin
  F <= (A AND B AND C);
end behe;