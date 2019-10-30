class Test
{
	public static void main(String[] args) 
	{
		int arr[][] = new int [8][9];
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<8;j++)
			{
				arr[i][j] =(i+1)*(j+1); 
			}
		}
					for(int i=0;i<=8;i++)
			{
				for(int j=0;j<=9;j++)
					System.out.print(arr[i][j]+"  ");
			}


	}
}
