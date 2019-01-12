package java_class;

import java.util.Scanner;

public class 럭키찬스 {

	@Override
	public void run() {
		
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
					int array[] = {build.currentbuild-1,build.currentbuild-2};
						if(choice==1) {
							
						}if(choice==2) {
							build.currentbuild++;
						}
						if(choice==3) {
					
						
						}
				}
				else if(choice ==2) {
					 // 다음 행동으로 넘어가게 한다.
				}
			}
		} catch (InterruptedException e) {
			
		}
	
}
