class EndView{

	/**
		��� or ���� ����� ���� ����, ���п� ���� �޼��� ���
	*/
	public static void printMessage(String message) {
		System.out.println(message);
	}

	/**
		��ü �˻�
	*/
	public static void printAll(Electronics[] electronics) {
		System.out.println("=========�� ���� ��ǰ :" +ElectronicsService.count);
		for(int i =0; i<ElectronicsService.count ; i++) {
			System.out.print("��ȣ = " +electronics[i].getModelNo()+" || ");
			System.out.print("�̸� = " +electronics[i].getModelName()+" || ");		
			System.out.print("���� = " +electronics[i].getModelPrice()+" || ");		
			System.out.print("���� = " +electronics[i].getModelDetail()+"\n");		
		
		}

	}

	/** 
		�κ� �˻�
	*/
	public static void printSearchByModelNo(Electronics electronics) {
		System.out.println("=========�˻��� ��ǰ===========");
		System.out.print("��ȣ = " +electronics.getModelNo()+" || ");
		System.out.print("�̸� = " +electronics.getModelName()+" || ");		
		System.out.print("���� = " +electronics.getModelPrice()+" || ");		
		System.out.print("���� = " +electronics.getModelDetail()+"\n\n");
		}


}