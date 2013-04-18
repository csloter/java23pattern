package sockettest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketTest {

	public static void t1()  throws IOException{
		Socket s = new Socket();
		s.connect(new InetSocketAddress("101.23.128.17",80));
		System.out.println(s);
		InputStream in = s.getInputStream();
		System.out.println(in.available());
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		System.out.println(br.readLine());
	}
	
	public static void t2() throws IOException{
		ServerSocket ss = new ServerSocket(8989);
		Socket so = ss.accept();
		System.out.println("=============");
		
		InputStream in = so.getInputStream();
		OutputStream ou = so.getOutputStream();
		
		Scanner sc = new Scanner(in);
		PrintWriter pw = new PrintWriter(ou,true);
		pw.println("bac");
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			pw.println(line);
			pw.println(so);
			if (line.trim().equals("bye")){
				break;
			}
		}
		
	}
	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws IOException {
		t2();
	}

}
