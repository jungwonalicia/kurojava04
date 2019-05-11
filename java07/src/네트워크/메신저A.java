package 네트워크;

import java.awt.BorderLayout;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 메신저A extends JFrame{
	JTextField input;
	JTextArea list;
	DatagramSocket socket;
		
	
	public 메신저A() throws Exception {
		setTitle("메신저A");
		socket = new DatagramSocket(6000);
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = input.getText();
				list.append("ME>> " + data + "\n");
				input.setText("");
				try {
					DatagramSocket socket = new DatagramSocket();
					byte[] data2 = data.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet 
					 = new DatagramPacket(data2, data2.length, ip, 5000);
					
					socket.send(packet);
				}catch (Exception e1) {
				}
			}
		});
		input.setBackground(Color.GREEN);
		input.setForeground(Color.BLUE);
		input.setFont(new Font("굴림", Font.BOLD, 25));
		list = new JTextArea();
		list.setEditable(false);
		list.setBackground(Color.YELLOW);
		list.setFont(new Font("Monospaced", Font.BOLD, 25));
		list.setColumns(20);
		list.setRows(6);
		getContentPane().add(list, BorderLayout.CENTER);
		getContentPane().add(input, BorderLayout.SOUTH);
		pack();
		setVisible(true);
		
	}
	
	public void process() throws Exception {
		while(true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			String data2 = new String(data);
			list.append("YOU>> " + data2 + "\n");
		}
	}
	public static void main(String[] args) throws Exception {
		메신저A name = new 메신저A();
		name.process();
		
	}

}





