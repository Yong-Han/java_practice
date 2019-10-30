class StaticInitExam{
	public static void main(String []args){

		System.out.println("메인메소드 시작");

	}

	static {
		//기능(환경설정 정보를 세팅, 초기 데이터 로딩, 시스템 점검 등)
		//즉, 프로그램 시작전에 해야할 일
		System.out.println("메인메소드 보다 먼저 실행합니다...");
	}

}