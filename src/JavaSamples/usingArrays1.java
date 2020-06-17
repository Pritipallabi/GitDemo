package JavaSamples;

public class usingArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};
		
		System.out.print("a = ");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i] + " ");
//		}
		
		for(int i : a)
		{
			System.out.print(i + " ");
		}
	}

}
