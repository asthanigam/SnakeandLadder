package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SnakeAndLadder {
	private List<Snake> snakes;
	private List<Ladder> ladders;
	private int size;
	public SnakeAndLadder(int size)
	{
		this.size = size;
		this.ladders = new ArrayList<Ladder>();
		this.snakes = new ArrayList<Snake>();
	}
	public int getSize()
	{
		return size;
	}
	public List<Snake> getSnakes()
	{
		return snakes;
	}
	public void setSnakes(List<Snake> snakes)
	{
		this.snakes = snakes;
	}
	public List<Ladder> getLadders()
	{
		return ladders;
	}
	public void setLadders(List<Ladder> ladders)
	{
		this.ladders = ladders;
	}
}
