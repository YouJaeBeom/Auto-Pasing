import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Threadtest implements Runnable  {
	String portName="";
	public Threadtest(String portName) {
		this.portName = portName;
	}
	   public void run()
	    {
	        SerialPort serialPort;
			OutputStream out;
			InputStream in;
			
			try 
				{
				while(true)
				{
					System.out.printf("Port : %s\n", portName);
					
					CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);

					if (portIdentifier.isCurrentlyOwned()) {
						System.out.println("Error: Port is currently in use");
					} 
					else
					{
						CommPort commPort = portIdentifier.open(this.getClass().getName(),
								2000);

						if (commPort instanceof SerialPort)
						{
							 serialPort = (SerialPort) commPort;
							serialPort.setSerialPortParams(9600,	// ��żӵ�
									SerialPort.DATABITS_8, 			// ������ ��Ʈ
									SerialPort.STOPBITS_1,			// stop ��Ʈ
									SerialPort.PARITY_NONE);		// �и�Ƽ

							// �Է� ��Ʈ��
							 in = serialPort.getInputStream();
							
							// ��� ��Ʈ��
							 out = serialPort.getOutputStream();
							
							
							(new Thread(new SerialReader(in))).start();
							while(true) {
							try
							{
								while(true) {
								int c = 0;
								String CoinName[]= Static_setting.coin_name.split(",");
							
								//��ü ������ �迭�� ���� ���� �߰��� ���⿡�� �߰��ϸ� ��
								int i;
								
								for(i=0; i<CoinName.length;i++) 
								{// ���ΰ��� ��ŭ ������ �Ľ��� ���� for���� �迭 ���ڸ�ŭ
									
									Request re = new Request(CoinName[i]); //url�� �����ϴ� Ŭ���� ���� (�����̸��� ������)
									
									String json =re.json; 
									
									
									JSONParser parser=new JSONParser();
									JSONObject obj =(JSONObject)parser.parse(json);
									JSONObject data =(JSONObject)obj.get("data");
									String price=(String)data.get("closing_price");
									
									
									///////////////////////////////////////////////////////////////////�����̸� ��Ʈȭ
									
									String[] arr_coin=CoinName[i].split("");
//	        							for(int r=0;r<arr_coin.length;r++)
//	        							{
//	        							System.out.print(arr_coin[r]);
//	        							}
									String[] array_coin= {"<","<","0","0","0","0","0","0","0"};
									int coinlen1=arr_coin.length;
									int coinlen2=arr_coin.length;
									for(int w=8; w>8-coinlen1;w--) 
									{
										array_coin[w]=arr_coin[coinlen2-1];
										coinlen2--;
									}
								
									
									//////////////////////////////////////////////////////////////////// ���� ��Ʈȭ
									
									String[] arr_price=price.split("");
									
									String[] array_price= {"_","_","0","0","0","0","0","0","0","0","0","0"};
									int pricelen1=arr_price.length;
									int pricelen2=arr_price.length;
									for(int w=11; w>11-pricelen1;w--)
									{
										array_price[w]=arr_price[pricelen2-1];
										pricelen2--;
									}
								
//	        							///////////////////////////////////////////////////////////////////// �ŷ��� ��Ʈȭ
									String unit_straded=(String)data.get("units_traded");
									String[] arr_unit=unit_straded.split("\\.");
									String[] arr_unit1=arr_unit[0].split("");
									
									String[] array_unit= {"_","_","0","0","0","0","0","0","0","0","0","0"};
									int unitlen1=arr_unit1.length;
									int unitlen2=arr_unit1.length;
									for(int w=11; w>11-unitlen1;w--)
									{
										array_unit[w]=arr_unit1[unitlen2-1];
										unitlen2--;
									}
									
									/////////////////////////////////////////////////////////////////// �����ݾ� ��Ʈȭ
									
									String lfluctate= (String)data.get("fluctate_24H");
									String fluctate=String.valueOf(lfluctate);
									String[] arr_fluctate;
									String[] array_fluctate;
									if(fluctate.contains("-"))
									{
										fluctate=fluctate.replace("-", "0");
										arr_fluctate=fluctate.split("");
										array_fluctate=new String[]{"_","_","-","0","0","0","0","0","0","0","0","0"}; ///�����ݾ��� ��Ʈ �ø���� �ϳ� �߰� 
									}
									else
									{
										arr_fluctate=fluctate.split("");
										array_fluctate=new String[]{"_","_","+","0","0","0","0","0","0","0","0","0"};///�����ݾ��� ��Ʈ �ø���� �ϳ� �߰� 
									}
									
									int fluctate_len1=arr_fluctate.length;
									int fluctate_len2=arr_fluctate.length;
									for(int w=11; w>11-fluctate_len1;w--)
									{
										array_fluctate[w]=arr_fluctate[fluctate_len2-1];
										fluctate_len2--;
									}
									
									/////////////////////////////////////////////////////////////////// ������ ��Ʈȭ
									String fluctate_rate=(String)data.get("fluctate_rate_24H");
									String[] arr_fluctate_rate;
									String[] array_fluctate_rate;
									if(fluctate_rate.contains("-"))
									{
										fluctate_rate=fluctate_rate.replace("-", "0");
										arr_fluctate_rate=fluctate_rate.split("");
										array_fluctate_rate=new String[]{"_","_","-","0","0","0","0","0","0","0","0"};
									}
									else
									{
										arr_fluctate_rate=fluctate_rate.split("");
										array_fluctate_rate=new String[]{"_","_","+","0","0","0","0","0","0","0","0"};
									}
									int fluctate_ratelen1=arr_fluctate_rate.length;
									int fluctate_ratelen2=arr_fluctate_rate.length;
									for(int w=10; w>10-fluctate_ratelen1;w--)
									{
										array_fluctate_rate[w]=arr_fluctate_rate[fluctate_ratelen2-1];
										fluctate_ratelen2--;
									}
//									String[] arr_price=price.split("");
//									
//									String[] array_price= {"_","_","0","0","0","0","0","0","0","0","0","0"};
//									int pricelen1=arr_price.length;
//									int pricelen2=arr_price.length;
//									for(int w=11; w>11-pricelen1;w--)
//									{
//										array_price[w]=arr_price[pricelen2-1];
//										pricelen2--;
//									}
									
									
									
							       ///////////////////////////////////////////////////////////////// ��Ʈ�� ����
									ArrayList list =new ArrayList(Arrays.asList(array_coin));
									list.addAll(Arrays.asList(array_price));
									list.addAll(Arrays.asList(array_unit));
									list.addAll(Arrays.asList(array_fluctate));
									list.addAll(Arrays.asList(array_fluctate_rate));
//									list.addAll(Arrays.asList(array_btai));
//									list.addAll(Arrays.asList(array_btmi));
									Object[] all=list.toArray();
//	        							out.write(Arrays.toString(all).getBytes());
//	        					    out.write("\n".getBytes());
									for(int y=0; y<list.size();y++)
									{
										out.write(((String) list.get(y)).getBytes());
									}
									out.write("\n".getBytes());
								
									}
								
								Request1 re1 = new Request1();
								String json1 =re1.json;
								JSONParser parser1=new JSONParser();
								JSONObject obj1 =(JSONObject)parser1.parse(json1);
								JSONObject data1 =(JSONObject)obj1.get("data");
								JSONObject btai =(JSONObject)data1.get("btai");
								String market_index =(String)btai.get("market_index");
								JSONObject btmi =(JSONObject)data1.get("btmi");
								String market_index1 =(String)btmi.get("market_index");
								////////////////////////////////////////////////////////////////////btai
								
								String[] arr_btai=market_index.split("");

								String[] array_btai= {"<","<","A","I","0","0","0","0","0","0","0","0","0","0"};
								int btailen1=arr_btai.length;
								int btailen2=arr_btai.length;
								for(int w=13; w>13-btailen1;w--)
								{
									array_btai[w]=arr_btai[btailen2-1];
									btailen2--;
								}

								//////////////////////////////////////////////////////////////////// btmi

								String[] arr_btmi=market_index1.split("");

								String[] array_btmi= {"_","_","M","I","0","0","0","0","0","0","0","0","0","0"};
								int btmilen1=arr_btmi.length;
								int btmilen2=arr_btmi.length;
								for(int w=13; w>13-btmilen1;w--)
								{
									array_btmi[w]=arr_btmi[btmilen2-1];
									btmilen2--;
								}
									ArrayList list =new ArrayList(Arrays.asList(array_btai));
									//list.addAll(Arrays.asList(array_btai));
									list.addAll(Arrays.asList(array_btmi));
									Object[] all=list.toArray();
//        								out.write(Arrays.toString(all).getBytes());
//        					  			  out.write("\n".getBytes());
									for(int y=0; y<list.size();y++)
									{
										out.write(((String) list.get(y)).getBytes());
									}
									out.write("\n".getBytes());
								}
								
								
								} 
									catch (IOException e) 
									{
										e.printStackTrace();
										
									} 
									catch (Exception e) 
									{
								// TODO Auto-generated catch block
										
										e.printStackTrace();
									}
//	        					(new Thread(new SerialWriter(out))).start();
							}
						}
						else
						{
							System.out.println("Error: Only serial ports are handled by this example.");
						}
					}
				}
        } 
         catch (IOException e) 
				{
			 
			   System.out.println( "Error:" + e.getMessage() );
			   } catch (NoSuchPortException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (PortInUseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedCommOperationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			}
	    
		
	
/**
 * �ø��� �б�
 */
public class SerialReader implements Runnable 
{
	InputStream in;

	public SerialReader(InputStream in) {
		this.in = in;
	}

	public void run() {
		byte[] buffer = new byte[1024];
		int len = -1;
		
		try {
			while ((len = this.in.read(buffer)) > -1) {
				System.out.print(new String(buffer, 0, len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}





}

