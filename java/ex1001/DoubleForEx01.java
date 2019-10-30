class DoubleForEx01 {
	public static void main(String [] args){
	//1.   1~100 까지 출력 (for문안에 for문을 이용하여 출력)

	//2.  구구단 출력
		/* 
			2*1 = 2     3*1 = 3 ..... 9*1=9
			2*2 = 4     3*2 = 3 ..... 9*2=9

			...						  9*9=81
		*/
	int i,j;
	int num=1;

	for(i=1;i<=10;i++)
		{
		for(j=1;j<=10;j++){
			System.out.print(num+"\t");
			num++;
			}
			System.out.println();
			
		}
//	System.out.println("\n"+num); //현재 num수

	System.out.println("===구구단 세로 ===");
	for(i=1;i<=9;i++)
		{
		for(j=2;j<=9;j++)
			{
				System.out.print(j+ " * " +i+ " = " +j*i+ "\t");
			}
			System.out.println();
		}
	
	System.out.println("\n===구구단 가로 ===");

	for(i=2;i<=9;i++) {
		for(j=1;j<=9;j++){
			System.out.print(i+ " * " +j+ " = " +i*j+ "\t");
		}
		System.out.println();
	}

		System.out.println("===구구단 5단빼고 ===\n\n");
	for(i=1;i<=9;i++)
		{
		for(j=2;j<=9;j++)
			{
				if(j==5) continue;
				System.out.print(j+ " * " +i+ " = " +j*i+ "\t");
			
			}
			System.out.println();
		}
	
		System.out.println("\n\n===구구단 5단까지만 출력 ===");
	for(i=1;i<=9;i++)
		{
		for(j=2;j<=9;j++)
			{
			//	if(j==6) break;
			//	if(j>5) continue;
				if(j>5) break;
				System.out.print(j+ " * " +i+ " = " +j*i+ "\t");
		
			
			}
			System.out.println();
		}


	}
}