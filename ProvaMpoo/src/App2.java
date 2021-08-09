import javax.swing.JFrame;

public class App2 extends JFrame{

		
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
			
			Thread thread = new Thread( new App());
			thread.start();
			new App();
			
		}

	

	

}
