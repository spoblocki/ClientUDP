package pl.sp.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {

	final static String ipaddress = "192.168.43.1";
	final static int port = 55560;
	final static int portdoc = 55555;

	static void send() {

		InetAddress ip = null;
		try {
			ip = InetAddress.getByName(ipaddress);
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		}

		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(port);
		} catch (SocketException se) {

			se.printStackTrace();
		}
	
		byte[] buf1 = GUI.getJtextfield().getText().getBytes();

		DatagramPacket dp1 = new DatagramPacket(buf1, buf1.length, ip, portdoc);

		try {
			ds.send(dp1);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		ds.close();

	}
}
