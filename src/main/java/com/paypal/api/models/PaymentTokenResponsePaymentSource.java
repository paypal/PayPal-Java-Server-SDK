/*
 * PayPalRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.api.utilities.JsonObject;

/**
 * This is a model class for PaymentTokenResponsePaymentSource type.
 */
public class PaymentTokenResponsePaymentSource {
    private CardPaymentToken card;
    private PayPalPaymentToken paypal;
    private VenmoPaymentToken venmo;
    private ApplePayPaymentToken applePay;
    private JsonObject bank;

    /**
     * Default constructor.
     */
    public PaymentTokenResponsePaymentSource() {
    }

    /**
     * Initialization constructor.
     * @param  card  CardPaymentToken value for card.
     * @param  paypal  PayPalPaymentToken value for paypal.
     * @param  venmo  VenmoPaymentToken value for venmo.
     * @param  applePay  ApplePayPaymentToken value for applePay.
     * @param  bank  JsonObject value for bank.
     */
    public PaymentTokenResponsePaymentSource(
            CardPaymentToken card,
            PayPalPaymentToken paypal,
            VenmoPaymentToken venmo,
            ApplePayPaymentToken applePay,
            JsonObject bank) {
        this.card = card;
        this.paypal = paypal;
        this.venmo = venmo;
        this.applePay = applePay;
        this.bank = bank;
    }

    /**
     * Getter for Card.
     * Full representation of a Card Payment Token including network token.
     * @return Returns the CardPaymentToken
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardPaymentToken getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Full representation of a Card Payment Token including network token.
     * @param card Value for CardPaymentToken
     */
    @JsonSetter("card")
    public void setCard(CardPaymentToken card) {
        this.card = card;
    }

    /**
     * Getter for Paypal.
     * @return Returns the PayPalPaymentToken
     */
    @JsonGetter("paypal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayPalPaymentToken getPaypal() {
        return paypal;
    }

    /**
     * Setter for Paypal.
     * @param paypal Value for PayPalPaymentToken
     */
    @JsonSetter("paypal")
    public void setPaypal(PayPalPaymentToken paypal) {
        this.paypal = paypal;
    }

    /**
     * Getter for Venmo.
     * @return Returns the VenmoPaymentToken
     */
    @JsonGetter("venmo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VenmoPaymentToken getVenmo() {
        return venmo;
    }

    /**
     * Setter for Venmo.
     * @param venmo Value for VenmoPaymentToken
     */
    @JsonSetter("venmo")
    public void setVenmo(VenmoPaymentToken venmo) {
        this.venmo = venmo;
    }

    /**
     * Getter for ApplePay.
     * A resource representing a response for Apple Pay.
     * @return Returns the ApplePayPaymentToken
     */
    @JsonGetter("apple_pay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayPaymentToken getApplePay() {
        return applePay;
    }

    /**
     * Setter for ApplePay.
     * A resource representing a response for Apple Pay.
     * @param applePay Value for ApplePayPaymentToken
     */
    @JsonSetter("apple_pay")
    public void setApplePay(ApplePayPaymentToken applePay) {
        this.applePay = applePay;
    }

    /**
     * Getter for Bank.
     * Full representation of a Bank Payment Token.
     * @return Returns the JsonObject
     */
    @JsonGetter("bank")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JsonObject getBank() {
        return bank;
    }

    /**
     * Setter for Bank.
     * Full representation of a Bank Payment Token.
     * @param bank Value for JsonObject
     */
    @JsonSetter("bank")
    public void setBank(JsonObject bank) {
        this.bank = bank;
    }

    /**
     * Converts this PaymentTokenResponsePaymentSource into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentTokenResponsePaymentSource [" + "card=" + card + ", paypal=" + paypal
                + ", venmo=" + venmo + ", applePay=" + applePay + ", bank=" + bank + "]";
    }

    /**
     * Builds a new {@link PaymentTokenResponsePaymentSource.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentTokenResponsePaymentSource.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard())
                .paypal(getPaypal())
                .venmo(getVenmo())
                .applePay(getApplePay())
                .bank(getBank());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentTokenResponsePaymentSource}.
     */
    public static class Builder {
        private CardPaymentToken card;
        private PayPalPaymentToken paypal;
        private VenmoPaymentToken venmo;
        private ApplePayPaymentToken applePay;
        private JsonObject bank;



        /**
         * Setter for card.
         * @param  card  CardPaymentToken value for card.
         * @return Builder
         */
        public Builder card(CardPaymentToken card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for paypal.
         * @param  paypal  PayPalPaymentToken value for paypal.
         * @return Builder
         */
        public Builder paypal(PayPalPaymentToken paypal) {
            this.paypal = paypal;
            return this;
        }

        /**
         * Setter for venmo.
         * @param  venmo  VenmoPaymentToken value for venmo.
         * @return Builder
         */
        public Builder venmo(VenmoPaymentToken venmo) {
            this.venmo = venmo;
            return this;
        }

        /**
         * Setter for applePay.
         * @param  applePay  ApplePayPaymentToken value for applePay.
         * @return Builder
         */
        public Builder applePay(ApplePayPaymentToken applePay) {
            this.applePay = applePay;
            return this;
        }

        /**
         * Setter for bank.
         * @param  bank  JsonObject value for bank.
         * @return Builder
         */
        public Builder bank(JsonObject bank) {
            this.bank = bank;
            return this;
        }

        /**
         * Builds a new {@link PaymentTokenResponsePaymentSource} object using the set fields.
         * @return {@link PaymentTokenResponsePaymentSource}
         */
        public PaymentTokenResponsePaymentSource build() {
            return new PaymentTokenResponsePaymentSource(card, paypal, venmo, applePay, bank);
        }
    }
}
