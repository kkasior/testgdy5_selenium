package PageObjects;
import org.openqa.selenium.WebDriver;

public class DevToMainPage {
    String url = "https://dev.to";
    WebDriver driverInDevToMainPage;

    public DevToMainPage(WebDriver driverFromPageObjectTests) {
        this.driverInDevToMainPage = driverFromPageObjectTests;
        //przypisanie zależności przeglądarki z klasy PageObjectTests do przelgądarki używanej w kalsie DevToMainPage
        driverInDevToMainPage.get(url); //otwiermy stronę w przeglądarce
    }
}
