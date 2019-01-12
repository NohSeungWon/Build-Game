
package java_class;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class game {
	
	public static void main(String[] args) throws InterruptedException{
		
		// 클래스 모음
		User user = new User();
		Job job = new Job(); 
		Job_workman workman = new Job_workman();
		Job_workman_high high = new Job_workman_high();
		Job_workman_safe safe = new Job_workman_safe();
		Job_company company = new Job_company();
		
		Item item = new Item();
		Line line = new Line();
		Build build = new Build();
		Select select = new Select();
		Scanner scan = new Scanner(System.in);
		
		
	
		int choice; // 사용자 입력값 받기
		// 게임시작화면

		노래 music = new 노래();
		Thread musicthread = new Thread(music);
		musicthread.start();
		
		loading y = new loading();
		Thread lo = new Thread(y);
		lo.start();
		lo.join();
		
		System.out.println();
		System.out.println();
		System.out.println("******** 10층 건물을 올려라! ********");
		Thread.sleep(500);
		System.out.println();
		System.out.println("목표 : 돈을 모아 벽돌을 사고 10층 건물을 최대한 빨리 지어라");
		Thread.sleep(500);
		System.out.println();
		System.out.println("--- 직업종류");
		Thread.sleep(500);
		System.out.println();
		System.out.println("1. 건설노동자 : 초기자금(1천원) + 일급(1만원) / 벽돌 +1 and 전직가능 ");
		Thread.sleep(500);
		System.out.println();
		System.out.println("2. 사업가 : 초기자금(1만원) + 수익률랜덤");
		Thread.sleep(500);
		System.out.println();
		System.out.println("어떤 직업을 선택하시겠습니까?");
		
		
		choice=scan.nextInt(); //직업 선택하게 하기 
		
		if(choice==1) { // 노동자선택
			
			line.start();
			System.out.println("직업 : 건설노동자 (일급:1만원/벽돌 +1)");
			Thread.sleep(500);
			System.out.println("재산 : 1000원");
			Thread.sleep(500);
			System.out.println("벽돌: 0개");
			Thread.sleep(500);
			System.out.println("건설층 : 0층");
			Thread.sleep(500);
			select.printselect();
			
			
			// 건설노동자를 선택한 경우 
			
			for(int a=1; a<=4; a++) { // 10번만 진행되게 하기 (전직을 위해)
				choice=scan.nextInt(); 
				line.start();
				if(choice==1) { //일을 한다 선택경우
					일을한다소리 f = new 일을한다소리();
					Thread t = new Thread(f);
					t.start();
					// 지진발생 
					Buildlucky r = new Buildlucky(a,build);
					Thread builddown = new Thread(r);
					builddown.start();
					builddown.join();
					// 지진발생 끝\
					// 럭키찬스
					Workmanlucky o = new Workmanlucky(a,user,item);
					Thread workchance = new Thread(o);
					workchance.start();
					workchance.join();
					//럭키찬스 끝
					job.printname(choice);
					user.workmanaddmoney(1); // 일급을 재산에 추가하는 메소드
					System.out.println("재산: "+user.workmanhavemoney+"원");
					Thread.sleep(500);
					System.out.println("벽돌: "+item.itemhave+"개");
					Thread.sleep(500);
					System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
					System.out.println();
					line.start2();
					build.up();
				}
				if(choice==2) { //벽돌을 쌓는다 선택경우
					벽돌을쌓는다소리 m = new 벽돌을쌓는다소리();
					Thread t = new Thread(m);
					t.start();
					// 지진발생 
					Buildlucky r = new Buildlucky(a,build);
					Thread builddown = new Thread(r);
					builddown.start();
					builddown.join();
					// 지진발생 끝
					job.printname(1);
					build.upbuild();
					build.printbuild();
					item.minus(); // 벽돌개수 1개씩 줄이기
					System.out.println("재산 : "+user.workmanhavemoney+"원");
					Thread.sleep(500);
					System.out.println("벽돌: "+item.itemhave+"개");
					Thread.sleep(500);
					System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
					System.out.println();
					line.start2();
					build.up();
				}
				if(choice==3) { //벽돌을 산다
					벽돌을산다소리 d = new 벽돌을산다소리();
					Thread t = new Thread(d);
					t.start();
					// 지진발생 
					Buildlucky r = new Buildlucky(a,build);
					Thread builddown = new Thread(r);
					builddown.start();
					builddown.join();
					// 지진발생 끝
					job.printname(1);
					item.workplusitem(user); 
					user.workminusitemmoney();
					System.out.println("재산 : "+user.workmanhavemoney+"원");
					Thread.sleep(500);
					System.out.println("벽돌: "+item.itemhave+"개");
					Thread.sleep(500);
					System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
					line.start2();
					build.up();
				}else if(choice!=1 && choice!=2 && choice!=3) { // 1,2가 아닌 다른 선택을 할 경우 처음으로
					a--;
					line.start();
					System.out.println("올바른 선택을 하세요");
				}
		
				select.printselect();
				if(a>3) { // 10번 진행되면 스탑하고 전직하게 만드는 코드
					line.start();
					Thread.sleep(500);
					System.out.println("숙련도가 올랐습니다. 전직을 실행하세요");
					Thread.sleep(500);
					select.printnextworkman();
					choice=scan.nextInt();
				} // 10번 진행되면 스탑하고 전직하게 만드는 코드 끝 괄호
			} // 10번만 진행되게 하기 (전직을 위해) 끝 괄호
			
			line.start();
			
			if(choice==1) { //기술자 선택한 경우
				
				// 전직 후 전 단계 현황 프린트
				line.start();
				System.out.println("직업 : "+high.name+"(벽돌사기+3)");
				Thread.sleep(500);
				System.out.println("재산: "+user.workmanhavemoney+"원");
				Thread.sleep(500);
				System.out.println("벽돌: "+item.itemhave+"개");
				Thread.sleep(500);
				System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
				Thread.sleep(500);
				select.printselect();
				
				// 기술자 게임 시작부분
				
				for(int a=0; a<=10000; a++) { 
					choice=scan.nextInt(); 
					line.start();
					if(choice==1) { //일을 한다 선택경우
						일을한다소리 f = new 일을한다소리();
						Thread t = new Thread(f);
						t.start();
						// 지진발생 
						Buildlucky r = new Buildlucky(a,build);
						Thread builddown = new Thread(r);
						builddown.start();
						builddown.join();
						// 지진발생 끝
						Workmanlucky o = new Workmanlucky(a,user,item);
						Thread workchance = new Thread(o);
						workchance.start();
						workchance.join();
						//럭키찬스 끝
						System.out.println("직업 : "+high.name+"(벽돌사기+3)");
						Thread.sleep(500);
						user.workmanaddmoney(1); // 일급을 재산에 추가하는 메소드
						System.out.println("재산: "+user.workmanhavemoney+"원");
						Thread.sleep(500);
						System.out.println("벽돌: "+item.itemhave+"개");
						Thread.sleep(500);
						System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
						line.start2();
						build.up();
					}
					if(choice==2) { //벽돌을 쌓는다 선택경우
						벽돌을쌓는다소리 m = new 벽돌을쌓는다소리();
						Thread t = new Thread(m);
						t.start();
						// 지진발생 
						Buildlucky r = new Buildlucky(a,build);
						Thread builddown = new Thread(r);
						builddown.start();
						builddown.join();
						// 지진발생 끝
						System.out.println("직업 : "+high.name+"(벽돌사기+3)");
						Thread.sleep(500);
						item.minus(); // 벽돌개수 1개씩 줄이기
						build.upbuild();
						System.out.println("재산 : "+user.workmanhavemoney+"원");
						Thread.sleep(500);
						System.out.println("벽돌: "+item.itemhave+"개");
						Thread.sleep(500);
						build.printbuild();
						Thread.sleep(500);
						System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
						System.out.println();
						line.start2();
						build.up();
					}
					if(choice==3) { //벽돌을 산다
						벽돌을산다소리 d = new 벽돌을산다소리();
						Thread t = new Thread(d);
						t.start();
						// 지진발생 
						Buildlucky r = new Buildlucky(a,build);
						Thread builddown = new Thread(r);
						builddown.start();
						builddown.join();
						// 지진발생 끝
						System.out.println("직업 : "+high.name+"(벽돌사기+3)");
						item.highplusitem(user); 
						user.workminusitemmoney();
						Thread.sleep(500);
						System.out.println("재산 : "+user.workmanhavemoney+"원");
						Thread.sleep(500);
						System.out.println("벽돌: "+item.itemhave+"개");
						Thread.sleep(500);
						System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
						line.start2();
						build.up();
					}
					if(build.currentbuild==build.buildmax) { // 10층 건설시 종료 메소드
						line.start();
						System.out.println("게임성공!");
						System.exit(0);
					}else if(choice!=1 && choice!=2 && choice!=3) { // 1,2가 아닌 다른 선택을 할 경우 처음으로
						a--;
						line.start();
						System.out.println("올바른 선택을 하세요");
					}
					select.printselect();
				} // 기술자 전직 진행 끝 괄호
				
			} //기술자 전직 끝 괄호
			
			if(choice==2) { // 안전요원 선택
				
				// 전직 후 전 단계 현황 프린트
				line.start();
				System.out.println("직업 : "+safe.name+"(일급+2000 / 벽돌+2)");
				Thread.sleep(500);
				System.out.println("재산: "+user.workmanhavemoney+"원");
				Thread.sleep(500);
				System.out.println("벽돌: "+item.itemhave+"개");
				Thread.sleep(500);
				System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
				Thread.sleep(500);
				select.printselect();
				
				// 안전요원 게임 시작부분
				
				for(int a=1; a<=1000000; a++) { // 
					choice=scan.nextInt(); 
					line.start();
					if(choice==1) { //일을 한다 선택경우
						일을한다소리 f = new 일을한다소리();
						Thread t = new Thread(f);
						t.start();
						// 지진발생 
						Buildlucky r = new Buildlucky(a,build);
						Thread builddown = new Thread(r);
						builddown.start();
						builddown.join();
						// 지진발생 끝
						Workmanlucky o = new Workmanlucky(a,user,item);
						Thread workchance = new Thread(o);
						workchance.start();
						workchance.join();
						//럭키찬스 끝
						System.out.println("직업 : "+safe.name+"(일급+2000 / 벽돌+2)");
						Thread.sleep(500);
						user.safeaddmoney(1); // 일급을 재산에 추가하는 메소드 (1)가운데 숫자는 관련없음
						System.out.println("재산: "+user.workmanhavemoney+"원");
						Thread.sleep(500);
						System.out.println("벽돌: "+item.itemhave+"개");
						Thread.sleep(500);
						System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
						line.start2();
						build.up();
					}
					if(choice==2) { //벽돌을 쌓는다 선택경우
						벽돌을쌓는다소리 m = new 벽돌을쌓는다소리();
						Thread t = new Thread(m);
						t.start();
						// 지진발생 
						Buildlucky r = new Buildlucky(a,build);
						Thread builddown = new Thread(r);
						builddown.start();
						builddown.join();
						// 지진발생 끝
						System.out.println("직업 : "+safe.name+"(일급+2000 /벽돌 +2)");
						Thread.sleep(500);
						item.minus(); // 벽돌개수 1개씩 줄이기
						build.upbuild();
						System.out.println("재산 : "+user.workmanhavemoney+"원");
						Thread.sleep(500);
						System.out.println("벽돌: "+item.itemhave+"개");
						Thread.sleep(500);
						build.printbuild();
						Thread.sleep(500);
						System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
						System.out.println();
						line.start2();
						build.up();
					}
					if(choice==3) { //벽돌을 산다
						벽돌을산다소리 d = new 벽돌을산다소리();
						Thread t = new Thread(d);
						t.start();
						// 지진발생 
						Buildlucky r = new Buildlucky(a,build);
						Thread builddown = new Thread(r);
						builddown.start();
						builddown.join();
						// 지진발생 끝
						System.out.println("직업 : "+safe.name+"(일급+2000 /벽돌+2)");
						Thread.sleep(500);
						item.safeworkplusitem(user);  
						user.workminusitemmoney();
						System.out.println("재산 : "+user.workmanhavemoney+"원");
						Thread.sleep(500);
						System.out.println("벽돌: "+item.itemhave+"개");
						Thread.sleep(500);
						System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
						line.start2();
						build.up();
					}
					if(build.currentbuild==build.buildmax) { // 10층 건설시 종료 메소드
						line.start();
						System.out.println("게임성공!");
						System.exit(0);
					}else if(choice!=1 && choice!=2 && choice!=3 ) { // 1,2가 아닌 다른 선택을 할 경우 처음으로
						a--;
						line.start();
						System.out.println("올바른 선택을 하세요");
					}
					select.printselect();
				} // 안전요원 플레이 괄호 끝
				
			}// 안전요원 전직선택 괄호 끝
			
		} // 노동자 선택 끝 괄호
		
		
		
		
		else if(choice==2){// 사업가 선택시 초기화면 
			
			//job.setmoney(choice); 사업가 선택했을 때 초기자금 1만원 셋업
			line.start();
			System.out.println("직업 : 사업가 (재산+랜덤수익률)");
			Thread.sleep(500);
			System.out.println("재산 : 10000원");
			Thread.sleep(500);
			System.out.println("벽돌: 0개");
			Thread.sleep(500);
			System.out.println("건설층 : 0층");
			Thread.sleep(500);
			select.printselect();
			
			for(int a=1; a<=100000; a++) { // 
				choice=scan.nextInt(); 
				line.start();
				if(choice==1) { //일을 한다 선택경우
					일을한다소리 f = new 일을한다소리();
					Thread t = new Thread(f);
					t.start();
					// 지진발생 
					Buildlucky r = new Buildlucky(a,build);
					Thread builddown = new Thread(r);
					builddown.start();
					builddown.join();
					// 지진발생 끝
					// 럭키찬스
					Joblucky n = new Joblucky(a,user);
					Thread companychance = new Thread(n);
					companychance.start();
					companychance.join();
					//럭키찬스 끝
					System.out.println("직업 : "+company.name+"(수익률랜덤)");
					Thread.sleep(500);
					user.companyaddmoney(1); // 일급을 재산에 추가하는 메소드
					System.out.println("재산: "+user.companyhavemoney+"원");
					Thread.sleep(500);
					System.out.println("벽돌: "+item.itemhave+"개");
					Thread.sleep(500);
					System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
					line.start2();
					build.up();
				}
				if(choice==2) { //벽돌을 쌓는다 선택경우
					벽돌을쌓는다소리 m = new 벽돌을쌓는다소리();
					Thread t = new Thread(m);
					t.start();
					// 지진발생 
					Buildlucky r = new Buildlucky(a,build);
					Thread builddown = new Thread(r);
					builddown.start();
					builddown.join();
					// 지진발생 끝
					item.minus(); // 벽돌개수 1개씩 줄이기
					System.out.println("직업 : "+company.name+"(수익률랜덤)");
					build.upbuild();
					Thread.sleep(500);
					System.out.println("재산: "+user.companyhavemoney+"원");
					Thread.sleep(500);
					build.printbuild();
					System.out.println("벽돌: "+item.itemhave+"개");
					Thread.sleep(500);
					System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
					System.out.println();
					line.start2();
					build.up();
				}
				if(choice==3) { //벽돌을 산다
					벽돌을산다소리 d = new 벽돌을산다소리();
					Thread t = new Thread(d);
					t.start();
					// 지진발생 
					Buildlucky r = new Buildlucky(a,build);
					Thread builddown = new Thread(r);
					builddown.start();
					builddown.join();
					// 지진발생 끝
					item.plusitem(user);
					user.companyminusitemmoney();
					System.out.println("직업 : "+company.name+"(수익률랜덤)");
					Thread.sleep(500);
					System.out.println("재산: "+user.companyhavemoney+"원");
					Thread.sleep(500);
					System.out.println("벽돌: "+item.itemhave+"개");
					Thread.sleep(500);
					System.out.println("건설층수: "+build.printbuild+"층"+"(벽돌 "+build.currentbuild+"개)");
					line.start2();
					build.up();
				}
				if(build.currentbuild==build.buildmax) { // 10층 건설시 종료 메소드
					line.start();
					System.out.println("게임성공!");
					System.exit(0);
				}else if(choice!=1 && choice!=2 && choice!=3) { // 1,2가 아닌 다른 선택을 할 경우 처음으로
					a--;
					line.start();
					System.out.println("올바른 선택을 하세요");
				}
		
				select.printselect();
			} 
			
			
		} // 사업가 선택 끝 괄호
		
	

	
		
		
	} // 메인 메소드 종료괄호

} // game 클래스 종료 괄호
