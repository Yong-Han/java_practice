class SwitchEx01 {
	public static void main(String [] args){
		int num1 = (int)(Math.random()*7)+1;
		char day = '��';

		System.out.println("daynumber = "+num1);

	
		switch (num1)
		{
		case 1: day = '��'; break;
		case 2: day = 'ȭ'; break;
		case 3: day = '��'; break;
		case 4: day = '��'; break;
		case 5: day = '��'; break; 
		case 6: day = '��'; break;
		default : day = '��';
		}
		System.out.println("������ " +day+"���� �Դϴ�.");

	}

}