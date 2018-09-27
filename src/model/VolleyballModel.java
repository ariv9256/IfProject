package model;

public class VolleyballModel
{

	private int scoreBoard;
	private boolean inBounds;
	private int addPoint;
	private String playerName;
	
	public VolleyballModel()
	{
		//Default constructor 
	}
	public VolleyballModel (int scoreBoard, boolean inBounds, int addPoint, String playerName)
	{
		this.scoreBoard = scoreBoard;
		this.inBounds = inBounds;
		this.addPoint = addPoint;
		this.playerName = playerName;
	}
	public int getScoreBoard()
	{
		return scoreBoard;
	}
	public boolean getInBounds()
	{
		return inBounds;
	}
	public int getAddPoint()
	{
		return addPoint;
	}
	public String getPlayerName()
	{
		return playerName;
	}
	public void setScoreBoard(int scoreBoard)
	{
		this.scoreBoard = scoreBoard;
	}
	public void setInBounds(boolean inBounds)
	{
		this.inBounds = inBounds;
	}
	public void setAddPoint(int addPoint)
	{
		this.addPoint = addPoint;
	}
	public void setPlayerName(String playerName)
	{
		this.playerName = playerName;
	}
}
