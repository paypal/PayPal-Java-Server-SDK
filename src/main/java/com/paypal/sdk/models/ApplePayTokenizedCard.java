/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ApplePayTokenizedCard type.
 */
public class ApplePayTokenizedCard {
    private String name;
    private String number;
    private String expiry;
    private CardBrand cardType;
    private CardType type;
    private CardBrand brand;
    private Address billingAddress;

    /**
     * Default constructor.
     */
    public ApplePayTokenizedCard() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  number  String value for number.
     * @param  expiry  String value for expiry.
     * @param  cardType  CardBrand value for cardType.
     * @param  type  CardType value for type.
     * @param  brand  CardBrand value for brand.
     * @param  billingAddress  Address value for billingAddress.
     */
    public ApplePayTokenizedCard(
            String name,
            String number,
            String expiry,
            CardBrand cardType,
            CardType type,
            CardBrand brand,
            Address billingAddress) {
        this.name = name;
        this.number = number;
        this.expiry = expiry;
        this.cardType = cardType;
        this.type = type;
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
     * Getter for CardType.
     * The card network or brand. Applies to credit, debit, gift, and payment cards.
     * @return Returns the CardBrand
     */
    @JsonGetter("card_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardBrand getCardType() {
        return cardType;
    }

    /**
     * Setter for CardType.
     * The card network or brand. Applies to credit, debit, gift, and payment cards.
     * @param cardType Value for CardBrand
     */
    @JsonSetter("card_type")
    public void setCardType(CardBrand cardType) {
        this.cardType = cardType;
    }

    /**
     * Getter for Type.
     * Type of card. i.e Credit, Debit and so on.
     * @return Returns the CardType
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardType getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of card. i.e Credit, Debit and so on.
     * @param type Value for CardType
     */
    @JsonSetter("type")
    public void setType(CardType type) {
        this.type = type;
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
     * Converts this ApplePayTokenizedCard into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplePayTokenizedCard [" + "name=" + name + ", number=" + number + ", expiry="
                + expiry + ", cardType=" + cardType + ", type=" + type + ", brand=" + brand
                + ", billingAddress=" + billingAddress + "]";
    }

    /**
     * Builds a new {@link ApplePayTokenizedCard.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplePayTokenizedCard.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .number(getNumber())
                .expiry(getExpiry())
                .cardType(getCardType())
                .type(getType())
                .brand(getBrand())
                .billingAddress(getBillingAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link ApplePayTokenizedCard}.
     */
    public static class Builder {
        private String name;
        private String number;
        private String expiry;
        private CardBrand cardType;
        private CardType type;
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
         * Setter for cardType.
         * @param  cardType  CardBrand value for cardType.
         * @return Builder
         */
        public Builder cardType(CardBrand cardType) {
            this.cardType = cardType;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  CardType value for type.
         * @return Builder
         */
        public Builder type(CardType type) {
            this.type = type;
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
         * Builds a new {@link ApplePayTokenizedCard} object using the set fields.
         * @return {@link ApplePayTokenizedCard}
         */
        public ApplePayTokenizedCard build() {
            return new ApplePayTokenizedCard(name, number, expiry, cardType, type, brand,
                    billingAddress);
        }
    }
}
