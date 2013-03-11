package test;

import java.io.*;
import java.net.*;

public class Dool {
	 Socket fromserver = null;
	 PrintWriter    out;
	 BufferedReader in;
	 public void ccc() throws IOException {

		    System.out.println("Welcome to Client side");

		   

		    System.out.println("Connecting to... ");
     try{
		    fromserver = new Socket("192.168.161.33",8039);
      }catch (Exception e) {
	System.out.println("fail");
     }
		    System.out.println("Connected to Port:"+fromserver.getPort()+" \nHost: "+fromserver.getInetAddress());
		   in  = new BufferedReader(new InputStreamReader(fromserver.getInputStream()));
		   out = new PrintWriter(fromserver.getOutputStream(),true);
		  
		  }
	 public void messageWrite() throws IOException{
//		 try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
		 
		    System.out.println("Enter the message:");
		    BufferedReader inu = new  BufferedReader(new InputStreamReader(System.in));
		    System.out.println("entered message: "+inu.readLine()+"\n");

		    String fuser,fserver;

		    while ((fuser = inu.readLine())!=null) {
		      out.println(fuser);
		      fserver = in.readLine();
		      System.out.println(fserver);
		      if (fuser.equalsIgnoreCase("close")) break;
		      if (fuser.equalsIgnoreCase("exit")) break;
		    }

		    out.close();
		    in.close();
		    inu.close();
		    fromserver.close();
		 
	 }
	 public static void main(String[] args) throws IOException {
		 Dool dd = new Dool();
		 try{
			 dd.ccc(); 
			 dd.messageWrite();
		 }catch (Exception e) {
			System.out.println("Shit");
		}
		 
	}
}
