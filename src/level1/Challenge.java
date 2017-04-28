package level1;

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	/**
	 * Without touching the wall reach the endZone
	 */
	public void initialize() {
		// driveDirect(1000, 1000);
		// sleep(1000);
		// driveDirect(-100, 100);
		// sleep(1800);
		// driveDirect(1000, 1000);
		// sleep(4000);
		// driveDirect(-1000, 1000);
		// sleep(175);
		// driveDirect(1000, 1000);
		driveFoward(1);
		turn90Degrees(1);
		driveFoward(3.5f);
		turn90Degrees(1);
	driveFoward(1.75f);
	}

	public void driveFoward(float distance) {
		driveDirect(500, 500);
		int sleepTime = (int) (2500 * distance);
		sleep(sleepTime);
		driveDirect(0, 0);
		System.out.println("" + sleepTime);
	}

	public void turn90Degrees(int amount) {
		driveDirect(-100, 100);
		int turns = 1850 * amount;
		sleep(turns);
		driveDirect(0,0);
	}

	public void loop() {

	}
}
