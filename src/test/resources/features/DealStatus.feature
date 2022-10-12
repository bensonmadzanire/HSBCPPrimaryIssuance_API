Feature: Deal status

  @Announced
  Scenario:Deal statuses and book statuses
    Given "SUPER_ADMIN" user send a request to endpoint with "/event-login-auth" status code as "200"
    Given the following Announced deal status details
      | DatasourceId          | IPR           |
      | CurrencyCode          | USD           |
      | IssuerCountry         | USA           |
      | TrancheCurrency       | USD           |
      | IssuerRating          | A+//          |
      | Ipts                  | SM+11         |
      | DealStatus            | Announced     |
      | BookStatus            | Book open     |
      | BondSeniority         | B.Secured     |
      | TotalIssuedAmount     | 1000000       |
      | TrancheSettlementDate | 1653649569000 |
      | FirstCallDate         | 1809169569000 |
      | IsPerpetual           | true          |
    When I creating an issuance


  @FinalTerms
  Scenario:Deal statuses and book statuses
    Given "SUPER_ADMIN" user send a request to endpoint with "/event-login-auth" status code as "200"
    Given the following Final terms deal status details
      | DatasourceId          | IPR            |
      | IssuanceDataKey       | IPR:ZXZXTEST39 |
      | IssuerTicker          | ZXZXZXZTEST39  |
      | IssuerName            | ZXZXZXZTEST39  |
      | MaturityDate          | 1636675200000  |
      | CurrencyCode          | USD            |
      | IssuerCountry         | USA            |
      | TrancheCurrency       | USD            |
      | IssuerRating          | A+//           |
      | Ipts                  | SM+11          |
      | DealStatus            | Final Terms    |
      | BookStatus            | Book open      |
      | BondSeniority         | B.Secured      |
      | TotalIssuedAmount     | 1000000        |
      | TrancheSettlementDate | 1653649569000  |
      | FirstCallDate         | 1809169569000  |
      | IsPerpetual           | true           |
    When I creating an issuance

  @Allocated @severity
  Scenario:Deal statuses and book statuses
    Given "SUPER_ADMIN" user send a request to endpoint with "/event-login-auth" status code as "200"
    Given that the following allocated details
      | DatasourceId          | DB            |
      | MaturityDate          | 1636675200000 |
      | CurrencyCode          | USD           |
      | IssuerCountry         | USA           |
      | TrancheCurrency       | USD           |
      | IssuerRating          | A+//          |
      | Ipts                  | SM+11         |
      | DealStatus            | Allocated     |
      | BookStatus            | Book open     |
      | BondSeniority         | B.Secured     |
      | TrancheSettlementDate | 1653649569000 |
      | FirstCallDate         | 1809169569000 |
      | IsPerpetual           | true          |
    When I creating an issuance

  #@Pricing
  #Scenario:Deal statuses and book statuses
    #Given "SUPER_ADMIN" user send a request to endpoint with "/event-login-auth" status code as "200"
    #Given the following details
      #| DatasourceId          | IPR            |
      #| IssuanceDataKey       | IPR:ZXZXTEST41 |
      #| IssuerTicker          | ZXZXZXZTEST41  |
      #| IssuerName            | ZXZXZXZTEST41  |
     # | MaturityDate          | 1636675200000  |
      #| CurrencyCode          | USD            |
      #| IssuerCountry         | USA            |
     # | TrancheCurrency       | USD            |
      #| IssuerRating          | A+//           |
      #| Ipts                  | SM+11          |
     # | DealStatus            | Pricing        |
      #| BookStatus            | Book open      |
      #| BondSeniority         | B.Secured      |
      #| TotalIssuedAmount     | 1000000        |
      #| TrancheSettlementDate | 1653649569000  |
      #| FirstCallDate         | 1809169569000  |
      #| IsPerpetual           | true           |
    #When I creating an issuance

 # @Cancelled
  #Scenario:Deal statuses and book statuses
    #Given "SUPER_ADMIN" user send a request to endpoint with "/event-login-auth" status code as "200"
    #Given the following details
      #| DatasourceId          | IPR            |
      #| IssuanceDataKey       | IPR:ZXZXTEST42 |
      #| IssuerTicker          | ZXZXZXZTEST42  |
      #| IssuerName            | ZXZXZXZTEST42  |
     # | MaturityDate          | 1636675200000  |
     # | CurrencyCode          | USD            |
      #| IssuerCountry         | USA            |
      #| TrancheCurrency       | USD            |
      #| IssuerRating          | A+//           |
      #| Ipts                  | SM+11          |
      #| DealStatus            | Cancelled      |
      #| BookStatus            | Book open      |
      #| BondSeniority         | B.Secured      |
      #| TotalIssuedAmount     | 1000000        |
      #| TrancheSettlementDate | 1653649569000  |
      #| FirstCallDate         | 1809169569000  |
      #| IsPerpetual           | true           |
    #When I creating an issuance

