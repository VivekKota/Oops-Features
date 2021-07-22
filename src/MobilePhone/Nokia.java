package MobilePhone;

public class Nokia extends Mobile{
	
	private boolean bluetooth;
	
	public Nokia() 
	{
		super();
	}

	public Nokia(String imeiCode, String simCard, String processor, int storage, boolean bluetooth) 
	{
		super(imeiCode, simCard, processor, storage);
		this.bluetooth = bluetooth;
	}

	public void getBlueToothConnection()  
    {  
        if(bluetooth == true)
        {
        	System.out.println("Bluetooth present");
        }  
        else
        {
        	System.out.println("Bluetooth not present");
        }
    }  
  
	@Override
	public void sendMessage()
    {  
    	System.out.println("Message Sent to a group");  
    }  

}
