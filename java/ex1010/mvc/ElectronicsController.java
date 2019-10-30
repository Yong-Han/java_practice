/**
	view와 model 사이에서 view의 요청을 받아
	그 요청에 따른 Service를 호출하고 그 결과를 받아
	결과에 해당하는 view를 호출해준다.
*/

public class ElectronicsController{
	private ElectronicsService service = ElectronicsService.getInstance();

	/**
		등록
	*/
	public void insert(Electronics electronics){
	
		if(service.insert(electronics)) EndView.printMessage("등록되었습니다.");
		else EndView.printMessage("등록오류!!");
			
	}



	/**
		전체 검색
	*/
	public void selectAll() {
		//서비스를 호출하고 그 결과에 따라 뷰로 이동
		Electronics [] elecArray = service.selectAll();
		EndView.printAll(elecArray);
	
	}

	/**
		부분 검색
	*/
	public void searchByModelNo(int modelNo) {
		Electronics elecArray = service.searchByModelNo(modelNo);
		if(elecArray==null) EndView.printMessage(modelNo+"제품 없음");

		else EndView.printSearchByModelNo(elecArray);
		

	}

	/**
		수정하기 (모델번호, 모델가격, 모델설명 인수로)
	*/
	public void update(Electronics electronics) {
		boolean result =service.update(electronics);
		if(result) EndView.printMessage("수정되었습니다.");
		else EndView.printMessage("수정되지않았습니다.");



	}

}