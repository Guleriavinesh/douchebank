package douchebank;

public class largest {

	public void m1() {
		
	
	int a[]= {1,2,3,40,5,5};
	int max=a[0];
	
	for(int j=1;j<a.length;j++)
	{
		if(max<a[j])
		{
			max=a[j];
			
		}
		
	}
	System.out.println(max);
}
	public void m2() {
		String rev="mY name is vinesh";
		char ch;
		String rev2="";
		for(int i=0;i<rev.length();i++)
		{
			ch= rev.charAt(i);
			rev2=ch+rev2;
		}
		System.out.println(rev2);	
	}
	public static void main(String[] args) {
		largest m= new largest();
		m.m2();
		
	}
}
