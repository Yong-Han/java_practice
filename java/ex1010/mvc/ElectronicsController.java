/**
	view�� model ���̿��� view�� ��û�� �޾�
	�� ��û�� ���� Service�� ȣ���ϰ� �� ����� �޾�
	����� �ش��ϴ� view�� ȣ�����ش�.
*/

public class ElectronicsController{
	private ElectronicsService service = ElectronicsService.getInstance();

	/**
		���
	*/
	public void insert(Electronics electronics){
	
		if(service.insert(electronics)) EndView.printMessage("��ϵǾ����ϴ�.");
		else EndView.printMessage("��Ͽ���!!");
			
	}



	/**
		��ü �˻�
	*/
	public void selectAll() {
		//���񽺸� ȣ���ϰ� �� ����� ���� ��� �̵�
		Electronics [] elecArray = service.selectAll();
		EndView.printAll(elecArray);
	
	}

	/**
		�κ� �˻�
	*/
	public void searchByModelNo(int modelNo) {
		Electronics elecArray = service.searchByModelNo(modelNo);
		if(elecArray==null) EndView.printMessage(modelNo+"��ǰ ����");

		else EndView.printSearchByModelNo(elecArray);
		

	}

	/**
		�����ϱ� (�𵨹�ȣ, �𵨰���, �𵨼��� �μ���)
	*/
	public void update(Electronics electronics) {
		boolean result =service.update(electronics);
		if(result) EndView.printMessage("�����Ǿ����ϴ�.");
		else EndView.printMessage("���������ʾҽ��ϴ�.");



	}

}