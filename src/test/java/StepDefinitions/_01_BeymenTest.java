package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _01_BeymenTest {
    @Given("Navigate to beymen.com")
    public void nagivgateToBeymenCom() {

        GWD.getDriver().get("https://www.beymen.com/");
        GWD.getDriver().manage().window().maximize();

    }

    @Then("The word {string} is entered into the search box.")
    public void theWordIsEnteredIntoTheSearchBox(String arg0) {

        

    }

    @Then("The value entered in the search box is deleted.")
    public void theValueEnteredInTheSearchBoxIsDeleted() {



    }

    @Then("Press the enter key on the keyboard")
    public void pressTheEnterKeyOnTheKeyboard() {



    }

    @And("One of the products listed according to the result is randomly selected")
    public void oneOfTheProductsListedAccordingToTheResultIsRandomlySelected() {



    }

    @Then("Product information and amount information of the selected product are written in a txt file.")
    public void productInformationAndAmountInformationOfTheSelectedProductAreWrittenInATxtFile() {



    }

    @Then("The selected product is added to the cart")
    public void theSelectedProductIsAddedToTheCart() {



    }

    @And("Compares the price on the product page with the price of the product in the cart.")
    public void comparesThePriceOnTheProductPageWithThePriceOfTheProductInTheCart() {



    }

    @Then("It is verified that the number of products is two by increasing the number.")
    public void ıtIsVerifiedThatTheNumberOfProductsIsByIncreasingTheNumber(int arg0) {



    }

    @And("The product is deleted from the cart and it is verified that the cart is empty.")
    public void theProductIsDeletedFromTheCartAndItIsVerifiedThatTheCartIsEmpty() {



    }
}
