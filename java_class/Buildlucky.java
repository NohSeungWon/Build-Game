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
			if(a==5) { //(int)(Math.random()*30+1)) �������� �̰ɷ� �������
					File theFile = new File("C:\\Users\\usser\\Desktop\\Dawn//builddown.wav");
					FileInputStream fis = new FileInputStream(theFile); 
					AudioStream as = new AudioStream(fis);
					AudioPlayer.player.start(as);
					System.out.print("  �� ");
					Thread.sleep(800);
					System.out.print("  �� ");
					Thread.sleep(800);
					System.out.print("  �� ");
					Thread.sleep(800);
					System.out.println("  �� ");
					Thread.sleep(800);
					System.out.println();
					System.out.println("-----���� �߻����� �ǹ������� 2�� ���������ϴ�!!----");
					System.out.println();
					build.currentbuild-=2; //(int)(Math.random()*5+1);
					build.up-=2;
					
					Thread.sleep(10);
			}
		} catch (Exception e) {
			
		}
	
	}// run
	
	
}
