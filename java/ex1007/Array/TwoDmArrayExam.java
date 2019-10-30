//TwoDmArrayExam.java

class TwoDmArray{
	//String을 저장하는 twoDmArray 배열선언
	String [][]twoDmArray = new String[10][];
	int len = 10;

	
	//메소드 make2DmArray
	public void make2DmArray(){
		//twoDmArray 배열에  값을 할당
		
		for(int i = 0; i<len; i++){
		twoDmArray[i] = new String[10-i];
	}	//0행 10칸, 1행 9칸, ..... 식으로 선언
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++) {
				twoDmArray[i][j] = j+"동"+i+"호";
			}
		}
	}	
		
	//메소드 print2DmArray
	//	twoDmArray 배열의 값을 주어진형식으로 출력
	public void print2DmArray(){
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++) {
				System.out.print(twoDmArray[i][j]+" ");
			}
			System.out.println();
		}
	}
		
}

public class TwoDmArrayExam{
	//main메소드에서
		public static void main(String [] args){
	
		//TwoDmArray객체생성
		TwoDmArray td = new TwoDmArray();
		
		//TwoDmArray객체의 make2DmArray메소드 호출
		td.make2DmArray();
		
		//TwoDmArray객체의 print2DmArray메소드 호출
		td.print2DmArray();
		}
	
}
