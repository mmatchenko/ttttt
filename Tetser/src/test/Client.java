package test;

import java.io.*;
import java.net.*;

public class Client {
  public void conn() throws IOException {

    System.out.println("Welcome to Client side");

    Socket fromserver = null;


    System.out.println("Connecting to... ");

    fromserver = new Socket("localhost",8079);
    BufferedReader in  = new BufferedReader(new InputStreamReader(fromserver.getInputStream()));
    PrintWriter    out = new PrintWriter(fromserver.getOutputStream(),true);
    BufferedReader inu = new BufferedReader(new InputStreamReader(System.in));

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
}