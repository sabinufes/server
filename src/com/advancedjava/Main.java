package com.advancedjava;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket =new ServerSocket(9999);
        Socket s  = serverSocket.accept();

        InputStream inputStream = s.getInputStream();
        OutputStream outputStream= s.getOutputStream();

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

        String line =in.readLine();
        String line2 =in.readLine();
        String line3 =in.readLine();


        System.out.println( Integer.parseInt(line + line2 + line3));
    }
}
