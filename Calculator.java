package seleniumDeo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.calculator.net/");
	//Multiplication Operation
	
	WebElement Num1= d.findElement(By.xpath("//span[text()='4']"));
	WebElement Num2=d.findElement(By.xpath("//span[text()='2']"));
	WebElement Num3=d.findElement(By.xpath("//span[text()='3']"));
	WebElement Num4=d.findElement(By.xpath("//span[text()='×']"));
	WebElement Num5=d.findElement(By.xpath("//span[text()='5']"));
	WebElement Num6=d.findElement(By.xpath("//span[text()='2']"));
	WebElement Num7=d.findElement(By.xpath("//span[text()='5']"));
	WebElement Num8=d.findElement(By.xpath("//span[text()='=']"));
	Num1.click();
	Num2.click();
	Num3.click();
	Num4.click();
	Num5.click();
    Num6.click();
    Num7.click();
    Num8.click();
    Thread.sleep(2000); 
   // Division Operation
    
    WebElement Num9=d.findElement(By.xpath("//span[text()='4']"));
    WebElement Num10=d.findElement(By.xpath("//span[text()='0']"));
    WebElement Num11=d.findElement(By.xpath("//span[text()='0']"));
    WebElement Num12=d.findElement(By.xpath("//span[text()='/']"));
    WebElement Num13=d.findElement(By.xpath("//span[text()='2']"));
    WebElement Num14=d.findElement(By.xpath("//span[text()='0']"));
    WebElement Num15=d.findElement(By.xpath("//span[text()='0']"));
    WebElement Num51=d.findElement(By.xpath("//span[text()='AC']"));
    Num9.click();
    Num10.click();
    Num11.click();
    Num12.click();
    Num13.click();
    Num14.click();
    Num15.click();
    Thread.sleep(2000);
    Num51.click();
   
    
    //Addition Operation
    WebElement Num16=d.findElement(By.xpath("//span[text()='–']"));
    WebElement Num17=d.findElement(By.xpath("//span[text()='2']"));
    WebElement Num18=d.findElement(By.xpath("//span[text()='3']"));
    WebElement Num19=d.findElement(By.xpath("//span[text()='4']"));
    WebElement Num20=d.findElement(By.xpath("//span[text()='2']"));
    WebElement Num21=d.findElement(By.xpath("//span[text()='3']"));
    WebElement Num22=d.findElement(By.xpath("//span[text()='4']"));
    WebElement Num23=d.findElement(By.xpath("//span[text()='+']"));
    WebElement Num24=d.findElement(By.xpath("//span[text()='3']"));
    WebElement Num25=d.findElement(By.xpath("//span[text()='4']"));
    WebElement Num26=d.findElement(By.xpath("//span[text()='5']"));
    WebElement Num27=d.findElement(By.xpath("//span[text()='3']"));
    WebElement Num28=d.findElement(By.xpath("//span[text()='4']"));
    WebElement Num29=d.findElement(By.xpath("//span[text()='5']"));
    WebElement Num92=d.findElement(By.xpath("//span[text()='AC']"));
    Num16.click();
    Num17.click();
    Num18.click();
    Num19.click();
    Num20.click();
    Num21.click();
    Num22.click();
    Num23.click();
    Num24.click();
    Num25.click();
    Num26.click();
    Num27.click();
    Num28.click();
    Num29.click();
    Thread.sleep(2000);
    Num92.click();
    //Subtraction operation
    WebElement Num30=d.findElement(By.xpath("//span[text()='2']"));
    WebElement Num31=d.findElement(By.xpath("//span[text()='3']"));
    WebElement Num32=d.findElement(By.xpath("//span[text()='4']"));
    WebElement Num33=d.findElement(By.xpath("//span[text()='8']"));
    WebElement Num34=d.findElement(By.xpath("//span[text()='2']"));
    WebElement Num35=d.findElement(By.xpath("//span[text()='3']"));
    WebElement Num36=d.findElement(By.xpath("//span[text()='–']"));
    WebElement Num37=d.findElement(By.xpath("//span[text()='(']"));
    WebElement Num38=d.findElement(By.xpath("//span[text()='–']"));
    WebElement Num39=d.findElement(By.xpath("//span[text()='2']"));
    WebElement Num40=d.findElement(By.xpath("//span[text()='3']"));
    WebElement Num41=d.findElement(By.xpath("//span[text()='0']"));
    WebElement Num42=d.findElement(By.xpath("//span[text()='9']"));
    WebElement Num43=d.findElement(By.xpath("//span[text()='4']"));
    WebElement Num44=d.findElement(By.xpath("//span[text()='8']"));
    WebElement Num45=d.findElement(By.xpath("//span[text()='2']"));
    WebElement Num46=d.findElement(By.xpath("//span[text()='3']"));
    Num30.click();
    Num31.click();
    Num32.click();
    Num33.click();
    Num34.click();
    Num35.click();
    Num36.click();
    Num37.click();
    Num38.click();
    Num39.click();
    Num40.click();
    Num41.click();
    Num42.click();
    Num43.click();
    Num44.click();
    Num45.click();
    Num46.click();
    Thread.sleep(5000);
    d.close();
    
    
    
    
    
    
    
    
    
    
	}

}
