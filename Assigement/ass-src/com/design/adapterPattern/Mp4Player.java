package com.design.adapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Play Mp4 file "+fileName);
	}

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
