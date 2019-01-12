package java_class;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Workmanlucky implements Runnable{
	User user;
	Item item;
	int a;
	Scanner scan = new Scanner(System.in);
	int choice;
	
	public Workmanlucky (int a, User user,Item item) {
		this.user = user;
		this.item = item;
		this.a=a;
	}
	public int luc(int a) {
		int 럭키[] = {user.workmanhavemoney+30000,
				user.workmanhavemoney+2000,
				user.workmanhavemoney*50000,
				user.workmanhavemoney+1000,
				user.workmanhavemoney-2000,
				user.workmanhavemoney-100,
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
					user.workmanhavemoney += luc(1);
				}
				if(choice==2) {
					user.workmanhavemoney += luc(1);
				}
				if(choice==3) {
					user.workmanhavemoney += luc(1);
				}
				if(choice==4) {
					user.workmanhavemoney += luc(1);
				}
				if(choice==5) {
					user.workmanhavemoney += luc(1);
				}
			} // a if 종료
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
}// 종료
