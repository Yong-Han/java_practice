class StudentMainApp 
{
	public static void main(String[] args) {
		
		String [][] data = new String [][]{
			{"희정","15","서울"},
			{"나영","30","대구"},
			{"효리","25","부산"},
			{"동건","20","경기"},
			{"소영","22","창원"},
		};
		
		// 1. 초기 데이터 설정 
		StudentService service = new StudentService(data);
		System.out.println("전체 검색 ====================");		
		service.printAll();


		// 2. 이름 검색
		System.out.println("2. 이름 검색(있을 시 ) ============");
		service.searchName("나영");

		System.out.println("2. 이름 검색(없을 시 ) ============");
		service.searchName("바보");

		// 3. 이름에 해당하는 정보(나이, 주소) 수정
		System.out.println("3. 수정하기 (있을 시 ) ===========");
		Student updateSt = new Student("나영",17,"미국");
		service.update(updateSt);
		service.printAll();
		
		service.update(updateSt);
		System.out.println("\n");
		System.out.println("3. 수정하기 (없을 시 ) ===========");
		
		updateSt = new Student("삼순이",20);
		service.update(updateSt);

		service.printAll();

		System.out.println("4. 등록하기 ============");
		service.insert(new Student("쁜이",20,"서울"));
		service.printAll();

		service.insert(new Student("dd",30, "마산"));

	}
}
