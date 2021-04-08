package model;

import java.util.UUID;

public class Player {
	private String id;
	private String name;
	private int initialPosition;
	public Player(String name )
	{
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.setInitialPosition(0);
	}
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
	public int getInitialPosition() {
		return initialPosition;
	}
	public void setInitialPosition(int initialPosition) {
		this.initialPosition = initialPosition;
	}
}
