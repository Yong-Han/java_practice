class Puppy3{
	/*String Ÿ�� ���� ���� ����
		int Ÿ�� ���� ���� ����*/
		String s;
		int a;
	
	/*�μ��� ���� �������ۼ�
		String Ÿ�� ���������� "�޸�" �Ҵ�
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
		�������� ���
	*/
	public Puppy3() {
		s = "�޸�";
		System.out.println("1�� ������ public Puppy3() ȣ��Ǿ����ϴ�.");
		System.out.println("���� ��Ʈ�� ���� �� = " +s);
		System.out.println("���� ��Ʈ�� ���� �� = " +a);

	}
	

	/*String Ÿ���� �μ� 1���� �޴� �������ۼ�
		String Ÿ�� ���������� �μ� �Ҵ�
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
		�������� ���
	*/
	public Puppy3(String str) {
		s=str;
		System.out.println("2�� ������ public Puppy3(String str) ȣ��Ǿ����ϴ�.");
		System.out.println("���� ��Ʈ�� ���� �� = " +s);
		System.out.println("���� ��Ʈ�� ���� �� = " +a);

	}
		
	
	/*String Ÿ���� �μ� 2���� �޴� �������ۼ�
		�μ�2���� �ϳ��� String���� �����
		String Ÿ���� �μ� 1���� �޴� �����ڿ��� �μ��� �ָ� ȣ��
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
	*/
	public Puppy3(String s1, String s2) {
		this(s1+s2);
		System.out.println("3�� ������ public Puppy3(String s1, String s2) ȣ��Ǿ����ϴ�.");


	}
		
	
	
	/*boolean Ÿ���� �μ� 1���� �޴� �������ۼ�
		�μ��� "��"�� �ٿ� �ϳ��� String���� �����
		String Ÿ���� �μ� 1���� �޴� �����ڿ��� �μ��� �ָ� ȣ��
		"puplic Puppy3()ȣ��Ǿ����ϴ�"  ���
	*/					
	public Puppy3(boolean b){
		this("��"+b);
		System.out.println("4�� ������ public Puppy3(boolean b) ȣ��Ǿ����ϴ�.");
	}
	
	
	/*char Ÿ���� �μ� 1���� �޴� �������ۼ�
			�μ��� ���� �����ڸ� ȣ���ϰ�
			�μ��� ���� data�� intŸ�� ���������� �Ҵ�	
			"puplic Puppy3()ȣ��Ǿ����ϴ�"���
			int�� �����������
	*/
	public Puppy3(char ch) {
		this();
		a=ch;
		System.out.println("5�� ������ public Puppy3(char ch) ȣ��Ǿ����ϴ�.");
		System.out.println("int�� �������� : "+a);

	}
	
	/*�޼ҵ� printMemberVariable
	���� ����
	���������� ���
	*/	
	public void printMemberVariable()
	{
		System.out.println("�������� String�� : "+s);
		System.out.println("�������� int �� : "+a);
	}

	
}

class ConstructorOverloadingExam{
		//���θ޼ҵ忡��
		public static void main(String [] args){
			//Puppy3 Ŭ������ �� �����ڸ� �ѹ��� �̿��� ��ü 5�� ����
			Puppy3 p1 = new Puppy3();
			System.out.println("========2.============");
			Puppy3 p2 = new Puppy3("����");
			System.out.println("========3.============");
			Puppy3 p3 = new Puppy3("��Ÿ��","�ݿ���");
			System.out.println("========4.============");
			Puppy3 p4 = new Puppy3(true);
			System.out.println("========5.============");
			Puppy3 p5 = new Puppy3('A');
		
			System.out.println("\n\n\n");
			
		//�� ��ü�� printMemberVariable�޼ҵ带 �ѹ��� ȣ��
			p1.printMemberVariable();
			p2.printMemberVariable();
			p3.printMemberVariable();
			p4.printMemberVariable();
			p5.printMemberVariable();
			
	}
}