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
 * This is a model class for ApplePayPaymentObject type.
 */
public class ApplePayPaymentObject {
    private String id;
    private String token;
    private String name;
    private String emailAddress;
    private PhoneNumber phoneNumber;
    private ApplePayCardResponse card;
    private ApplePayAttributesResponse attributes;

    /**
     * Default constructor.
     */
    public ApplePayPaymentObject() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  token  String value for token.
     * @param  name  String value for name.
     * @param  emailAddress  String value for emailAddress.
     * @param  phoneNumber  PhoneNumber value for phoneNumber.
     * @param  card  ApplePayCardResponse value for card.
     * @param  attributes  ApplePayAttributesResponse value for attributes.
     */
    public ApplePayPaymentObject(
            String id,
            String token,
            String name,
            String emailAddress,
            PhoneNumber phoneNumber,
            ApplePayCardResponse card,
            ApplePayAttributesResponse attributes) {
        this.id = id;
        this.token = token;
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.card = card;
        this.attributes = attributes;
    }

    /**
     * Getter for Id.
     * ApplePay transaction identifier, this will be the unique identifier for this transaction
     * provided by Apple. The pattern is defined by an external party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * ApplePay transaction identifier, this will be the unique identifier for this transaction
     * provided by Apple. The pattern is defined by an external party and supports Unicode.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Token.
     * Encrypted ApplePay token, containing card information. This token would be base64encoded. The
     * pattern is defined by an external party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * Encrypted ApplePay token, containing card information. This token would be base64encoded. The
     * pattern is defined by an external party and supports Unicode.
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Getter for Name.
     * The full name representation like Mr J Smith.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The full name representation like Mr J Smith.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for EmailAddress.
     * The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters
     * are allowed before and 255 characters are allowed after the &lt;code&gt;{@literal @}&lt;/code&gt; sign. However, the
     * generally accepted maximum length for an email address is 254 characters. The pattern
     * verifies that an unquoted &lt;code&gt;{@literal @}&lt;/code&gt; sign exists.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("email_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for EmailAddress.
     * The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters
     * are allowed before and 255 characters are allowed after the &lt;code&gt;{@literal @}&lt;/code&gt; sign. However, the
     * generally accepted maximum length for an email address is 254 characters. The pattern
     * verifies that an unquoted &lt;code&gt;{@literal @}&lt;/code&gt; sign exists.&lt;/blockquote&gt;
     * @param emailAddress Value for String
     */
    @JsonSetter("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for PhoneNumber.
     * The phone number in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en).
     * @return Returns the PhoneNumber
     */
    @JsonGetter("phone_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * The phone number in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en).
     * @param phoneNumber Value for PhoneNumber
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for Card.
     * The Card from Apple Pay Wallet used to fund the payment.
     * @return Returns the ApplePayCardResponse
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayCardResponse getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * The Card from Apple Pay Wallet used to fund the payment.
     * @param card Value for ApplePayCardResponse
     */
    @JsonSetter("card")
    public void setCard(ApplePayCardResponse card) {
        this.card = card;
    }

    /**
     * Getter for Attributes.
     * Additional attributes associated with the use of Apple Pay.
     * @return Returns the ApplePayAttributesResponse
     */
    @JsonGetter("attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayAttributesResponse getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * Additional attributes associated with the use of Apple Pay.
     * @param attributes Value for ApplePayAttributesResponse
     */
    @JsonSetter("attributes")
    public void setAttributes(ApplePayAttributesResponse attributes) {
        this.attributes = attributes;
    }

    /**
     * Converts this ApplePayPaymentObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplePayPaymentObject [" + "id=" + id + ", token=" + token + ", name=" + name
                + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", card="
                + card + ", attributes=" + attributes + "]";
    }

    /**
     * Builds a new {@link ApplePayPaymentObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplePayPaymentObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .token(getToken())
                .name(getName())
                .emailAddress(getEmailAddress())
                .phoneNumber(getPhoneNumber())
                .card(getCard())
                .attributes(getAttributes());
        return builder;
    }

    /**
     * Class to build instances of {@link ApplePayPaymentObject}.
     */
    public static class Builder {
        private String id;
        private String token;
        private String name;
        private String emailAddress;
        private PhoneNumber phoneNumber;
        private ApplePayCardResponse card;
        private ApplePayAttributesResponse attributes;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for token.
         * @param  token  String value for token.
         * @return Builder
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

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
         * Setter for emailAddress.
         * @param  emailAddress  String value for emailAddress.
         * @return Builder
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Setter for phoneNumber.
         * @param  phoneNumber  PhoneNumber value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(PhoneNumber phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Setter for card.
         * @param  card  ApplePayCardResponse value for card.
         * @return Builder
         */
        public Builder card(ApplePayCardResponse card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for attributes.
         * @param  attributes  ApplePayAttributesResponse value for attributes.
         * @return Builder
         */
        public Builder attributes(ApplePayAttributesResponse attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Builds a new {@link ApplePayPaymentObject} object using the set fields.
         * @return {@link ApplePayPaymentObject}
         */
        public ApplePayPaymentObject build() {
            return new ApplePayPaymentObject(id, token, name, emailAddress, phoneNumber, card,
                    attributes);
        }
    }
}
