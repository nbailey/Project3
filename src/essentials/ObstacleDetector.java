package essentials;

import lejos.nxt.*;
import java.awt.*;

public class ObstacleDetector {
	
	private TouchSensor leftBumper;
	private TouchSensor rightBumper;
	private UltrasonicSensor sensor;
	
	private Point[] obstacleLocations;
	
	public boolean waitForRightPress() {
		return false;
	}
	
	public boolean waitForLeftPress() {
		return false;
	}
	
	public void findObstacles() {
		
	}
	
	public Point[] getObstacleLocations() {
		return obstacleLocations;
	}

}
