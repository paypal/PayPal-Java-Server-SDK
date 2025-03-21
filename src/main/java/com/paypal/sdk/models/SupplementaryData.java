/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SupplementaryData type.
 */
public class SupplementaryData {
    private CardSupplementaryData card;
    private RiskSupplementaryData risk;

    /**
     * Default constructor.
     */
    public SupplementaryData() {
    }

    /**
     * Initialization constructor.
     * @param  card  CardSupplementaryData value for card.
     * @param  risk  RiskSupplementaryData value for risk.
     */
    public SupplementaryData(
            CardSupplementaryData card,
            RiskSupplementaryData risk) {
        this.card = card;
        this.risk = risk;
    }

    /**
     * Getter for Card.
     * Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment
     * processing costs. For more information about processing payments, see checkout or multiparty
     * checkout.
     * @return Returns the CardSupplementaryData
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardSupplementaryData getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment
     * processing costs. For more information about processing payments, see checkout or multiparty
     * checkout.
     * @param card Value for CardSupplementaryData
     */
    @JsonSetter("card")
    public void setCard(CardSupplementaryData card) {
        this.card = card;
    }

    /**
     * Getter for Risk.
     * Additional information necessary to evaluate the risk profile of a transaction.
     * @return Returns the RiskSupplementaryData
     */
    @JsonGetter("risk")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RiskSupplementaryData getRisk() {
        return risk;
    }

    /**
     * Setter for Risk.
     * Additional information necessary to evaluate the risk profile of a transaction.
     * @param risk Value for RiskSupplementaryData
     */
    @JsonSetter("risk")
    public void setRisk(RiskSupplementaryData risk) {
        this.risk = risk;
    }

    /**
     * Converts this SupplementaryData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SupplementaryData [" + "card=" + card + ", risk=" + risk + "]";
    }

    /**
     * Builds a new {@link SupplementaryData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SupplementaryData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard())
                .risk(getRisk());
        return builder;
    }

    /**
     * Class to build instances of {@link SupplementaryData}.
     */
    public static class Builder {
        private CardSupplementaryData card;
        private RiskSupplementaryData risk;



        /**
         * Setter for card.
         * @param  card  CardSupplementaryData value for card.
         * @return Builder
         */
        public Builder card(CardSupplementaryData card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for risk.
         * @param  risk  RiskSupplementaryData value for risk.
         * @return Builder
         */
        public Builder risk(RiskSupplementaryData risk) {
            this.risk = risk;
            return this;
        }

        /**
         * Builds a new {@link SupplementaryData} object using the set fields.
         * @return {@link SupplementaryData}
         */
        public SupplementaryData build() {
            return new SupplementaryData(card, risk);
        }
    }
}
