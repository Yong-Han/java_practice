//TwoDmArrayExam.java

class TwoDmArray{
	//String�� �����ϴ� twoDmArray �迭����
	String [][]twoDmArray = new String[10][];
	int len = 10;

	
	//�޼ҵ� make2DmArray
	public void make2DmArray(){
		//twoDmArray �迭��  ���� �Ҵ�
		
		for(int i = 0; i<len; i++){
		twoDmArray[i] = new String[10-i];
	}	//0�� 10ĭ, 1�� 9ĭ, ..... ������ ����
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++) {
				twoDmArray[i][j] = j+"��"+i+"ȣ";
			}
		}
	}	
		
	//�޼ҵ� print2DmArray
	//	twoDmArray �迭�� ���� �־����������� ���
	public void print2DmArray(){
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++) {
				System.out.print(twoDmArray[i][j]+" ");
			}
			System.out.println();
		}
	}
		
}

public class TwoDmArrayExam{
	//main�޼ҵ忡��
		public static void main(String [] args){
	
		//TwoDmArray��ü����
		TwoDmArray td = new TwoDmArray();
		
		//TwoDmArray��ü�� make2DmArray�޼ҵ� ȣ��
		td.make2DmArray();
		
		//TwoDmArray��ü�� print2DmArray�޼ҵ� ȣ��
		td.print2DmArray();
		}
	
}
