package PRAKTIKA19;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;

public class Chat {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> ports = new ArrayList<>();
        DatagramSocket socket = new DatagramSocket(9087);
        byte[] buffer = new byte[2024];
        DatagramPacket packet = new DatagramPacket(
                buffer,
                0,
                buffer.length);
        System.out.println("listening on 9087");
        while (true) {
            socket.receive(packet);
            System.out.println(packet.getAddress());
            System.out.println(packet.getPort());
            if(!ports.contains(packet.getPort()))
                ports.add(packet.getPort());
            String message = new String(buffer, 0, packet.getLength());
            System.out.println(message);
            for(int t: ports)
                sendMessage(message, "255.255.255.255", t);
        }
    }
    public static void sendMessage(
            String message,
            String address,
            int port) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] data = message.getBytes();
        DatagramPacket packet = new DatagramPacket(
                data,
                0, data.length,
                InetAddress.getByName(address),
                port
        );
        socket.send(packet);
    }
}
