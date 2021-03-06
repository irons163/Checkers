package com.example.try_checkers;

import java.util.List;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public interface IChessBoard {
	public void createLines();
	public void createPoints();
	public Point newPoint(Float x, Float y);
	public int[][] getAllExistPoints();
	public void setAllExistPoints(int[][] allExistPoints);
	public void drawChessboardLines(Canvas canvas, Paint paint);
	public void drawAllExistPoints(Canvas canvas);
	public void drawPlayerPocessableMovePoints(Canvas canvas);
	public int getLineDistance();
	public void setPlayersBySquential(List<IPlayer> playersBySquential);
}
