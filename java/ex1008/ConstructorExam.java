
//ConstructorExam.java
class Puppy{
		//String,int  Ÿ�� ���� ���� ����(member ��������)
		String s;
		int a;
		
		/*	�޼ҵ� printPuppyName�ۼ�
			�μ�����, ���Ͼ���
			"public void printPuppyName() ȣ��Ǿ����ϴ�!"���
			���������� ���
		*/	
		public void printPuppyName() {
			System.out.println("pulbic void printPuppyName() ȣ��Ǿ����ϴ�!");
			System.out.println("��Ʈ���� ���� ���� �� = " + s);
			System.out.println("��Ʈ�� ���� ���� �� = "+a);

		}

		
		/*�μ��� ���� ������ �ۼ�
			"������ public Puppy() ȣ��Ǿ����ϴ�!"���
			printPuppyName�޼ҵ� ȣ��
				�������� String��"�޸�" �Ҵ�
			�������� int�� -98998 �Ҵ�
		*/
		public Puppy() {
			System.out.println("������ public Puppy()ȣ��Ǿ����ϴ�!");
			printPuppyName();
			s = "�޸�";
			a = -98998;
		}
			
		
}
class ConstructorExam{
	//���θ޼ҵ忡��
	public static void main(String [] agrs){
		//Puppy��ü ����
		Puppy p ;
		p = new Puppy();
		
		System.out.println("==================");
		//Puppy��ü�� printPuppyName�޼ҵ� ȣ��
		p.printPuppyName();

	}
}
			
