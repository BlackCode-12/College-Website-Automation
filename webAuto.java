
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class webAuto {

	static WebDriver webd;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
		float attendence[] = new float[12];
		String titles[] = new String[12];
		webd = new ChromeDriver();
		webd.manage().window().maximize();
		webd.navigate().to("https://uims.cuchd.in/uims/");
		webd.findElement(By.name("txtUserId")).sendKeys(new String[]{"18BCS6150"});
		webd.findElement(By.name("btnNext")).click();
		webd.findElement(By.name("txtLoginPassword")).sendKeys(new String[]{"Crazy@no1"});
		webd.findElement(By.name("btnLogin")).click();
		try {
			Thread.sleep(2000);
			webd.findElement(By.name("bntNavigate")).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webd.findElement(By.xpath("//*[@id=\"divForcePopUp\"]/div/div/div[1]/button")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webd.findElement(By.xpath("//*[@id=\"menu-content\"]/li[3]/a")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println('t');
		int i = 1;
		int j = 0;
		while(i < 13)
		{ 
			String percent = "//*[@id=\"SortTable\"]/tbody/tr[" + i + "]/td[11]";
			String title = "//*[@id=\"SortTable\"]/tbody/tr[" + i + "]/td[2]";
			WebElement button = null;
			WebElement button1 = null;
		    button = webd.findElement(By.xpath(percent));
		    button1 = webd.findElement(By.xpath(title));
		String a = button.getText();
		String a1 = button1.getText();
		float b = Float.parseFloat(a);
		attendence[j] = b;
		titles[j] = a1;
		i++;
		j++;
		}
		for(int k =0; k <12;k++)
		{
			System.out.println(titles[k]);
			System.out.println(attendence[k]);
		}
		webd.get("https://mail.google.com");
		webd.findElement(By.name("identifier")).sendKeys(new String[]{"robinduhan@gmail.com"});
		webd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		webd.findElement(By.name("password")).sendKeys(new String[]{"robinstarboy"});
		webd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		webd.navigate().to("https://mail.google.com/mail/u/0/#inbox?compose=new");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		webd.findElement(By.name("to")).sendKeys(new String[]{"robinduhan@gmail.com"});
		for(int i1 =0;i1 < 12;i1++)
		{
			webd.findElement(By.xpath("//*[@id=\":rx\"]")).sendKeys(new String[]{titles[i1]});
			webd.findElement(By.xpath("//*[@id=\":rx\"]")).sendKeys(new String[]{":"+attendence[i1]});
		}
		webd.findElement(By.xpath("//*[@id=\":qi\"]")).click();
	}
}
