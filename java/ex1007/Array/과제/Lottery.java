class Lottery
{
	public static void main(String[] args) 
	{
		LotteryFucntion l = new LotteryFucntion();
		l.makeNum();
		l.sort();
		l.print();

	}
}

class LotteryFucntion
{
	int arr[] = new int[6];
	int len = 6;
	int k,j;
	public void makeNum(){
		for (int i=0;i<len ;i++)
		{
			arr[i]=(int)(Math.random()*45+1);	
		
			for(j=0;j<i;j++)  		
			{
				if(arr[i]==arr[j]){  //중복이 있을시에
				i--;
				break;  //i값을 감소시키고 다시 루프
				}
			}	
		}
	}
	public void sort(){
	
		for(int i=1;i<len;i++) {
			k=arr[i];
			for(j=i-1;j>=0 && arr[j]>k ; j--){
				arr[j+1] = arr[j];
			}
			arr[j+1] = k;
		}
	}

	public void print(){
		for(int i =0;i<len;i++)
		System.out.println(arr[i]);
	}
}
