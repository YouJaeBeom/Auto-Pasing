import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Request1 {
	String json;
	 Request1( ) throws Exception {
		// TODO Auto-generated constructor stub
		 String address ="https://api.bithumb.com/public/btci"; // 특정 코인이름을 가져오는 주소
		 BufferedReader br; 
		 URL url;
		 HttpURLConnection conn;
		 String protocol ="GET";
		 
		 url=new URL(address); //url에 주소를 넣고
		 conn=(HttpURLConnection)url.openConnection(); //http통신을 통해 웹서버 접속
		 conn.setRequestMethod(protocol); //안에있는 값들을 
		 br = new BufferedReader(new InputStreamReader(conn.getInputStream()));// 안에 있는값들을 버퍼리드로 가져온다.
		 
		 json = br.readLine();
		 
	}
}
