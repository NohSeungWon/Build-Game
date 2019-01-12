package java_class;

public class Buildprint implements Runnable { // 빌드값이 0부터 +1 추가될 때마다 -를 프린트
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
