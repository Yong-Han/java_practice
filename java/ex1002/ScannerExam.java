import java.util.Scanner;

class ScannerExam{
	public static void main(String [] agrs){
		//Ű���� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng= sc.nextInt();
		System.out.print("�̸��� ? ");
		String name = sc.next();

		int total = kor + eng;
		System.out.println(name+"�� ������ "+total+"�Դϴ�.");
	
		System.out.println("����");

	}

}