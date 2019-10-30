class ArrayExam{
	
	//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
	int intArr [] = new int [5];
	double doubleArr [] = new double [5];
	char charArr [] = new char [5];
	boolean booleanArr[] = new boolean[5];
	String stringArr[] = new String[5];
	int len = intArr.length; 


	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
	void printArrayValue01 () {
		for(int i = 0; i<len; i++) System.out.print(intArr[i]+"\t");
		System.out.println("\n");

		for(int i = 0; i<len; i++) System.out.print(doubleArr[i]+"\t");
		System.out.println("\n");

		for(int i = 0; i<len; i++) System.out.print(charArr[i]+"\t");
		System.out.println("\n");

		for(int i = 0; i<len; i++) System.out.print(booleanArr[i]+"\t");
		System.out.println("\n");

		for(int i = 0; i<len; i++) System.out.print(stringArr[i]+"\t");
		System.out.println("\n");

	}
	
	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
	void printArrayValue02() {
		for (int i = 0; i<len; i++) {
			//intArr 할당
			intArr[i] = (i+1)*2;
			
			//doubleArr 할당
			doubleArr[i] = (i*1.5);
			
			//charArr 할당
			charArr[i] = (char)('A'+i);
			
			//boolArr할당
			if(i%2 == 0) booleanArr[i] = true;
			else booleanArr[i] = false;
			
			//stringArr 할당
			stringArr[i] = "A"+i;
			}
	}


	
	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	void printArrayValue03() {
		printArrayValue01();
	}
	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출하세요.
	public static void main(String [] args) {
		ArrayExam ar = new ArrayExam();

		ar.printArrayValue01();
		ar.printArrayValue02(); //배열에 데이터 할당
		System.out.println("======배열에 할당 한 후======\n");
		ar.printArrayValue03();
	
	}
	
}..