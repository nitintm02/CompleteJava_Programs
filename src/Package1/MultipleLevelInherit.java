package Package1;
interface Youtube
{
	void watch_later();
	void play ();
}

interface Gmail
{
	void send_schedule();
	void inbox();
	
}
public class MultipleLevelInherit implements Youtube, Gmail
{

	public static void main(String[] args) 
	{
		

	}

	@Override
	public void send_schedule() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inbox() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void watch_later() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
