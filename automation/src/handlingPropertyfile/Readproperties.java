package handlingPropertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Readproperties {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("./data/config.properties");
						Properties pro = new Properties();
	}

}
