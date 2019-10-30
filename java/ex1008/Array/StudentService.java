/*
	�л������� �迭�� �����ϸ鼭
	���񽺸� �������� ��ü

*/

class StudentService {
	Student [] stArr = new Student[6];
	int count =0;
	
	//�ʱ� �л� ������ ����ϴ� ������
	public StudentService (String [][] data) {

		for(int i =0; i<data.length; i++) {
			stArr[i] = create(data[i]);
			count++;
		}
	}
	public StudentService(){}



	//Student ��ü�� �����ؼ� �����͸� �����ϰ� ��ü ���� �޼ҵ�
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
		//�̸��� �ش��ϴ� �л��� ������ �˻�

		public void searchName(String name) {
			Student st = this.search(name);
			if(st==null){
				System.out.println(name+"������ �����ϴ�.");
			}

			else {
				//�̸� | ���� | �ּ� ���
				System.out.println(name+"ã��");
				System.out.println(name+"�� ���� : "+st.getAge());
				System.out.println(name+"�� �ּ� : "+st.getAddr());

			}

		}

		// �̸��� �ش��ϴ� ����(����, �ּ�) ����
		public void update(Student student) {
			Student st = this.search(student.getName());
			if(st==null) {
				System.out.println(student.getName() + "���� ������ ���� ������ �� �����ϴ�.");
			}
			else{
				// System.out.println("���� ���� : "+st.getAge());
				 //System.out.println("�ٲ� ���� : "+student.getAge());
			
				st.setAge(student.getAge());
				//st.setAddr(student.getAddr());
			}

		}

		// �̸��� �ش��ϴ� ������ ã���ִ� �޼ҵ�
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

		//�߰��ϱ�
		public void insert(Student st) {
			if(count==stArr.length){
				System.out.println("���̻� ����� �� �����ϴ�.");

			}
			else {
			stArr[count] = st;
			count++;
			}

		}

}