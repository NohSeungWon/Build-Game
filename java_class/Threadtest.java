package java_class;

public class Threadtest extends Thread {
	int seq;
	public Threadtest(int seq) {
		this.seq=seq;
	}
	public void run() {
		System.out.println(this.seq+"Thread start.");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(this.seq+"therad end.");
	}
	
	public static void main(String[] args) {
		for(int a=0; a<10; a++) {
			Threadtest t = new Threadtest(a);
			t.start();
		}
		System.out.println("main end.");
	}

}
