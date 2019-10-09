import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
//import

public class Grab {

    private WebDriver driver;

    static float x;

    @BeforeClass
    public static void setupClass() {

        WebDriverManager.chromedriver().setup();

    }

    @Before
    public void setupTest() {

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless", "--disable-gpu");
        driver = new ChromeDriver(options);

    }

    @After
    public void teardown() {

        if(driver != null) {
            driver.quit();
        }

    }

    @Test
    public void test() throws Exception{

        String url = "https://wiki.wdf.sap.corp/wiki/display/3DVE/Cloud+Applications";
        driver.get(url);
        String resultUrl = driver.getCurrentUrl();

        System.out.println(resultUrl);
//        if(resultUrl = )

//        List<WebElement> links = driver.findElements(By.xpath("//p//a"));
//        ArrayList<String> name = new ArrayList<String>();
//        ArrayList<String> href = new ArrayList<String>();

//        for(int i = 0; i < links.size(); i++) {
//            name.add(links.get(i).getText());
//            href.add(links.get(i).getAttribute("href"));
//
//        }

//        for(int i = 0; i < links.size(); i++) {
//            String fileName = name.get(i) + ".txt";
//            String page = href.get(i);
//            driver.navigate().to(page);
//
//            WebElement body = driver.findElement(By.tagName("body"));
//
//            try{
//
//                File file = new File(fileName);
//                if(!file.exists()) {
//                    file.createNewFile();
//                }
//
//                FileWriter fw = new FileWriter(file,true);
//                BufferedWriter bw = new BufferedWriter(fw);
//                PrintWriter pw = new PrintWriter(bw);
//                //This will add a new line to the file content
//                pw.println("");
//                pw.println(body.getText());
//                pw.close();
//
//                System.out.println("Data successfully dumped");
//
//            }catch(IOException ioe){
//
//                System.out.println("Exception occurred:");
//                ioe.printStackTrace();
//
//            }
//
////          driver.navigate().back();
//
//        }

    }


}
