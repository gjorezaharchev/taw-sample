import com.tawtest.TextBoxData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass extends BaseTest{


    @Test(groups = {"smoke", "regression"})
    public void test1(){
        webTablesPage.clickEdit(0);
        webTablesPage.typeUsername(TextBoxData.fname);
    }


    @Test(groups = {"regression"})
    public void test2(){

        String firstname = "gjore";
        Assert.assertEquals(webTablesPage.returnResult(0), firstname);
        webTablesPage.typeUsername(firstname);
       /* SoftAssertions sa = new SoftAssertions();
        sa.assertThat(webTablesPage.returnResult(0)).isEqualTo("Name:slfsldf");*/
        webTablesPage.clickMainMenu("Interactions");




        Assert.assertEquals(webTablesPage.returnResult(1), "Name:slfsldf");
        Assert.assertEquals(webTablesPage.returnResult(2), "Name:slfsldf");
        Assert.assertEquals(webTablesPage.returnResult(3), "Name:slfsldf");
        webTablesPage.el(By.xpath("")).getText();



        //sa.assertAll();
    }

    @DataProvider(name = "test")
    public Object[][] dataProvider(){
        return new Object [][]
                {
                        {1,2,3},
                        {4,5,6}};
    }

}
