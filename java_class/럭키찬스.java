package java_class;

import java.util.Scanner;

public class ��Ű���� {

	@Override
	public void run() {
		
		Scanner scan = new Scanner(System.in);
		int choice;
		try {
			if(true) {
				Thread.sleep(500);
				System.out.println("-----------------");
				Thread.sleep(500);
				System.out.println("��Ű����!");
				Thread.sleep(500);
				System.out.println("��Ű������ �����ϰڽ��ϱ�?");
				Thread.sleep(500);
				System.out.println("1. ��    2. �ƴϿ�");
				choice=scan.nextInt();
				if(choice==1) {
					// 1,2,3 �� ���ڸ� �����ϰ� �Ѵ�
					// 1,2,3�� �������� + ����,��� �Ǵ� - ����� �ش�
					Thread.sleep(500);
					System.out.println("-----------------");
					Thread.sleep(500);
					System.out.println("1�� 2�� �����ϼ���");
					Thread.sleep(500);
					choice=scan.nextInt();
					int array[] = {build.currentbuild-1,build.currentbuild-2};
						if(choice==1) {
							
						}if(choice==2) {
							build.currentbuild++;
						}
						if(choice==3) {
					
						
						}
				}
				else if(choice ==2) {
					 // ���� �ൿ���� �Ѿ�� �Ѵ�.
				}
			}
		} catch (InterruptedException e) {
			
		}
	
}
