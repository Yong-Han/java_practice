//UsingMethod.java
class UsingMethodExam{
     //�Ʒ��� ���� �޼ҵ带 �ۼ��ϼ���.
   
     /*Method�̸� :  methodExam03_01
     �ڱ��ڽŸ� ���ٰ���
     ReturnType : ����
     Parameter : ���� 1��
	(�����ο���)�ϴ� �� : 
	methodExam03_01�� ȣ��Ǿ����ϴ�. ���
	�μ��� ���� ���� ��� 
	����*2 ����. */
	private int methodExam03_01(int i) {
		System.out.println("methodExam03_01�� ȣ��Ǿ����ϴ�.");
		System.out.println("�μ��� ���� ���� : "+i);

		return i*2;
	}
		
	
	 
	 /*Method�̸� :  methodExam03_02
     ��𼭳� �ƹ��� ���ٰ���
     Return String
     Parameter : String 1��, ���� 1��
	(�����ο���)�ϴ� �� : 
		methodExam03_02�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� String �� �ٺ��� �ٿ��� ���
		�ι�°�μ��� ���� ���� methodExam03_01�� �־� �ָ� methodExam03_01�� ȣ���ϰ� �����ϴ� ���� ���
		�μ��� ���� String �� �ٺ��� �ٿ��� ����
	*/
	public String methodExam03_02(String s, int i) {
		System.out.println("methodExam03_02�� ȣ��Ǿ����ϴ�.");
		System.out.println(s+"�ٺ�");
		int temp = this.methodExam03_01(i);
		System.out.println("���� �� : "+temp);

		return s+"�ٺ�";

	}
			
	
	 /*Method�̸� :  methodExam03_03
     ���� package���� �ƹ��� ���� ����
     ReturnType : ���Ͼ���
     Parameter : ���� 1���� String 1��
     (�����ο���)�ϴ� �� : 
		methodExam03_03�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� ���� 1���� String 1���� �Ѱ��ָ�
		methodExam03_02ȣ��
	*/	
		
	void methodExam03_03(int i, String s) {
		System.out.println("methodExam03_03�� ȣ��Ǿ����ϴ�.");
		this.methodExam03_02(s,i);

	}
     
     /*Method�̸� :  methodExam03_04
     ��Ӱ����� ��𼭳� ���� ����
     ReturnType : �Ǽ�(�ε��Ҽ���)
     Parameter : ù��° �μ�(����),�ι�° �μ�(�Ǽ�), ����°�μ�(����)
	(�����ο���)�ϴ� �� : 
		methodExam03_04�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� ���� �̿��� 
		MakeMethodExam02��ü�� methodExam02_04�޼ҵ� ȣ���ϰ�
		method02_04�� �����ϴ� ���� ����
	*/
	protected double methodExam03_04(int i1, double d1, int i2){
		System.out.println("methodExam03_04�� ȣ��Ǿ����ϴ�.");
		MakeMethodExam02 temp = new MakeMethodExam02();
		double result = temp.methodExam02_04(i1, d1, i2);
		return result;
		


	}

		
} // UsingMethodExam ��

class UsingMethod{
	public static void main (String [] args)
	{
		String str = "AAAA";
		UsingMethodExam m = new UsingMethodExam();
	//	m.methodExam03_01(11); methodExam03_01 private access�� ���� �Ұ���
		System.out.println("���� str : " +str);
		str = m.methodExam03_02("zzz",92);
		System.out.println("���ϰ��� ���� str : "+str);
		System.out.println("\n");

		m.methodExam03_03(100, "��������");


		double result = 0.0;
		System.out.println("���� result �� : "+result);
		result = m.methodExam03_04(17,2.9,23);
		System.out.println("�޼ҵ� ȣ�� �� result �� : "+result);



	}
	//���θ޼ҵ忡��
		//UsingMethodExam�� ȣ�Ⱑ���� �޼ҵ���� ȣ���ϰ�
		// �����ϴ� �� �ִٸ� ���
		
	
}

  
