package ru.yandex.incoming34;

public final class Wall implements Obstacle {
	private final int HEIGHT;

	public Wall(int hEIGHT) {
		super();
		HEIGHT = hEIGHT;
	}

	@Override
	public ObstacleInfo getObstacle() {
		ObstacleInfo obstacleInfo = new ObstacleInfo(this.getClass().getSimpleName(), HEIGHT);
		//System.out.println("Track: " + this.getClass().getSimpleName());
		return obstacleInfo;
	}

}
