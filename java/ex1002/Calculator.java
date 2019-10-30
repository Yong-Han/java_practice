import java.util.Scanner;

class Calculator{
	public static void main(String [] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int i1= sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int i2= sc.nextInt();
		System.out.print("연산 기호 입력(+,-,*,/,%)");
		String s = sc.next();

		Calculator c = new Calculator();
		c.cal(i1, i2, s);
		

	
	}
	public void cal(int i1, int i2, String s){
		char ch = s.charAt(0);
		if (ch=='+') System.out.println("두 연산의 합 : "+(i1+i2));
		else if (ch=='-') System.out.println("두 연산의 차 : "+(i1-i2));
		else if (ch=='*') System.out.println("두 연산의 곱 : "+(i1*i2));
		else if (ch=='/') System.out.println("두 연산의 나누기 : "+(i1/(double)i2));	
		else if (ch=='%') System.out.println("두 연산의 나머지 : "+(i1%i2));
		else System.out.println("연산 기호 오류!!");
		}
}
