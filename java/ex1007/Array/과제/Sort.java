class Sort
{
	public static void main(String[] args) 
	{
		int arr[] = {5,7,1,2,4,3,8,9,6,10};
		int len = 10;

		int i,j,k;
		
		System.out.print("���� �迭 : ");
		for(i=0;i<len;i++) System.out.print(arr[i]+" ");

		System.out.print("\n\n������ �迭 : ");

		for(i=1;i<len;i++) 
		{
			k=arr[i]; //���Ե� i��° ������ k�� ����
			for(j=i-1; j>=0 && arr[j]>k; j--)
			{
				arr[j+1] = arr[j];
				//(�ε���1~9) i-1���� �������� k���� Ŭ�� j�� j+1�� �ٲ�
			}
			arr[j+1]=k; //���������� �̵�

		}
		for(i=0;i<len;i++)
		System.out.print(arr[i]+" ");
		System.out.println();

	}
}