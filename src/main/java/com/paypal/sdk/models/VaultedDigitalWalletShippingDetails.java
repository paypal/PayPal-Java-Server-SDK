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
 * This is a model class for VaultedDigitalWalletShippingDetails type.
 */
public class VaultedDigitalWalletShippingDetails {
    private ShippingName name;
    private PhoneNumberWithCountryCode phoneNumber;
    private FulfillmentType type;
    private Address address;

    /**
     * Default constructor.
     */
    public VaultedDigitalWalletShippingDetails() {
    }

    /**
     * Initialization constructor.
     * @param  name  ShippingName value for name.
     * @param  phoneNumber  PhoneNumberWithCountryCode value for phoneNumber.
     * @param  type  FulfillmentType value for type.
     * @param  address  Address value for address.
     */
    public VaultedDigitalWalletShippingDetails(
            ShippingName name,
            PhoneNumberWithCountryCode phoneNumber,
            FulfillmentType type,
            Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.address = address;
    }

    /**
     * Getter for Name.
     * The name of the party.
     * @return Returns the ShippingName
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingName getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the party.
     * @param name Value for ShippingName
     */
    @JsonSetter("name")
    public void setName(ShippingName name) {
        this.name = name;
    }

    /**
     * Getter for PhoneNumber.
     * The phone number, in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en).
     * @return Returns the PhoneNumberWithCountryCode
     */
    @JsonGetter("phone_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PhoneNumberWithCountryCode getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * The phone number, in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en).
     * @param phoneNumber Value for PhoneNumberWithCountryCode
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber(PhoneNumberWithCountryCode phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for Type.
     * A classification for the method of purchase fulfillment (e.g shipping, in-store pickup, etc).
     * Either `type` or `options` may be present, but not both.
     * @return Returns the FulfillmentType
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FulfillmentType getType() {
        return type;
    }

    /**
     * Setter for Type.
     * A classification for the method of purchase fulfillment (e.g shipping, in-store pickup, etc).
     * Either `type` or `options` may be present, but not both.
     * @param type Value for FulfillmentType
     */
    @JsonSetter("type")
    public void setType(FulfillmentType type) {
        this.type = type;
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
     * Converts this VaultedDigitalWalletShippingDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VaultedDigitalWalletShippingDetails [" + "name=" + name + ", phoneNumber="
                + phoneNumber + ", type=" + type + ", address=" + address + "]";
    }

    /**
     * Builds a new {@link VaultedDigitalWalletShippingDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VaultedDigitalWalletShippingDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .phoneNumber(getPhoneNumber())
                .type(getType())
                .address(getAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link VaultedDigitalWalletShippingDetails}.
     */
    public static class Builder {
        private ShippingName name;
        private PhoneNumberWithCountryCode phoneNumber;
        private FulfillmentType type;
        private Address address;



        /**
         * Setter for name.
         * @param  name  ShippingName value for name.
         * @return Builder
         */
        public Builder name(ShippingName name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for phoneNumber.
         * @param  phoneNumber  PhoneNumberWithCountryCode value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(PhoneNumberWithCountryCode phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  FulfillmentType value for type.
         * @return Builder
         */
        public Builder type(FulfillmentType type) {
            this.type = type;
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
         * Builds a new {@link VaultedDigitalWalletShippingDetails} object using the set fields.
         * @return {@link VaultedDigitalWalletShippingDetails}
         */
        public VaultedDigitalWalletShippingDetails build() {
            return new VaultedDigitalWalletShippingDetails(name, phoneNumber, type, address);
        }
    }
}
