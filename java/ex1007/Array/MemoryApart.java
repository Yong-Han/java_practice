class MultiArray{
//������ 2���� �迭 8*9
	int arr[][] = new int [8][9];
	
//�޼ҵ��̸� :array99
	void array99(){
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<9;j++)
			{
				arr[i][j] =(i+2)*(j+1[); 
			}
		}
	}
	void print(){
			for(int i=0;i<8;i++)
			{
				for(int j=0;j<9;j++){
					System.out.print(arr[i][j]+"  ");
				}	
			System.out.println();
			}
	}
	
	//for loop �� ����Ͽ� 
	//�迭�� ���� (������)�������
	//�迭�� ����� �������
		
	
		
		
}
public class MemoryApart{
//main�޼ҵ忡�� 
//MultiArray��ü�� array99�޼ҵ�ȣ��
	public static void main(String [] args)
	{
		MultiArray m = new MultiArray();
		m.array99();
		m.print();
	}
	
}

