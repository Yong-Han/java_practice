class WhileEx01 {
	public static void main(String [] args){
	//1. 1~100���� ���ٷ� ���
	//2. 1~100���� 10�� 10���� ���
	//3. 1~100���� 3�� ����� ���� ���
	//4. ������ ���
	int i,j;
	int total;

	i=1;
	while(i<=100)
		{
		System.out.print(i+" ");
		i++;
		}

	System.out.println("\n 2�� ===============");
	i=1;
	total=1;
	while(i<=10)
		{
			j=1;
			while(j<=10)
			{
				System.out.print(total+"\t");
				total++;
				j++;
			}
			System.out.println();
			i++;
		}
	System.out.println("\n 3�� ===============");


	i=1;
	while(i<=9)
		{
		j=2;
		while(j<=9)
			{
				System.out.print(j + "*" + i + "=" + j*i + "\t");
				j++;
			}
			i++;
			System.out.println();
				
		}
	System.out.println("\n 4�� ===============");
	
	i=1;
	total=0;
	while(i<=100)
		{
			if(i%3==0) total = total + i;
			i++;
		}
	System.out.println("1~100���̿��� 3�� ����� �� : "+total);
	

	}
}