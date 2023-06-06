import java.net.*;
class IPAddress
{
	public static void main(String args[])
	{
	try
	{
	InetAddress ipAddr=InetAddress.getLocalHost();
	System.out.println("Ip address of the Machine:"+ipAddr.getHostAddress());
	}
	catch(UnknownHostException ex)
	{
	ex.printStackTrace();
	}
	}
}