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
 * This is a model class for OrderCaptureRequestPaymentSource type.
 */
public class OrderCaptureRequestPaymentSource {
    private CardRequest card;
    private Token token;
    private PayPalWallet paypal;
    private ApplePayRequest applePay;
    private GooglePayRequest googlePay;
    private VenmoWalletRequest venmo;

    /**
     * Default constructor.
     */
    public OrderCaptureRequestPaymentSource() {
    }

    /**
     * Initialization constructor.
     * @param  card  CardRequest value for card.
     * @param  token  Token value for token.
     * @param  paypal  PayPalWallet value for paypal.
     * @param  applePay  ApplePayRequest value for applePay.
     * @param  googlePay  GooglePayRequest value for googlePay.
     * @param  venmo  VenmoWalletRequest value for venmo.
     */
    public OrderCaptureRequestPaymentSource(
            CardRequest card,
            Token token,
            PayPalWallet paypal,
            ApplePayRequest applePay,
            GooglePayRequest googlePay,
            VenmoWalletRequest venmo) {
        this.card = card;
        this.token = token;
        this.paypal = paypal;
        this.applePay = applePay;
        this.googlePay = googlePay;
        this.venmo = venmo;
    }

    /**
     * Getter for Card.
     * The payment card to use to fund a payment. Can be a credit or debit
     * card.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Passing card number, cvv and expiry directly via the
     * API requires &lt;a
     * href="https://www.pcisecuritystandards.org/pci_security/completing_self_assessment"&gt; PCI SAQ
     * D compliance&lt;/a&gt;. &lt;br&gt;*PayPal offers a mechanism by which you do not have to take on the
     * &lt;strong&gt;PCI SAQ D&lt;/strong&gt; burden by using hosted fields - refer to &lt;a
     * href="https://developer.paypal.com/docs/checkout/advanced/integrate/"&gt;this Integration
     * Guide&lt;/a&gt;*.&lt;/blockquote&gt;
     * @return Returns the CardRequest
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardRequest getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * The payment card to use to fund a payment. Can be a credit or debit
     * card.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Passing card number, cvv and expiry directly via the
     * API requires &lt;a
     * href="https://www.pcisecuritystandards.org/pci_security/completing_self_assessment"&gt; PCI SAQ
     * D compliance&lt;/a&gt;. &lt;br&gt;*PayPal offers a mechanism by which you do not have to take on the
     * &lt;strong&gt;PCI SAQ D&lt;/strong&gt; burden by using hosted fields - refer to &lt;a
     * href="https://developer.paypal.com/docs/checkout/advanced/integrate/"&gt;this Integration
     * Guide&lt;/a&gt;*.&lt;/blockquote&gt;
     * @param card Value for CardRequest
     */
    @JsonSetter("card")
    public void setCard(CardRequest card) {
        this.card = card;
    }

    /**
     * Getter for Token.
     * The tokenized payment source to fund a payment.
     * @return Returns the Token
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Token getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * The tokenized payment source to fund a payment.
     * @param token Value for Token
     */
    @JsonSetter("token")
    public void setToken(Token token) {
        this.token = token;
    }

    /**
     * Getter for Paypal.
     * A resource that identifies a PayPal Wallet is used for payment.
     * @return Returns the PayPalWallet
     */
    @JsonGetter("paypal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayPalWallet getPaypal() {
        return paypal;
    }

    /**
     * Setter for Paypal.
     * A resource that identifies a PayPal Wallet is used for payment.
     * @param paypal Value for PayPalWallet
     */
    @JsonSetter("paypal")
    public void setPaypal(PayPalWallet paypal) {
        this.paypal = paypal;
    }

    /**
     * Getter for ApplePay.
     * Information needed to pay using ApplePay.
     * @return Returns the ApplePayRequest
     */
    @JsonGetter("apple_pay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayRequest getApplePay() {
        return applePay;
    }

    /**
     * Setter for ApplePay.
     * Information needed to pay using ApplePay.
     * @param applePay Value for ApplePayRequest
     */
    @JsonSetter("apple_pay")
    public void setApplePay(ApplePayRequest applePay) {
        this.applePay = applePay;
    }

    /**
     * Getter for GooglePay.
     * Information needed to pay using Google Pay.
     * @return Returns the GooglePayRequest
     */
    @JsonGetter("google_pay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GooglePayRequest getGooglePay() {
        return googlePay;
    }

    /**
     * Setter for GooglePay.
     * Information needed to pay using Google Pay.
     * @param googlePay Value for GooglePayRequest
     */
    @JsonSetter("google_pay")
    public void setGooglePay(GooglePayRequest googlePay) {
        this.googlePay = googlePay;
    }

    /**
     * Getter for Venmo.
     * Information needed to pay using Venmo.
     * @return Returns the VenmoWalletRequest
     */
    @JsonGetter("venmo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VenmoWalletRequest getVenmo() {
        return venmo;
    }

    /**
     * Setter for Venmo.
     * Information needed to pay using Venmo.
     * @param venmo Value for VenmoWalletRequest
     */
    @JsonSetter("venmo")
    public void setVenmo(VenmoWalletRequest venmo) {
        this.venmo = venmo;
    }

    /**
     * Converts this OrderCaptureRequestPaymentSource into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderCaptureRequestPaymentSource [" + "card=" + card + ", token=" + token
                + ", paypal=" + paypal + ", applePay=" + applePay + ", googlePay=" + googlePay
                + ", venmo=" + venmo + "]";
    }

    /**
     * Builds a new {@link OrderCaptureRequestPaymentSource.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderCaptureRequestPaymentSource.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard())
                .token(getToken())
                .paypal(getPaypal())
                .applePay(getApplePay())
                .googlePay(getGooglePay())
                .venmo(getVenmo());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderCaptureRequestPaymentSource}.
     */
    public static class Builder {
        private CardRequest card;
        private Token token;
        private PayPalWallet paypal;
        private ApplePayRequest applePay;
        private GooglePayRequest googlePay;
        private VenmoWalletRequest venmo;



        /**
         * Setter for card.
         * @param  card  CardRequest value for card.
         * @return Builder
         */
        public Builder card(CardRequest card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for token.
         * @param  token  Token value for token.
         * @return Builder
         */
        public Builder token(Token token) {
            this.token = token;
            return this;
        }

        /**
         * Setter for paypal.
         * @param  paypal  PayPalWallet value for paypal.
         * @return Builder
         */
        public Builder paypal(PayPalWallet paypal) {
            this.paypal = paypal;
            return this;
        }

        /**
         * Setter for applePay.
         * @param  applePay  ApplePayRequest value for applePay.
         * @return Builder
         */
        public Builder applePay(ApplePayRequest applePay) {
            this.applePay = applePay;
            return this;
        }

        /**
         * Setter for googlePay.
         * @param  googlePay  GooglePayRequest value for googlePay.
         * @return Builder
         */
        public Builder googlePay(GooglePayRequest googlePay) {
            this.googlePay = googlePay;
            return this;
        }

        /**
         * Setter for venmo.
         * @param  venmo  VenmoWalletRequest value for venmo.
         * @return Builder
         */
        public Builder venmo(VenmoWalletRequest venmo) {
            this.venmo = venmo;
            return this;
        }

        /**
         * Builds a new {@link OrderCaptureRequestPaymentSource} object using the set fields.
         * @return {@link OrderCaptureRequestPaymentSource}
         */
        public OrderCaptureRequestPaymentSource build() {
            return new OrderCaptureRequestPaymentSource(card, token, paypal, applePay, googlePay,
                    venmo);
        }
    }
}
