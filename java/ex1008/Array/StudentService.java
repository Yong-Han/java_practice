/*
	학생정보를 배열로 관리하면서
	서비스를 제공해줄 객체

*/

class StudentService {
	Student [] stArr = new Student[6];
	int count =0;
	
	//초기 학생 정보를 등록하는 생성자
	public StudentService (String [][] data) {

		for(int i =0; i<data.length; i++) {
			stArr[i] = create(data[i]);
			count++;
		}
	}
	public StudentService(){}



	//Student 객체를 생성해서 데이터를 설정하고 객체 리턴 메소드
	private Student create (String [] row) {
		Student st = new Student(row[0],Integer.parseInt(row[1]),row[2]);

		return st;
	}

	public void printAll() {

		for(int i =0; i<count ; i++) { 
			System.out.print(stArr[i].getName() + " | ");
			System.out.print(stArr[i].getAge() + " | ");
			System.out.print(stArr[i].getAddr() + " | \n");
	}	
	/*
		for(Student st : stArr) {
			System.out.print(st.getName() + " | ");
			System.out.print(st.getAge() + " | ");
			System.out.print(st.getAddr() + " | \n");

		}*/

	}
		//이름에 해당하는 학생의 정보를 검색

		public void searchName(String name) {
			Student st = this.search(name);
			if(st==null){
				System.out.println(name+"정보는 없습니다.");
			}

			else {
				//이름 | 나이 | 주소 출력
				System.out.println(name+"찾음");
				System.out.println(name+"의 나이 : "+st.getAge());
				System.out.println(name+"의 주소 : "+st.getAddr());

			}

		}

		// 이름에 해당하는 정보(나이, 주소) 수정
		public void update(Student student) {
			Student st = this.search(student.getName());
			if(st==null) {
				System.out.println(student.getName() + "님의 정보가 없어 수정할 수 없습니다.");
			}
			else{
				// System.out.println("현재 나이 : "+st.getAge());
				 //System.out.println("바꿀 나이 : "+student.getAge());
			
				st.setAge(student.getAge());
				//st.setAddr(student.getAddr());
			}

		}

		// 이름에 해당하는 정보를 찾아주는 메소드
		private Student search(String name) {
			/*
			for(Student st : stArr) {
				if(st.getName().equals(name) ) return st;

			}*/			
			//////////////////////////////////////////////////////
			for(int i =0;i<count;i++) {
				if(stArr[i].getName().equals(name) ) return stArr[i];

			}

			return null;
		}

		//추가하기
		public void insert(Student st) {
			if(count==stArr.length){
				System.out.println("더이상 등록할 수 없습니다.");

			}
			else {
			stArr[count] = st;
			count++;
			}

		}

}