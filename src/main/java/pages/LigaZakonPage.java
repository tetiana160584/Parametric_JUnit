package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LigaZakonPage {
    @FindBy(xpath = "/html/body/section/div/div[1]/div[2]/div[1]/a")
    WebElement solutions;

    @FindBy(xpath = "/html/body/section/div/div[1]/div[2]/div[2]/a")
    WebElement market;

    @FindBy( xpath= "/html/body/section/div/div[1]/div[2]/div[3]/a")
    WebElement analytics;

    public String solutionTab(){
        return solutions.findElement(By.tagName("span")).getText();
    }
    public String marketTab(){
        return market.findElement(By.tagName("span")).getText();
    }
    public String analyticsTab(){
        return analytics.findElement(By.tagName("span")).getText();
    }
}
