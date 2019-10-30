class Sort
{
	public static void main(String[] args) 
	{
		int arr[] = {5,7,1,2,4,3,8,9,6,10};
		int len = 10;

		int i,j,k;
		
		System.out.print("현재 배열 : ");
		for(i=0;i<len;i++) System.out.print(arr[i]+" ");

		System.out.print("\n\n정렬후 배열 : ");

		for(i=1;i<len;i++) 
		{
			k=arr[i]; //삽입될 i번째 정수를 k에 저장
			for(j=i-1; j>=0 && arr[j]>k; j--)
			{
				arr[j+1] = arr[j];
				//(인덱스1~9) i-1부터 역순으로 k보다 클때 j를 j+1로 바꿈
			}
			arr[j+1]=k; //오른쪽으로 이동

		}
		for(i=0;i<len;i++)
		System.out.print(arr[i]+" ");
		System.out.println();

	}
}