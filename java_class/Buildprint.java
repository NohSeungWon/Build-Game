package java_class;

public class Buildprint implements Runnable { // ���尪�� 0���� +1 �߰��� ������ -�� ����Ʈ
	Build build = new Build();
	
	public void run() {
		for(int a=0; a<1; a++) {
			if(build.currentbuild==0) {
				System.out.println("-");
			}	
		}
	}
	
	public static void main(String[] args) {
		Build build = new Build();

		Buildprint p = new Buildprint();
		Thread print = new Thread(p);
		print.start();
		
		
		build.currentbuild++;
		try {
			print.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
