/*
	전자 제품에 대한 정보를 조회, 저장 할 객체
	value obj, domain 객체 
*/

public class Electronics{
	private int modelNo;
	private String modelName;
	private int modelPrice;
	private String modelDetail;

	public Electronics(){}

	//수정할 때 필요한 생성자
	public Electronics(int modelNo, int modelPrice, String modelDetail){
		this.modelNo = modelNo;
		this.modelPrice = modelPrice;
		this.modelDetail = modelDetail;
	}
	public Electronics(int modelNo, String modelName, int modelPrice, String modelDetail){
		this(modelNo, modelPrice, modelDetail); //다른 생성자 호출은 무조건 첫줄에서만 가능
		this.modelName = modelName;
	}
	
	//멤버 변수 접근을 위한 메소드
	public void setModelNo(int modelNo) {this.modelNo=modelNo;}
	public void setModelName(String modelNo) {this.modelName=modelName;}
	public void setModelPrice(int modelPrice) {this.modelPrice=modelPrice;}
	public void setModelDetail(String modelDetail) {this.modelDetail=modelDetail;}

	public int getModelNo(){return modelNo;}
	public String getModelName(){return modelName;}
	public int getModelPrice(){return modelPrice;}
	public String getModelDetail(){return modelDetail;}

}