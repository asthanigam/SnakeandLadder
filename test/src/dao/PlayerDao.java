package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Player;

public class PlayerDao {
	private static HashMap<Integer,Player> players = new HashMap<Integer,Player>();
	private static int index = 0;
	public void savePlayer(Player playerobj) {
		players.put(index++, playerobj);
	}
	public List<Player> getAllPlayers() {
		return  new ArrayList<Player>(players.values());
	}

}
