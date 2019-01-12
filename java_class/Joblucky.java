package java_class;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Joblucky implements Runnable{
	
	User user;
	int a;
	Scanner scan = new Scanner(System.in);
	int choice;
	
	public Joblucky(int a, User user) {
		this.user = user;
		this.a = a;
	}
	
	public int luc(int a) {
		int 럭키[] = {user.companyhavemoney+30000,
				user.companyhavemoney+2000,
				user.companyhavemoney*50000,
				user.companyhavemoney+1000,
				user.companyhavemoney-2000,
				user.companyhavemoney-100,
	};
		return 럭키[0];
	}
	
	public void run() {
		try {
			
				if(a==4) {
					File theFile = new File("C:\\Users\\usser\\Desktop\\Dawn//chance.wav");
					FileInputStream fis = new FileInputStream(theFile); 
					AudioStream as = new AudioStream(fis);
					AudioPlayer.player.start(as);
				System.out.println();
				System.out.println("---------럭키찬스!!---------");
				Thread.sleep(500);
				System.out.println();
				System.out.println("다음 숫자 중 하나를 고르세요");
				Thread.sleep(500);
				System.out.println();
				System.out.print("1    ");
				Thread.sleep(360);
				System.out.print("2    ");
				Thread.sleep(360);
				System.out.print("3    ");
				Thread.sleep(360);
				System.out.print("4    ");
				Thread.sleep(360);
				System.out.print("5    ");
				System.out.println();
				
				
				choice=scan.nextInt();
				if(choice==1) {
					user.companyhavemoney += luc(1);
				}
				if(choice==2) {
					user.companyhavemoney += luc(1);
				}
				if(choice==3) {
					user.companyhavemoney += luc(1);
				}
				if(choice==4) {
					user.companyhavemoney += luc(1);
				}
				if(choice==5) {
					user.companyhavemoney += luc(1);
				}
			} // a if 종료
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
}
