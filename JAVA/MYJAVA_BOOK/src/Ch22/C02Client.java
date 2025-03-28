package Ch22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class C02Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket client = new Socket("192.168.16.203",7002);	
		
		System.out.println("[CLIENT] 연결 시작합니다");
		//INOUT STREAM 
		System.out.println("CLIENT IP : " + client.getInetAddress());
		OutputStream out = client.getOutputStream();
		DataOutputStream dout = new DataOutputStream(out);
		InputStream in = client.getInputStream();
		DataInputStream din = new DataInputStream(in);
		
		//내용교환(q:종료)
		Scanner sc = new Scanner(System.in);
		String recv=null;
		String send=null;
		
		while(true) {
			//CLIENT->SERVER (수신)
			recv = din.readUTF();
			if(recv.equals("q"))
				break;
			System.out.println("[SERVER ] : " + recv);	
			
			//SERVER->CLIENT (송신)
			System.out.print("[CLIENT(q:종료)] :");
			send=sc.nextLine();
			if(send.equals("q")) {
				break;
			}
			dout.writeUTF(send);
			dout.flush();

		}
		din.close();
		dout.close();
		in.close();
		out.close();
		client.close();
		System.out.println("[CLIENT] 연결 종료합니다");
		
	}
}
