package ru.yandex.incoming34;

public final class Track implements Obstacle {
	private final int LENGTH;

	public Track(int lENGTH) {
		super();
		LENGTH = lENGTH;
	}

	@Override
	public ObstacleInfo getObstacle() {
		ObstacleInfo obstacleInfo = new ObstacleInfo(this.getClass().getSimpleName(), LENGTH);
		//System.out.println("Track: " + this.getClass().getSimpleName());
		return obstacleInfo;
	}

}
