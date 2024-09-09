/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SetupTokenResponsePaymentSource type.
 */
public class SetupTokenResponsePaymentSource {
    private SetupTokenResponseCard card;
    private PayPalPaymentToken paypal;
    private VenmoPaymentToken venmo;

    /**
     * Default constructor.
     */
    public SetupTokenResponsePaymentSource() {
    }

    /**
     * Initialization constructor.
     * @param  card  SetupTokenResponseCard value for card.
     * @param  paypal  PayPalPaymentToken value for paypal.
     * @param  venmo  VenmoPaymentToken value for venmo.
     */
    public SetupTokenResponsePaymentSource(
            SetupTokenResponseCard card,
            PayPalPaymentToken paypal,
            VenmoPaymentToken venmo) {
        this.card = card;
        this.paypal = paypal;
        this.venmo = venmo;
    }

    /**
     * Getter for Card.
     * @return Returns the SetupTokenResponseCard
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SetupTokenResponseCard getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * @param card Value for SetupTokenResponseCard
     */
    @JsonSetter("card")
    public void setCard(SetupTokenResponseCard card) {
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
     * Converts this SetupTokenResponsePaymentSource into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SetupTokenResponsePaymentSource [" + "card=" + card + ", paypal=" + paypal
                + ", venmo=" + venmo + "]";
    }

    /**
     * Builds a new {@link SetupTokenResponsePaymentSource.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SetupTokenResponsePaymentSource.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard())
                .paypal(getPaypal())
                .venmo(getVenmo());
        return builder;
    }

    /**
     * Class to build instances of {@link SetupTokenResponsePaymentSource}.
     */
    public static class Builder {
        private SetupTokenResponseCard card;
        private PayPalPaymentToken paypal;
        private VenmoPaymentToken venmo;



        /**
         * Setter for card.
         * @param  card  SetupTokenResponseCard value for card.
         * @return Builder
         */
        public Builder card(SetupTokenResponseCard card) {
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
         * Builds a new {@link SetupTokenResponsePaymentSource} object using the set fields.
         * @return {@link SetupTokenResponsePaymentSource}
         */
        public SetupTokenResponsePaymentSource build() {
            return new SetupTokenResponsePaymentSource(card, paypal, venmo);
        }
    }
}