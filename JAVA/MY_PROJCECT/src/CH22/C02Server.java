package CH22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02Server {

	public static void main(String[] args) throws IOException {
		// 서버 소켓 생성
		ServerSocket server = new ServerSocket(7000); // 192.168.16.105:7000
		System.out.println("[INFO] SERVER SOCKET LISTENING");

		//1회 응답
		Socket client = server.accept();
		
		System.out.println("[SERVER] 연결 시작합니다");
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
			//SERVER->CLIENT (송신)
			System.out.print("[SERVER(q:종료)] :");
			send=sc.nextLine();
			if(send.equals("q")) {
				break;
			}
			dout.writeUTF(send);
			dout.flush();
			//CLIENT->SERVER (수신)
			recv = din.readUTF();
			if(recv.equals("q"))
				break;
			System.out.println("[CLIENT ] : " + recv);	
		}
		din.close();
		dout.close();
		in.close();
		out.close();
		client.close();
		server.close();
		System.out.println("[SERVER] 연결 종료합니다");
		
		
	
	}

}