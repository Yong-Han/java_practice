class BooleanOPeratorExam{
	public static void main(String args[]){
		boolean  t=true ;
		boolean f=false;
		System.out.println("true&false="+(t&f));	//f
		System.out.println("true&true="+(t&t));		//t
		System.out.println("false&false="+(f&f));	//f
		System.out.println();
	
		System.out.println("true|false="+(t|f));	//t
		System.out.println("true|true="+(t|t));		//t
		System.out.println("false|false="+(f|f));	//f
		System.out.println();

		// ^ : XOR 양쪽이 같으면 false , 다르면 true
		System.out.println("true^false="+(t^f));	//t
		System.out.println("true^true="+(t^t));		//f
		System.out.println("true^false="+(t^f));	//t
		System.out.println("true^true="+(t^t));		//f
		System.out.println();

		System.out.println("true&&false="+(t&&f));	//f
		System.out.println("true&&true="+(t&&t));	//t
		System.out.println("true&&false="+(t&&f));	//f
		System.out.println("false&&false="+(f&&f)); //f
		System.out.println();

		System.out.println("true||false="+(t||f)); //t
		System.out.println("true||true="+(t||t)); //t
		System.out.println("false||false="+(f||f)); //f
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i="+i+"\tint j="+j); //5	 3
		System.out.println("i>=j==>>"+(i>=j));	//t
		System.out.println("i>j=>>"+(i>j));		//t
		System.out.println("i<=j=>>"+(i<=j));	//f
		System.out.println("i<j=>>"+(i<j));		//f
		System.out.println("i==j=>>"+(i==j));	//f
		System.out.println("i!=j=>>"+(i != j));	//t

		System.out.println("--------------------------");
		System.out.println("| , || 비교하기");

		System.out.println(true | test());  //test메소드를 실행함 
		System.out.println("**********************************");

		System.out.println(true || test()); //test 메소드를 실행하지 않음

		System.out.println("--------------------------");
		System.out.println("& , && 비교하기");

		System.out.println(false & test());  // false (test메소드를 실행함)
		System.out.println("**********************************");

		System.out.println(false && test()); // false (test메소드를 실행하지 않음)


	
	}
	public static boolean test(){
		System.out.println("test()입니다.");
		return false;


	}

}