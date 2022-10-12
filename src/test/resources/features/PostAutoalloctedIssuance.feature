Feature: Issuance creation


  Scenario  : Creating different scenarios of Issuance


  @Autoallocated
  Scenario:Testing the full data feed
    Given "SUPER_ADMIN" user send a request to endpoint with "/event-login-auth" status code as "200"
    Given the following details
      | DatasourceId          | IPR           |
      | MaturityDate          | 1636675200000 |
      | CurrencyCode          | USD           |
      | IssuerCountry         | USA           |
      | TrancheCurrency       | USD           |
      | IssuerRating          | A+//          |
      | Ipts                  | SM+11         |
      | DealStatus            | Announced     |
      | BookStatus            | Book open     |
      | BondSeniority         | B.Secured     |
      | TotalIssuedAmount     | 500000000     |
      | TrancheSettlementDate | 1653649569000 |
      | FirstCallDate         | 1809169569000 |
      | IsPerpetual           | false          |
    When I creating an issuance



  @Perpetual
  Scenario:Creating a new Perpetual issuance data
    Given "SUPER_ADMIN" user send a request to endpoint with "/event-login-auth" status code as "200"
    Given the following details for perpetual issuance
      | DatasourceId          | IPR           |
      | CurrencyCode          | USD           |
      | IssuerCountry         | USA           |
      | TrancheCurrency       | USD           |
      | IssuerRating          | A+//          |
      | Ipts                  | SM+11         |
      | DealStatus            | Announced     |
      | BookStatus            | Book open     |
      | BondSeniority         | B.Secured     |
      | TotalIssuedAmount     | 400000000     |
      | TrancheSettlementDate | 1653649569000 |
      | FirstCallDate         | 1809169569000 |
      | IsPerpetual           | true          |
    When I creating an issuance

  @DealSizeTest
  Scenario:Testing the full data feed
    Given "SUPER_ADMIN" user send a request to endpoint with "/event-login-auth" status code as "200"
    Given the following dealsize details
      | DatasourceId          | BBG            |
      | MaturityDate          | 1636675200000 |
      | CurrencyCode          | EUR           |
      | IssuerCountry         | USA           |
      | TrancheCurrency       | USD           |
      | IssuerRating          | A+//          |
      | Ipts                  | SM+11         |
      | DealStatus            | Announced     |
      | BookStatus            | Book open     |
      | BondSeniority         | B.Secured     |
      | TrancheSettlementDate | 1653649569000 |
      | FirstCallDate         | 1809169569000 |
      | IsPerpetual           | false         |
    When I creating an issuance


