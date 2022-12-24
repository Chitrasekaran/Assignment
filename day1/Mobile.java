package week1.day1;

public class Mobile {

	public void makeCall()
	{
		float mobileWeight = 400f;
		String mobileModel="Xiomi";
		System.out.println(mobileWeight);	
	System.out.println(mobileModel);
	}
	
	public void sendMsg()
	{
		int mobileCost = 25000;
		boolean fullCharged =true;
		System.out.println(mobileCost);	
		System.out.println(fullCharged);	
	}
	
	public static void main(String[]args)
	{
		Mobile obj=new Mobile ();
		obj.makeCall();
		obj.sendMsg();
			}
	
}
