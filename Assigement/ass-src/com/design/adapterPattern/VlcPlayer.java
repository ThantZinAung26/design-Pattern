package com.design.adapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer{
	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Play Vlc file "+fileName);
	}
	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		
	}
}
