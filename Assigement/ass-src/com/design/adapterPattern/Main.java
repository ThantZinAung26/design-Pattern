package com.design.adapterPattern;

public class Main {

	public static void main(String[] args) {
		AudioPlayer a = new AudioPlayer();
		a.play("vlc", "Never ever");
		a.play("mp4", "Closer");
		a.play("mp3", "Panama");
		a.play("m4a", "I am Your");
	}

}
