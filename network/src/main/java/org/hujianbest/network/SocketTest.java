package org.hujianbest.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
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
        try (Socket socket = new Socket()) {
            socket.connect(address, 10000);
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
