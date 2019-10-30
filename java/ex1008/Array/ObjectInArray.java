//ObjectInArray.java

class ObjectOne{
	public int a;
}

public class ObjectInArray{
	//메인 메소드에서 
	public static void main(String [] args) {
		ObjectOne classArr[] = new ObjectOne[5];
		for (int i=0;i<5 ;i++ ) classArr[i] = new ObjectOne();
		
		System.out.println("classArr 주소 " + classArr);

		for (int i =0;i<5 ;i++ )
		{
			System.out.println(i+"번째 객체 주소값 : " +classArr[i]);
			System.out.println(i+"번째 객체 변수 a값 : "+classArr[i].a);
		}
		classArr[0].a = 3;
		classArr[1].a = 5;
		classArr[2].a = 4;
		classArr[3].a = (int)(Math.random()*10);
		for (int i =0;i<5 ;i++ )
		{
			System.out.println(i+"값 바꾼 후 번째 객체 주소값 : " +classArr[i]);
			System.out.println(i+"값 바꾼 후 번째 객체 변수 a값 : "+classArr[i].a);
		}



	}
	
		//ObjectOne 타입을 5개 까지 저장하는 배열을 선언하고
		 
		//5개의 ObjectOne객체를 생성하세요.
		//각 객체가 갖고있는 전역변수 출력
		//각 객체의 주소값 출력
			
		//각각의 ObjectOne객체가 서로 다른 a의 값을 갖도록 a의 값을 변경하세요.			
		//각 ObjectOne 객체의 a를 출력하세요
			
		
	
}
