class ForEx01 {
	public static void main(String [] args){
	// 1.  1~100���� ���� ���
	// 2.  1~100���� 10�� 10���� ��� for�� �ȿ� if�� �̿�
	// 3.  A~Z�� ���
	// 4.  1~10���� ���� ���
	// 5.  100���� 1���� ���
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

	System.out.println("1~10������ �� : "+total);
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