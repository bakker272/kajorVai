package polymorphism;

public class fibonacci {
	public static Xls_Reader x=new Xls_Reader(System.getProperty("user.dir")+"\\src\\polymorphism\\hybrideExcel.xlsx");

	public static void main(String[] args) {
		
		 
		//Xls_Reader x=new Xls_Reader(System.getProperty("user.dir")+"\\src\\polymorphism\\hybrideExcel.xlsx");
		score(x,"LoginTest");
		score(x,"CreateLeadTest");
		score(x,"MenuTest");
		
		System.out.println(Math.abs(20));
	
	}
	

	public static void score(Xls_Reader xl,String testcase)
	{
		
		//find out the starting row of testcase
		
		int testcasestartrow=1;
		while(!xl.getCellData("Sheet1", 0, testcasestartrow).equals(testcase))
		{
			testcasestartrow++;
		}
		System.out.println(testcase+" is starting from the row no. "+testcasestartrow);
		
		//find out the number of rows of test data in each test case
		
		int rowstart=testcasestartrow+2;
		int rows=0;
		while(!xl.getCellData("Sheet1", 0,rowstart+rows ).equals(""))
		{
			rows++;
			
		}
		System.out.println("total no. of rows in each test case is "+rows);
		
		//find out the col number in each testcase
		
		int cols=0;
		
		while(!xl.getCellData("Sheet1", cols, rowstart+1).equals(""))
		{
			
			
			cols++;
		}
		
		System.out.println("total column present in each testcase are "+cols);
		
		for(int row=rowstart;row<=rowstart+rows;row++)
		{
			
			for(int col=0;col<cols;col++)
			{
				System.out.print(xl.getCellData("Sheet1", col, row-1)+"  ");
				
			}
			System.out.println();
		}
		System.out.println("************************************************");
		
	}
		
}
