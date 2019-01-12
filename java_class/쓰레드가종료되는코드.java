package java_class;

import java.util.Scanner;

public class 쓰레드가종료되는코드 implements Runnable{
	
	@Override
	public void run() {  // try안에 조건문 실행이 들어있어야 인터룹트 제어가 된다.
		/*
		
		Scanner scan = new Scanner(System.in);
		int choice;
	
			try {
					if(true) {
						Thread.sleep(500);
						System.out.println("-----------------");
						Thread.sleep(500);
						System.out.println("럭키찬스!");
						Thread.sleep(500);
						System.out.println("럭키찬스를 실행하겠습니까?");
						Thread.sleep(500);
						System.out.println("1. 네    2. 아니오");
						choice=scan.nextInt();
						if(choice==1) {
							// 1,2,3 중 숫자를 선택하게 한다
							// 1,2,3에 랜덤으로 + 벽돌,재산 또는 - 재산을 준다
							Thread.sleep(500);
							System.out.println("-----------------");
							Thread.sleep(500);
							System.out.println("1과 2중 선택하세요");
							Thread.sleep(500);
							choice=scan.nextInt();
								if(choice==1) {
									user.workmanaddmoney(1);
								}if(choice==2) {
									user.workminusitemmoney(1);
								}
							if(choice==1) {
							
								
							}
						}
						else if(choice ==2) {
							// 다음 행동으로 넘어가게 한다.
						}
					}
				} catch (InterruptedException e) {
					
				}
		
	
	try{
        Thread.sleep(1);
    }catch(InterruptedException e){
        // ...
    }
	test(<-쓰레드 이름).interrupt(); 
	*/
	
	}
}
