import org.junit.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Test1 extends Web_Driver {


    @Test
    public void test() {

        new PageObject().pg2();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        new PageObject().pg3();
        new PageObject().pg4();
        new PageObject().pg1();


    }
}
