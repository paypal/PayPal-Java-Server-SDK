/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ShippingDetails type.
 */
public class ShippingDetails {
    private ShippingName name;
    private PhoneNumberWithCountryCode phoneNumber;
    private FullfillmentType type;
    private List<ShippingOption> options;
    private Address address;

    /**
     * Default constructor.
     */
    public ShippingDetails() {
    }

    /**
     * Initialization constructor.
     * @param  name  ShippingName value for name.
     * @param  phoneNumber  PhoneNumberWithCountryCode value for phoneNumber.
     * @param  type  FullfillmentType value for type.
     * @param  options  List of ShippingOption value for options.
     * @param  address  Address value for address.
     */
    public ShippingDetails(
            ShippingName name,
            PhoneNumberWithCountryCode phoneNumber,
            FullfillmentType type,
            List<ShippingOption> options,
            Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.options = options;
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
     * The phone number in its canonical international [E.164 numbering plan
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
     * The phone number in its canonical international [E.164 numbering plan
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
     * @return Returns the FullfillmentType
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FullfillmentType getType() {
        return type;
    }

    /**
     * Setter for Type.
     * A classification for the method of purchase fulfillment (e.g shipping, in-store pickup, etc).
     * Either `type` or `options` may be present, but not both.
     * @param type Value for FullfillmentType
     */
    @JsonSetter("type")
    public void setType(FullfillmentType type) {
        this.type = type;
    }

    /**
     * Getter for Options.
     * An array of shipping options that the payee or merchant offers to the payer to ship or pick
     * up their items.
     * @return Returns the List of ShippingOption
     */
    @JsonGetter("options")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ShippingOption> getOptions() {
        return options;
    }

    /**
     * Setter for Options.
     * An array of shipping options that the payee or merchant offers to the payer to ship or pick
     * up their items.
     * @param options Value for List of ShippingOption
     */
    @JsonSetter("options")
    public void setOptions(List<ShippingOption> options) {
        this.options = options;
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
     * Converts this ShippingDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ShippingDetails [" + "name=" + name + ", phoneNumber=" + phoneNumber + ", type="
                + type + ", options=" + options + ", address=" + address + "]";
    }

    /**
     * Builds a new {@link ShippingDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ShippingDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .phoneNumber(getPhoneNumber())
                .type(getType())
                .options(getOptions())
                .address(getAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link ShippingDetails}.
     */
    public static class Builder {
        private ShippingName name;
        private PhoneNumberWithCountryCode phoneNumber;
        private FullfillmentType type;
        private List<ShippingOption> options;
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
         * @param  type  FullfillmentType value for type.
         * @return Builder
         */
        public Builder type(FullfillmentType type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for options.
         * @param  options  List of ShippingOption value for options.
         * @return Builder
         */
        public Builder options(List<ShippingOption> options) {
            this.options = options;
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
         * Builds a new {@link ShippingDetails} object using the set fields.
         * @return {@link ShippingDetails}
         */
        public ShippingDetails build() {
            return new ShippingDetails(name, phoneNumber, type, options, address);
        }
    }
}
