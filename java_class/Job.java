package java_class;


public class Job{

	int workmanhavemoney=1000; // 노동자 재산
	int companyhavemoney=10000;; // 사업자 재산
	
	
	
	public void printname(int a){
		if(a==1) {
			System.out.println("직업 : 건설노동자 (일급:1만원/벽돌 +1)");
		}
		if(a==2) {
			System.out.println("직업 : 사업가");
		}
	}
	
	
}

