package java_class;
import java.util.Scanner;

public class 테스트 {
	
	public static void main(String[] args) throws InterruptedException {
		User user = new User();
		Item item = new Item();
		Scanner scan = new Scanner(System.in);
		int a =4;
		
		노래 music = new 노래();
		Thread musicthread = new Thread(music);
		musicthread.start();
		
		Joblucky j = new Joblucky(a,user);
		Thread t = new Thread(j);
		t.start();
		
		user.workmanhavemoney+=10000;
		user.workmanhavemoney+=10000;
		System.out.println(user.workmanhavemoney);
		
		item.workplusitem(user);
		
		System.out.println(item.itemhave);
		
		/*
		
		for(int a=0; a<15; a++) {
			System.out.println("1을 눌러라");
			choice=scan.nextInt();
			if(choice==1) {
				System.out.println("현재 재산: "+user.workmanhavemoney);
				System.out.println("현재 아이템: "+item.itemhave);
				Joblucky n = new Joblucky(a,user);
				Thread companychance = new Thread(n);
				companychance.start();
				companychance.join();
				System.out.println("가상 재산: "+user.workmanhavemoney);
				System.out.println("가상 아이템: "+item.itemhave);
			}
		}
	*/
	
	} // main
}// 테스트

	
	

	

	




