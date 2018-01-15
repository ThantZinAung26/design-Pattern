package com.design.adapterPattern;

public class AudioPlayer implements MediaPlayer {
	
	MediaAdapter mediaAdapter;
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4") ) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);;
		}else if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Play mp3 file " + fileName);
		}
		else {
			System.out.println("Invalid file format" + audioType + " not support");
		}
	}

}
