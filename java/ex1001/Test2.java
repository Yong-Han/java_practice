/*
	난수 발생 공식
	double a = (Math.random()*경우의수) + 최솟값;
	int a = (int)((Math.random()*경우의수)+최솟값);
*/

class Test2 {
	public static void main(String [] args)
	{
		double nansu = Math.random(); // 0 ~ 0.99999...
		System.out.println("nansu = " +nansu);

		int nansu2 = (int)(Math.random()*10)+1;
		System.out.println("nansu2 = "+nansu2);

		int dayNum = (int)(Math.random()*7);
		System.out.println("dayNumber = " +dayNum);
		char day='토';



		if(dayNum == 0)
			day = '월';	
		else if (dayNum ==1)
			day = '화';
		else if (dayNum ==2)
			day = '수';
		else if (dayNum ==3)
			day = '목';
		else if (dayNum ==4)
			day = '금';
		else if (dayNum ==5)
			day = '토';
		else if (dayNum ==6)
			day = '일';

		System.out.println("오늘은 " +day + "요일 입니다.");


	}


}