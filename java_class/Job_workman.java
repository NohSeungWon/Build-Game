package java_class;

public class Job_workman extends Job{
	int pay=10000; // 건설노동자 일급
	
	String name="건설노동자";
	
	public int workmanitemplusskill (int a) { //벽돌살때 +1 증가
		return a+=2;
	}
}
