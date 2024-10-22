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
 * This is a model class for CustomerVaultPaymentTokensResponse type.
 */
public class CustomerVaultPaymentTokensResponse {
    private Integer totalItems;
    private Integer totalPages;
    private CustomerRequest customer;
    private List<PaymentTokenResponse> paymentTokens;
    private List<LinkDescription> links;

    /**
     * Default constructor.
     */
    public CustomerVaultPaymentTokensResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalItems  Integer value for totalItems.
     * @param  totalPages  Integer value for totalPages.
     * @param  customer  CustomerRequest value for customer.
     * @param  paymentTokens  List of PaymentTokenResponse value for paymentTokens.
     * @param  links  List of LinkDescription value for links.
     */
    public CustomerVaultPaymentTokensResponse(
            Integer totalItems,
            Integer totalPages,
            CustomerRequest customer,
            List<PaymentTokenResponse> paymentTokens,
            List<LinkDescription> links) {
        this.totalItems = totalItems;
        this.totalPages = totalPages;
        this.customer = customer;
        this.paymentTokens = paymentTokens;
        this.links = links;
    }

    /**
     * Getter for TotalItems.
     * Total number of items.
     * @return Returns the Integer
     */
    @JsonGetter("total_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalItems() {
        return totalItems;
    }

    /**
     * Setter for TotalItems.
     * Total number of items.
     * @param totalItems Value for Integer
     */
    @JsonSetter("total_items")
    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    /**
     * Getter for TotalPages.
     * Total number of pages.
     * @return Returns the Integer
     */
    @JsonGetter("total_pages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Setter for TotalPages.
     * Total number of pages.
     * @param totalPages Value for Integer
     */
    @JsonSetter("total_pages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
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
     * Getter for PaymentTokens.
     * @return Returns the List of PaymentTokenResponse
     */
    @JsonGetter("payment_tokens")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PaymentTokenResponse> getPaymentTokens() {
        return paymentTokens;
    }

    /**
     * Setter for PaymentTokens.
     * @param paymentTokens Value for List of PaymentTokenResponse
     */
    @JsonSetter("payment_tokens")
    public void setPaymentTokens(List<PaymentTokenResponse> paymentTokens) {
        this.paymentTokens = paymentTokens;
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
     * Converts this CustomerVaultPaymentTokensResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerVaultPaymentTokensResponse [" + "totalItems=" + totalItems + ", totalPages="
                + totalPages + ", customer=" + customer + ", paymentTokens=" + paymentTokens
                + ", links=" + links + "]";
    }

    /**
     * Builds a new {@link CustomerVaultPaymentTokensResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerVaultPaymentTokensResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .totalItems(getTotalItems())
                .totalPages(getTotalPages())
                .customer(getCustomer())
                .paymentTokens(getPaymentTokens())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerVaultPaymentTokensResponse}.
     */
    public static class Builder {
        private Integer totalItems;
        private Integer totalPages;
        private CustomerRequest customer;
        private List<PaymentTokenResponse> paymentTokens;
        private List<LinkDescription> links;



        /**
         * Setter for totalItems.
         * @param  totalItems  Integer value for totalItems.
         * @return Builder
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * Setter for totalPages.
         * @param  totalPages  Integer value for totalPages.
         * @return Builder
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
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
         * Setter for paymentTokens.
         * @param  paymentTokens  List of PaymentTokenResponse value for paymentTokens.
         * @return Builder
         */
        public Builder paymentTokens(List<PaymentTokenResponse> paymentTokens) {
            this.paymentTokens = paymentTokens;
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
         * Builds a new {@link CustomerVaultPaymentTokensResponse} object using the set fields.
         * @return {@link CustomerVaultPaymentTokensResponse}
         */
        public CustomerVaultPaymentTokensResponse build() {
            return new CustomerVaultPaymentTokensResponse(totalItems, totalPages, customer,
                    paymentTokens, links);
        }
    }
}
