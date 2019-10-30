class DoWhileEx01 {
	public static void main(String [] agrs){

		int i,j;
		int total;

		i=1;
		do{
			System.out.print(i+" " );
			i++;
		}while(i<=100);

	System.out.println("\n\n");

		i=0;
		total=1;
		do{
			i++;
			j=0;
			do{
				j++;
				System.out.print(total+"\t");
				total++;
			}while(j<10);
			System.out.println();
		}while(i<10);

	i=0;
	total=0;
	do{
			if(i%3==0) total = total + i;
			i++;
		}
		while(i<=100);
	System.out.println("\n\n1~100사이에서 3의 배수의 합 : "+total);
	i=1;
	do{
		j=2;
		do{
			System.out.print(j+"x"+i+"="+j*i+"\t");
			j++;

		}while(j<=9);
		i++;
		System.out.println();
	}while(i<=9);

	

	}

}