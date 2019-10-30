import java.util.Scanner;

class ScannerExam{
	public static void main(String [] agrs){
		//키보드 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng= sc.nextInt();
		System.out.print("이름은 ? ");
		String name = sc.next();

		int total = kor + eng;
		System.out.println(name+"님 총점은 "+total+"입니다.");
	
		System.out.println("종료");

	}

}