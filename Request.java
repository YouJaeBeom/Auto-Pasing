
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Request {

	String json;
	 Request(String CoinName) throws Exception {
		// TODO Auto-generated constructor stub
		 String address ="https://api.bithumb.com/public/ticker/"+CoinName; // Ư�� �����̸��� �������� �ּ�
		 BufferedReader br; 
		 URL url;
		 HttpURLConnection conn;
		 String protocol ="GET";
		 
		 url=new URL(address); //url�� �ּҸ� �ְ�
		 conn=(HttpURLConnection)url.openConnection(); //http����� ���� ������ ����
		 conn.setRequestMethod(protocol); //�ȿ��ִ� ������ 
		 br = new BufferedReader(new InputStreamReader(conn.getInputStream()));// �ȿ� �ִ°����� ���۸���� �����´�.
		 
		 json = br.readLine();
		 
	}
}
