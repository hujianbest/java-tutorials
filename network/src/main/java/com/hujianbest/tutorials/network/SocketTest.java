package com.hujianbest.tutorials.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hujian
 */
public class SocketTest {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("time-a.nist.gov", 13);
             Scanner in = new Scanner(socket.getInputStream(), "UTF-8")) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        }

        InetSocketAddress address = new InetSocketAddress("time-a.nist.gov", 13);
        InetAddress addressIp = InetAddress.getByName("time-a.nist.gov");
        byte[] addressBytes = addressIp.getAddress();
        System.out.println(Arrays.toString(addressBytes));
        connect(address);

        InetSocketAddress localhost = new InetSocketAddress("localhost", 8080);
        connect(localhost);
    }

    private static void connect(InetSocketAddress localhost) throws IOException {
        try (Socket socket = new Socket()) {
            socket.connect(localhost, 10000);
            socket.setSoTimeout(10000);
            try (Scanner in = new Scanner(socket.getInputStream(), "UTF-8")) {
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    System.out.println(line);
                }

            }
        }
    }
}
