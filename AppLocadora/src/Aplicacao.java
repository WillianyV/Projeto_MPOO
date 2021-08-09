


	import javax.swing.JOptionPane;



	public class Aplicacao extends Thread{
		
		TelaInicial t = new TelaInicial();
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
			
			Thread thread = new Thread( new Aplicacao());
			thread.start();
			new Aplicacao();
			
		}

	}



