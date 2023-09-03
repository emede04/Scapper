package Models;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author md
 */
public class HTMLtoEXCEL {

    String path;
    String title;
    RegistroEOR Registro;
    ArrayList<WebElement> listaEmpresas_EOR;
    String Elementos[] = new String[6];

    // WebDriver driver = new ChromeDriver();
    public HTMLtoEXCEL(String parth) {
        File F = new File(path);
        this.path = parth;
        lanzarWeb();

    }

    public void lanzarWeb() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mapa.gob.es/app/ropo/");

        title = driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement lascookcks = driver.findElement(By.id("dismissbutton"));
        lascookcks.click();
        Select se = new Select(driver.findElement(By.xpath("//*[@id='ID0EBADAA']")));
        se.selectByIndex(1);

        WebElement submitButton = driver.findElement(By.id("bt_matr1"));

        submitButton.click();

        WebElement htmltable = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[2]/div/div[8]/div/table[2]"));
        List<WebElement> rows = htmltable.findElements(By.tagName("tr"));

        for (int rnum = 0; rnum < rows.size(); rnum++) {
            System.out.println("numero de registros" + rows.size());
            List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
            Iterator<WebElement> it = columns.iterator();
            while (it.hasNext()) {
                String texto = it.next().getAttribute("innerText");

            }

        }

    }

    private void createWorkbook() throws Exception {

    }

    public int sacarNumeroLink(WebDriver driver) {

        return 1;
    }

}
