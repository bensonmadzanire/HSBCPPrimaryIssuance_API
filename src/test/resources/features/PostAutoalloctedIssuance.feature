Feature: Issuance creation


  Scenario  : Creating different scenarios of Issuance


  @Autoallocated
  Scenario:Testing the full data feed
    Given "SUPER_ADMIN" user send a request to endpoint with "/event-login-auth" status code as "200"
    Given the following details
      | DatasourceId          | DB            |
      | IssuanceDataKey       | DB:ZXZXTEST44 |
      | IssuerTicker          | ZXZXZXZTEST44 |
      | IssuerName            | ZXZXZXZTEST44 |
      | MaturityDate          | 1636675200000 |
      | CurrencyCode          | USD           |
      | IssuerCountry         | USA           |
      | TrancheCurrency       | USD           |
      | IssuerRating          | A+//          |
      | Ipts                  | SM+11         |
      | DealStatus            | Announced     |
      | BookStatus            | Book open     |
      | BondSeniority         | B.Secured     |
      | TotalIssuedAmount     | 500000000       |
      | TrancheSettlementDate | 1653649569000 |
      | FirstCallDate         | 1809169569000 |
      | IsPerpetual           | true          |
    When I creating an issuance


  @Perpetual
  Scenario:Creating a new Perpetual issuance data
    Given "SUPER_ADMIN" user send a request to endpoint with "/event-login-auth" status code as "200"
    Given the following details for perpetual issuance
      | DatasourceId          | BBG           |
      | IssuanceDataKey       | DB:ZXZXTEST39 |
      | IssuerTicker          | ZXZXZXZTEST39 |
      | IssuerName            | ZXZXZXZTEST39 |
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
    Given the following details
      | DatasourceId          | DB            |
      | IssuanceDataKey       | DB:ZXZXTEST44 |
      | IssuerTicker          | ZXZXZXZTEST44 |
      | IssuerName            | ZXZXZXZTEST44 |
      | MaturityDate          | 1636675200000 |
      | CurrencyCode          | USD           |
      | IssuerCountry         | USA           |
      | TrancheCurrency       | USD           |
      | IssuerRating          | A+//          |
      | Ipts                  | SM+11         |
      | DealStatus            | Announced     |
      | BookStatus            | Book open     |
      | BondSeniority         | B.Secured     |
      | TotalIssuedAmount     | 100000000       |
      | TrancheSettlementDate | 1653649569000 |
      | FirstCallDate         | 1809169569000 |
      | IsPerpetual           | true          |
    When I creating an issuance


