//MethodOverloadingExam.java
class OverloadedMethod{
	private int i;	//��� ���� (private)
       
	public void  setOverload(int i){
		this.i = i;  //���� ���� i�� �μ� i ����
	}

	public void setOverload(int i1, int i2)
	{
		this.i = i1;
		System.out.println(i);
		this.i = i2;
		System.out.println(i);
	}
	
	public void setOverload(){
		System.out.println("�μ� ���� setOverload�޼ҵ� ȣ��");
	}

	public int getOverload(){
		return i;  //private int i ����
	}

	public int getOverload(int i){
		return this.i*i;
	}

	public void getOverload(int i1, int i2){
		System.out.println("�μ� 2���϶� ���ϰ� ����");
	}

	//setOverload�� Overloading�ϼ���. ���ϵ� �ϼ���.
	
	//setOverload�� �� Overloading �ϼ���. �� �ٸ� ������ ���� �ϼ���.
	
	//setOverload�� �� ��Overloading �ϼ���. ���� ���ؿ�



	//getOverload�� Overloading�ϼ���. ���ϵ� �ϼ���.
	
	//getOverload�� �� Overloading �ϼ���. �� �ٸ� ������ ���� �ϼ���.
	
	//getOverload�� �� ��Overloading �ϼ���. ���� ���ؿ�
		
	
}

class  MethodOverloadingExam{
       
  public static void main(String [] agr){
     //OverloadedMethod��ü���� ȣ�Ⱑ����  �޼ҵ���� �ѹ��� ȣ���ϼ���.
	OverloadedMethod o = new OverloadedMethod();
	o.setOverload(1);
	o.setOverload(1,2);
	o.setOverload();
	System.out.println();

	int a = o.getOverload();
	int b = o.getOverload(3);
	o.getOverload(4,5);

	System.out.print(a+" "+b);


	
        
	}   


}

