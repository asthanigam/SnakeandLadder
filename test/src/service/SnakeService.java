package service;


import dao.SnakeDao;
import model.Snake;
public class SnakeService {
	private SnakeDao snakeDao = new SnakeDao();

	public void saveSnakes(Snake obj) {
		snakeDao.saveSnakes(obj);
	}

}
