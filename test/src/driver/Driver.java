package driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;
import service.*;
import service.SnakeService;

public class Driver {
	   
public static void main(String[] args)
{
	
    SnakeService snakeService = new SnakeService();
    LadderService ladderService = new LadderService();
    PlayerService playerService = new PlayerService();
	Scanner ob = new Scanner(System.in);
	System.out.println("Enter no.of snakes");
	int noOfSnakes = ob.nextInt();
	List<Snake> snakes = new ArrayList<Snake>();
	for(int i = 0;i< noOfSnakes;i++)
	{	
		Snake obj = new Snake(ob.nextInt(), ob.nextInt());
		snakeService.saveSnakes(obj);
	}
	System.out.println("Enter no.of ladders");
	int noOfLadders = ob.nextInt();
	List<Ladder> ladders = new ArrayList<Ladder>();
	for(int i = 0;i< noOfLadders;i++)
	{	
		Ladder ladderOb = new Ladder(ob.nextInt(), ob.nextInt());
		ladderService.saveLadder(ladderOb);
	}
	System.out.println("Enter no.of players");
	int noOfPlayers = ob.nextInt();;
    for (int i = 0; i < noOfPlayers; i++) {
        Player playerobj = new Player(ob.next());
        playerService.savePlayer(playerobj);
    }
    LadderAndSnakeService snakeAndLadderService = new LadderAndSnakeService(100);
    snakeAndLadderService.startGame();
	
}
}