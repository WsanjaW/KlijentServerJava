import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Proba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("DD");
		try {
			ServerSocket ss=new ServerSocket(8090);
			while (true) {
				Socket szk = ss.accept();
				BufferedReader ut = new BufferedReader(new InputStreamReader(szk.getInputStream()));
				DataOutputStream izt = new DataOutputStream(szk.getOutputStream());
				System.out.println("Klijent: "+ ut.readLine());
				izt.writeBytes("HHJKKL");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
