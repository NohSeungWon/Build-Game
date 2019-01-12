package java_class;
import java.util.Scanner;
import java.util.regex.Matcher;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class 가상메인{
	
	
	public static void main(String[] args) throws InterruptedException{
		
	
		String regex = "^\\[?[Web]?\\]$";
		String str = "[Web발신]\n"+
		"삼성8643 노*원\n"+"900원 일시불\n"
				+"09/13 20:19 (주)그린카";
		
		Pattern pattern = Pattern.co(regex); // 정규표현식으로 패턴을 설정하고,
        Matcher matcher = pattern.matcher(str); /
		System.out.println(str);
	
	} // 메인종료
		

} // 클래스 종료


