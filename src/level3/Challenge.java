package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveFoward(1);
	turn90Degrees(1);
	driveFoward(1);
	turn90Degrees(3.25f);
	driveFoward(1);
	turn90Degrees(1);
	driveFoward(1);
	turn90Degrees(3.25f);
	driveFoward(1);
	}
	public void driveFoward(float distance) {
		driveDirect(500, 500);
		int sleepTime = (int) (2500 * distance);
		sleep(sleepTime);
		driveDirect(0, 0);
		System.out.println("" + sleepTime);
	}

	public void turn90Degrees(float amount) {
		driveDirect(-100, 100);
		int turns = (int) (1200 * amount);
		sleep(turns);
		driveDirect(0,0);
	}

	public void loop() {
	
	}
}
