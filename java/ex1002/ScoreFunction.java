/*
	1002과제 
	배용한
*/

import java.util.Scanner;

class ScoreFunction{
	public static void main(String []args){
		Function f = new Function();
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 성적 입력 :");
		int kor = sc.nextInt();
		System.out.print("영어 성적 입력 :");
		int eng = sc.nextInt();
		System.out.print("수학 성적 입력 :");
		int math = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		f.print(name, kor, eng, math);
		//int total = f.getTotal(kor, eng, math); //access error
		
	
	}
}

class Function{
	private int getTotal(int kor, int eng, int math){
	
		return kor+eng+math;
	}

	private double getAvg(int total, int num){
	
	return total/(double)num;
	}

	private char getRank(double avg){
		if(avg>=90) return 'A';
		else if (avg>=80) return 'B';
		else if (avg>=70) return 'C';
		else if (avg>=60) return 'D';
		else return 'F';
	}
		public void print(String s, int kor, int eng, int math)
	{
		int total=getTotal(kor, eng, math);
		double avg=getAvg(total, 3);
		char rank =getRank(avg);
		System.out.println("================================");
		System.out.println(s+"의 총점 : "+total);
		System.out.println(s+"의 평균 : "+String.format("%.2f", avg));
	//	System.out.printf("%s의 평균 : %.2f \n",s,avg);
		System.out.println(s+"의 등급 : "+rank);
		

	}



}