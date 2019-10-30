class Puppy3{
	/*String 타입 전역 변수 선언
		int 타입 전역 변수 선언*/
		String s;
		int a;
	
	/*인수가 없는 생성자작성
		String 타입 전역변수에 "메리" 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/
	public Puppy3() {
		s = "메리";
		System.out.println("1번 생성자 public Puppy3() 호출되었습니다.");
		System.out.println("현재 스트링 변수 값 = " +s);
		System.out.println("현재 인트형 변수 값 = " +a);

	}
	

	/*String 타입의 인수 1개를 받는 생성자작성
		String 타입 전역변수에 인수 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/
	public Puppy3(String str) {
		s=str;
		System.out.println("2번 생성자 public Puppy3(String str) 호출되었습니다.");
		System.out.println("현재 스트링 변수 값 = " +s);
		System.out.println("현재 인트형 변수 값 = " +a);

	}
		
	
	/*String 타입의 인수 2개를 받는 생성자작성
		인수2개를 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"출력
	*/
	public Puppy3(String s1, String s2) {
		this(s1+s2);
		System.out.println("3번 생성자 public Puppy3(String s1, String s2) 호출되었습니다.");


	}
		
	
	
	/*boolean 타입의 인수 1개를 받는 생성자작성
		인수를 "쫑"과 붙여 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"  출력
	*/					
	public Puppy3(boolean b){
		this("쫑"+b);
		System.out.println("4번 생성자 public Puppy3(boolean b) 호출되었습니다.");
	}
	
	
	/*char 타입의 인수 1개를 받는 생성자작성
			인수가 없는 생성자를 호출하고
			인수로 받은 data를 int타입 전역변수에 할당	
			"puplic Puppy3()호출되었습니다"출력
			int형 전역변수출력
	*/
	public Puppy3(char ch) {
		this();
		a=ch;
		System.out.println("5번 생성자 public Puppy3(char ch) 호출되었습니다.");
		System.out.println("int형 전역변수 : "+a);

	}
	
	/*메소드 printMemberVariable
	리턴 없슴
	전역변수를 출력
	*/	
	public void printMemberVariable()
	{
		System.out.println("전역변수 String형 : "+s);
		System.out.println("전역변수 int 형 : "+a);
	}

	
}

class ConstructorOverloadingExam{
		//메인메소드에서
		public static void main(String [] args){
			//Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
			Puppy3 p1 = new Puppy3();
			System.out.println("========2.============");
			Puppy3 p2 = new Puppy3("하이");
			System.out.println("========3.============");
			Puppy3 p3 = new Puppy3("불타는","금요일");
			System.out.println("========4.============");
			Puppy3 p4 = new Puppy3(true);
			System.out.println("========5.============");
			Puppy3 p5 = new Puppy3('A');
		
			System.out.println("\n\n\n");
			
		//각 객체의 printMemberVariable메소드를 한번씩 호출
			p1.printMemberVariable();
			p2.printMemberVariable();
			p3.printMemberVariable();
			p4.printMemberVariable();
			p5.printMemberVariable();
			
	}
}