/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbdeleter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import javax.swing.*;
/**
/**
 *
 * @author User
 */
public class FBDeleter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\JAVA API\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        displayUI();
        loginFB(driver);
        redirectWall(driver);
        deleteStatus(driver);
    }
    
    private static void displayUI()
    {
        System.out.println("+------------------------------------------+\n"
                        +  "|       WELCOME TO FB STATUS DELETER       |\n"
                        +  "+------------------------------------------+\n"
                        +  "|         CREATED BY #HambaAllah           |\n"
                        +  "+------------------------------------------+\n"
                        +  "|    SETIAP ORANG PASTI ADA MEMORI PAHIT   |\n"
                        +  "|  & KALAU BOLEH TAK SEKALI MAHU DIINGAT.  |\n"
                        +  "|  MAKA, JANGANLAH KALIAN MEMPERSENDA AKAN |\n"
                        +  "|   KESILAPAN ATAU KISAHNYA ITU, IA PASTI  |\n"
                        +  "|   MENGAMBIL MASA YANG LAMA UNTUK SEMBUH  |\n"
                        +  "+------------------------------------------+");
        JOptionPane.showMessageDialog(null, 
                           "+------------------------------------------+\n"
                        +  "|       WELCOME TO FB STATUS DELETER       |\n"
                        +  "+------------------------------------------+\n"
                        +  "|         CREATED BY #HambaAllah           |\n"
                        +  "+------------------------------------------+\n"
                        +  "|    SETIAP ORANG PASTI ADA MEMORI PAHIT   |\n"
                        +  "|  & KALAU BOLEH TAK SEKALI MAHU DIINGAT.  |\n"
                        +  "|  MAKA, JANGANLAH KALIAN MEMPERSENDA AKAN |\n"
                        +  "|   KESILAPAN ATAU KISAHNYA ITU, IA PASTI  |\n"
                        +  "|   MENGAMBIL MASA YANG LAMA UNTUK SEMBUH  |\n"
                        +  "+------------------------------------------+");
    }
    
    private static void deleteStatus(WebDriver driver)
    {
        System.out.println("HOW MANY STATUS DO YOU WANT TO DELETE?");
        int howMany = Integer.parseInt(JOptionPane.showInputDialog("HOW MANY STATUS DO YOU WANT TO DELETE?"));
        int speed = Integer.parseInt(JOptionPane.showInputDialog("HOW MANY SECONDS(s) DO YOU WANT TO SET? FOR EACH LOOPING"));
        System.out.println("RETRIEVED INPUT ( STATUS : " + howMany + ", SPEED : " + speed + ").\n");
        System.out.println("PLEASE WAIT...");
        JOptionPane.showMessageDialog(null, "PLEASE WAIT..");
        sleepSec(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        sleepSec(5);
        for(int i = 0; i < howMany; i++) {
            try {
                System.out.println("TEST DIV (" + (i+1) + ").");
                /*//*[@id="mount_0_0"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[4]/div[2]/div/div[2]/div[3]/div[" + (i+1) + "]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div*/
                try {
                    driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[4]/div[2]/div/div[2]/div[3]/div[" + (i+1) + "]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/div")).click();
                } catch (Exception ex) {
                    try {
                        driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[4]/div[2]/div/div[2]/div[3]/div[" + (i+1) + "]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div")).click();
                    } catch(Exception et){
                        
                    }
                }
                sleepSec(speed);
                //System.out.println("DIV TEXT :" + driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/span")).getText());
                if(driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/span")) != null)
                if(driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/span")).getText().equals("Padam siaran")){
                        driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/span")).click();
                        sleepSec(speed/2);
                                                    /*//*[@id="mount_0_0"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/div[4]/div/div[1]/div[1]/div[1]/div/span/span*/
                        driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/div[4]/div/div[1]/div[1]/div[1]/div/span/span")).click();
                        sleepSec(speed/3);
                }
                
                
                
                if(driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[4]/div[2]/div/div[1]/span")) != null)
                if(driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[4]/div[2]/div/div[1]/span")).getText().equals("Keluarkan tag"))
                        driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[4]/div[2]/div/div[1]/span")).click();
                
                
                
                if(driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/span")) !=null)
                if(driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/span")).getText().equals("Sembunyikan daripada profil"))
                        driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/span")).click();
                
                
                if(driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[8]/div[2]/div/div[1]/span")) != null)
                if(driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[8]/div[2]/div/div[1]/span")).getText().equals("Alih ke sampah")) {
                        driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[8]/div[2]/div/div[1]/span")).click(); 
                        sleepSec(speed/2);
                                                   /*//*[@id="mount_0_0"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/div[4]/div/div[1]/div[1]/div[1]/div/span/span*/
                        driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/div[4]/div/div[1]/div[1]/div[1]/div/span/span")).click();
                        sleepSec(speed/3);
                }
                
                
                
                if(driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[9]/div[2]/div/div[1]/span")) !=null)
                if(driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[9]/div[2]/div/div[1]/span")).getText().equals("Alih ke sampah")) {
                        driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[9]/div[2]/div/div[1]/span")).click();
                        sleepSec(speed/2);
                        driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/div[4]/div/div[1]/div[1]/div[1]/div/span/span")).click();
                        sleepSec(speed/3);
                }
                                                     /*//*[@id="mount_0_0"]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div/div[9]/div[2]/div/div[1]/span*/
                sleepSec(speed);
            } catch (Exception ex)
            {
               System.out.println("FAILED DIV(" + (i+1)+ ").");
            }
        }
    }
    
    private static void redirectWall(WebDriver driver)
    {
        sleepSec(3);
        try {
            System.out.println("PLEASE DISABLED NOTIFICATION FROM FACEBOOK FIRST!");
            JOptionPane.showInputDialog("PLEASE DISABLED NOTIFICATION FROM FACEBOOK FIRST!");
            driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[2]/div[4]/div[1]/div[4]/a")).click();
            sleepSec(3);
            System.out.println("SUCCESS REDIRECT WEBDRIVER TO WALL");     
            System.out.println("RETRIEVED USER WALL URL : " + driver.getCurrentUrl());
        } catch (Exception et)
        {
            System.out.println("FAILED TO GO WALL."); 
            System.exit(0);
        }
    }
    
    private static void loginFB(WebDriver driver)
    {
        //operation @ behaviour
        System.out.println("PLEASE ENTER YOUR FB INFORMATION");
        JTextField username = new JTextField(30);
        JTextField password = new JTextField(20);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Email :\n"));
        myPanel.add(username);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Password :\n"));
        myPanel.add(password);

        int result =JOptionPane.showConfirmDialog(null, myPanel, 
                 "PLEASE ENTER YOUR FB INFORMATION", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.CANCEL_OPTION) {
            System.exit(0);
        }
        
        System.out.print("\nRETRIEVED YOUR FB INFO (EMAIL AND PASSWORD)\ne-mail : " + username.getText() + "\nPassword : ");
        for(int i = 0; i < password.getText().length(); i++)
        
            if(!(i<password.getText().length()/4) && (i<(password.getText().length()-1))) {
                System.out.print("*");
            } else {
                System.out.print(password.getText().charAt(i));
        }
        System.out.println("\nPLEASE WAIT...");
        sleepSec(3);
        driver.get("https://www.facebook.com/login");
        sleepSec(3);
        driver.findElement(By.name("email")).sendKeys(username.getText());
        driver.findElement(By.name("pass")).sendKeys(password.getText());
        driver.findElement(By.name("login")).click();
        sleepSec(5);
        System.out.println(driver.getCurrentUrl());
        if(driver.getCurrentUrl().equals("https://www.facebook.com/") || driver.getCurrentUrl().equals("https://www.facebook.com"))
        {
            System.out.println("SUCCESS LOGIN!");
            JOptionPane.showMessageDialog(null, "SUCCES LOGIN PROCESS");
        } else {
            System.out.println("UNABLE TO LOGIN! PLEASE TRY AGAIN");
            JOptionPane.showMessageDialog(null, "FAILED TO LOGIN");
            System.exit(0);
        }
    }
    
    private static void sleepSec(int time)
    {
        time *= 1000;
        try{
            Thread.sleep(time);
        } catch(Exception ex)
        {
            
        }
    }
}
