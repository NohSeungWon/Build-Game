
package java_class;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class game {
	
	public static void main(String[] args) throws InterruptedException{
		
		// Ŭ���� ����
		User user = new User();
		Job job = new Job(); 
		Job_workman workman = new Job_workman();
		Job_workman_high high = new Job_workman_high();
		Job_workman_safe safe = new Job_workman_safe();
		Job_company company = new Job_company();
		
		Item item = new Item();
		Line line = new Line();
		Build build = new Build();
		Select select = new Select();
		Scanner scan = new Scanner(System.in);
		
		
	
		int choice; // ����� �Է°� �ޱ�
		// ���ӽ���ȭ��

		�뷡 music = new �뷡();
		Thread musicthread = new Thread(music);
		musicthread.start();
		
		loading y = new loading();
		Thread lo = new Thread(y);
		lo.start();
		lo.join();
		
		System.out.println();
		System.out.println();
		System.out.println("******** 10�� �ǹ��� �÷���! ********");
		Thread.sleep(500);
		System.out.println();
		System.out.println("��ǥ : ���� ��� ������ ��� 10�� �ǹ��� �ִ��� ���� �����");
		Thread.sleep(500);
		System.out.println();
		System.out.println("--- ��������");
		Thread.sleep(500);
		System.out.println();
		System.out.println("1. �Ǽ��뵿�� : �ʱ��ڱ�(1õ��) + �ϱ�(1����) / ���� +1 and �������� ");
		Thread.sleep(500);
		System.out.println();
		System.out.println("2. ����� : �ʱ��ڱ�(1����) + ���ͷ�����");
		Thread.sleep(500);
		System.out.println();
		System.out.println("� ������ �����Ͻðڽ��ϱ�?");
		
		
		choice=scan.nextInt(); //���� �����ϰ� �ϱ� 
		
		if(choice==1) { // �뵿�ڼ���
			
			line.start();
			System.out.println("���� : �Ǽ��뵿�� (�ϱ�:1����/���� +1)");
			Thread.sleep(500);
			System.out.println("��� : 1000��");
			Thread.sleep(500);
			System.out.println("����: 0��");
			Thread.sleep(500);
			System.out.println("�Ǽ��� : 0��");
			Thread.sleep(500);
			select.printselect();
			
			
			// �Ǽ��뵿�ڸ� ������ ��� 
			
			for(int a=1; a<=4; a++) { // 10���� ����ǰ� �ϱ� (������ ����)
				choice=scan.nextInt(); 
				line.start();
				if(choice==1) { //���� �Ѵ� ���ð��
					�����ѴټҸ� f = new �����ѴټҸ�();
					Thread t = new Thread(f);
					t.start();
					// �����߻� 
					Buildlucky r = new Buildlucky(a,build);
					Thread builddown = new Thread(r);
					builddown.start();
					builddown.join();
					// �����߻� ��\
					// ��Ű����
					Workmanlucky o = new Workmanlucky(a,user,item);
					Thread workchance = new Thread(o);
					workchance.start();
					workchance.join();
					//��Ű���� ��
					job.printname(choice);
					user.workmanaddmoney(1); // �ϱ��� ��꿡 �߰��ϴ� �޼ҵ�
					System.out.println("���: "+user.workmanhavemoney+"��");
					Thread.sleep(500);
					System.out.println("����: "+item.itemhave+"��");
					Thread.sleep(500);
					System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
					System.out.println();
					line.start2();
					build.up();
				}
				if(choice==2) { //������ �״´� ���ð��
					�������״´ټҸ� m = new �������״´ټҸ�();
					Thread t = new Thread(m);
					t.start();
					// �����߻� 
					Buildlucky r = new Buildlucky(a,build);
					Thread builddown = new Thread(r);
					builddown.start();
					builddown.join();
					// �����߻� ��
					job.printname(1);
					build.upbuild();
					build.printbuild();
					item.minus(); // �������� 1���� ���̱�
					System.out.println("��� : "+user.workmanhavemoney+"��");
					Thread.sleep(500);
					System.out.println("����: "+item.itemhave+"��");
					Thread.sleep(500);
					System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
					System.out.println();
					line.start2();
					build.up();
				}
				if(choice==3) { //������ ���
					��������ټҸ� d = new ��������ټҸ�();
					Thread t = new Thread(d);
					t.start();
					// �����߻� 
					Buildlucky r = new Buildlucky(a,build);
					Thread builddown = new Thread(r);
					builddown.start();
					builddown.join();
					// �����߻� ��
					job.printname(1);
					item.workplusitem(user); 
					user.workminusitemmoney();
					System.out.println("��� : "+user.workmanhavemoney+"��");
					Thread.sleep(500);
					System.out.println("����: "+item.itemhave+"��");
					Thread.sleep(500);
					System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
					line.start2();
					build.up();
				}else if(choice!=1 && choice!=2 && choice!=3) { // 1,2�� �ƴ� �ٸ� ������ �� ��� ó������
					a--;
					line.start();
					System.out.println("�ùٸ� ������ �ϼ���");
				}
		
				select.printselect();
				if(a>3) { // 10�� ����Ǹ� ��ž�ϰ� �����ϰ� ����� �ڵ�
					line.start();
					Thread.sleep(500);
					System.out.println("���õ��� �ö����ϴ�. ������ �����ϼ���");
					Thread.sleep(500);
					select.printnextworkman();
					choice=scan.nextInt();
				} // 10�� ����Ǹ� ��ž�ϰ� �����ϰ� ����� �ڵ� �� ��ȣ
			} // 10���� ����ǰ� �ϱ� (������ ����) �� ��ȣ
			
			line.start();
			
			if(choice==1) { //����� ������ ���
				
				// ���� �� �� �ܰ� ��Ȳ ����Ʈ
				line.start();
				System.out.println("���� : "+high.name+"(�������+3)");
				Thread.sleep(500);
				System.out.println("���: "+user.workmanhavemoney+"��");
				Thread.sleep(500);
				System.out.println("����: "+item.itemhave+"��");
				Thread.sleep(500);
				System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
				Thread.sleep(500);
				select.printselect();
				
				// ����� ���� ���ۺκ�
				
				for(int a=0; a<=10000; a++) { 
					choice=scan.nextInt(); 
					line.start();
					if(choice==1) { //���� �Ѵ� ���ð��
						�����ѴټҸ� f = new �����ѴټҸ�();
						Thread t = new Thread(f);
						t.start();
						// �����߻� 
						Buildlucky r = new Buildlucky(a,build);
						Thread builddown = new Thread(r);
						builddown.start();
						builddown.join();
						// �����߻� ��
						Workmanlucky o = new Workmanlucky(a,user,item);
						Thread workchance = new Thread(o);
						workchance.start();
						workchance.join();
						//��Ű���� ��
						System.out.println("���� : "+high.name+"(�������+3)");
						Thread.sleep(500);
						user.workmanaddmoney(1); // �ϱ��� ��꿡 �߰��ϴ� �޼ҵ�
						System.out.println("���: "+user.workmanhavemoney+"��");
						Thread.sleep(500);
						System.out.println("����: "+item.itemhave+"��");
						Thread.sleep(500);
						System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
						line.start2();
						build.up();
					}
					if(choice==2) { //������ �״´� ���ð��
						�������״´ټҸ� m = new �������״´ټҸ�();
						Thread t = new Thread(m);
						t.start();
						// �����߻� 
						Buildlucky r = new Buildlucky(a,build);
						Thread builddown = new Thread(r);
						builddown.start();
						builddown.join();
						// �����߻� ��
						System.out.println("���� : "+high.name+"(�������+3)");
						Thread.sleep(500);
						item.minus(); // �������� 1���� ���̱�
						build.upbuild();
						System.out.println("��� : "+user.workmanhavemoney+"��");
						Thread.sleep(500);
						System.out.println("����: "+item.itemhave+"��");
						Thread.sleep(500);
						build.printbuild();
						Thread.sleep(500);
						System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
						System.out.println();
						line.start2();
						build.up();
					}
					if(choice==3) { //������ ���
						��������ټҸ� d = new ��������ټҸ�();
						Thread t = new Thread(d);
						t.start();
						// �����߻� 
						Buildlucky r = new Buildlucky(a,build);
						Thread builddown = new Thread(r);
						builddown.start();
						builddown.join();
						// �����߻� ��
						System.out.println("���� : "+high.name+"(�������+3)");
						item.highplusitem(user); 
						user.workminusitemmoney();
						Thread.sleep(500);
						System.out.println("��� : "+user.workmanhavemoney+"��");
						Thread.sleep(500);
						System.out.println("����: "+item.itemhave+"��");
						Thread.sleep(500);
						System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
						line.start2();
						build.up();
					}
					if(build.currentbuild==build.buildmax) { // 10�� �Ǽ��� ���� �޼ҵ�
						line.start();
						System.out.println("���Ӽ���!");
						System.exit(0);
					}else if(choice!=1 && choice!=2 && choice!=3) { // 1,2�� �ƴ� �ٸ� ������ �� ��� ó������
						a--;
						line.start();
						System.out.println("�ùٸ� ������ �ϼ���");
					}
					select.printselect();
				} // ����� ���� ���� �� ��ȣ
				
			} //����� ���� �� ��ȣ
			
			if(choice==2) { // ������� ����
				
				// ���� �� �� �ܰ� ��Ȳ ����Ʈ
				line.start();
				System.out.println("���� : "+safe.name+"(�ϱ�+2000 / ����+2)");
				Thread.sleep(500);
				System.out.println("���: "+user.workmanhavemoney+"��");
				Thread.sleep(500);
				System.out.println("����: "+item.itemhave+"��");
				Thread.sleep(500);
				System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
				Thread.sleep(500);
				select.printselect();
				
				// ������� ���� ���ۺκ�
				
				for(int a=1; a<=1000000; a++) { // 
					choice=scan.nextInt(); 
					line.start();
					if(choice==1) { //���� �Ѵ� ���ð��
						�����ѴټҸ� f = new �����ѴټҸ�();
						Thread t = new Thread(f);
						t.start();
						// �����߻� 
						Buildlucky r = new Buildlucky(a,build);
						Thread builddown = new Thread(r);
						builddown.start();
						builddown.join();
						// �����߻� ��
						Workmanlucky o = new Workmanlucky(a,user,item);
						Thread workchance = new Thread(o);
						workchance.start();
						workchance.join();
						//��Ű���� ��
						System.out.println("���� : "+safe.name+"(�ϱ�+2000 / ����+2)");
						Thread.sleep(500);
						user.safeaddmoney(1); // �ϱ��� ��꿡 �߰��ϴ� �޼ҵ� (1)��� ���ڴ� ���þ���
						System.out.println("���: "+user.workmanhavemoney+"��");
						Thread.sleep(500);
						System.out.println("����: "+item.itemhave+"��");
						Thread.sleep(500);
						System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
						line.start2();
						build.up();
					}
					if(choice==2) { //������ �״´� ���ð��
						�������״´ټҸ� m = new �������״´ټҸ�();
						Thread t = new Thread(m);
						t.start();
						// �����߻� 
						Buildlucky r = new Buildlucky(a,build);
						Thread builddown = new Thread(r);
						builddown.start();
						builddown.join();
						// �����߻� ��
						System.out.println("���� : "+safe.name+"(�ϱ�+2000 /���� +2)");
						Thread.sleep(500);
						item.minus(); // �������� 1���� ���̱�
						build.upbuild();
						System.out.println("��� : "+user.workmanhavemoney+"��");
						Thread.sleep(500);
						System.out.println("����: "+item.itemhave+"��");
						Thread.sleep(500);
						build.printbuild();
						Thread.sleep(500);
						System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
						System.out.println();
						line.start2();
						build.up();
					}
					if(choice==3) { //������ ���
						��������ټҸ� d = new ��������ټҸ�();
						Thread t = new Thread(d);
						t.start();
						// �����߻� 
						Buildlucky r = new Buildlucky(a,build);
						Thread builddown = new Thread(r);
						builddown.start();
						builddown.join();
						// �����߻� ��
						System.out.println("���� : "+safe.name+"(�ϱ�+2000 /����+2)");
						Thread.sleep(500);
						item.safeworkplusitem(user);  
						user.workminusitemmoney();
						System.out.println("��� : "+user.workmanhavemoney+"��");
						Thread.sleep(500);
						System.out.println("����: "+item.itemhave+"��");
						Thread.sleep(500);
						System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
						line.start2();
						build.up();
					}
					if(build.currentbuild==build.buildmax) { // 10�� �Ǽ��� ���� �޼ҵ�
						line.start();
						System.out.println("���Ӽ���!");
						System.exit(0);
					}else if(choice!=1 && choice!=2 && choice!=3 ) { // 1,2�� �ƴ� �ٸ� ������ �� ��� ó������
						a--;
						line.start();
						System.out.println("�ùٸ� ������ �ϼ���");
					}
					select.printselect();
				} // ������� �÷��� ��ȣ ��
				
			}// ������� �������� ��ȣ ��
			
		} // �뵿�� ���� �� ��ȣ
		
		
		
		
		else if(choice==2){// ����� ���ý� �ʱ�ȭ�� 
			
			//job.setmoney(choice); ����� �������� �� �ʱ��ڱ� 1���� �¾�
			line.start();
			System.out.println("���� : ����� (���+�������ͷ�)");
			Thread.sleep(500);
			System.out.println("��� : 10000��");
			Thread.sleep(500);
			System.out.println("����: 0��");
			Thread.sleep(500);
			System.out.println("�Ǽ��� : 0��");
			Thread.sleep(500);
			select.printselect();
			
			for(int a=1; a<=100000; a++) { // 
				choice=scan.nextInt(); 
				line.start();
				if(choice==1) { //���� �Ѵ� ���ð��
					�����ѴټҸ� f = new �����ѴټҸ�();
					Thread t = new Thread(f);
					t.start();
					// �����߻� 
					Buildlucky r = new Buildlucky(a,build);
					Thread builddown = new Thread(r);
					builddown.start();
					builddown.join();
					// �����߻� ��
					// ��Ű����
					Joblucky n = new Joblucky(a,user);
					Thread companychance = new Thread(n);
					companychance.start();
					companychance.join();
					//��Ű���� ��
					System.out.println("���� : "+company.name+"(���ͷ�����)");
					Thread.sleep(500);
					user.companyaddmoney(1); // �ϱ��� ��꿡 �߰��ϴ� �޼ҵ�
					System.out.println("���: "+user.companyhavemoney+"��");
					Thread.sleep(500);
					System.out.println("����: "+item.itemhave+"��");
					Thread.sleep(500);
					System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
					line.start2();
					build.up();
				}
				if(choice==2) { //������ �״´� ���ð��
					�������״´ټҸ� m = new �������״´ټҸ�();
					Thread t = new Thread(m);
					t.start();
					// �����߻� 
					Buildlucky r = new Buildlucky(a,build);
					Thread builddown = new Thread(r);
					builddown.start();
					builddown.join();
					// �����߻� ��
					item.minus(); // �������� 1���� ���̱�
					System.out.println("���� : "+company.name+"(���ͷ�����)");
					build.upbuild();
					Thread.sleep(500);
					System.out.println("���: "+user.companyhavemoney+"��");
					Thread.sleep(500);
					build.printbuild();
					System.out.println("����: "+item.itemhave+"��");
					Thread.sleep(500);
					System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
					System.out.println();
					line.start2();
					build.up();
				}
				if(choice==3) { //������ ���
					��������ټҸ� d = new ��������ټҸ�();
					Thread t = new Thread(d);
					t.start();
					// �����߻� 
					Buildlucky r = new Buildlucky(a,build);
					Thread builddown = new Thread(r);
					builddown.start();
					builddown.join();
					// �����߻� ��
					item.plusitem(user);
					user.companyminusitemmoney();
					System.out.println("���� : "+company.name+"(���ͷ�����)");
					Thread.sleep(500);
					System.out.println("���: "+user.companyhavemoney+"��");
					Thread.sleep(500);
					System.out.println("����: "+item.itemhave+"��");
					Thread.sleep(500);
					System.out.println("�Ǽ�����: "+build.printbuild+"��"+"(���� "+build.currentbuild+"��)");
					line.start2();
					build.up();
				}
				if(build.currentbuild==build.buildmax) { // 10�� �Ǽ��� ���� �޼ҵ�
					line.start();
					System.out.println("���Ӽ���!");
					System.exit(0);
				}else if(choice!=1 && choice!=2 && choice!=3) { // 1,2�� �ƴ� �ٸ� ������ �� ��� ó������
					a--;
					line.start();
					System.out.println("�ùٸ� ������ �ϼ���");
				}
		
				select.printselect();
			} 
			
			
		} // ����� ���� �� ��ȣ
		
	

	
		
		
	} // ���� �޼ҵ� �����ȣ

} // game Ŭ���� ���� ��ȣ
