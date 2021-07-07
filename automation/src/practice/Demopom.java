


	package practice;
	import java.io.IOException;
	public class Demopom extends BaseTest1 {

		public static void main(String[] args) throws IOException, InterruptedException {
			BaseTest1 bt = new BaseTest1();
			Flib2 fb = new Flib2();
		    bt.OpenBrowser();
		    Pomdemo login = new Pomdemo(driver);
		    Thread.sleep(3000);
	        login.validLogin(fb.readPropertyFile("./Data/config.properties","username"),fb.readPropertyFile("./Data/config.properties","pwd"));
		}

	}








