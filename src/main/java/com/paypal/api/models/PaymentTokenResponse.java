/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for PaymentTokenResponse type.
 */
public class PaymentTokenResponse {
    private String id;
    private CustomerRequest customer;
    private PaymentTokenResponsePaymentSource paymentSource;
    private List<LinkDescription> links;

    /**
     * Default constructor.
     */
    public PaymentTokenResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  customer  CustomerRequest value for customer.
     * @param  paymentSource  PaymentTokenResponsePaymentSource value for paymentSource.
     * @param  links  List of LinkDescription value for links.
     */
    public PaymentTokenResponse(
            String id,
            CustomerRequest customer,
            PaymentTokenResponsePaymentSource paymentSource,
            List<LinkDescription> links) {
        this.id = id;
        this.customer = customer;
        this.paymentSource = paymentSource;
        this.links = links;
    }

    /**
     * Getter for Id.
     * The PayPal-generated ID for the vault token.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The PayPal-generated ID for the vault token.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
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
     * The vaulted payment method details.
     * @return Returns the PaymentTokenResponsePaymentSource
     */
    @JsonGetter("payment_source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentTokenResponsePaymentSource getPaymentSource() {
        return paymentSource;
    }

    /**
     * Setter for PaymentSource.
     * The vaulted payment method details.
     * @param paymentSource Value for PaymentTokenResponsePaymentSource
     */
    @JsonSetter("payment_source")
    public void setPaymentSource(PaymentTokenResponsePaymentSource paymentSource) {
        this.paymentSource = paymentSource;
    }

    /**
     * Getter for Links.
     * An array of related [HATEOAS links](/api/rest/responses/#hateoas).
     * @return Returns the List of LinkDescription
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LinkDescription> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * An array of related [HATEOAS links](/api/rest/responses/#hateoas).
     * @param links Value for List of LinkDescription
     */
    @JsonSetter("links")
    public void setLinks(List<LinkDescription> links) {
        this.links = links;
    }

    /**
     * Converts this PaymentTokenResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentTokenResponse [" + "id=" + id + ", customer=" + customer + ", paymentSource="
                + paymentSource + ", links=" + links + "]";
    }

    /**
     * Builds a new {@link PaymentTokenResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentTokenResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .customer(getCustomer())
                .paymentSource(getPaymentSource())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentTokenResponse}.
     */
    public static class Builder {
        private String id;
        private CustomerRequest customer;
        private PaymentTokenResponsePaymentSource paymentSource;
        private List<LinkDescription> links;



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
         * Setter for customer.
         * @param  customer  CustomerRequest value for customer.
         * @return Builder
         */
        public Builder customer(CustomerRequest customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for paymentSource.
         * @param  paymentSource  PaymentTokenResponsePaymentSource value for paymentSource.
         * @return Builder
         */
        public Builder paymentSource(PaymentTokenResponsePaymentSource paymentSource) {
            this.paymentSource = paymentSource;
            return this;
        }

        /**
         * Setter for links.
         * @param  links  List of LinkDescription value for links.
         * @return Builder
         */
        public Builder links(List<LinkDescription> links) {
            this.links = links;
            return this;
        }

        /**
         * Builds a new {@link PaymentTokenResponse} object using the set fields.
         * @return {@link PaymentTokenResponse}
         */
        public PaymentTokenResponse build() {
            return new PaymentTokenResponse(id, customer, paymentSource, links);
        }
    }
}
