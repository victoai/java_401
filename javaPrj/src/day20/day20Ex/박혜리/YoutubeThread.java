package day20.day20Ex.박혜리;

public class YoutubeThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("비디오 재생중: " + i);
		}
	}
}
