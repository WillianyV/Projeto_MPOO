package model;

import view.Log;

public class ThreadLog extends Thread{
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(500);
				Historico.lerArquivo();				
				Log.getArea().setText(Log.getLog());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
