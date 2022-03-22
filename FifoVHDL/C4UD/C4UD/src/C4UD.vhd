-------------------------------------------------------------------------------
--
-- Title       : C4UD
-- Design      : C4UD
-- Author      : tudorcampan@gmail.com
-- Company     : Sistemul Lamborghini SRL
--
-------------------------------------------------------------------------------
--
-- File        : D:\Proiect\C4UD\C4UD\src\C4UD.vhd
-- Generated   : Fri May 22 21:06:13 2020
-- From        : interface description file
-- By          : Itf2Vhdl ver. 1.22
--
-------------------------------------------------------------------------------
--
-- Description : 
--
-------------------------------------------------------------------------------

--{{ Section below this comment is automatically maintained
--   and may be overwritten
--{entity {C4UD} architecture {C4UD}}



library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.STD_LOGIC_UNSIGNED.all; 

entity C4UD is
	port(CE_WR,CE_RD,CLK: in std_logic;
	Q: out std_logic_vector(3 downto 0));
end C4UD;

architecture ARHC4UD of C4UD is
signal aux:std_logic_vector(3 downto 0):= (others => '0');

begin 
	process(CE_WR,CE_RD,CLK)
	begin
		if rising_edge(CLK) then
			if CE_WR='1' and CE_RD='0' then aux<=aux+1;
			     elsif CE_WR='0' and CE_RD='1' then aux<=aux+1;
			end if;
		end if;
    end process;
	Q<=aux;
end ARHC4UD;
