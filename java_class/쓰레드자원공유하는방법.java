package java_class;

public class �������ڿ������ϴ¹�� implements Runnable {
	// Build build; �̰� �ϸ� Build Ŭ������ �� ���� ��ü�� �Ѿ�´�  
	Build build = new Build();  // ���� �Ŷ� �����ϰ� ������ �Ǵµ� �������� ���� �𸥴�.
								

	public �������ڿ������ϴ¹��(Build build) {
		this.build = build;
	}
	
	
	public void run() {
		build.currentbuild--;
	}
}
