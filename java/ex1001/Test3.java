import java.util.Scanner;

class Test3{
	public static void main(String [] agrs){
		
		boolean run = true;
		int balance = 0;
		int i=0;

		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("==============================");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("==============================");
			System.out.println("���� > ");
			i = scanner.nextInt();
	
			System.out.println("���ݾ� > ");
			if(i==4) break;
		
		}

	}
}