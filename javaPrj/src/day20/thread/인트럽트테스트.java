package day20.thread;

public class 인트럽트테스트 {

	public static void main(String[] args) {
		 

		
		Thread t  = new Thread( new Runnable() {

			@Override
			public void run() {
				for( int i=0; i<100000; i++) {
				
					try {
						Thread.sleep(1000);
						System.out.println( (i+1) + " hi ^^");					
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						System.out.println("자고 있는데 깨어남 "); // interrupt   속성 초기화
						return;
					}
				
					
					if( Thread.currentThread().isInterrupted() ) {
						return;
					}
					
					
				}
				
				
			}});
		t.start();
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//스레드 강제 종료하고 끝내려고 한다.
		t.interrupt();
		System.out.println( "main end");
		
	}

}
