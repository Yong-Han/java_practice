class EndView{

	/**
		등록 or 수정 결과에 대한 성공, 실패에 대한 메세지 출력
	*/
	public static void printMessage(String message) {
		System.out.println(message);
	}

	/**
		전체 검색
	*/
	public static void printAll(Electronics[] electronics) {
		System.out.println("=========총 전자 제품 :" +ElectronicsService.count);
		for(int i =0; i<ElectronicsService.count ; i++) {
			System.out.print("번호 = " +electronics[i].getModelNo()+" || ");
			System.out.print("이름 = " +electronics[i].getModelName()+" || ");		
			System.out.print("가격 = " +electronics[i].getModelPrice()+" || ");		
			System.out.print("설명 = " +electronics[i].getModelDetail()+"\n");		
		
		}

	}

	/** 
		부분 검색
	*/
	public static void printSearchByModelNo(Electronics electronics) {
		System.out.println("=========검색된 제품===========");
		System.out.print("번호 = " +electronics.getModelNo()+" || ");
		System.out.print("이름 = " +electronics.getModelName()+" || ");		
		System.out.print("가격 = " +electronics.getModelPrice()+" || ");		
		System.out.print("설명 = " +electronics.getModelDetail()+"\n\n");
		}


}