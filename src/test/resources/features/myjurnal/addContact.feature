Feature: add contact in my jurnal

  Scenario Outline: Success create contact
    Given I already logged in
    When I click "contacts" menu
    Then Contact page appear
    When I click new contact
    Then create new contact page appear
    When I fill name with "<dname>"
    And I choose contact type as customer
    And I input title name with "<title>"
    And I input first name with "<fname>"
    And I input midle name with "<mname>"
    And I input last name with "<lname>"
    And I input number handphone with "<phone>"
    And I input identity type with "<itype>"
    And I input identity number with <inumber>
    And I input email with "<email>"
    And I input another info with "<aninfo>"
    And I input company name "<cname>"
    And I input number telephone with "<telp>"
    And I input fax with "<fax>"
    And I input npwp with "<npwp>"
    And I input billing address with "<bildres>"
    And I input shipping adres with "<shipdres>"
    And I input bank name with "<bname>"
    And I input bank branch with "<bbranch>"
    And I input bank holder name with "<bhlname>"
    And I input account number with <anumber>
    And I click add button
    Then Contact with name "<dname>" is created
    Examples:
      | dname                | title | fname   | mname | lname   | phone    | itype | inumber  | email               | aninfo | cname              | telp | fax | npwp             | bildres      | shipdres | bname        | bbranch | bhlname | anumber |
      | Agy Nugroho          | Mr.   | Agy     |       | Nugroho | 08120812 | KTP   | 36710606 | agyn575@gmail.com   |        | Kita Sehat Bersama | 021  |     | 99.999.9-999.999 | jl. sektor 7 |          | Mandiri      | Ciledug | BCA     | 604150  |
      | Rinalia Nurul Aisyah | Ms.   | Rinalia | Nurul | Aisyah  | 08130813 | SIM   | 36710680 | keprek757@gmail.com | Spirit | Maju Terus         | 021  |     | 99.999.9-999.999 | komp. bpkp   |          | BCA Personal | Bintaro | BCA     | 9772150 |