package java_class;

public class 쓰레드자원공유하는방법 implements Runnable {
	// Build build; 이걸 하면 Build 클래스가 이 공유 객체로 넘어온다  
	Build build = new Build();  // 위에 거랑 동일하게 실행이 되는데 차이점은 아직 모른다.
								

	public 쓰레드자원공유하는방법(Build build) {
		this.build = build;
	}
	
	
	public void run() {
		build.currentbuild--;
	}
}
