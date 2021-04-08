package model;

public class Snake {

	private int startPoint;
	private int endPoint;
	public Snake(int start,int end)
	{
		this.startPoint = start;
		this.endPoint = end;
	}
	public int getStart()
	{
		return startPoint;
	}
	public int getendPoint()
	{
		return endPoint;
	}
	
}
