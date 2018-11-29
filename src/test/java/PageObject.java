import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject extends Web_Driver {

    public PageObject() {
        if (getDriver().getCurrentUrl().contains("blog.csssr.ru"))
            PageFactory.initElements(getDriver(), getTimeout());
        else Assert.fail("Не та страница");
    }

    @FindBy(xpath = ".//a[text()='ВНИКАТЬ В ДЕТАЛИ ПРОЕКТОВ']")
    private WebElement pg1;
    @FindBy(xpath = ".//a[text()='НАХОДИТЬ НЕСОВЕРШЕНСТВА']")
    private WebElement pg2;
    @FindBy(xpath = ".//a[text()='СОПРОВОЖДАТЬ ПРОЕКТЫ']")
    private WebElement pg3;
    @FindBy(xpath = ".//a[text()='РАБОТАТЬ С ФАЙЛАМИ ПРОЕКТОВ']")
    private WebElement pg4;
    @FindBy(xpath = "//input[@id='attention']")
    private WebElement ch1;
    @FindBy(xpath = "//input[@id='logic']")
    private WebElement ch2;
    @FindBy(xpath = "//input[@id='eye']")
    private WebElement ch3;
    @FindBy(xpath = "//input[@id='beautiful']")
    private WebElement ch4;
    @FindBy(xpath = "//input[@id='tasks']")
    private WebElement ch5;
    @FindBy(xpath = "//input[@id='soft']")
    private WebElement ch6;
    @FindBy(xpath = "//a[text()= 'Софт для быстрого создания скриншотов']]")
    private WebElement ch6_1;
    @FindBy(xpath = "//input[@id='attention2']")
    private WebElement ch7;
    @FindBy(xpath = "//input[@id='responsibility']")
    private WebElement ch8;
    @FindBy(xpath = "//input[@id='parallel']")
    private WebElement ch9;
    @FindBy(xpath = "//input[@id='logic2']")
    private WebElement ch10;
    @FindBy(xpath = "//input[@id='chaos']")
    private WebElement ch11;
    @FindBy(xpath = "//input[@id='beautiful2']")
    private WebElement ch12;
    public void pg1() {
        pg1.click();
    }

    public void pg2() {
        pg2.click();
    }

    public void pg3() {
        pg3.click();
    }

    public void pg4() {
        pg4.click();


    }
    public void  ch1(){
        ch1.click();

    }
    public void  ch2(){
        ch2.click();

    }
    public void  ch3(){
        ch3.click();

    }
    public void  ch4(){
        ch4.click();

    }
    public void  ch5(){
        ch5.click();

    }
    public void  ch6(){
        ch6.click();

    }
    public void  ch6_1(){
        ch6_1.click();

    }
    public void  ch7(){
        ch7.click();

    }
    public void  ch8(){
        ch8.click();

    }
    public void  ch9(){
        ch9.click();

    }
    public void  ch10(){
        ch10.click();

    }
    public void  ch11(){
        ch11.click();

    }
    public void  ch12(){
        ch12.click();

    }

}
