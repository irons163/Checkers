package com.example.try_checkers;

public interface IChessPointFactory {
	IChessPoint createChessPointRed();
	IChessPoint createChessPointYellow();
	IChessPoint createChessPointWhite();
	
	IChessPoint createChessPointRamdon(int resource);
}
