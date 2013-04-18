package sockettest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketTest {
	public static void main(String[] args) throws IOException {
		int i = 0;
		ServerSocket s = new ServerSocket(8989);
		while(true){
			Socket incoming = s.accept();
			System.out.println("µÚ" + i);
			Runnable r = new EchoHandler(incoming);
			Thread  t = new Thread(r);
			t.start();
			i++;
		}
		
	}
}
class EchoHandler implements Runnable{
	private Socket incoming;
	public EchoHandler(Socket s){
		this.incoming = s;
	}
	@Override
	public void run() {
		try {
			try{
				System.out.println("11111");
				InputStream inStream = this.incoming.getInputStream();
				OutputStream outStream = this.incoming.getOutputStream();
				
				//BufferedReader br = new BufferedReader(new InputStreamReader(inStream));
				Scanner in = new Scanner(inStream);
				PrintWriter pw = new PrintWriter(outStream,true);
				pw.println("OK");
				System.out.println("2222222222222222");
				boolean done = false;
				while(!done && in.hasNextLine()){
					String line = in.nextLine();
					pw.println("out: " + line);
					if (line.trim().equals("bye")){
						done = true;
					}
				}
				System.out.println("3333333333333");
			}finally{
				this.incoming.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}

