package corsojavagenesis.common.networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;


public class Server {
	class InnerClass{
		
	}
	
	private ArrayList<String> ip;
	private int port;
	private ServerSocket listener;
	
	int i = 10;	
	int a = new Integer(10);

	int b = Integer.parseInt("100");

	public int getPort() {
		return port;
		
	
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ServerSocket getListener() {
		return listener;
	}

	public void setListener(ServerSocket listener) {
		this.listener = listener;
	}

	public Server(int port){
		this.port = port;
		this.ip = new ArrayList<String>();
		try {
			this.listener = new ServerSocket(9090);
		} catch (IOException e) {
			System.out.println("Port already in use");
		}
	}
	
	// public Server(ServerSocket listener, int port){
		
	//}
	
	public void start(){
		try {
			System.out.println("Server started");
			Socket socket = this.listener.accept();
			this.ip.add(socket.getInetAddress().getHostAddress());
		} catch (IOException e) {
			System.out.println("Errore nel collegamento al client");
		}
	}
	
	public void stop(){
		try {
			this.listener.close();
		} catch (IOException e) {
			System.out.println("Errore nella chiusura del listener");
		}
	}
	
	/**
	 * Salva un file nel disco locale del server contenente l'elenco degli ip server client connessi.
	 * 
	 * Integer
	 * @param path	-   Stringa che rappresenta la path dove salvare il file. 
	 * @return
	 */
	
	public boolean salvaDatiSuDisco(String path){
		
		return true;
	}
	
	public void stampaListaIp(){
		for (int i=0;i<this.ip.size();i++){
			System.out.println("IP " + (i+1) + " - " + this.ip.get(i));
		}
	}
	
	
	
	
 
    
}
