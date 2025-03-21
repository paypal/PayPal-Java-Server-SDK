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
 * This is a model class for ShippingWithTrackingDetails type.
 */
public class ShippingWithTrackingDetails {
    private ShippingName name;
    private String emailAddress;
    private PhoneNumberWithCountryCode phoneNumber;
    private FulfillmentType type;
    private List<ShippingOption> options;
    private Address address;
    private List<OrderTrackerResponse> trackers;

    /**
     * Default constructor.
     */
    public ShippingWithTrackingDetails() {
    }

    /**
     * Initialization constructor.
     * @param  name  ShippingName value for name.
     * @param  emailAddress  String value for emailAddress.
     * @param  phoneNumber  PhoneNumberWithCountryCode value for phoneNumber.
     * @param  type  FulfillmentType value for type.
     * @param  options  List of ShippingOption value for options.
     * @param  address  Address value for address.
     * @param  trackers  List of OrderTrackerResponse value for trackers.
     */
    public ShippingWithTrackingDetails(
            ShippingName name,
            String emailAddress,
            PhoneNumberWithCountryCode phoneNumber,
            FulfillmentType type,
            List<ShippingOption> options,
            Address address,
            List<OrderTrackerResponse> trackers) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.options = options;
        this.address = address;
        this.trackers = trackers;
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
     * Getter for EmailAddress.
     * The internationalized email address. Note: Up to 64 characters are allowed before and 255
     * characters are allowed after the {@literal @} sign. However, the generally accepted maximum length for
     * an email address is 254 characters. The pattern verifies that an unquoted {@literal @} sign exists.
     * @return Returns the String
     */
    @JsonGetter("email_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for EmailAddress.
     * The internationalized email address. Note: Up to 64 characters are allowed before and 255
     * characters are allowed after the {@literal @} sign. However, the generally accepted maximum length for
     * an email address is 254 characters. The pattern verifies that an unquoted {@literal @} sign exists.
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
     * Getter for Trackers.
     * An array of trackers for a transaction.
     * @return Returns the List of OrderTrackerResponse
     */
    @JsonGetter("trackers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderTrackerResponse> getTrackers() {
        return trackers;
    }

    /**
     * Setter for Trackers.
     * An array of trackers for a transaction.
     * @param trackers Value for List of OrderTrackerResponse
     */
    @JsonSetter("trackers")
    public void setTrackers(List<OrderTrackerResponse> trackers) {
        this.trackers = trackers;
    }

    /**
     * Converts this ShippingWithTrackingDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ShippingWithTrackingDetails [" + "name=" + name + ", emailAddress=" + emailAddress
                + ", phoneNumber=" + phoneNumber + ", type=" + type + ", options=" + options
                + ", address=" + address + ", trackers=" + trackers + "]";
    }

    /**
     * Builds a new {@link ShippingWithTrackingDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ShippingWithTrackingDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .emailAddress(getEmailAddress())
                .phoneNumber(getPhoneNumber())
                .type(getType())
                .options(getOptions())
                .address(getAddress())
                .trackers(getTrackers());
        return builder;
    }

    /**
     * Class to build instances of {@link ShippingWithTrackingDetails}.
     */
    public static class Builder {
        private ShippingName name;
        private String emailAddress;
        private PhoneNumberWithCountryCode phoneNumber;
        private FulfillmentType type;
        private List<ShippingOption> options;
        private Address address;
        private List<OrderTrackerResponse> trackers;



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
         * Setter for trackers.
         * @param  trackers  List of OrderTrackerResponse value for trackers.
         * @return Builder
         */
        public Builder trackers(List<OrderTrackerResponse> trackers) {
            this.trackers = trackers;
            return this;
        }

        /**
         * Builds a new {@link ShippingWithTrackingDetails} object using the set fields.
         * @return {@link ShippingWithTrackingDetails}
         */
        public ShippingWithTrackingDetails build() {
            return new ShippingWithTrackingDetails(name, emailAddress, phoneNumber, type, options,
                    address, trackers);
        }
    }
}
