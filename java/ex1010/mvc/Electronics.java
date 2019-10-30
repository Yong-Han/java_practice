/*
	���� ��ǰ�� ���� ������ ��ȸ, ���� �� ��ü
	value obj, domain ��ü 
*/

public class Electronics{
	private int modelNo;
	private String modelName;
	private int modelPrice;
	private String modelDetail;

	public Electronics(){}

	//������ �� �ʿ��� ������
	public Electronics(int modelNo, int modelPrice, String modelDetail){
		this.modelNo = modelNo;
		this.modelPrice = modelPrice;
		this.modelDetail = modelDetail;
	}
	public Electronics(int modelNo, String modelName, int modelPrice, String modelDetail){
		this(modelNo, modelPrice, modelDetail); //�ٸ� ������ ȣ���� ������ ù�ٿ����� ����
		this.modelName = modelName;
	}
	
	//��� ���� ������ ���� �޼ҵ�
	public void setModelNo(int modelNo) {this.modelNo=modelNo;}
	public void setModelName(String modelNo) {this.modelName=modelName;}
	public void setModelPrice(int modelPrice) {this.modelPrice=modelPrice;}
	public void setModelDetail(String modelDetail) {this.modelDetail=modelDetail;}

	public int getModelNo(){return modelNo;}
	public String getModelName(){return modelName;}
	public int getModelPrice(){return modelPrice;}
	public String getModelDetail(){return modelDetail;}

}