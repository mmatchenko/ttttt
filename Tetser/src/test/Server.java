package test;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Server side");
		BufferedReader in = null;
		PrintWriter out = null;
		PrintWriter out2 = null;
		ServerSocket servers = null;
		Socket fromclient = null;
		Socket fromclient2 = null;
		Dool dool = new Dool();
		Dool dool2 = new Dool();
		// create server socket
		try {
			servers = new ServerSocket(8039);
		} catch (IOException e) {
			System.out.println("Couldn't listen to port");
			System.exit(-1);
		}

		try {
			System.out.print("Waiting for the first client...\n");
			dool.ccc();
			fromclient = servers.accept();
			System.out.println("First Client connected");
			
			System.out.print("Waiting for the second client...\n");
			dool2.ccc();
			fromclient2 = servers.accept();
			System.out.println("Second Client connected");
			
		} catch (IOException e) {
			System.out.println("Can't accept");
			System.exit(-1);
		}

		in = new BufferedReader(new InputStreamReader(
				fromclient.getInputStream()));
		out = new PrintWriter(fromclient.getOutputStream(), true);
		out2 = new PrintWriter(fromclient2.getOutputStream(), true);
		String input, output;

		System.out.println("Wait for messages");
		dool.messageWrite();

		while ((input = in.readLine()) != null) {
			if (input.equalsIgnoreCase("exit"))
				break;
			 int end = input.indexOf("666");
			out2.println("S ::: " + input);
			
			System.out.println(input);
		}
		out.close();
		in.close();
		fromclient.close();
		servers.close();

	}
}
