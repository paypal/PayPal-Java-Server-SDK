/*
 * PayPalRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PaymentTokenRequestPaymentSource type.
 */
public class PaymentTokenRequestPaymentSource {
    private PaymentTokenRequestCard card;
    private VaultTokenRequest token;

    /**
     * Default constructor.
     */
    public PaymentTokenRequestPaymentSource() {
    }

    /**
     * Initialization constructor.
     * @param  card  PaymentTokenRequestCard value for card.
     * @param  token  VaultTokenRequest value for token.
     */
    public PaymentTokenRequestPaymentSource(
            PaymentTokenRequestCard card,
            VaultTokenRequest token) {
        this.card = card;
        this.token = token;
    }

    /**
     * Getter for Card.
     * A Resource representing a request to vault a Card.
     * @return Returns the PaymentTokenRequestCard
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentTokenRequestCard getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * A Resource representing a request to vault a Card.
     * @param card Value for PaymentTokenRequestCard
     */
    @JsonSetter("card")
    public void setCard(PaymentTokenRequestCard card) {
        this.card = card;
    }

    /**
     * Getter for Token.
     * The Tokenized Payment Source representing a Request to Vault a Token.
     * @return Returns the VaultTokenRequest
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultTokenRequest getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * The Tokenized Payment Source representing a Request to Vault a Token.
     * @param token Value for VaultTokenRequest
     */
    @JsonSetter("token")
    public void setToken(VaultTokenRequest token) {
        this.token = token;
    }

    /**
     * Converts this PaymentTokenRequestPaymentSource into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentTokenRequestPaymentSource [" + "card=" + card + ", token=" + token + "]";
    }

    /**
     * Builds a new {@link PaymentTokenRequestPaymentSource.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentTokenRequestPaymentSource.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard())
                .token(getToken());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentTokenRequestPaymentSource}.
     */
    public static class Builder {
        private PaymentTokenRequestCard card;
        private VaultTokenRequest token;



        /**
         * Setter for card.
         * @param  card  PaymentTokenRequestCard value for card.
         * @return Builder
         */
        public Builder card(PaymentTokenRequestCard card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for token.
         * @param  token  VaultTokenRequest value for token.
         * @return Builder
         */
        public Builder token(VaultTokenRequest token) {
            this.token = token;
            return this;
        }

        /**
         * Builds a new {@link PaymentTokenRequestPaymentSource} object using the set fields.
         * @return {@link PaymentTokenRequestPaymentSource}
         */
        public PaymentTokenRequestPaymentSource build() {
            return new PaymentTokenRequestPaymentSource(card, token);
        }
    }
}
