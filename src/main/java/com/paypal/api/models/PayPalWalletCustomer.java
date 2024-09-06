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
 * This is a model class for PayPalWalletCustomer type.
 */
public class PayPalWalletCustomer {
    private String id;
    private String emailAddress;
    private PhoneWithType phone;
    private String merchantCustomerId;

    /**
     * Default constructor.
     */
    public PayPalWalletCustomer() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  emailAddress  String value for emailAddress.
     * @param  phone  PhoneWithType value for phone.
     * @param  merchantCustomerId  String value for merchantCustomerId.
     */
    public PayPalWalletCustomer(
            String id,
            String emailAddress,
            PhoneWithType phone,
            String merchantCustomerId) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.merchantCustomerId = merchantCustomerId;
    }

    /**
     * Getter for Id.
     * The unique ID for a customer generated by PayPal.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The unique ID for a customer generated by PayPal.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
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
     * Getter for Phone.
     * The phone information.
     * @return Returns the PhoneWithType
     */
    @JsonGetter("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PhoneWithType getPhone() {
        return phone;
    }

    /**
     * Setter for Phone.
     * The phone information.
     * @param phone Value for PhoneWithType
     */
    @JsonSetter("phone")
    public void setPhone(PhoneWithType phone) {
        this.phone = phone;
    }

    /**
     * Getter for MerchantCustomerId.
     * Merchants and partners may already have a data-store where their customer information is
     * persisted. Use merchant_customer_id to associate the PayPal-generated customer.id to your
     * representation of a customer.
     * @return Returns the String
     */
    @JsonGetter("merchant_customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMerchantCustomerId() {
        return merchantCustomerId;
    }

    /**
     * Setter for MerchantCustomerId.
     * Merchants and partners may already have a data-store where their customer information is
     * persisted. Use merchant_customer_id to associate the PayPal-generated customer.id to your
     * representation of a customer.
     * @param merchantCustomerId Value for String
     */
    @JsonSetter("merchant_customer_id")
    public void setMerchantCustomerId(String merchantCustomerId) {
        this.merchantCustomerId = merchantCustomerId;
    }

    /**
     * Converts this PayPalWalletCustomer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayPalWalletCustomer [" + "id=" + id + ", emailAddress=" + emailAddress + ", phone="
                + phone + ", merchantCustomerId=" + merchantCustomerId + "]";
    }

    /**
     * Builds a new {@link PayPalWalletCustomer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PayPalWalletCustomer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .emailAddress(getEmailAddress())
                .phone(getPhone())
                .merchantCustomerId(getMerchantCustomerId());
        return builder;
    }

    /**
     * Class to build instances of {@link PayPalWalletCustomer}.
     */
    public static class Builder {
        private String id;
        private String emailAddress;
        private PhoneWithType phone;
        private String merchantCustomerId;



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
         * Setter for emailAddress.
         * @param  emailAddress  String value for emailAddress.
         * @return Builder
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Setter for phone.
         * @param  phone  PhoneWithType value for phone.
         * @return Builder
         */
        public Builder phone(PhoneWithType phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Setter for merchantCustomerId.
         * @param  merchantCustomerId  String value for merchantCustomerId.
         * @return Builder
         */
        public Builder merchantCustomerId(String merchantCustomerId) {
            this.merchantCustomerId = merchantCustomerId;
            return this;
        }

        /**
         * Builds a new {@link PayPalWalletCustomer} object using the set fields.
         * @return {@link PayPalWalletCustomer}
         */
        public PayPalWalletCustomer build() {
            return new PayPalWalletCustomer(id, emailAddress, phone, merchantCustomerId);
        }
    }
}
