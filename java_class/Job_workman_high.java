package java_class;

public class Job_workman_high extends Job_workman{
	
	
	String name="기술자";
	
	public int itemplusskill (int a) { //벽돌 +2개 증가 
		return a+=workmanitemplusskill(0)+1; // 기본 2씩 증가에서 +1 =3
	}
}
