class Methodinvoke01{
	//������ ���� �޼ҵ带 �ۼ��ϼ���.
	
	/*method �̸� : method01
	��𼭳� ������ ���ٰ���
	���� ����
	�μ��� ����2�� ����
	�μ��� ���� ���� 2���� ���ؼ� ����ϰ� ����*/
	public int method01(int i1, int i2){
		System.out.println("�� ������ �� = "+(i1*i2));
		return i1*i2;
	}

		
	
}

class Methodinvoke02{
	
	//method �̸� : method02
	//��𼭳� ������ ���ٰ���,��ü�� �������� �ʰ� ���ٰ���
	//���� ����
	//�μ��� ����2�� ����
	
	//�μ��� ���� ���� 2���� ���ؼ� ����ϰ� ���Ѽ� ����
		
		public static int method02(int i1, int i2){
		System.out.println("�� ������ �� = "+(i1+i2));
		return i1+i2;
	}	
	

	
}

class MethodInvokeExam{
	public static void main(String []args){
		
		//MethodInvoke01�� method01 ȣ��
		Methodinvoke01 miv01;
		miv01 = new Methodinvoke01();
		miv01.method01(4, 2);


		//MethodInvoke02�� method02 ȣ��
//		Methodinvoke02 miv02;
//		miv02 = new Methodinvoke02();
		Methodinvoke02 miv02 = new Methodinvoke02();

		//miv02.method02(3,4);
		Methodinvoke02.method02(3,32); //Methodinvoke02Ŭ������ method02�޼ҵ尡 static�̸� ����
		

	}
}

