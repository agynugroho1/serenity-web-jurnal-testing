Feature: add products

  Scenario Outline: Success create new products with new category
    Given I already logged in
    When I click "Products" menu
    Then Products page appear
    When I click button action
    And I click new products
    Then New products page appear
    When I fill product name with "<pname>"
    And I fill product sku with "<psku>"
    And I fill product category to "<pcategory>"
    And I fill type of unit product to pcs
    And I fill description with "<pdesc>"
    And I fill "Buy" Unit Price with <pricebuy>
    And I fill Default "Buy" Tax with PPN
    And I fill "Sale" Unit Price with <pricesell>
    And I fill Default "Sell" Tax with PPN
    And I verify checkbox on I "Track Stock for" This Item is Active (disable and enable)
    And I fill Stock Minimum with <minstock>
    And I click button create new product
    Then Product Detail page appear
    Examples:
      | pname                  | psku   | pcategory     | pdesc                   | pricebuy | pricesell | minstock |
      | Sepatu Pantofel Brando | SPB001 | Sepatu Klasik | Sepatu Formal dan Kerja | 100000   | 150000    | 15       |
      | Kemeja Jaga Lisan      | KJL005 | Kemeja Kerja  | Kemeja Stylish dan Cool | 85000    | 110000    | 10       |