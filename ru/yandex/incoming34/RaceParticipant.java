package ru.yandex.incoming34;

public interface RaceParticipant {
	
	void handleObstacle(ObstacleInfo obstacleInfo);
	boolean doesParticipate();
	String getName();

}
