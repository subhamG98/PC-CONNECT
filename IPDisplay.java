
import java.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Enumeration;
 

public class IPDisplay extends JFrame {

    String userWord = "";
    JTextField userInput = new JTextField(10);
    JTextPane IP=new JTextPane();
    JButton submit = new JButton("Submit");
    
    

	private static ServerSocket server = null;
	private static Socket client = null;
	private static BufferedReader in = null;
	private static String line;
	private static boolean isConnected=true;
	private static Robot robot;
	private static  int SERVER_PORT = 8998;
 

	public static InetAddress getLocalAddress() throws SocketException
	  {
	    Enumeration<NetworkInterface> ifaces = NetworkInterface.getNetworkInterfaces();
	    while( ifaces.hasMoreElements() )
	    {
	      NetworkInterface iface = ifaces.nextElement();
	      Enumeration<InetAddress> addresses = iface.getInetAddresses();

	      while( addresses.hasMoreElements() )
	      {
	        InetAddress addr = addresses.nextElement();
	        if( addr instanceof Inet4Address && !addr.isLoopbackAddress() )
	        {
	        	
	          return addr;
	        }
	      }
	    }

	    return null;
	  }


	
	
    public IPDisplay() {
        super("Your IP Address");
        JPanel centerPanel = new JPanel();
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // This center the window on the screen
        
        submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
//				submitAction();	
			}
		});
        	
        try {
			IP.setText("IP Address="+getLocalAddress().toString().replace("/", ""));
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        centerPanel.add(IP);
        
        
        
        
        
        Box theBox = Box.createVerticalBox();
        theBox.add(Box.createVerticalStrut(100));
        theBox.add(centerPanel);
        theBox.add(Box.createVerticalStrut(200));
        
        
        add(theBox);
    }

 
    public static void main(String[] args) {
        new IPDisplay().setVisible(true);

 
        
        
        
        
        
    }
}





