package service;

import java.util.List;


import model.*;
public class LadderAndSnakeService {
	private SnakeAndLadder snakeAndLadder;
	private int initiialNumberOfPlayers;
	private List<Player> players;
	private static final int DEFAULT_BOARD_SIZE = 100;
	private PlayerService playerService  = new PlayerService();
	
	
	public LadderAndSnakeService(int size)
	{
		this.snakeAndLadder = new SnakeAndLadder(size);
		this.players = playerService.getAllPlayers();
		this.initiialNumberOfPlayers = players.size();
	}
	public LadderAndSnakeService() {
        this(LadderAndSnakeService.DEFAULT_BOARD_SIZE);
    }
	
	private boolean isGameCompleted()
	{
		return players.size() < initiialNumberOfPlayers;
	}
	
	public void startGame()
	{
		while(!isGameCompleted())
		{
			int totalDiceValue = getTotalValueAfterDiceRolls();
			Player currentPlayer = players.remove(0);
			movePlayer(currentPlayer, totalDiceValue);
			if (hasPlayerWon(currentPlayer))
			{
				System.out.println(currentPlayer.getName() + "wins the game");
				players.remove(0);
			}
		}
	
	}
	private int getTotalValueAfterDiceRolls()
	{
		return DiceService.rollDice();
	}
	private boolean hasPlayerWon(Player player)
	{
		int playerPosition = player.getInitialPosition();
		return playerPosition == 100;
	}
	private void movePlayer(Player player, int diceValue)
	{
		int oldPosition = player.getInitialPosition();
		int newPosition = oldPosition + diceValue;
		int boardSize = 100;
		if (newPosition > boardSize)
		{
			newPosition = oldPosition;
		}
		else
		{
			newPosition = getNewPositionAfterSnakesandLadders(newPosition);
		}
		player.setInitialPosition(newPosition);
		players.add(player);
		System.out.println(player.getName() + "rolled dice " + diceValue + "and moved from" + oldPosition +" to " + newPosition);
	}
	private int getNewPositionAfterSnakesandLadders(int position)
	{
		int previousPosition = position;
		do
		{
			previousPosition = position;
			for(Snake snake: snakeAndLadder.getSnakes())
			{
				if(snake.getStart()== previousPosition)
				{
					position = snake.getendPoint();
				}
			}
			for(Ladder ladder: snakeAndLadder.getLadders())
			{
				if(ladder.getStart() == previousPosition)
				{
					position = ladder.endPoint();
				}
			}
		}while(position != previousPosition);
			return position;	
	}
	
	
}
