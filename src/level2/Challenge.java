package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveFoward(1.5f);
		turn90Degrees(0.85f);
		driveFoward(2);
		turn90Degrees(2.5f);
		driveFoward(4);
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
		int turns = (int) (1900 * amount);
		sleep(turns);
		driveDirect(0,0);
	}


	public void loop() {
	
	}
}
