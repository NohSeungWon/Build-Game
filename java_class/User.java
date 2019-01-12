package java_class;

public class User {
	
	
	Job job=new Job();
	Job_workman workman = new Job_workman();
	Job_workman_safe safe = new Job_workman_safe();
	Job_company company = new Job_company();
	
	
	
	int workmanhavemoney = job.workmanhavemoney; //가지고있는 돈
	int companyhavemoney = job.companyhavemoney;
			
	public int workmanaddmoney(int a) { //건설노동자 일급 추가되는 메소드
		return workmanhavemoney+=workman.pay;
	}
	
	public int companyaddmoney(int a) { //사업가 일급 추가되는 메소드
		return companyhavemoney+= company.companypay;
	}
	
	public int safeaddmoney(int a) { // 안전요원 일급 추가 메소드
		return workmanhavemoney+= safe.moneyplusskill(0);
	}
	
	public void workminusitemmoney() { //건설노동자 분류직업군이 벽돌사면 가격만큼 차감
	
		if(workmanhavemoney>=10000) {
			workmanhavemoney-=10000;
		}
	}
	public void companyminusitemmoney() { //사업가가 벽돌사면 가격만큼 차감
		
		if(companyhavemoney>=10000) {
			companyhavemoney-=10000;
		}
	}
	

	
	
	
}