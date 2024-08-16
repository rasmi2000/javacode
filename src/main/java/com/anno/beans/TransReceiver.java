package com.anno.beans;

public class TransReceiver {
	private int frequency; 
	public void tune() {
		System.out.println("tunning to frequency: "+ frequency);
	}
	public void setFrequency(int freqnency) {
		this.frequency=frequency;
	}
}
