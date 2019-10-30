class Test{

	private Test(){} //외부에서 객체 생성못함 (다른 클래스에서 Test 변수 = new Test 로 접근 못함)


	//Test클래스가 생성자를 통해 private로 만들었기 때문에 객체 생성을 위한 메소드 작성
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
	//	Test t2 = new Test(); Test 객체가 private Test이므로 생성안됨
		
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();

		System.out.println("t1 주소값 : " +t1);
		System.out.println("t2 주소값 : " +t2);

		Test2 t3 = Test2.getInstance();
		Test2 t4 = Test2.getInstance();
		
		System.out.println("t3 의 주소값 :"+t3);
		System.out.println("t4 의 주소값 :"+t4);


	}
}