/*
	�л� ������ ������ ��ü
	: DTO = Data Transfer Object = Value Object = Domain

*/
class Student 
{
	//������ ������ �Ӽ����� ����(Field = property = �������)
	private String name; //�ܺο��� ���� ���� �Ұ�
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

	//�޼ҵ带 �̿��Ͽ� �Ӽ��� �����Ҽ� �ֵ��� �޼ҵ� ����
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if(age > 0) this.age = age;
		else System.out.println("���ƴ� 1�� �̻� �Է����ּ���.");
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

