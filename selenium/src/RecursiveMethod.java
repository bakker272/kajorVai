
public class RecursiveMethod {

	public static void main(String[] args) {
		String a="asdf";
		String []b=new String[a.length()];
		for(int i=a.length()-1;i>0;i--)
		{
			b[i]=a.substring(i+1);
			System.out.print(b[i]);
		}
		
	}
	
	

}
