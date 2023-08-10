package day16.project.티켓팅프로그램;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Area {
	String Path;
	int Seat;
	char[] Concert;
	
	public Area() {
	}
	
	public Area(String path, int seat) {
		super();
		this.Path = path;
		this.Seat = seat;
		this.Concert = new char[seat];
	}
	
	public void ConcertState() {
		//파일에서 문자 단위로 읽기
		try {
			FileReader fis = new FileReader(this.Path);
			for(int i = 0; i<this.Seat; i++) {
				int data = fis.read();
				this.Concert[i] = (char)data;
				//System.out.print(this.Concert[i]);
			}
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
