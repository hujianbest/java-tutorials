package com.hujianbest.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author hujian
 */
public class ServerTest {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(8080)) {
            try (Socket incoming = server.accept()) {
                InputStream inputStream = incoming.getInputStream();
                OutputStream outputStream = incoming.getOutputStream();

                try (Scanner in = new Scanner(inputStream, "UTF-8")) {
                    PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"), true);
                    printWriter.println("Hello! Enter BYE to exit.");

                    boolean done = false;
                    while (!done && in.hasNextLine()) {
                        String line = in.nextLine();
                        printWriter.println("Echo: " + line);
                        if (line.trim().equals("BYE")) {
                            done = true;
                        }
                    }
                }
            }
        }

    }
}
