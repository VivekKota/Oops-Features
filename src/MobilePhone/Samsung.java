package MobilePhone;

public class Samsung extends Mobile 
{
	private String camera;
	
	public Samsung() 
	{
		super();
	}
     

	public Samsung(String imeiCode, String simCard, String processor, int storage, String camera) 
	{
		super(imeiCode, simCard, processor, storage);
		this.camera = camera; 

	}


	public void getWIFIConnection()  
    {  
		System.out.println("WIFI connected");  
    }  
 

    public void cameraClick()  
    {  
    	System.out.println("Camera clicked");  
    }  
  
  
    public void cameraClick(String cameraMode)  
    {  
    	System.out.println("Camera clicked in " + cameraMode + " Mode");  
    }  

}
