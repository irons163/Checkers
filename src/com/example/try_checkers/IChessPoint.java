package com.example.try_checkers;

import android.graphics.Bitmap;
import android.graphics.Point;

public abstract class IChessPoint extends Point{
	abstract Bitmap getChessPointBitmap();
	abstract void setChessPointBitmap(Bitmap ChessPointBimap);
}
