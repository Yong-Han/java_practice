/*
	�̸� : �����
	��¥ : 0930
	���� : ����ǥ���

*/



class ScoreFunction 
{
	public static void main(String[] args) 
	{
		String userName = "�����";
		int kor,eng,math,total;
		double avr;
		char grade;

		kor = 90;
		eng = 95;
		math = 95;
		total = kor + eng + math;
		avr = (double)total/3;


	//	avr = avr-10;	 

		grade = (avr>= 90)? 'A' : 'F';
		System.out.println("�̸� : " +userName);
		System.out.println("���� ���� : "+kor);
		System.out.println("���� ���� : "+eng);
		System.out.println("���� ���� : "+math);
		System.out.println("���� : "+total);
		System.out.println("��� : "+avr);

		System.out.println("���� : " +grade);

		avr = ((int)(avr*100))/100.0;

		System.out.println("avr : " +avr);


	}
}
