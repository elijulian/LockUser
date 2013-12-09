import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class lockMain {

	public static void main(String[] args) {
		File log = new File("C:\\Users\\" + System.getProperty("user.name") + "\\lockUser\\log.log");
		String testRead = null;
		try {
			RandomAccessFile raf = new RandomAccessFile(log, "r");
			testRead=raf.readLine();
			raf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (testRead.isEmpty()) {
			JsonTimeKeeper jsonTimeKeeper = new JsonTimeKeeper();
		}
	}

}
