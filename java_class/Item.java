package java_class;

public class Item {
	Job_workman workman = new Job_workman();
	Job_workman_high high = new Job_workman_high();
	Job_workman_safe safe = new Job_workman_safe();
	User user = new User();
	
	
	
	int itemhave=0;
	
	public void pritnhave() {
		System.out.println(itemhave);
	}
	public void plusitem(User user) {
		if(user.companyhavemoney>=10000) {
			itemhave+=1;
		}
		
	}
	public void workplusitem(User user) { // �Ǽ� �뵿 ���ý� +1
		if(user.workmanhavemoney>=10000) {
			itemhave+=workman.workmanitemplusskill(0);
		}
		
	}
	public void highplusitem(User user) { // ����� ���ý� +2
		if(user.workmanhavemoney>=10000) {
			itemhave+=high.itemplusskill(0);	
		}
	}
	public void safeworkplusitem(User user) { // �������  ���ý� +1
		if(user.workmanhavemoney>=10000) {
			itemhave+=safe.safeitemplusskill(0);	
		}
	}

	public void minus() {
		if(itemhave>=1) {
			itemhave--;
		}
	}
	
}
