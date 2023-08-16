package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server0 {

	//서버소켓
	ServerSocket ss;
	//클라이언트와 통신할 수 있는 소켓
	Socket s;		
	
	//보조스트림
	DataInputStream  dis;
	DataOutputStream dos;
	
	 
	public Server0() {
		 
		try {
			ss = new ServerSocket(5500);
			//대기상태에 있다가  client가 요청이 오면 통신할 수 있는 소켓을 생성해서 반환합니다.
			System.out.println(" server start!!!!!");
			s=ss.accept();
			System.out.println(" client  요청 !!");
			
			//받기
			dataRecv();			
			
			//보내기
			dataSend();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	private void dataSend() {
		// TODO Auto-generated method stub
		
	}

	private void dataRecv() {
		// TODO Auto-generated method stub
		
	}

	public static void main( String[] args) {

		Server0 s= new Server0();
		
	}

}
