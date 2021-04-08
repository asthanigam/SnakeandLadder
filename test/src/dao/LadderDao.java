package dao;


import java.util.HashMap;

import model.Ladder;

public class LadderDao {
	private static HashMap<Integer,Ladder> ladders = new HashMap<Integer,Ladder>();
	private static int index = 0;
	public void saveLadder(Ladder ladder) {
		ladders.put(index++,ladder);
	}
}
