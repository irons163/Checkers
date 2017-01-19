package com.example.try_checkers;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

public interface IGameModel {
	public void moveChess(ChessPoint chessPoint);
	public void setChessBorad(IChessBoard chessBoard);
	public IChessBoard getChessBorad();
	public int[][] getAllExistPoints();
	public void drawChessboardLines(Canvas canvas, Paint paint);
	public void drawAllExistPoints(Canvas canvas);
	public void drawPlayerPocessableMovePoints(Canvas canvas);
	public void registerObserver(IMoveObserver moveObserver);
	public void removeObserver(IMoveObserver moveObserver);
	public void onTouchEvent(MotionEvent event);
}
