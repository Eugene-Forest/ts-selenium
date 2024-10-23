

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium {

    WebDriver driver;

    @BeforeEach
    public void setup() {
        //指定驱动路径
        System.setProperty("webdriver.chrome.driver","E://Driver/chromedriver-win64/chromedriver.exe");
        // 谷歌驱动
        ChromeOptions options = new ChromeOptions();
        // 允许所有请求
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
    }

    @Test
    public void eightComponents() {

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        // 启动需要打开的网页
        driver.get("https://cn.bing.com/");
        String title = driver.getTitle();
        assertEquals("必应", title);

//        sb_form_q

    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }

}
