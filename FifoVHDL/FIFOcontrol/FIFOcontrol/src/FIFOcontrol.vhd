library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.STD_LOGIC_UNSIGNED.all;

entity FIFOcontrol is
	port (POP,PUSH,EMPTY,FULL: in std_logic;
	      CE_WR, CE_RD: out std_logic);
end FIFOcontrol; 

architecture arhi of FIFOcontrol is 
begin
	process(POP,PUSH,EMPTY,FULL)
	begin
		CE_WR<=PUSH and not(FULL);
		CE_RD<=POP and not(PUSH) and not(EMPTY);
	end process;
end arhi;