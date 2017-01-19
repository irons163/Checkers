package com.example.try_checkers;

public interface IPlayerFactory {
	IPlayer createHumanPlayerWithRed();
	IPlayer createHumanPlayerWithYellow();
	IPlayer createAIPlayer();
	
	IPlayer createAIPlayerRamdon();
}
