package java_class;
import java.util.Scanner;
import java.util.regex.Matcher;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class �������{
	
	
	public static void main(String[] args) throws InterruptedException{
		
	
		String regex = "^\\[?[Web]?\\]$";
		String str = "[Web�߽�]\n"+
		"�Ｚ8643 ��*��\n"+"900�� �Ͻú�\n"
				+"09/13 20:19 (��)�׸�ī";
		
		Pattern pattern = Pattern.co(regex); // ����ǥ�������� ������ �����ϰ�,
        Matcher matcher = pattern.matcher(str); /
		System.out.println(str);
	
	} // ��������
		

} // Ŭ���� ����


