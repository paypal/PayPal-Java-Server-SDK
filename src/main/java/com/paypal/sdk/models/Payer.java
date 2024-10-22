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
 * This is a model class for Payer type.
 */
public class Payer {
    private String emailAddress;
    private String payerId;
    private Name name;
    private PhoneWithType phone;
    private String birthDate;
    private TaxInfo taxInfo;
    private Address address;

    /**
     * Default constructor.
     */
    public Payer() {
    }

    /**
     * Initialization constructor.
     * @param  emailAddress  String value for emailAddress.
     * @param  payerId  String value for payerId.
     * @param  name  Name value for name.
     * @param  phone  PhoneWithType value for phone.
     * @param  birthDate  String value for birthDate.
     * @param  taxInfo  TaxInfo value for taxInfo.
     * @param  address  Address value for address.
     */
    public Payer(
            String emailAddress,
            String payerId,
            Name name,
            PhoneWithType phone,
            String birthDate,
            TaxInfo taxInfo,
            Address address) {
        this.emailAddress = emailAddress;
        this.payerId = payerId;
        this.name = name;
        this.phone = phone;
        this.birthDate = birthDate;
        this.taxInfo = taxInfo;
        this.address = address;
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
     * Getter for PayerId.
     * The account identifier for a PayPal account.
     * @return Returns the String
     */
    @JsonGetter("payer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * The account identifier for a PayPal account.
     * @param payerId Value for String
     */
    @JsonSetter("payer_id")
    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    /**
     * Getter for Name.
     * The name of the party.
     * @return Returns the Name
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Name getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the party.
     * @param name Value for Name
     */
    @JsonSetter("name")
    public void setName(Name name) {
        this.name = name;
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
     * Getter for BirthDate.
     * The stand-alone date, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values,
     * such as a date of birth, you should use dates with no associated time or time-zone data.
     * Whenever possible, use the standard `date_time` type. This regular expression does not
     * validate all dates. For example, February 31 is valid and nothing is known about leap years.
     * @return Returns the String
     */
    @JsonGetter("birth_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Setter for BirthDate.
     * The stand-alone date, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values,
     * such as a date of birth, you should use dates with no associated time or time-zone data.
     * Whenever possible, use the standard `date_time` type. This regular expression does not
     * validate all dates. For example, February 31 is valid and nothing is known about leap years.
     * @param birthDate Value for String
     */
    @JsonSetter("birth_date")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Getter for TaxInfo.
     * The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and
     * `tax_id_type` are required.
     * @return Returns the TaxInfo
     */
    @JsonGetter("tax_info")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxInfo getTaxInfo() {
        return taxInfo;
    }

    /**
     * Setter for TaxInfo.
     * The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and
     * `tax_id_type` are required.
     * @param taxInfo Value for TaxInfo
     */
    @JsonSetter("tax_info")
    public void setTaxInfo(TaxInfo taxInfo) {
        this.taxInfo = taxInfo;
    }

    /**
     * Getter for Address.
     * The portable international postal address. Maps to
     * [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata)
     * and HTML 5.1 [Autofilling form controls: the autocomplete
     * attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
     * @return Returns the Address
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * The portable international postal address. Maps to
     * [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata)
     * and HTML 5.1 [Autofilling form controls: the autocomplete
     * attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
     * @param address Value for Address
     */
    @JsonSetter("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Converts this Payer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Payer [" + "emailAddress=" + emailAddress + ", payerId=" + payerId + ", name="
                + name + ", phone=" + phone + ", birthDate=" + birthDate + ", taxInfo=" + taxInfo
                + ", address=" + address + "]";
    }

    /**
     * Builds a new {@link Payer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Payer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .emailAddress(getEmailAddress())
                .payerId(getPayerId())
                .name(getName())
                .phone(getPhone())
                .birthDate(getBirthDate())
                .taxInfo(getTaxInfo())
                .address(getAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link Payer}.
     */
    public static class Builder {
        private String emailAddress;
        private String payerId;
        private Name name;
        private PhoneWithType phone;
        private String birthDate;
        private TaxInfo taxInfo;
        private Address address;



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
         * Setter for payerId.
         * @param  payerId  String value for payerId.
         * @return Builder
         */
        public Builder payerId(String payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  Name value for name.
         * @return Builder
         */
        public Builder name(Name name) {
            this.name = name;
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
         * Setter for birthDate.
         * @param  birthDate  String value for birthDate.
         * @return Builder
         */
        public Builder birthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        /**
         * Setter for taxInfo.
         * @param  taxInfo  TaxInfo value for taxInfo.
         * @return Builder
         */
        public Builder taxInfo(TaxInfo taxInfo) {
            this.taxInfo = taxInfo;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  Address value for address.
         * @return Builder
         */
        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        /**
         * Builds a new {@link Payer} object using the set fields.
         * @return {@link Payer}
         */
        public Payer build() {
            return new Payer(emailAddress, payerId, name, phone, birthDate, taxInfo, address);
        }
    }
}
