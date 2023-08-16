package day20.thread;

public class Test {

	public static void main(String[] args) { 
		
		
	}

}


class A extends Thread{
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		 long  time=1000;
		  try {
			sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
