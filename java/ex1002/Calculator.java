import java.util.Scanner;

class Calculator{
	public static void main(String [] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int i1= sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int i2= sc.nextInt();
		System.out.print("���� ��ȣ �Է�(+,-,*,/,%)");
		String s = sc.next();

		Calculator c = new Calculator();
		c.cal(i1, i2, s);
		

	
	}
	public void cal(int i1, int i2, String s){
		char ch = s.charAt(0);
		if (ch=='+') System.out.println("�� ������ �� : "+(i1+i2));
		else if (ch=='-') System.out.println("�� ������ �� : "+(i1-i2));
		else if (ch=='*') System.out.println("�� ������ �� : "+(i1*i2));
		else if (ch=='/') System.out.println("�� ������ ������ : "+(i1/(double)i2));	
		else if (ch=='%') System.out.println("�� ������ ������ : "+(i1%i2));
		else System.out.println("���� ��ȣ ����!!");
		}
}
