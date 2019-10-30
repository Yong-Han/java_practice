class SwitchEx02 {
	public static void main(String [] args){
	int month = (int)(Math.random()*12)+1;
	int month2 = (int)(Math.random()*12)+1;
	int day,day2;

	System.out.println("month= "+month);
	switch(month)
		{
			case 2: day = 28; break;
			case 4: day = 30; 
			case 6: day = 30;
			case 9: day = 30; 
			case 11: day = 30; break;
			default : day = 31;

		}
		System.out.println(+month+"월은 " +day+"일 까지 입니다.\n");


	 System.out.println("month2 = "+month2);

	 if(month2 == 2)
		 day2 = 28;
	 else if (month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11)
		 day2 = 30;
	 else
		 day2 = 31;

		System.out.println(+month2+"월은 " +day2+ "일 까지 입니다.");



	}

}