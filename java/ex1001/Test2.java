/*
	���� �߻� ����
	double a = (Math.random()*����Ǽ�) + �ּڰ�;
	int a = (int)((Math.random()*����Ǽ�)+�ּڰ�);
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
		char day='��';



		if(dayNum == 0)
			day = '��';	
		else if (dayNum ==1)
			day = 'ȭ';
		else if (dayNum ==2)
			day = '��';
		else if (dayNum ==3)
			day = '��';
		else if (dayNum ==4)
			day = '��';
		else if (dayNum ==5)
			day = '��';
		else if (dayNum ==6)
			day = '��';

		System.out.println("������ " +day + "���� �Դϴ�.");


	}


}