package utilities.PoJos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Details {
    /*Faker faker = new Faker();
    String randomName = faker.name().firstName();
    String prefix;*/
    @JsonProperty("USER_NAME")
    private String USER_NAME;
    @JsonProperty("PASSWORD")
    private String PASSWORD;
    @JsonProperty("DATASOURCE_ID")
    private String datasourceId;
    @JsonProperty("ISSUANCE_DATA_KEY")
    private String issuanceDataKey;
    @JsonProperty("ISSUER_TICKER")
    private String issuerTicker;
    @JsonProperty("ISSUER_NAME")
    private String issuerName;
    @JsonProperty("MATURITY_DATE")
    private Long maturityDate;
    @JsonProperty("CURRENCY_CODE")
    private String currencyCode;
    @JsonProperty("ISSUER_COUNTRY")
    private String issuerCountry;
    @JsonProperty("TRANCHE_CURRENCY")
    private String trancheCurrency;
    @JsonProperty("ISSUER_RATING")
    private String issuerRating;
    @JsonProperty("IPTS")
    private String ipts;
    @JsonProperty("DEAL_STATUS")
    private String dealStatus;
    @JsonProperty("BOOK_STATUS")
    private String bookStatus;
    @JsonProperty("BOND_SENIORITY")
    private String bondSeniority;
    @JsonProperty("TRANCHE_SETTLEMENT_DATE")
    private String trancheSettlementDate;
    @JsonProperty("FIRST_CALL_DATE")
    private String firstCallDate;
    @JsonProperty("TOTAL_ISSUED_AMOUNT")
    private String totalIssuedAmount;
    @JsonProperty("IS_PERPETUAL")
    private Boolean isPerpetual;

    /**
     * No args constructor for use in serialization
     */
    public Details() {
    }


    public Details(String datasourceId, String issuanceDataKey, String issuerTicker, String issuerName, Long maturityDate, String currencyCode, String issuerCountry, String trancheCurrency, String issuerRating, String ipts, String dealStatus, String bookStatus, String bondSeniority, String trancheSettlementDate, String firstCallDate, String totalIssuedAmount, Boolean isPerpetual) {
        super();
        this.datasourceId = datasourceId;
        this.issuanceDataKey = issuanceDataKey;
        this.issuerTicker = issuerTicker;
        this.issuerName = issuerName;
        this.maturityDate = maturityDate;
        this.currencyCode = currencyCode;
        this.issuerCountry = issuerCountry;
        this.trancheCurrency = trancheCurrency;
        this.issuerRating = issuerRating;
        this.ipts = ipts;
        this.dealStatus = dealStatus;
        this.bookStatus = bookStatus;
        this.bondSeniority = bondSeniority;
        this.trancheSettlementDate = trancheSettlementDate;
        this.firstCallDate = firstCallDate;
        this.totalIssuedAmount = totalIssuedAmount;
        this.isPerpetual = isPerpetual;
    }

    @JsonProperty("DATASOURCE_ID")
    public String getDatasourceId() {
             return datasourceId;
    }

    @JsonProperty("DATASOURCE_ID")
    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    @JsonProperty("ISSUANCE_DATA_KEY")
    public String getIssuanceDataKey() {
        return issuanceDataKey;
    }

    @JsonProperty("ISSUANCE_DATA_KEY")
    public void setIssuanceDataKey(String issuanceDataKey) {
        this.issuanceDataKey = issuanceDataKey;
    }

    @JsonProperty("ISSUER_TICKER")
    public String getIssuerTicker() {
        return issuerTicker;
    }

    @JsonProperty("ISSUER_TICKER")
    public void setIssuerTicker(String issuerTicker) {
        this.issuerTicker = issuerTicker;
    }

    @JsonProperty("ISSUER_NAME")
    public String getIssuerName() {
        return issuerName;
    }

    @JsonProperty("ISSUER_NAME")
    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    @JsonProperty("MATURITY_DATE")
    public Long getMaturityDate() {
        return maturityDate;
    }

    @JsonProperty("MATURITY_DATE")
    public void setMaturityDate(Long maturityDate) {
        this.maturityDate = maturityDate;
    }

    @JsonProperty("CURRENCY_CODE")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("CURRENCY_CODE")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("ISSUER_COUNTRY")
    public String getIssuerCountry() {
        return issuerCountry;
    }

    @JsonProperty("ISSUER_COUNTRY")
    public void setIssuerCountry(String issuerCountry) {
        this.issuerCountry = issuerCountry;
    }

    @JsonProperty("TRANCHE_CURRENCY")
    public String getTrancheCurrency() {
        return trancheCurrency;
    }

    @JsonProperty("TRANCHE_CURRENCY")
    public void setTrancheCurrency(String trancheCurrency) {
        this.trancheCurrency = trancheCurrency;
    }

    @JsonProperty("ISSUER_RATING")
    public String getIssuerRating() {
        return issuerRating;
    }

    @JsonProperty("ISSUER_RATING")
    public void setIssuerRating(String issuerRating) {
        this.issuerRating = issuerRating;
    }

    @JsonProperty("IPTS")
    public String getIpts() {
        return ipts;
    }

    @JsonProperty("IPTS")
    public void setIpts(String ipts) {
        this.ipts = ipts;
    }

    @JsonProperty("DEAL_STATUS")
    public String getDealStatus() {
        return dealStatus;
    }

    @JsonProperty("DEAL_STATUS")
    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    @JsonProperty("BOOK_STATUS")
    public String getBookStatus() {
        return bookStatus;
    }

    @JsonProperty("BOOK_STATUS")
    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    @JsonProperty("BOND_SENIORITY")
    public String getBondSeniority() {
        return bondSeniority;
    }

    @JsonProperty("BOND_SENIORITY")
    public void setBondSeniority(String bondSeniority) {
        this.bondSeniority = bondSeniority;
    }

    @JsonProperty("TRANCHE_SETTLEMENT_DATE")
    public String getTrancheSettlementDate() {
        return trancheSettlementDate;
    }

    @JsonProperty("TRANCHE_SETTLEMENT_DATE")
    public void setTrancheSettlementDate(String trancheSettlementDate) {
        this.trancheSettlementDate = trancheSettlementDate;
    }

    @JsonProperty("FIRST_CALL_DATE")
    public String getFirstCallDate() {
        return firstCallDate;
    }

    @JsonProperty("FIRST_CALL_DATE")
    public void setFirstCallDate(String firstCallDate) {
        this.firstCallDate = firstCallDate;
    }

    @JsonProperty("TOTAL_ISSUED_AMOUNT")
    public String getTotalIssuedAmount() {
        return totalIssuedAmount;
    }

    @JsonProperty("TOTAL_ISSUED_AMOUNT")
    public void setTotalIssuedAmount(String totalIssuedAmount) {
        this.totalIssuedAmount = totalIssuedAmount;
    }

    @JsonProperty("IS_PERPETUAL")
    public Boolean getIsPerpetual() {
        return isPerpetual;
    }

    @JsonProperty("IS_PERPETUAL")
    public void setIsPerpetual(Boolean isPerpetual) {
        this.isPerpetual = isPerpetual;
    }

    @Override
    public String toString() {
        return "Details{" +
                "USER_NAME='" + USER_NAME + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", datasourceId='" + datasourceId + '\'' +
                ", issuanceDataKey='" + issuanceDataKey + '\'' +
                ", issuerTicker='" + issuerTicker + '\'' +
                ", issuerName='" + issuerName + '\'' +
                ", maturityDate=" + maturityDate +
                ", currencyCode='" + currencyCode + '\'' +
                ", issuerCountry='" + issuerCountry + '\'' +
                ", trancheCurrency='" + trancheCurrency + '\'' +
                ", issuerRating='" + issuerRating + '\'' +
                ", ipts='" + ipts + '\'' +
                ", dealStatus='" + dealStatus + '\'' +
                ", bookStatus='" + bookStatus + '\'' +
                ", bondSeniority='" + bondSeniority + '\'' +
                ", trancheSettlementDate='" + trancheSettlementDate + '\'' +
                ", firstCallDate='" + firstCallDate + '\'' +
                ", totalIssuedAmount='" + totalIssuedAmount + '\'' +
                ", isPerpetual=" + isPerpetual +
                '}';
    }
}