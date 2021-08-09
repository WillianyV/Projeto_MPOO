
public class App extends Thread {
	Menu menu = new Menu();
	Backup b;
	
	
	public void run(){
		
		for(;;){

			try {
				
				Thread.sleep(10000);
				Backup.backup();
				

			} catch (InterruptedException e) {
				e.printStackTrace();
			}


		}
	}	
	
	public static void main(String[] args) {
		
		Thread thread = new Thread( (Runnable) new Menu() );
		thread.start();
		new Menu();
	}

}
