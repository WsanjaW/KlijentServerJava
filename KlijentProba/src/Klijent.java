import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;


public class Klijent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost",8090);
			System.out.println("konektovan");
			BufferedReader ut = new BufferedReader(new InputStreamReader(s.getInputStream()));
			DataOutputStream izt = new DataOutputStream(s.getOutputStream());
			System.out.println("sss");
			izt.writeBytes("Sanja"+"/n");
			//System.out.println(ut.readLine());
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
