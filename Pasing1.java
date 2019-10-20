
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
		//���� ����
		Dimension dim = new Dimension(400,150);
		JFrame frame =new JFrame("������ ���⿡!!");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
	
		// ���� �ǳ�
		JPanel setting_panel =new JPanel(); // key 2�� �Է� ĭ�� com port����â �߰�
		setting_panel.setLayout(new BoxLayout(setting_panel,BoxLayout.X_AXIS));
		
		setting_panel.add(new JLabel("Coin_Name"));
		final JTextField Coin_Name=new JTextField(20);
		setting_panel.add(Coin_Name);
	
		setting_panel.add(new JLabel("COM_Port"));
		final JTextField COM_Port=new JTextField(20);
		setting_panel.add(COM_Port);
	
		
		
		// ��ư �ǳ�
		JPanel btn_panel =new JPanel(); // ��� Ű �� ���� ���� ��ư ������
		btn_panel.setLayout(new BoxLayout(btn_panel,BoxLayout.X_AXIS));
		Enr_btn = new JButton("��� �ϱ�");
		 con_btn = new JButton("�����ϱ�");
		 discon_btn = new JButton("��������");
		 Enr_btn.setBackground(SystemColor.LIGHT_GRAY);
		 con_btn.setBackground(SystemColor.LIGHT_GRAY);
		 discon_btn.setBackground(SystemColor.LIGHT_GRAY);
		btn_panel.add(Enr_btn);
		btn_panel.add(con_btn);
		btn_panel.add(discon_btn);
	
		//��� â �ǳ�
		JPanel result_panel =new JPanel(); // key 2�� �Է� ĭ�� com port����â �߰�
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
	
		//����ϱ� 
		Enr_btn.addActionListener(new ActionListener(){ //�͸�Ŭ������ ������ �ۼ�
			public void actionPerformed(ActionEvent e){
				Enr_btn.setBackground(SystemColor.gray);
				Enr_btn.setText("��� �Ϸ�");
				String coin_name="";
				String com_port="";
				
				if(Coin_Name.getText().isEmpty()||COM_Port.getText().isEmpty())
				{ // ����� �Է��� ���� �ȵ�
					result_Jtext.append("�Է��� �Ϻ����� �ʽ��ϴ�."+"\n");
				}
				else { // ����� �Է��̵�
					Static_setting.coin_name=Coin_Name.getText();
					Static_setting.com_port=COM_Port.getText();
					 result_Jtext.append("����� ���θ� : "+Static_setting.coin_name+"\n");
					 result_Jtext.append("����� Comport�� : "+Static_setting.com_port+"\n");
					 result_Jtext.setCaretPosition(result_Jtext.getDocument().getLength());  // �ǾƷ��� ��ũ���Ѵ�.

				}
				
				 
				}
		});
//		
//		/*�����ϱ� ��ư Ŭ���� 
//		 * �ø��� ��Ʈ �����Ͽ� �ø��� ���ް� ������ �ڵ� �ż� �ŵ� �����ϵ��� �̵��ϰ�
//		 * �ø��� ��Ʈ Ŭ���� �����ؼ� �ױ�� �̵��ϸ� �ɵ� */
		//�����ϱ� //��°� �ż� 
		con_btn.addActionListener(new ActionListener(){ //�͸�Ŭ������ ������ �ۼ�
			public void actionPerformed(ActionEvent e){
			//String api_key=Jtext.getText();
				String com_port=Static_setting.com_port;
				con_btn.setBackground(SystemColor.gray);
				con_btn.setText("���� �Ϸ�");
				
					new Thread(new Threadtest(com_port)).start();
			
//				try {
////					closePort();
////		  			(new Pasing1()).connect(com_port);// ������ ��Ʈ��ȣ
//					Threadtest t1 = new Threadtest();
//					t1.run(com_port);
//		  			} catch (Exception e1) {
//		  				e1.printStackTrace();
//		  				System.out.println("������ ����");
//		  			}
			}
		});
		
		/*���� ���� ��ư Ŭ����
		 * apiŰ�� null�� �����Ͽ� ��� ���ϵ��� �ٽ� ������ �� �ֵ��� ����*/
		//���� ���� //�Ĵ°� �ŵ�
		discon_btn.addActionListener(new ActionListener(){ //�͸�Ŭ������ ������ �ۼ�
			public void actionPerformed(ActionEvent e){
				Enr_btn.setBackground(SystemColor.LIGHT_GRAY);
				Enr_btn.setText("��� �ϱ�");
				con_btn.setBackground(SystemColor.LIGHT_GRAY);
				con_btn.setText("�����ϱ�");
				Static_setting.com_port=null;
				 Static_setting.com_port=null;
				 result_Jtext.append("������ �����Ǿ����ϴ�.\n"+"��õ��� �ٽ� Ű�� ������ּ���.\n");
				 result_Jtext.setCaretPosition(result_Jtext.getDocument().getLength());  // �ǾƷ��� ��ũ���Ѵ�.
				 System.exit(0);
			}
		});
		
		//������ ���̵��� ����
		frame.setVisible(true);
		
		//X��ư ������ �� �������� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		


	}
		

	
	
}