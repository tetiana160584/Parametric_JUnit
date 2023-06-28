import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.LigaZakonPage;
import testData.Language;
import testData.LigaTestData;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class LigaZakonPageTest extends LigaTestData {

@Parameterized.Parameters   //метод передаёт коллекцию языков//
public static Collection options(){
    return Arrays.asList(Language.values());
}

    public LigaZakonPageTest(Language lang) {
    ligaBundle= ResourceBundle.getBundle(lang.getLang());
        if (!driver.getCurrentUrl().contains("https://"+"ligazakon.net/"+ligaBundle.getString("language"))){
            driver.get("https://"+"ligazakon.net/"+ligaBundle.getString("language"));
            liga= PageFactory.initElements(driver, LigaZakonPage.class);

        }


    }

    @Test
    public void testSolutionTab(){
        Assert.assertEquals(ligaBundle.getString("solution"), liga.solutionTab());
    }
    @Test
    public void testMarketTab(){
        Assert.assertEquals(ligaBundle.getString("market"),liga.marketTab());
    }
    @Test
    public void testAnalyticsTab(){
        Assert.assertEquals(ligaBundle.getString("analytics"), liga.analyticsTab());
    }
}

