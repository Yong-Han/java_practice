class Test{
	int a = 5;
	static int b = 10;

	public void aa(){//non-static method �ȿ��� static, non-static ���� ��� ���� ����
		//method aa�� �ҷ����� ���� Test ��ü�� �̸� �����Ǿ������ϱ⶧��
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(this.b);	
	}
	public void bb(){
		//method bb�� �ҷ����� ���� Test ��ü�� �̸� �����Ǿ� �����Ƿ� ��� ��
		aa();
		this.aa();
		dd();
		this.dd();
		Test.dd();
	}
	public static void cc(){ //static method������ static �� ���� ����, this Ű���� ����(�ǹ̰� ��ü �����̹Ƿ�)

	//	System.out.println(a);	//non-static a�� static method cc���� ���� �Ұ���
	//	System.out.println(this.a);	//  
		System.out.println(b);
	//	System.out.println(this.b);	
	
	//	aa();		//non-static�̹Ƿ� ���� �ȵ�
	//	this.aa();	//non-static�̹Ƿ� ���� �ȵ�

		dd();		//staic ���� �ҷ����� ����
	//	this.dd();	//���� �Ұ���
		Test.dd();
	}
	public static void dd(){
		
	}

}




class StaticExam{
	public static void main(String [] args){
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();

		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);


		System.out.println("static ���� �� ");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);
		
		t2.b = 50;
		System.out.println("static ���� �� ���� �� ");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);




	
	}

}