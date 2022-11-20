package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.apache.poi.ss.usermodel.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class _01_BeymenTest {

    DialogContent dc = new DialogContent();

    @Given("Nagivgate to beymen.com")
    public void nagivgateToBeymenCom() {

        GWD.getDriver().get("https://www.beymen.com/");
        GWD.getDriver().manage().window().maximize();

    }

    @Then("The word sort is entered into the search box.")
    public void theWordIsEnteredIntoTheSearchBox() throws IOException {

        dc.findAndClick("cookies");

        String file = "src/test/java/ApachePOI/resource/BeymenTestDatas.xlsx";
        FileInputStream fileInputStream = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet = workbook.getSheetAt(0);

        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);

        dc.findAndSend("searchInput", cell.toString());


    }

    @Then("The value entered in the search box is deleted.")
    public void theValueEnteredInTheSearchBoxIsDeleted() {

        dc.findAndClear("searchInput");
        dc.findAndClick("searchInput");

    }

    @Then("The word gomlek is entered into the search box.")
    public void theWordGomlekIsEnteredIntoTheSearchBox() throws IOException {

        String file = "src/test/java/ApachePOI/resource/BeymenTestDatas.xlsx";
        FileInputStream fileInputStream = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet = workbook.getSheetAt(0);

        Row row = sheet.getRow(1);
        Cell cell = row.getCell(0);

        dc.findAndSend("searchInput", cell.toString());

    }

    @Then("Press the enter key on the keyboard")
    public void pressTheEnterKeyOnTheKeyboard() throws AWTException {

        Robot rbt =new Robot();

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

    }

    @And("One of the products listed according to the result is randomly selected")
    public void oneOfTheProductsListedAccordingToTheResultIsRandomlySelected() {

        dc.findAndClick("product");

    }

    String productPrice;

    @Then("Product information and amount information of the selected product are written in a txt file.")
    public void productInformationAndAmountInformationOfTheSelectedProductAreWrittenInATxtFile() {

        String productName = dc.findAndGetText("productName");
        productPrice =dc.findAndGetText("productPrice");

        System.out.println("productName = " + productName);
        System.out.println("productPrice = " + productPrice);

        try {
            FileWriter myWriter = new FileWriter("src/test/java/TextFile/ProductInfo.txt");
            myWriter.write(productName);
            myWriter.write("\n"+ productPrice);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    @Then("The selected product is added to the cart")
    public void theSelectedProductIsAddedToTheCart() {

        dc.findAndClick("bodySize");
        dc.findAndClick("addCart");

    }

    @And("Compares the price on the product page with the price of the product in the cart.")
    public void comparesThePriceOnTheProductPageWithThePriceOfTheProductInTheCart() {

        dc.findAndClick("cartButton");

        String cartPrice =dc.findAndGetText("cartPrice");

        if (productPrice.equals(cartPrice)) {
            System.out.println("Sepet fiyatı ile ürün fiyatı aynı");
        } else {
            System.out.println("Sepet fiyatı ile ürüs fiyatı eşit değil");
        }

    }

    @Then("It is verified that the number of products is two by increasing the number.")
    public void ıtIsVerifiedThatTheNumberOfProductsIsByIncreasingTheNumber() {

        GWD.getDriver().navigate().back();
        dc.findAndClick("bodySize");
        dc.findAndClick("addCart");
        dc.findAndClick("cartButton");

        dc.findAndContainsText("productPiece","2 adet");

    }

    @And("The product is deleted from the cart and it is verified that the cart is empty.")
    public void theProductIsDeletedFromTheCartAndItIsVerifiedThatTheCartIsEmpty() {

        dc.findAndClick("deleteButton");

        dc.findAndContainsText("emptyBasket","Sepetinizde");

    }
}
