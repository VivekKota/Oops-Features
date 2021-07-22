package MobilePhone;

public class Mobile implements Phone
{

    private String imeiCode;  
    private String simCard ;  
    private String processor ;  
    private int storage ; 
 
    public Mobile(String imeiCode, String simCard, String processor, int storage) {
		super();
		this.imeiCode = imeiCode;
		this.simCard = simCard;
		this.processor = processor;
		this.storage = storage;
	}    
    
	public Mobile() 
	{
		super();
	}
	
	@Override
	public void dial() 
	{
		System.out.println("Call dialed");
		
	}

	@Override
	public void receive() 
	{
		System.out.println("Call received");
		
	}
	
	public String getImeiCode() {
		return imeiCode;
	}
	public void setImeiCode(String imeiCode) {
		this.imeiCode = imeiCode;
	}
	public String getSimCard() {
		return simCard;
	}
	public void setSimCard(String simCard) {
		this.simCard = simCard;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
    
   
    public void sendMessage()  
    {  
    	System.out.println("Message Sent");  
    }
    
    public void receiveMessage()
    {
    	System.out.println("Received a Message");
    }
 
	 

}
