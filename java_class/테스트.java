package java_class;
import java.util.Scanner;

public class �׽�Ʈ {
	
	public static void main(String[] args) throws InterruptedException {
		User user = new User();
		Item item = new Item();
		Scanner scan = new Scanner(System.in);
		int a =4;
		
		�뷡 music = new �뷡();
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
			System.out.println("1�� ������");
			choice=scan.nextInt();
			if(choice==1) {
				System.out.println("���� ���: "+user.workmanhavemoney);
				System.out.println("���� ������: "+item.itemhave);
				Joblucky n = new Joblucky(a,user);
				Thread companychance = new Thread(n);
				companychance.start();
				companychance.join();
				System.out.println("���� ���: "+user.workmanhavemoney);
				System.out.println("���� ������: "+item.itemhave);
			}
		}
	*/
	
	} // main
}// �׽�Ʈ

	
	

	

	




