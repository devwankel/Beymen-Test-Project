Feature: Beymen Test project

  Scenario:
    Given Nagivgate to beymen.com
    Then The word "sort" is entered into the search box.
    Then The value entered in the search box is deleted.
    And The word "gomlek" is entered into the search box.
    Then Press the enter key on the keyboard
    And One of the products listed according to the result is randomly selected
    Then Product information and amount information of the selected product are written in a txt file.
    Then The selected product is added to the cart
    And Compares the price on the product page with the price of the product in the cart.
    Then It is verified that the number of products is two by increasing the number.
    And The product is deleted from the cart and it is verified that the cart is empty.

