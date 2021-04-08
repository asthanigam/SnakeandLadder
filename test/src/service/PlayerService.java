package service;

import java.util.List;

import dao.PlayerDao;
import model.Player;

public class PlayerService {
	private PlayerDao playerDao = new PlayerDao();
	public void savePlayer(Player playerobj) {
		playerDao.savePlayer(playerobj);
	}
	public List<Player> getAllPlayers()
	{
		return playerDao.getAllPlayers();
	}

}
