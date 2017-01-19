package com.example.try_checkers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

public class GameModel implements IGameModel{
	private Context context;
	private IChessBoard chessBoard;
	private IPlayerManager playerManager;
	private IChessPointManager chessPointManager;
	private int[][] allExistPoints;
	
	public GameModel(Context context) {
		// TODO Auto-generated constructor stub
		this.context = context;

		initChessBoard();
		initChessPointManager();
		initPlayerManager();
		
		chessBoard.setPlayersBySquential(playerManager.getPlayersBySquential());
	}
	
	private void initChessBoard(){
		chessBoard = new ChessBoard(CommonUtil.screenWidth, CommonUtil.screenHeight);
		chessBoard.createLines();
		chessBoard.createPoints();
		allExistPoints = chessBoard.getAllExistPoints();
	}
	
	private void initChessPointManager(){
		chessPointManager = new ChessPointManager(context, chessBoard.getLineDistance(), chessBoard.getLineDistance());
	}
	
	private void initPlayerManager(){
		playerManager = new PlayerManager(chessBoard, chessPointManager);
		Logic logic = new Logic(allExistPoints);
		playerManager.setLogic(logic);
//		playerManager.setPlayersBySquential(players);
//		playerManager.setBoard(jumpChessBoard);
	}
	

	
	@Override
	public void moveChess(ChessPoint chessPoint) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerObserver(IMoveObserver moveObserver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(IMoveObserver moveObserver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setChessBorad(IChessBoard chessBoard) {
		// TODO Auto-generated method stub
		this.chessBoard = chessBoard;
	}

	@Override
	public IChessBoard getChessBorad() {
		// TODO Auto-generated method stub
		return chessBoard;
	}

	@Override
	public int[][] getAllExistPoints() {
		// TODO Auto-generated method stub
		return allExistPoints;
	}

	@Override
	public void drawChessboardLines(Canvas canvas, Paint paint) {
		// TODO Auto-generated method stub
		
		chessBoard.drawChessboardLines(canvas, paint);
		

	}

	@Override
	public void drawAllExistPoints(Canvas canvas) {
		// TODO Auto-generated method stub
		chessBoard.drawAllExistPoints(canvas);
	}
	
	@Override
	public void drawPlayerPocessableMovePoints(Canvas canvas) {
		chessBoard.drawPlayerPocessableMovePoints(canvas);
	}

	@Override
	public void onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
			playerManager.onTouchEvent(event);
	}

}
