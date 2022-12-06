import org.jboss.netty.channel.socket.ClientSocketChannelFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class WebTablesPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    By editRow = By.className("mr-2");
    By deleteRow = By.xpath("//*[@title='Delete']");
    By username = By.id("username");
    By result = By.xpath("//*[@class='mb-1']");

    public WebTablesPage(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }

    public void clickEdit(int index){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(editRow)).get(index).click();
    }

    public void clickDelete(int index){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(deleteRow)).get(index).click();
    }

    public void typeUsername(String user){
        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(user);
    }

    public String returnResult(int index){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(result)).get(index).getText();
    }

    public WebElement el(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /*public List<WebElement> element(By locator){
        return  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void click(By locator, int index){
        el(locator).click();
        element(locator).get(index).click();
    }*/

    public void clickMainMenu(String menu){
        String[] menuItems = {"Elements", "Alerts", "Interactions"};
        int index = Arrays.asList(menuItems).indexOf(menu);

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className(""))).get(index).click();
    }

}
