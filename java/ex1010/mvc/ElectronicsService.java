/* 
	전자제품 관리(등록, 수정, 삭제, 검색) 기능을 담당하는
	Bissness login을 담당하는 클래스
	:싱글톤 패턴으로 만든다.
		-1) private 생성자
		-2) 자기자신 객체를 리턴
		-3) 멤버영역에 자기자신 객체 생성
*/
public class ElectronicsService 
{
	/**
		샘플 데이터
	*/
	private static ElectronicsService instance = new ElectronicsService();
	String data [][] = {
      {"100" , "에어컨" , "250000", "삼성 무풍에어컨"} ,
      {"200" , "세탁기" , "350000", "LG 세탁짱"} ,
      {"300" , "냉장고" , "500000", "냉장고입니다."} ,
      {"400" , "전자렌지" , "640000", "전자렌즈입니다."} ,
      {"500" , "밥통" , "450000", "쿠쿠밥솥 최고!"} , 
   };

	private Electronics [] elecArr = new Electronics [10];
	public static int count;	//배열에 저장될 Electronics의 개수 체크를 위한 변수

	private ElectronicsService(){
		for(int i =0 ;i<data.length ;i++){
		elecArr[i] = new Electronics(Integer.parseInt(data[i][0]),data[i][1],Integer.parseInt(data[i][2]),data[i][3]);
		count++;
		}
	}

	public static ElectronicsService getInstance() {
		return instance;
	}

	/**
		등록하기
		return : boolean - true면 성공, false면 실패
	*/
	public boolean insert(Electronics electronics){
		
		Electronics searchElec = this.searchByModelNo(electronics.getModelNo());
		//중복체크
		if(searchElec!=null) return false;
		//sieze체크
		if(count==elecArr.length) return false;

		else{
		elecArr[count] = electronics;
		count++;
		return true;
		}

	}

	/**
		전체검색

	*/
	public Electronics [] selectAll(){
			
			return elecArr;

	}

	/**
		부분검색
	*/
	public Electronics searchByModelNo(int modelNo){
		for(int i =0 ; i< count ; i++) {
			if(elecArr[i].getModelNo() == modelNo) {
				return elecArr[i];
			}
			
		}
		return null;

	}


	/**
		수정
		return : true 이면 수정 성공, false이면 수정 실패
	*/
	public boolean update(Electronics electronics){
		Electronics elec =this.searchByModelNo(electronics.getModelNo());
		if(elec==null) return false;
		
		//변경
		elec.setModelPrice(electronics.getModelPrice());
		elec.setModelDetail(electronics.getModelDetail());

		return true;
	}



}
