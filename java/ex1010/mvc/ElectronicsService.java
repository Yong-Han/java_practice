/* 
	������ǰ ����(���, ����, ����, �˻�) ����� ����ϴ�
	Bissness login�� ����ϴ� Ŭ����
	:�̱��� �������� �����.
		-1) private ������
		-2) �ڱ��ڽ� ��ü�� ����
		-3) ��������� �ڱ��ڽ� ��ü ����
*/
public class ElectronicsService 
{
	/**
		���� ������
	*/
	private static ElectronicsService instance = new ElectronicsService();
	String data [][] = {
      {"100" , "������" , "250000", "�Ｚ ��ǳ������"} ,
      {"200" , "��Ź��" , "350000", "LG ��Ź¯"} ,
      {"300" , "�����" , "500000", "������Դϴ�."} ,
      {"400" , "���ڷ���" , "640000", "���ڷ����Դϴ�."} ,
      {"500" , "����" , "450000", "������ �ְ�!"} , 
   };

	private Electronics [] elecArr = new Electronics [10];
	public static int count;	//�迭�� ����� Electronics�� ���� üũ�� ���� ����

	private ElectronicsService(){
		for(int i =0 ;i<data.length ;i++){
		elecArr[i] = new Electronics(Integer.parseInt(data[i][0]),data[i][1],Integer.parseInt(data[i][2]),data[i][3]);
		count++;
		}
	}

	public static ElectronicsService getInstance() {
		return instance;
	}

	/**
		����ϱ�
		return : boolean - true�� ����, false�� ����
	*/
	public boolean insert(Electronics electronics){
		
		Electronics searchElec = this.searchByModelNo(electronics.getModelNo());
		//�ߺ�üũ
		if(searchElec!=null) return false;
		//siezeüũ
		if(count==elecArr.length) return false;

		else{
		elecArr[count] = electronics;
		count++;
		return true;
		}

	}

	/**
		��ü�˻�

	*/
	public Electronics [] selectAll(){
			
			return elecArr;

	}

	/**
		�κа˻�
	*/
	public Electronics searchByModelNo(int modelNo){
		for(int i =0 ; i< count ; i++) {
			if(elecArr[i].getModelNo() == modelNo) {
				return elecArr[i];
			}
			
		}
		return null;

	}


	/**
		����
		return : true �̸� ���� ����, false�̸� ���� ����
	*/
	public boolean update(Electronics electronics){
		Electronics elec =this.searchByModelNo(electronics.getModelNo());
		if(elec==null) return false;
		
		//����
		elec.setModelPrice(electronics.getModelPrice());
		elec.setModelDetail(electronics.getModelDetail());

		return true;
	}



}
