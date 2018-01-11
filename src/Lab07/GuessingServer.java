package Lab07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GuessingServer {
	
	public static int getMid(int lower, int upper){
		int middle = lower + ((upper - lower) / 2);
		return middle;
	}
	
	public static void main(String[] args){
		
		try {
			ServerSocket server = new ServerSocket(5150);
			
			while(!(server.isClosed())){
				Socket socket = server.accept();
				InputStream istream = socket.getInputStream();
				OutputStream ostream = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(ostream, true);
				Scanner scanner = new Scanner(istream);
				
				String clientMessage = scanner.nextLine();
				
				if(clientMessage.equals("SHUT DOWN")){
					scanner.close();
					writer.close();
					socket.close();
					server.close();
					break;
				}
				
				String[] numbers = new String[2];
				numbers = clientMessage.split(" ");
				int lower = Integer.parseInt(numbers[0]);
				int upper = Integer.parseInt(numbers[1]);
				
				int middle = getMid(lower, upper);
				
				writer.println(middle);
				
				boolean isSearching = true;
				
				while(isSearching == true){
					String message = scanner.next();
					if(message.equals("won"))
						isSearching = false;
					else if(message.equals("low")){
						lower = middle;
						middle = getMid(lower, upper);
					}
					else if(message.equals("high")){
						upper = middle;
						middle = getMid(lower, upper);
					}
					else if(message.equals("lost"))
						isSearching  = false;
					
					writer.println(middle);
				}
			}
			
		} catch (NoSuchElementException f) {
			
		} catch (IOException e) {
			
		}
		
	}

}
