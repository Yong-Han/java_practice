class Test{
	int a = 5;
	static int b = 10;

	public void aa(){//non-static method 안에서 static, non-static 변수 모두 접근 가능
		//method aa를 불러오기 위해 Test 객체가 미리 생성되어져야하기때문
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(this.b);	
	}
	public void bb(){
		//method bb를 불러오기 위해 Test 객체가 미리 생성되어 있으므로 모두 됨
		aa();
		this.aa();
		dd();
		this.dd();
		Test.dd();
	}
	public static void cc(){ //static method에서는 static 만 접근 가능, this 키워드 못씀(의미가 객체 참조이므로)

	//	System.out.println(a);	//non-static a는 static method cc에서 참조 불가능
	//	System.out.println(this.a);	//  
		System.out.println(b);
	//	System.out.println(this.b);	
	
	//	aa();		//non-static이므로 참조 안됨
	//	this.aa();	//non-static이므로 참조 안됨

		dd();		//staic 끼리 불러오기 가능
	//	this.dd();	//참조 불가능
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


		System.out.println("static 변수 값 ");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);
		
		t2.b = 50;
		System.out.println("static 변수 값 변경 후 ");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);




	
	}

}