class CastingExam{
	public static void main(String []args){
		byte b1;
		byte b2,b3; 
		int i1=7;
		System.out.println("int i1="+i1);

		b1=(byte)i1 ; //int형을 byte에 담을수 없으므로 casting 필요
		System.out.println("byte b1="+b1);

		b2=20;
		System.out.println("byte b2="+b2);
		
	   	b3=(byte)(b2+b1); //연산 b2 + b1 은 32비트공간이 필요하므로 연산후에 byte로 casting 필요

		System.out.println("byte b3="+b3);
		
		long lo=56897L;
		System.out.println("long lo="+lo);

		int i4=(int)lo+i1; //lo가 long형이므로 casting 필요
		System.out.println("int i4="+i4);
		
		boolean boo=true;
		 //boo=0;  true or false  
		
		System.out.println("boolean boo="+boo);

		double d=4.67e-3;
		System.out.println("double d="+d);

		float f1=lo; //long이 8바이트지만 float는 실수형 자료형이라 공간할당을 더 크게 받아 자동형변환이 일어남
		System.out.println("float f1="+f1);
				
		
	    float f2=(float)d;	//d는 double형이므로 float에 대입 불가능 casting 필요
		System.out.println("float f2="+f2);

		char c1,c2, c3;
		c1='\u0065'; 
		System.out.println("char c1="+c1);

		 b2=(byte)c1; 
		System.out.println("byte b2="+b2);
		
		c2='가';
		System.out.println("char c2="+c2);
		
		b2=(byte)c1;
		System.out.println("byte b2="+b2);
		
		c3=(char)(c2+2);
		System.out.println("char c3="+c3);
		
		
	}

}