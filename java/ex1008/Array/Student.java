/*
	학생 정보를 관리할 객체
	: DTO = Data Transfer Object = Value Object = Domain

*/
class Student 
{
	//저장할 정보를 속성으로 선언(Field = property = 멤버변수)
	private String name; //외부에서 직접 접근 불가
	private int age;
	private String addr;
	
	public Student(){}
	public Student(String s, int i, String s2) {
		this(s,i);
		this.addr = s2;
	}
	public Student(String s,int i) {
		this.name = s;
		this.age = i;

	}

	//메소드를 이용하여 속성에 접근할수 있도록 메소드 선언
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if(age > 0) this.age = age;
		else System.out.println("나아는 1살 이상만 입력해주세요.");
	}
	public int getAge() {
		return age;
	}

	public void setAddr(String addr) {
		this.addr= addr;
	}
	public String getAddr() {
		return addr;
	}
}

