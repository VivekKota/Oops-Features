package MobilePhone;

public class MainMobile 
{

	public static void main(String[] args) 
	{
		Samsung samsungMobile=new Samsung("IMEI00123456","VI","SD865",128, "68MP" );
		Mobile nokiaMobile =new Nokia("IMEI00123654","Jio","Helio",128,true);
		
		//compile-time polymorphism
		samsungMobile.cameraClick();
		samsungMobile.cameraClick("Paranoid");
		
		//run-time polymorphism
		nokiaMobile.sendMessage();
		
		Phone p=new Mobile();
		p.dial();
			
	}

}
