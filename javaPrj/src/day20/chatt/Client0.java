package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client0 {
	
	Socket s;
	
	DataInputStream dis;
	DataOutputStream dos;
	
	public Client0() {
		  //서버의 ip , port 
		try {
			s= new Socket("localhost",5500);
			System.out.println(" 서버에 요청 !!");
			
			
			//보내기
			
			dataSend();
			
			//받기
			dataRecv();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	
	private void dataRecv() {
		// TODO Auto-generated method stub
		
	}


	private void dataSend() {
		// TODO Auto-generated method stub
		
	}


	public static void main( String[] args) {
		
		Client0  c= new Client0();
		
	}

}
