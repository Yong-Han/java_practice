import java.util.Scanner;

class Test3{
	public static void main(String [] agrs){
		
		boolean run = true;
		int balance = 0;
		int i=0;

		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("==============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("==============================");
			System.out.println("선택 > ");
			i = scanner.nextInt();
	
			System.out.println("예금액 > ");
			if(i==4) break;
		
		}

	}
}