package network;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class Download {

	public static void main(String[] args) throws Exception {
	 	URL urlobj = URL.of( new URI("http://www.srikanthtechnologies.com/banner.jpg"), null);
		InputStream is = urlobj.openStream();
		FileOutputStream fo = new FileOutputStream("d:\\classroom\\st.jpg");
		int ch = is.read();
		while (ch != -1) {
			fo.write(ch);
			ch = is.read();
		}
		fo.close();
		is.close();
		System.out.println("Download completed!");
	}

}
