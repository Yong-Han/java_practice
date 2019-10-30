class ForEx01 {
	public static void main(String [] args){
	// 1.  1~100까지 한줄 출력
	// 2.  1~100까지 10행 10열로 출력 for문 안에 if문 이용
	// 3.  A~Z를 출력
	// 4.  1~10까지 합을 출력
	// 5.  100부터 1까지 출력
	int i;
	int total =0;
	char ch = 'A';

	for(i = 1; i<=100; i++)
		System.out.print(i+" ");

	System.out.println("\n==============================================");

	for(i=1;i<=100;i++)
		{
			System.out.print(i+"\t");
			if(i%10 ==0) System.out.println();
		}
	System.out.println("\n==============================================");

	for(i=1;i<=26;i++)
		{
		System.out.print(ch+" ");
		ch++;
		}
	System.out.println();
	for(ch='a'; ch<='z';ch++)
		System.out.print(ch+" ");


	System.out.println("\n==============================================");

	for(i=1;i<=10;i++)
		total = total +i;

	System.out.println("1~10까지의 합 : "+total);
	System.out.println("\n==============================================");

	for(i=100;i>=1;i--)
		{
		if(i%5==0)
			System.out.print(i+" ");
		}

	System.out.println();

	for(i=1;i<=100;i*=2)
		System.out.print(i+" ");


	}


}