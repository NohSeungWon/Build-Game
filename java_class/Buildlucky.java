package java_class;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class Buildlucky implements Runnable{
	Build build;
	int a; 
	
	public Buildlucky(int a, Build build) {
		this.build = build;
		this.a = a;
	}
	
	
	@Override
	public void run() {
		try {
			if(a==5) { //(int)(Math.random()*30+1)) 랜덤값은 이걸로 넣으면됨
					File theFile = new File("C:\\Users\\usser\\Desktop\\Dawn//builddown.wav");
					FileInputStream fis = new FileInputStream(theFile); 
					AudioStream as = new AudioStream(fis);
					AudioPlayer.player.start(as);
					System.out.print("  지 ");
					Thread.sleep(800);
					System.out.print("  진 ");
					Thread.sleep(800);
					System.out.print("  발 ");
					Thread.sleep(800);
					System.out.println("  생 ");
					Thread.sleep(800);
					System.out.println();
					System.out.println("-----지진 발생으로 건물벽돌이 2개 무너졌습니다!!----");
					System.out.println();
					build.currentbuild-=2; //(int)(Math.random()*5+1);
					build.up-=2;
					
					Thread.sleep(10);
			}
		} catch (Exception e) {
			
		}
	
	}// run
	
	
}
