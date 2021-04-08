package service;
import dao.LadderDao;
import model.Ladder;

public class LadderService {
	private LadderDao ladderDao = new LadderDao();

	public void saveLadder(Ladder ladders) {
		ladderDao.saveLadder(ladders);
	}
}
