package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(className = "default-input o-header__search--input")
    private WebElement searchInput;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cookies;


    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "searchInput" : myElement =searchInput; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "cookies" : myElement =cookies; break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            //case "dashboard" : myElement =dashboard; break;
            //case "successMessage" : myElement =successMessage; break;
            //case "alreadyExist" : myElement =alreadyExist; break;
        }

        verifyContainsText(myElement,text);
    }

    public void findAndClear(String strElement) {
        switch (strElement)
        {
            case "searchInput" : myElement = searchInput; break;
        }

        clear(myElement);
    }













}
