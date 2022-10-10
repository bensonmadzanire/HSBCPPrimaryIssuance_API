#Feature: Issuance creation

  #@Unallocated
  #Scenario:Creating a new Unallocated issuance data
    #Given "SUPER_ADMIN" user send a request to endpoint with "/event-login-auth" status code as "200"
    #Given that following details are available
     #| DatasourceId          | DB             |
     #| IssuanceDataKey       | DB:ZXZXTEST36  |
      #| IssuerTicker          | ZXZXZXZTEST36  |
      #| IssuerName            | ZXZXZXZTEST36  |
     #| CurrencyCode          | USD            |
      #| IssuerCountry         | USA            |
      #| TrancheCurrency       | USD            |
      #| IssuerRating          | A+//           |
      #| Ipts                  | SM+11          |
      #| DealStatus            | Announced      |
      #| BookStatus            | Book open      |
      #| BondSeniority         | B.Secured      |
      #| TotalIssuedAmount     | 1000000        |
      #| TrancheSettlementDate | 1653649569000  |
      #| FirstCallDate         | 1809169569000  |
      #| IsPerpetual           | false          |
    #When I creating an issuance








