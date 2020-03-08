
public class Main implements Runnable {
	
	GameClass game = new GameClass();
	
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Main());
		t1.start();
	}

	@Override
	public void run() 
	{
		while(true) 
		{
			game.doIt();
			game.winCheck();
		}
	}

}
