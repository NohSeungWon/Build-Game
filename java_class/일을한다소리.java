package java_class;
import java.io.File;
import java.io.FileInputStream;

import javax.sound.sampled.AudioSystem;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class �����ѴټҸ� implements Runnable {
	
	public void run() {
		try{
			File theFile = new File("C:\\Users\\usser\\Desktop\\Dawn//money.wav");
			FileInputStream fis = new FileInputStream(theFile); 
			AudioStream as = new AudioStream(fis);
			AudioPlayer.player.start(as);
			
		}catch(Exception ex) {
			
		}
	}
}
