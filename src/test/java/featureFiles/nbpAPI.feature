Feature: Downloading infromation using the htttp GET method


  @Test2
  Scenario: Download information about the USD exchange rate.
    Given User sets content search parameters in URL path to "USD"
    When Sending a query to the server using parameters
    Then Receiving respone from the server


  @Test3
  Scenario: Download information about the exchange rate from table A.
    Given The user downloads information about all exchange rates using "/A"
    When Sending a query to the server using parameters
    Then Receiving respone from the server

#  @Test4
#  Scenario: Download information about the exchange rate by currency name
#    Given Download using the "dolar amerykański" parameter
#    When Sending a query to the server using parameters
#    Then Receiving respone from the server
