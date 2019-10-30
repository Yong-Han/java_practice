/*
	이름 : 배용한
	날짜 : 0930
	주제 : 성적표기능

*/



class ScoreFunction 
{
	public static void main(String[] args) 
	{
		String userName = "배용한";
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
		System.out.println("이름 : " +userName);
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avr);

		System.out.println("학점 : " +grade);

		avr = ((int)(avr*100))/100.0;

		System.out.println("avr : " +avr);


	}
}
