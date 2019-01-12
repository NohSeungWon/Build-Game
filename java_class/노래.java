package java_class;
import javax.sound.sampled.AudioSystem;

import java.io.File;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.FileInputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.io.File;


public class 노래 implements Runnable {
	
	public void run() {
		try{
			while(true) {
			File theFile = new File("C:\\Users\\usser\\Desktop\\Dawn//yo.wav");
			FileInputStream fis = new FileInputStream(theFile); 
			AudioStream as = new AudioStream(fis);
			AudioPlayer.player.start(as);
			Thread.sleep(184000);	
			}
		}catch(Exception ex) {
			
		}
	}
}
	
	/* 노래를 종료시키는 방법.... 대체 뭐지
	 * 
	노래 music = new 노래();
	Thread musicthread = new Thread(music);
	
	musicthread.start();
	
	try{
        Thread.sleep(1);
    }catch(InterruptedException e){
        // ...
    }
	musicthread.interrupt();
*/



		

