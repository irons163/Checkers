package com.example.try_checkers;

import android.graphics.Canvas;
import android.view.MotionEvent;

public interface IGameController {
	public void moveChess(ChessPoint chessPoint);
	public void start();
	public void stop();
	public void showWin();
	public void showLose();
	public void drawChessboardLines(Canvas canvas);
	public void drawAllExistPoints(Canvas canvas);
	public void drawPlayerPocessableMovePoints(Canvas canvas);
	public void onTouchEvent(MotionEvent event);
}
