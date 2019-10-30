class SwitchEx01 {
	public static void main(String [] args){
		int num1 = (int)(Math.random()*7)+1;
		char day = '일';

		System.out.println("daynumber = "+num1);

	
		switch (num1)
		{
		case 1: day = '월'; break;
		case 2: day = '화'; break;
		case 3: day = '수'; break;
		case 4: day = '목'; break;
		case 5: day = '금'; break; 
		case 6: day = '토'; break;
		default : day = '일';
		}
		System.out.println("오늘은 " +day+"요일 입니다.");

	}

}