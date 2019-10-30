class Test{

	private Test(){} //�ܺο��� ��ü �������� (�ٸ� Ŭ�������� Test ���� = new Test �� ���� ����)


	//TestŬ������ �����ڸ� ���� private�� ������� ������ ��ü ������ ���� �޼ҵ� �ۼ�
	public static Test getInstance(){
		Test instance = new Test();
		return instance;

	}
}

class Test2
{
	private static Test2 instance = new Test2();
	private Test2(){}

	public static Test2 getInstance(){
		return instance;
	}
}

class PrivateConstructorExam {
	public static void main(String [] args){

	//	Test t1 = new Test();
	//	Test t2 = new Test(); Test ��ü�� private Test�̹Ƿ� �����ȵ�
		
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();

		System.out.println("t1 �ּҰ� : " +t1);
		System.out.println("t2 �ּҰ� : " +t2);

		Test2 t3 = Test2.getInstance();
		Test2 t4 = Test2.getInstance();
		
		System.out.println("t3 �� �ּҰ� :"+t3);
		System.out.println("t4 �� �ּҰ� :"+t4);


	}
}