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
 * This is a model class for SetupTokenRequest type.
 */
public class SetupTokenRequest {
    private CustomerRequest customer;
    private SetupTokenRequestPaymentSource paymentSource;

    /**
     * Default constructor.
     */
    public SetupTokenRequest() {
    }

    /**
     * Initialization constructor.
     * @param  paymentSource  SetupTokenRequestPaymentSource value for paymentSource.
     * @param  customer  CustomerRequest value for customer.
     */
    public SetupTokenRequest(
            SetupTokenRequestPaymentSource paymentSource,
            CustomerRequest customer) {
        this.customer = customer;
        this.paymentSource = paymentSource;
    }

    /**
     * Getter for Customer.
     * Customer in merchant's or partner's system of records.
     * @return Returns the CustomerRequest
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerRequest getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * Customer in merchant's or partner's system of records.
     * @param customer Value for CustomerRequest
     */
    @JsonSetter("customer")
    public void setCustomer(CustomerRequest customer) {
        this.customer = customer;
    }

    /**
     * Getter for PaymentSource.
     * The payment method to vault with the instrument details.
     * @return Returns the SetupTokenRequestPaymentSource
     */
    @JsonGetter("payment_source")
    public SetupTokenRequestPaymentSource getPaymentSource() {
        return paymentSource;
    }

    /**
     * Setter for PaymentSource.
     * The payment method to vault with the instrument details.
     * @param paymentSource Value for SetupTokenRequestPaymentSource
     */
    @JsonSetter("payment_source")
    public void setPaymentSource(SetupTokenRequestPaymentSource paymentSource) {
        this.paymentSource = paymentSource;
    }

    /**
     * Converts this SetupTokenRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SetupTokenRequest [" + "paymentSource=" + paymentSource + ", customer=" + customer
                + "]";
    }

    /**
     * Builds a new {@link SetupTokenRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SetupTokenRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentSource)
                .customer(getCustomer());
        return builder;
    }

    /**
     * Class to build instances of {@link SetupTokenRequest}.
     */
    public static class Builder {
        private SetupTokenRequestPaymentSource paymentSource;
        private CustomerRequest customer;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentSource  SetupTokenRequestPaymentSource value for paymentSource.
         */
        public Builder(SetupTokenRequestPaymentSource paymentSource) {
            this.paymentSource = paymentSource;
        }

        /**
         * Setter for paymentSource.
         * @param  paymentSource  SetupTokenRequestPaymentSource value for paymentSource.
         * @return Builder
         */
        public Builder paymentSource(SetupTokenRequestPaymentSource paymentSource) {
            this.paymentSource = paymentSource;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  CustomerRequest value for customer.
         * @return Builder
         */
        public Builder customer(CustomerRequest customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Builds a new {@link SetupTokenRequest} object using the set fields.
         * @return {@link SetupTokenRequest}
         */
        public SetupTokenRequest build() {
            return new SetupTokenRequest(paymentSource, customer);
        }
    }
}
