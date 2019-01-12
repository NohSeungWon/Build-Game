package java_class;

import java.io.File;
import java.io.FileInputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class 벽돌을쌓는다소리 implements Runnable {
	
	public void run() {
		try{
			File theFile = new File("C:\\Users\\usser\\Desktop\\Dawn//build.wav");
			FileInputStream fis = new FileInputStream(theFile); 
			AudioStream as = new AudioStream(fis);
			AudioPlayer.player.start(as);
			
		}catch(Exception ex) {
			
		}
	}
}