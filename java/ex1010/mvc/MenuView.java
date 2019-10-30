import java.util.Scanner;

public class MenuView {
   Scanner sc = new Scanner(System.in);//Ű�����Է� �غ�
   ElectronicsController controller = new ElectronicsController();
    /**
	  �޴��� ����ϴ� �޼ҵ�
	*/
    public void printMenu(){
	   while(true){
		 System.out.println("***** �޴��� �������ּ��� *******");
		 System.out.println("1.���  2.��ü�˻�  3.�κа˻�  4.�����ϱ�   9.����");
         int no = sc.nextInt();
		 switch(no){
             case 1:   inputInsert() ; break;
			 case 2:   controller.selectAll() ;  break;
			 case 3:   inputSearch() ; break;
			 case 4:   inputUpdate() ; break;
			 case 9:   
				 System.out.println("��� ���α׷� �����մϴ�...");
				 System.exit(0) ; //���α׷���������
			 break;
			 default: System.out.println("�߸��� ���ù�ȣ�Դϴ�. �ٽ��Է����ּ���!");

		 }//switch����
	   }//while����  	
	}
	 
	/**
	  ����Ҷ� �ʿ��� ���� �Է� �޴� �޼ҵ�
	*/
	public  void inputInsert(){
       System.out.print("�𵨹�ȣ ? ");
	   int modelNo = sc.nextInt();

	   System.out.print("���̸� ? ");
	   String modelName = sc.next();

	   System.out.print("�𵨰��� ? ");
	   int modelPrice = sc.nextInt();

	   System.out.print("�𵨼��� ? ");
	   String modelDetail = sc.next();

        // �Էµ� ���� 4���� �ϳ��� Electronics��ü�� �����.
         Electronics electronics = 
			 new Electronics(modelNo, modelName,modelPrice,modelDetail);

         controller.insert(electronics);
	}

	/**
	  �κа˻��� �ʿ��� ���� �Է¹޴� �޼ҵ�
	*/
	public  void inputSearch(){
        System.out.print("�˻��� �𵨹�ȣ?");
		int modelNo = sc.nextInt();
		controller.searchByModelNo(modelNo);
	}

	/**
	  �����Ҷ� �ʿ��� ���� �Է� �޴� �޼ҵ�
	  ( �𵨹�ȣ�� �ش��ϴ� ������ǰ �𵨰���, ���� ����.)
	*/
    public  void inputUpdate(){
      System.out.print("������ �𵨹�ȣ�� ? ");
	   int modelNo = sc.nextInt();

	   System.out.print("���� �𵨰��� ? ");
	   int modelPrice = sc.nextInt();

	   System.out.print("���� �𵨼��� ? ");
	   String modelDetail = sc.next();

       Electronics electronics = 
			 new Electronics(modelNo, modelPrice,modelDetail);

         controller.update(electronics);

	}
}
