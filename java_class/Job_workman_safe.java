package java_class;

public class Job_workman_safe extends Job_workman{
	
	String name="안전요원";
	
	public int moneyplusskill (int a) { //2000원씩 더 증가
		return pay+2000;
	}

	public int safeitemplusskill (int a) { //벽돌살때 +1 증가
		return a+=workmanitemplusskill(0); // 안전요원은 +가 없고 기본상속만 받음
	}

}



