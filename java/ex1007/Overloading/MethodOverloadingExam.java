//MethodOverloadingExam.java
class OverloadedMethod{
	private int i;	//멤버 변수 (private)
       
	public void  setOverload(int i){
		this.i = i;  //전역 변수 i에 인수 i 대입
	}

	public void setOverload(int i1, int i2)
	{
		this.i = i1;
		System.out.println(i);
		this.i = i2;
		System.out.println(i);
	}
	
	public void setOverload(){
		System.out.println("인수 없이 setOverload메소드 호출");
	}

	public int getOverload(){
		return i;  //private int i 리턴
	}

	public int getOverload(int i){
		return this.i*i;
	}

	public void getOverload(int i1, int i2){
		System.out.println("인수 2개일때 리턴값 없음");
	}

	//setOverload를 Overloading하세요. 리턴도 하세요.
	
	//setOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	
	//setOverload를 또 또Overloading 하세요. 리턴 안해요



	//getOverload를 Overloading하세요. 리턴도 하세요.
	
	//getOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	
	//getOverload를 또 또Overloading 하세요. 리턴 안해요
		
	
}

class  MethodOverloadingExam{
       
  public static void main(String [] agr){
     //OverloadedMethod객체에서 호출가능한  메소드들을 한번씩 호출하세요.
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

