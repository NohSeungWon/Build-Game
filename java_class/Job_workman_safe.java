package java_class;

public class Job_workman_safe extends Job_workman{
	
	String name="�������";
	
	public int moneyplusskill (int a) { //2000���� �� ����
		return pay+2000;
	}

	public int safeitemplusskill (int a) { //�����춧 +1 ����
		return a+=workmanitemplusskill(0); // ��������� +�� ���� �⺻��Ӹ� ����
	}

}



