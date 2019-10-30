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
			//기능
			return 값; 
		}
		
			public static String toString(int i) {
			//기능
			return 값;
	}


	}
	
	*/
		int i,j;
		i = Integer.parseInt(args[0]);
		j = Integer.parseInt(args[1]);
		System.out.println("입력된 두 인 수의 합 : "+ (i+j));
	}

}