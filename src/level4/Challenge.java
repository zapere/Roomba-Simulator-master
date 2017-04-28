package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(500,500);
	}

	public void loop() {
		if(isBumpedLeft()){
			
		}
		if(isBumpedRight()){
			driveDirect(50,100);
		}
		if(isBumpedLeft()&&isBumpedRight()){
			driveDirect(-100,-100);
			sleep(700);
			driveDirect(50,100);
		}
	}
}
