package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import utilities.PoJos.Details;
import utilities.PoJos.DetailsPOJO;

import java.util.Map;

public class DealStatusSteps {
    DetailsPOJO detailsPOJO = new DetailsPOJO();
    Details details = new Details();
    Faker fake = new Faker();
    String prefix = "DB";
    @Given("that the following allocated details")
    public void thatTheFollowingAllocatedDetails(Map<String,String> dataTable) {
        //System.out.println("datatable"+dataTable);
        detailsPOJO.setMessageType("EVENT_NEW_ISSUANCE_DATA");
        detailsPOJO.setServiceName("ISSUANCE_EVENT_HANDLER");
        details.setDatasourceId(dataTable.get("DatasourceId"));
        details.setIssuanceDataKey(prefix +":"+ fake.currency().code());
        details.setIssuerTicker(fake.name().lastName().toUpperCase());
        details.setIssuerName(fake.country().currencyCode());
        details.setMaturityDate(Long.valueOf(dataTable.get("MaturityDate")));
        details.setCurrencyCode(dataTable.get("CurrencyCode"));
        details.setIssuerCountry(dataTable.get("IssuerCountry"));
        details.setTrancheCurrency(dataTable.get("TrancheCurrency"));
        details.setIssuerRating(dataTable.get("IssuerRating"));
        details.setIpts(dataTable.get("Ipts"));
        details.setDealStatus(dataTable.get("DealStatus"));
        details.setBookStatus(dataTable.get("BookStatus"));
        details.setBondSeniority(dataTable.get("BondSeniority"));
        //details.setTotalIssuedAmount(dataTable.get("TotalIssuedAmount"));
        details.setTrancheSettlementDate(dataTable.get("TrancheSettlementDate"));
        details.setFirstCallDate(dataTable.get("FirstCallDate"));
        details.setIsPerpetual(Boolean.valueOf(dataTable.get("IsPerpetual")));
        detailsPOJO.setDETAILS(details);

    }
}
