package java_class;

public class Select {

		public void printselect() throws InterruptedException{
			System.out.println();
			Thread.sleep(500);
			System.out.println("*** 다음 행동을 선택하세요");
			Thread.sleep(500);
			System.out.println();
			System.out.println("1. 일을한다 ");
			Thread.sleep(500);
			System.out.println("2. 벽돌을 쌓는다");
			Thread.sleep(500);
			System.out.println("3. 벽돌을 산다 (-10000)");
			System.out.println();
		}
		
		public void printnextworkman() throws InterruptedException{
			System.out.println();
			Thread.sleep(500);
			System.out.println("*** 다음 전직을 선택하세요");
			System.out.println();
			Thread.sleep(500);
			System.out.println("1. 기술자 (벽돌 사기 +1)");
			Thread.sleep(500);
			System.out.println("2. 안전요원 (일급+2000)");
			System.out.println();
		}
}
