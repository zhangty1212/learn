package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {

	public static void main(String[] args) throws UnknownHostException {

	   InetAddress inetAddress = InetAddress.getByName("zhangty");
	 	
		// 或者
		// InetAddress inetAddress = InetAddress.getByName("10.206.70.181");

		// 获取主机名
		String hostname = inetAddress.getHostName();

		// 获取ip地址

		String ipaddress = inetAddress.getHostAddress();

		System.out.println(hostname + "---" + ipaddress);
	}
}
