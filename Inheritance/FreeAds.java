package Inheritance;
class PaidAds
{
	public void addDescription(String Description)
	{
	System.out.println("Your description :"+Description);	
	}
	public void addContact(String n)
	{
	System.out.println("Your Contact Number "+n);	
	}
	public void addEmail(String Email)
	{
	System.out.println("Your Email Id :"+Email);	
	}
}
public class FreeAds extends PaidAds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Main FreeAds");
		FreeAds obj=new FreeAds();
		obj.addDescription("Want to sell our four wheeler");
		obj.addContact("9458707099");
		obj.addEmail("ashwani.jaiswal7099@gmail.com");
		obj.addManager("Mahesh");
		obj.addNewPage("Home Page");
		

	}
	public void addManager(String Name)
	{
	System.out.println("Your Manager Name is: "+Name);	
	}
	public void addNewPage(String PageName)
	{
		System.out.println("Your Page Name :"+PageName);
	}

}
