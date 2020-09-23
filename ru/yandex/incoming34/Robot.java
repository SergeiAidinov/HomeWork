package ru.yandex.incoming34;

public class Robot implements RaceParticipant {

	private final String NAME;

	public String getName() {
		return NAME;
	}

	private final int MAX_LENGTH;
	private final int MAX_HEIGTH;
	private boolean participates = true;

	public Robot(String nAME, int mAX_LENGTH, int mAX_HEIGTH) {
		super();
		NAME = nAME;
		MAX_LENGTH = mAX_LENGTH;
		MAX_HEIGTH = mAX_HEIGTH;
	}

	public void run(int length) {
		if (length <= MAX_LENGTH) {
			System.out.println(
					this.getClass().getSimpleName() + " " + NAME + " пробежал дорожку длиной " + length + " метров.");
		} else {
			System.out.println(this.getClass().getSimpleName() + " " + NAME + " не смог пробежать дорожку длиной "
					+ length + " метров и выбывает из гонки.");
			participates = false;
		}

	}

	public void jump(int higth) {
		if (higth <= MAX_HEIGTH) {
			System.out.println(this.getClass().getSimpleName() + " " + NAME + " перепрыгнул через препятствие высотой "
					+ higth + " метров.");
		} else {
			System.out.println(this.getClass().getSimpleName() + " " + NAME
					+ " не смог перепрыгнуть через препятствие высотой " + higth + " метров и выбывает из гонки.");
			participates = false;
		}

	}

	public boolean doesParticipate() {
		return participates;
	}

	@Override
	public void handleObstacle(ObstacleInfo obstacleInfo) {
		String str = (String) obstacleInfo.getType();
		int currentSize = obstacleInfo.getSize();

		switch (str) {
		case "Track":
			run(currentSize);
			break;
		case "Wall":
			jump(currentSize);
			break;

		default:
			break;
		}

	}

}
