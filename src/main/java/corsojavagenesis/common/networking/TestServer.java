package corsojavagenesis.common.networking;

public class TestServer {

	public static void main(String[] args) {
		Server s = new Server(9090);		
		s.start();
		s.start();
		
		
		s.stampaListaIp();
		
		//

	}

}
