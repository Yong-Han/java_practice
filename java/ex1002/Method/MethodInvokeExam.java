class Methodinvoke01{
	//다음과 같이 메소드를 작성하세요.
	
	/*method 이름 : method01
	어디서나 누구나 접근가능
	정수 리턴
	인수로 정수2개 받음
	인수로 들어온 정수 2개를 곱해서 출력하고 리턴*/
	public int method01(int i1, int i2){
		System.out.println("두 정수의 곱 = "+(i1*i2));
		return i1*i2;
	}

		
	
}

class Methodinvoke02{
	
	//method 이름 : method02
	//어디서나 누구나 접근가능,객체를 생성하지 않고도 접근가능
	//정수 리턴
	//인수로 정수2개 받음
	
	//인수로 들어온 정수 2개를 더해서 출력하고 더한수 리턴
		
		public static int method02(int i1, int i2){
		System.out.println("두 정수의 합 = "+(i1+i2));
		return i1+i2;
	}	
	

	
}

class MethodInvokeExam{
	public static void main(String []args){
		
		//MethodInvoke01의 method01 호출
		Methodinvoke01 miv01;
		miv01 = new Methodinvoke01();
		miv01.method01(4, 2);


		//MethodInvoke02의 method02 호출
//		Methodinvoke02 miv02;
//		miv02 = new Methodinvoke02();
		Methodinvoke02 miv02 = new Methodinvoke02();

		//miv02.method02(3,4);
		Methodinvoke02.method02(3,32); //Methodinvoke02클래스의 method02메소드가 static이면 가능
		

	}
}

