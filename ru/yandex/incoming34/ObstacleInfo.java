package ru.yandex.incoming34;

public class ObstacleInfo {
	private final String type;
	private final int size;
	public ObstacleInfo(String type, int size) {
		this.type = type;
		this.size = size;
	}

	

	public Object getType() {
		return type;
	}

	public int getSize() {
		return size;
	}

}
