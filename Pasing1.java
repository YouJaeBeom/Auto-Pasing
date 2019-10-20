
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//import Start.Serial_Reader_Writer;
import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Pasing1 extends JFrame {
	static JButton Enr_btn ;
	static JButton con_btn ;
	static JButton discon_btn ;
	public static JTextArea result_Jtext;
	
	public Pasing1()
	{			
		super();
	}
	public static void main(String[] args) throws Exception {                  
		// TODO Auto-generated method stub
		//제목 설정
		Dimension dim = new Dimension(400,150);
		JFrame frame =new JFrame("제목은 여기에!!");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
	
		// 세팅 판넬
		JPanel setting_panel =new JPanel(); // key 2개 입력 칸과 com port선택창 추가
		setting_panel.setLayout(new BoxLayout(setting_panel,BoxLayout.X_AXIS));
		
		setting_panel.add(new JLabel("Coin_Name"));
		final JTextField Coin_Name=new JTextField(20);
		setting_panel.add(Coin_Name);
	
		setting_panel.add(new JLabel("COM_Port"));
		final JTextField COM_Port=new JTextField(20);
		setting_panel.add(COM_Port);
	
		
		
		// 버튼 판넬
		JPanel btn_panel =new JPanel(); // 등록 키 및 시작 정지 버튼 누르기
		btn_panel.setLayout(new BoxLayout(btn_panel,BoxLayout.X_AXIS));
		Enr_btn = new JButton("등록 하기");
		 con_btn = new JButton("연결하기");
		 discon_btn = new JButton("연결해제");
		 Enr_btn.setBackground(SystemColor.LIGHT_GRAY);
		 con_btn.setBackground(SystemColor.LIGHT_GRAY);
		 discon_btn.setBackground(SystemColor.LIGHT_GRAY);
		btn_panel.add(Enr_btn);
		btn_panel.add(con_btn);
		btn_panel.add(discon_btn);
	
		//결과 창 판넬
		JPanel result_panel =new JPanel(); // key 2개 입력 칸과 com port선택창 추가
		result_panel.setLayout(new BoxLayout(result_panel,BoxLayout.X_AXIS));
		result_panel.add(new JLabel("Connect Key"));
		result_Jtext=new JTextArea(10,20);
		JScrollPane scroller=new JScrollPane(result_Jtext);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		result_panel.add(scroller);
		
		
		
		
		JPanel total_panel =new JPanel();
		total_panel.setLayout(new BoxLayout(total_panel,BoxLayout.Y_AXIS));
		total_panel.add(setting_panel);
		total_panel.add(btn_panel);
		total_panel.add(result_panel);
		
		frame.add(total_panel,BorderLayout.CENTER);
		
		//final String coin_name="TMTG";
		frame.pack();
	
		//등록하기 
		Enr_btn.addActionListener(new ActionListener(){ //익명클래스로 리스너 작성
			public void actionPerformed(ActionEvent e){
				Enr_btn.setBackground(SystemColor.gray);
				Enr_btn.setText("등록 완료");
				String coin_name="";
				String com_port="";
				
				if(Coin_Name.getText().isEmpty()||COM_Port.getText().isEmpty())
				{ // 어떤것이 입력이 재대로 안됨
					result_Jtext.append("입력이 완벽하지 않습니다."+"\n");
				}
				else { // 제대로 입력이됨
					Static_setting.coin_name=Coin_Name.getText();
					Static_setting.com_port=COM_Port.getText();
					 result_Jtext.append("등록한 코인명 : "+Static_setting.coin_name+"\n");
					 result_Jtext.append("등록한 Comport명 : "+Static_setting.com_port+"\n");
					 result_Jtext.setCaretPosition(result_Jtext.getDocument().getLength());  // 맨아래로 스크롤한다.

				}
				
				 
				}
		});
//		
//		/*연결하기 버튼 클릭시 
//		 * 시리얼 포트 연결하여 시리얼 값받고 보내서 자동 매수 매도 실행하도록 이동하게
//		 * 시리얼 포트 클래스 생성해서 그기로 이동하면 될듯 */
		//연결하기 //사는거 매수 
		con_btn.addActionListener(new ActionListener(){ //익명클래스로 리스너 작성
			public void actionPerformed(ActionEvent e){
			//String api_key=Jtext.getText();
				String com_port=Static_setting.com_port;
				con_btn.setBackground(SystemColor.gray);
				con_btn.setText("연결 완료");
				
					new Thread(new Threadtest(com_port)).start();
			
//				try {
////					closePort();
////		  			(new Pasing1()).connect(com_port);// 접속할 포트번호
//					Threadtest t1 = new Threadtest();
//					t1.run(com_port);
//		  			} catch (Exception e1) {
//		  				e1.printStackTrace();
//		  				System.out.println("접속중 오류");
//		  			}
			}
		});
		
		/*연결 해제 버튼 클릭시
		 * api키를 null로 세팅하여 사용 못하도록 다시 세팅할 수 있도록 유도*/
		//연결 해제 //파는거 매도
		discon_btn.addActionListener(new ActionListener(){ //익명클래스로 리스너 작성
			public void actionPerformed(ActionEvent e){
				Enr_btn.setBackground(SystemColor.LIGHT_GRAY);
				Enr_btn.setText("등록 하기");
				con_btn.setBackground(SystemColor.LIGHT_GRAY);
				con_btn.setText("연결하기");
				Static_setting.com_port=null;
				 Static_setting.com_port=null;
				 result_Jtext.append("연결이 해제되었습니다.\n"+"재시도시 다시 키를 등록해주세요.\n");
				 result_Jtext.setCaretPosition(result_Jtext.getDocument().getLength());  // 맨아래로 스크롤한다.
				 System.exit(0);
			}
		});
		
		//프레임 보이도록 설정
		frame.setVisible(true);
		
		//X버튼 눌렀을 때 닫히도록 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		


	}
		

	
	
}