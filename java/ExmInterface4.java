package com.ust.examples;

abstract interface MusicPlayer{
	public static final int defaultVolume=30;
	
	public abstract void play(String s);
	public abstract void stop(String s);
	
}


class VLCplayer implements MusicPlayer{
	
	
	

	public void play(String s) {
		
		
		if(s =="melody" || (s =="dance")) {
			if(defaultVolume == 30) {
				
				System.out.println("appro sound");
			}
			
			System.out.println("play");
		}
		else {
			System.out.println("stop");
		}
		

	}

	public void stop(String s) {
		
		if(s =="jazz") {
		System.out.println("stop");
		}
		else {
			System.out.println("play");
		}
	}
	
	
}
public class ExmInterface4 {

	public static void main(String[] args) {
		
		VLCplayer v1=new VLCplayer();
		v1.play("melody");
		v1.stop("jazz");

	}

}
