package ru.yandex.incoming34;

public class Race {
	RaceParticipant[] fullListofParticipants = {

			(RaceParticipant) new Robot("R2-D2", 20, 1), (RaceParticipant) new Robot("C-3PO", 30, 2),
			(RaceParticipant) new Robot("HK-47", 50, 7), (RaceParticipant) new Cat("Барсик", 40, 1),
			(RaceParticipant) new Cat("Мурка", 35, 2), (RaceParticipant) new Human("Джеймс Гослинг", 100, 2),
			(RaceParticipant) new Human("Никлаус Вирт", 30, 1), (RaceParticipant) new Human("Алан Тьюринг", 80, 3) };

	Obstacle[] fullListOfObstacles = { (Obstacle) new Wall(1), (Obstacle) new Track(10), (Obstacle) new Wall(2),
			(Obstacle) new Track(35), (Obstacle) new Wall(4)

	};

	public void doRace() {
		for (int obs = 0; obs < fullListOfObstacles.length; obs++) {
			Obstacle obstacle = fullListOfObstacles[obs];
			ObstacleInfo obstacleInfo = obstacle.getObstacle();
			System.out.println();
			System.out.println(
					"Штурмуем препятсвие " + obstacleInfo.getType() + " " + obstacleInfo.getSize() + " метров.");
			for (int part = 0; part < fullListofParticipants.length; part++) {
				RaceParticipant raceParticipant = fullListofParticipants[part];
				if (!raceParticipant.doesParticipate()) {
					System.out.println(raceParticipant.getClass().getSimpleName() + " " + raceParticipant.getName()
							+ " ранее выбыл из гонки.");
					continue;
				} else {
					raceParticipant.handleObstacle(obstacleInfo);
				}
			}
		}
	}
	
	public void showWinners(){
		boolean noWinners = true;
		System.out.println();
		System.out.println("Результаты забега:");
		for (int i = 0; i < fullListofParticipants.length; i++) {
			if (fullListofParticipants[i].doesParticipate()) {
				System.out.println(fullListofParticipants[i].getClass().getSimpleName() + " " + fullListofParticipants[i].getName() + " преодолел все препятствия!");
				noWinners = false;
			}
		}
		
		if (noWinners) {
			System.out.println("Никто из участников гонки не сумел преодолеть все препятсвия.");
		}
		
	}

}
