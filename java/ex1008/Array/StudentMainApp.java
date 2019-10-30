class StudentMainApp 
{
	public static void main(String[] args) {
		
		String [][] data = new String [][]{
			{"����","15","����"},
			{"����","30","�뱸"},
			{"ȿ��","25","�λ�"},
			{"����","20","���"},
			{"�ҿ�","22","â��"},
		};
		
		// 1. �ʱ� ������ ���� 
		StudentService service = new StudentService(data);
		System.out.println("��ü �˻� ====================");		
		service.printAll();


		// 2. �̸� �˻�
		System.out.println("2. �̸� �˻�(���� �� ) ============");
		service.searchName("����");

		System.out.println("2. �̸� �˻�(���� �� ) ============");
		service.searchName("�ٺ�");

		// 3. �̸��� �ش��ϴ� ����(����, �ּ�) ����
		System.out.println("3. �����ϱ� (���� �� ) ===========");
		Student updateSt = new Student("����",17,"�̱�");
		service.update(updateSt);
		service.printAll();
		
		service.update(updateSt);
		System.out.println("\n");
		System.out.println("3. �����ϱ� (���� �� ) ===========");
		
		updateSt = new Student("�����",20);
		service.update(updateSt);

		service.printAll();

		System.out.println("4. ����ϱ� ============");
		service.insert(new Student("����",20,"����"));
		service.printAll();

		service.insert(new Student("dd",30, "����"));

	}
}
