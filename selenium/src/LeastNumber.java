import java.util.Arrays;


public class LeastNumber {

	public static void main(String[] args) {
		int []a={50,0,-12,2,3,115,4,8};
		
		Arrays.sort(a);
		System.out.println("highest number is "+a[a.length-1]);
		System.out.println(a[0]);
		
		int low=a[0];
		int selected=1;
		for(int i=0;i<a.length;i++)
		{
			 selected=a[i];
			if(low<selected)
			{
				selected=low;
			}
		}
		System.out.println("lowest number is "+selected);

	}

}
