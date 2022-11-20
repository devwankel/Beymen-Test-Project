package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@class='default-input o-header__search--input']")
    private WebElement searchInput;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cookies;

    @FindBy(xpath = "//div[@data-productid='1008632']")
    private WebElement product;

    @FindBy(xpath = "(//span[text()='Slim Fit Haki Oxford Gömlek'])[2]")
    private WebElement productName;

    @FindBy(id = "priceNew")
    private WebElement productPrice;

    @FindBy(xpath = "//span[@class='m-variation__item'][text()='S']")
    private WebElement bodySize;

    @FindBy(id = "addBasket")
    private WebElement addCart;

    @FindBy(className = "m-productPrice__salePrice")
    private WebElement cartPrice;

    @FindBy(xpath = "//a[@title='Sepetim']")
    private WebElement cartButton;

    @FindBy(xpath = "//option[@value='2']")
    private WebElement productPiece;

    @FindBy(id = "removeCartItemBtn0-key-0")
    private WebElement deleteButton;

    @FindBy(xpath = "//strong[text()='Sepetinizde Ürün Bulunmamaktadır']")
    private WebElement emptyBasket;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "searchInput": myElement = searchInput; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "cookies": myElement = cookies; break;
            case "product": myElement = product; break;
            case "bodySize": myElement = bodySize; break;
            case "addCart": myElement = addCart; break;
            case "cartButton": myElement = cartButton; break;
            case "deleteButton": myElement = deleteButton; break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "productName" : myElement =productName; break;
            case "productPrice" : myElement =productPrice; break;
            case "emptyBasket" : myElement =emptyBasket; break;
            case "productPiece" : myElement =productPiece; break;
        }

        verifyContainsText(myElement, text);
    }

    public String  findAndGetText(String strElement) {
        switch (strElement) {
            case "productName" : myElement =productName; break;
            case "productPrice" : myElement =productPrice; break;
            case "cartPrice" : myElement =cartPrice; break;
        }

        return verifyContainsText(myElement);
    }

    public void findAndClear(String strElement) {
        switch (strElement) {
            case "searchInput": myElement = searchInput; break;
        }

        clear(myElement);
    }


}
