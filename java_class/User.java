package java_class;

public class User {
	
	
	Job job=new Job();
	Job_workman workman = new Job_workman();
	Job_workman_safe safe = new Job_workman_safe();
	Job_company company = new Job_company();
	
	
	
	int workmanhavemoney = job.workmanhavemoney; //�������ִ� ��
	int companyhavemoney = job.companyhavemoney;
			
	public int workmanaddmoney(int a) { //�Ǽ��뵿�� �ϱ� �߰��Ǵ� �޼ҵ�
		return workmanhavemoney+=workman.pay;
	}
	
	public int companyaddmoney(int a) { //����� �ϱ� �߰��Ǵ� �޼ҵ�
		return companyhavemoney+= company.companypay;
	}
	
	public int safeaddmoney(int a) { // ������� �ϱ� �߰� �޼ҵ�
		return workmanhavemoney+= safe.moneyplusskill(0);
	}
	
	public void workminusitemmoney() { //�Ǽ��뵿�� �з��������� ������� ���ݸ�ŭ ����
	
		if(workmanhavemoney>=10000) {
			workmanhavemoney-=10000;
		}
	}
	public void companyminusitemmoney() { //������� ������� ���ݸ�ŭ ����
		
		if(companyhavemoney>=10000) {
			companyhavemoney-=10000;
		}
	}
	

	
	
	
}