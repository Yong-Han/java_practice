class ArgsExam {
	public static void main (String [] args) {
		int len = args.length;
		
		for (int i =0;i<len ;i++ ) System.out.println(args[i]);
	/*
		int no = Integer.parseInt("100");
		String str = Integer.toString(100);

		~~
		public class Integer{
			public static int parseInt(String s) {
			//���
			return ��; 
		}
		
			public static String toString(int i) {
			//���
			return ��;
	}


	}
	
	*/
		int i,j;
		i = Integer.parseInt(args[0]);
		j = Integer.parseInt(args[1]);
		System.out.println("�Էµ� �� �� ���� �� : "+ (i+j));
	}

}