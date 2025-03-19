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
 * This is a model class for PaymentTokenRequest type.
 */
public class PaymentTokenRequest {
    private Customer customer;
    private PaymentTokenRequestPaymentSource paymentSource;

    /**
     * Default constructor.
     */
    public PaymentTokenRequest() {
    }

    /**
     * Initialization constructor.
     * @param  paymentSource  PaymentTokenRequestPaymentSource value for paymentSource.
     * @param  customer  Customer value for customer.
     */
    public PaymentTokenRequest(
            PaymentTokenRequestPaymentSource paymentSource,
            Customer customer) {
        this.customer = customer;
        this.paymentSource = paymentSource;
    }

    /**
     * Getter for Customer.
     * This object defines a customer in your system. Use it to manage customer profiles, save
     * payment methods and contact details.
     * @return Returns the Customer
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * This object defines a customer in your system. Use it to manage customer profiles, save
     * payment methods and contact details.
     * @param customer Value for Customer
     */
    @JsonSetter("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Getter for PaymentSource.
     * The payment method to vault with the instrument details.
     * @return Returns the PaymentTokenRequestPaymentSource
     */
    @JsonGetter("payment_source")
    public PaymentTokenRequestPaymentSource getPaymentSource() {
        return paymentSource;
    }

    /**
     * Setter for PaymentSource.
     * The payment method to vault with the instrument details.
     * @param paymentSource Value for PaymentTokenRequestPaymentSource
     */
    @JsonSetter("payment_source")
    public void setPaymentSource(PaymentTokenRequestPaymentSource paymentSource) {
        this.paymentSource = paymentSource;
    }

    /**
     * Converts this PaymentTokenRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentTokenRequest [" + "paymentSource=" + paymentSource + ", customer=" + customer
                + "]";
    }

    /**
     * Builds a new {@link PaymentTokenRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentTokenRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentSource)
                .customer(getCustomer());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentTokenRequest}.
     */
    public static class Builder {
        private PaymentTokenRequestPaymentSource paymentSource;
        private Customer customer;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentSource  PaymentTokenRequestPaymentSource value for paymentSource.
         */
        public Builder(PaymentTokenRequestPaymentSource paymentSource) {
            this.paymentSource = paymentSource;
        }

        /**
         * Setter for paymentSource.
         * @param  paymentSource  PaymentTokenRequestPaymentSource value for paymentSource.
         * @return Builder
         */
        public Builder paymentSource(PaymentTokenRequestPaymentSource paymentSource) {
            this.paymentSource = paymentSource;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  Customer value for customer.
         * @return Builder
         */
        public Builder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Builds a new {@link PaymentTokenRequest} object using the set fields.
         * @return {@link PaymentTokenRequest}
         */
        public PaymentTokenRequest build() {
            return new PaymentTokenRequest(paymentSource, customer);
        }
    }
}
