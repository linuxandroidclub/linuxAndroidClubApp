package ca.on.senecac.linux.ttc;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Prediction implements Serializable, Comparable<Prediction>{
	
	private int minutes;
	private int seconds;

	
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	@Override
	public int compareTo(Prediction o) {
		// TODO Auto-generated method stub
		return this.seconds - o.seconds;
	}
	
	

}
