
class ArrayValue{
	//������ 10�� �����ϴ� �迭����(����� ���ÿ� ���ǰ� ����)
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	


   /*printArrayvalue �޼ҵ��ۼ�
       => �޼ҵ� �ȿ��� ���� ����� �迭���� ���� ����Ѵ�.
   
	*/			
		void printArrayvalue(){
		int len = arr.length;
//		for (int i=0;i<len ;i++) {System.out.print(arr[i]+"  ");}
		
	//	for(dataType ���� �̸�: �ݺ����){}//Iterator
		for( int i : arr) {System.out.print(i +"  ");}

	}
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue�� �ִ� printArrayvalue�޼ҵ� ȣ��
		ArrayValue a = new ArrayValue();
		a.printArrayvalue();
		System.out.println();

	}
}