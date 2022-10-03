package utilities;



import com.github.javafaker.Faker;
import io.restassured.specification.RequestSpecification;
import utilities.PoJos.Details;
import utilities.PoJos.DetailsPOJO;

import static io.restassured.RestAssured.given;
import static utilities.ReqNResSpec.getReqSpec;

public class TestIssuance {
    public static void main(String[] args) {

        /*Faker fake = new Faker();
        System.out.println("First Name "+fake.name().firstName());
        System.out.println("Last Name "+fake.name().lastName());
        System.out.println("Full Name "+fake.name().fullName());
        System.out.println("Phone "+fake.phoneNumber().cellPhone());
        System.out.println("Email  "+fake.internet().emailAddress());
*/
        String baseURI = "http://" + ConfigReader.readProperty("hsbcIssuance") + ":9064";
        DetailsPOJO detailsPOJO = new DetailsPOJO();
        detailsPOJO.setMessageType("EVENT_NEW_ISSUANCE_DATA");
        detailsPOJO.setServiceName("ISSUANCE_EVENT_HANDLER");
        Details DETAILS = new Details();
        DETAILS.setDatasourceId("BBG");
        DETAILS.setIssuanceDataKey("ZXZXTEST25");
        DETAILS.setIssuerTicker("ZXZXZXZTEST25");
        DETAILS.setIssuerName("ZXZXZXZTEST25");
        DETAILS.setMaturityDate(Long.valueOf("1636675200000"));
        DETAILS.setCurrencyCode("USD");
        DETAILS.setIssuerCountry("USA");
        DETAILS.setTrancheCurrency("USD");
        DETAILS.setIssuerRating("A+//");
        DETAILS.setIpts("SM+11");
        DETAILS.setDealStatus("Announced");
        DETAILS.setBookStatus("Book open");
        DETAILS.setBondSeniority("B.Secured");
        DETAILS.setTotalIssuedAmount("1000000");
        DETAILS.setTrancheSettlementDate("1653649569000");
        DETAILS.setFirstCallDate("1809169569000");
        DETAILS.setIsPerpetual(true);
        detailsPOJO.setDETAILS(DETAILS);

        RequestSpecification super_admin = getReqSpec("SUPER_ADMIN");
        given()
                .spec(super_admin).
                body(detailsPOJO).

                when()
                .post("/event_new_issuance_data").
                then()
                .spec(ReqNResSpec.getRespSpec())
        ;




    }
}
