package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {

	public static void main(String[] args) throws UnknownHostException {

	   InetAddress inetAddress = InetAddress.getByName("zhangty");
	 	
		// ����
		// InetAddress inetAddress = InetAddress.getByName("10.206.70.181");

		// ��ȡ������
		String hostname = inetAddress.getHostName();

		// ��ȡip��ַ

		String ipaddress = inetAddress.getHostAddress();

		System.out.println(hostname + "---" + ipaddress);
	}
}
