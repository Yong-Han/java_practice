//ObjectInArray.java

class ObjectOne{
	public int a;
}

public class ObjectInArray{
	//���� �޼ҵ忡�� 
	public static void main(String [] args) {
		ObjectOne classArr[] = new ObjectOne[5];
		for (int i=0;i<5 ;i++ ) classArr[i] = new ObjectOne();
		
		System.out.println("classArr �ּ� " + classArr);

		for (int i =0;i<5 ;i++ )
		{
			System.out.println(i+"��° ��ü �ּҰ� : " +classArr[i]);
			System.out.println(i+"��° ��ü ���� a�� : "+classArr[i].a);
		}
		classArr[0].a = 3;
		classArr[1].a = 5;
		classArr[2].a = 4;
		classArr[3].a = (int)(Math.random()*10);
		for (int i =0;i<5 ;i++ )
		{
			System.out.println(i+"�� �ٲ� �� ��° ��ü �ּҰ� : " +classArr[i]);
			System.out.println(i+"�� �ٲ� �� ��° ��ü ���� a�� : "+classArr[i].a);
		}



	}
	
		//ObjectOne Ÿ���� 5�� ���� �����ϴ� �迭�� �����ϰ�
		 
		//5���� ObjectOne��ü�� �����ϼ���.
		//�� ��ü�� �����ִ� �������� ���
		//�� ��ü�� �ּҰ� ���
			
		//������ ObjectOne��ü�� ���� �ٸ� a�� ���� ������ a�� ���� �����ϼ���.			
		//�� ObjectOne ��ü�� a�� ����ϼ���
			
		
	
}
