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
 * This is a model class for PaypalWalletVaultResponse type.
 */
public class PaypalWalletVaultResponse {
    private String id;
    private PaypalWalletVaultStatus status;
    private List<LinkDescription> links;
    private PaypalWalletCustomer customer;

    /**
     * Default constructor.
     */
    public PaypalWalletVaultResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  status  PaypalWalletVaultStatus value for status.
     * @param  links  List of LinkDescription value for links.
     * @param  customer  PaypalWalletCustomer value for customer.
     */
    public PaypalWalletVaultResponse(
            String id,
            PaypalWalletVaultStatus status,
            List<LinkDescription> links,
            PaypalWalletCustomer customer) {
        this.id = id;
        this.status = status;
        this.links = links;
        this.customer = customer;
    }

    /**
     * Getter for Id.
     * The PayPal-generated ID for the saved payment source.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The PayPal-generated ID for the saved payment source.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Status.
     * The vault status.
     * @return Returns the PaypalWalletVaultStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalWalletVaultStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The vault status.
     * @param status Value for PaypalWalletVaultStatus
     */
    @JsonSetter("status")
    public void setStatus(PaypalWalletVaultStatus status) {
        this.status = status;
    }

    /**
     * Getter for Links.
     * An array of request-related HATEOAS links.
     * @return Returns the List of LinkDescription
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LinkDescription> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * An array of request-related HATEOAS links.
     * @param links Value for List of LinkDescription
     */
    @JsonSetter("links")
    public void setLinks(List<LinkDescription> links) {
        this.links = links;
    }

    /**
     * Getter for Customer.
     * The details about a customer in PayPal's system of record.
     * @return Returns the PaypalWalletCustomer
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalWalletCustomer getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * The details about a customer in PayPal's system of record.
     * @param customer Value for PaypalWalletCustomer
     */
    @JsonSetter("customer")
    public void setCustomer(PaypalWalletCustomer customer) {
        this.customer = customer;
    }

    /**
     * Converts this PaypalWalletVaultResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaypalWalletVaultResponse [" + "id=" + id + ", status=" + status + ", links="
                + links + ", customer=" + customer + "]";
    }

    /**
     * Builds a new {@link PaypalWalletVaultResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaypalWalletVaultResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .status(getStatus())
                .links(getLinks())
                .customer(getCustomer());
        return builder;
    }

    /**
     * Class to build instances of {@link PaypalWalletVaultResponse}.
     */
    public static class Builder {
        private String id;
        private PaypalWalletVaultStatus status;
        private List<LinkDescription> links;
        private PaypalWalletCustomer customer;



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
         * Setter for status.
         * @param  status  PaypalWalletVaultStatus value for status.
         * @return Builder
         */
        public Builder status(PaypalWalletVaultStatus status) {
            this.status = status;
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
         * Setter for customer.
         * @param  customer  PaypalWalletCustomer value for customer.
         * @return Builder
         */
        public Builder customer(PaypalWalletCustomer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Builds a new {@link PaypalWalletVaultResponse} object using the set fields.
         * @return {@link PaypalWalletVaultResponse}
         */
        public PaypalWalletVaultResponse build() {
            return new PaypalWalletVaultResponse(id, status, links, customer);
        }
    }
}
