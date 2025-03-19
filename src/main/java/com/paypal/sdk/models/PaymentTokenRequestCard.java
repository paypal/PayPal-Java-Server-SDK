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
 * This is a model class for PaymentTokenRequestCard type.
 */
public class PaymentTokenRequestCard {
    private String name;
    private String number;
    private String expiry;
    private String securityCode;
    private CardBrand brand;
    private Address billingAddress;

    /**
     * Default constructor.
     */
    public PaymentTokenRequestCard() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  number  String value for number.
     * @param  expiry  String value for expiry.
     * @param  securityCode  String value for securityCode.
     * @param  brand  CardBrand value for brand.
     * @param  billingAddress  Address value for billingAddress.
     */
    public PaymentTokenRequestCard(
            String name,
            String number,
            String expiry,
            String securityCode,
            CardBrand brand,
            Address billingAddress) {
        this.name = name;
        this.number = number;
        this.expiry = expiry;
        this.securityCode = securityCode;
        this.brand = brand;
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for Name.
     * The card holder's name as it appears on the card.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The card holder's name as it appears on the card.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Number.
     * The primary account number (PAN) for the payment card.
     * @return Returns the String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * The primary account number (PAN) for the payment card.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter for Expiry.
     * The year and month, in ISO-8601 `YYYY-MM` date format. See [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @return Returns the String
     */
    @JsonGetter("expiry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpiry() {
        return expiry;
    }

    /**
     * Setter for Expiry.
     * The year and month, in ISO-8601 `YYYY-MM` date format. See [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @param expiry Value for String
     */
    @JsonSetter("expiry")
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    /**
     * Getter for SecurityCode.
     * The three- or four-digit security code of the card. Also known as the CVV, CVC, CVN, CVE, or
     * CID. This parameter cannot be present in the request when `payment_initiator=MERCHANT`.
     * @return Returns the String
     */
    @JsonGetter("security_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Setter for SecurityCode.
     * The three- or four-digit security code of the card. Also known as the CVV, CVC, CVN, CVE, or
     * CID. This parameter cannot be present in the request when `payment_initiator=MERCHANT`.
     * @param securityCode Value for String
     */
    @JsonSetter("security_code")
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    /**
     * Getter for Brand.
     * The card network or brand. Applies to credit, debit, gift, and payment cards.
     * @return Returns the CardBrand
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardBrand getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * The card network or brand. Applies to credit, debit, gift, and payment cards.
     * @param brand Value for CardBrand
     */
    @JsonSetter("brand")
    public void setBrand(CardBrand brand) {
        this.brand = brand;
    }

    /**
     * Getter for BillingAddress.
     * The portable international postal address. Maps to
     * [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata)
     * and HTML 5.1 [Autofilling form controls: the autocomplete
     * attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
     * @return Returns the Address
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * The portable international postal address. Maps to
     * [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata)
     * and HTML 5.1 [Autofilling form controls: the autocomplete
     * attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
     * @param billingAddress Value for Address
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Converts this PaymentTokenRequestCard into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentTokenRequestCard [" + "name=" + name + ", number=" + number + ", expiry="
                + expiry + ", securityCode=" + securityCode + ", brand=" + brand
                + ", billingAddress=" + billingAddress + "]";
    }

    /**
     * Builds a new {@link PaymentTokenRequestCard.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentTokenRequestCard.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .number(getNumber())
                .expiry(getExpiry())
                .securityCode(getSecurityCode())
                .brand(getBrand())
                .billingAddress(getBillingAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentTokenRequestCard}.
     */
    public static class Builder {
        private String name;
        private String number;
        private String expiry;
        private String securityCode;
        private CardBrand brand;
        private Address billingAddress;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for expiry.
         * @param  expiry  String value for expiry.
         * @return Builder
         */
        public Builder expiry(String expiry) {
            this.expiry = expiry;
            return this;
        }

        /**
         * Setter for securityCode.
         * @param  securityCode  String value for securityCode.
         * @return Builder
         */
        public Builder securityCode(String securityCode) {
            this.securityCode = securityCode;
            return this;
        }

        /**
         * Setter for brand.
         * @param  brand  CardBrand value for brand.
         * @return Builder
         */
        public Builder brand(CardBrand brand) {
            this.brand = brand;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  Address value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(Address billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Builds a new {@link PaymentTokenRequestCard} object using the set fields.
         * @return {@link PaymentTokenRequestCard}
         */
        public PaymentTokenRequestCard build() {
            return new PaymentTokenRequestCard(name, number, expiry, securityCode, brand,
                    billingAddress);
        }
    }
}
