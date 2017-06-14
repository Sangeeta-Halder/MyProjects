

public class PingPong extends Thread{

	public static void main(String[] args)
	{
		PingPong p1 = new PingPong("Ping");
		PingPong p2 = new PingPong("Pong");
		
		p1.start();
		p2.start();
	}
	
	private String msg ;
	private String turn ; 
	
	PingPong(String msg)
	{
		this.msg = msg;
	}
	
	@Override
	public void run()
	{
		
		while(true)
		{
			sayPingPong();	
		}
		
		
	}
	
	
	 public synchronized void sayPingPong()
	{
		
			if(msg!=turn)
			{
				System.out.println(" "+msg);
				turn = msg;
			}
		
		
	}
}
