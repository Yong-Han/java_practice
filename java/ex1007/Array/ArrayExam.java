class ArrayExam{
	
	//��int,double,char,boolean ,String type���� �� 5���� �����ϴ�  �迭�� �����ϼ���
	int intArr [] = new int [5];
	double doubleArr [] = new double [5];
	char charArr [] = new char [5];
	boolean booleanArr[] = new boolean[5];
	String stringArr[] = new String[5];
	int len = intArr.length; 


	//�޼ҵ� : printArrayValue01	
	//���� �迭�鿡 �ڵ����� �ʱ�ȭ �Ȱ��� ����ϼ���
	void printArrayValue01 () {
		for(int i = 0; i<len; i++) System.out.print(intArr[i]+"\t");
		System.out.println("\n");

		for(int i = 0; i<len; i++) System.out.print(doubleArr[i]+"\t");
		System.out.println("\n");

		for(int i = 0; i<len; i++) System.out.print(charArr[i]+"\t");
		System.out.println("\n");

		for(int i = 0; i<len; i++) System.out.print(booleanArr[i]+"\t");
		System.out.println("\n");

		for(int i = 0; i<len; i++) System.out.print(stringArr[i]+"\t");
		System.out.println("\n");

	}
	
	//�޼ҵ� : printArrayValue02	
	//���� 5���� �迭���� ���� ������ ������ data�� �Ҵ��ϼ���.
	void printArrayValue02() {
		for (int i = 0; i<len; i++) {
			//intArr �Ҵ�
			intArr[i] = (i+1)*2;
			
			//doubleArr �Ҵ�
			doubleArr[i] = (i*1.5);
			
			//charArr �Ҵ�
			charArr[i] = (char)('A'+i);
			
			//boolArr�Ҵ�
			if(i%2 == 0) booleanArr[i] = true;
			else booleanArr[i] = false;
			
			//stringArr �Ҵ�
			stringArr[i] = "A"+i;
			}
	}


	
	//�޼ҵ� : printArrayValue03	
	//���Ӱ� �Ҵ�Ȱ��� ����ϼ���
	void printArrayValue03() {
		printArrayValue01();
	}
	
	//���θ޼ҵ忡��
	//ArrayExam�� �޼ҵ���� ������� ȣ���ϼ���.
	public static void main(String [] args) {
		ArrayExam ar = new ArrayExam();

		ar.printArrayValue01();
		ar.printArrayValue02(); //�迭�� ������ �Ҵ�
		System.out.println("======�迭�� �Ҵ� �� ��======\n");
		ar.printArrayValue03();
	
	}
	
}..