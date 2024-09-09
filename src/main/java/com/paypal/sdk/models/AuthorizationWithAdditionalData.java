/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for AuthorizationWithAdditionalData type.
 */
public class AuthorizationWithAdditionalData {
    private AuthorizationStatus status;
    private AuthorizationStatusDetails statusDetails;
    private String id;
    private Money amount;
    private String invoiceId;
    private String customId;
    private NetworkTransactionReference networkTransactionReference;
    private SellerProtection sellerProtection;
    private String expirationTime;
    private List<LinkDescription> links;
    private String createTime;
    private String updateTime;
    private ProcessorResponse processorResponse;

    /**
     * Default constructor.
     */
    public AuthorizationWithAdditionalData() {
    }

    /**
     * Initialization constructor.
     * @param  status  AuthorizationStatus value for status.
     * @param  statusDetails  AuthorizationStatusDetails value for statusDetails.
     * @param  id  String value for id.
     * @param  amount  Money value for amount.
     * @param  invoiceId  String value for invoiceId.
     * @param  customId  String value for customId.
     * @param  networkTransactionReference  NetworkTransactionReference value for
     *         networkTransactionReference.
     * @param  sellerProtection  SellerProtection value for sellerProtection.
     * @param  expirationTime  String value for expirationTime.
     * @param  links  List of LinkDescription value for links.
     * @param  createTime  String value for createTime.
     * @param  updateTime  String value for updateTime.
     * @param  processorResponse  ProcessorResponse value for processorResponse.
     */
    public AuthorizationWithAdditionalData(
            AuthorizationStatus status,
            AuthorizationStatusDetails statusDetails,
            String id,
            Money amount,
            String invoiceId,
            String customId,
            NetworkTransactionReference networkTransactionReference,
            SellerProtection sellerProtection,
            String expirationTime,
            List<LinkDescription> links,
            String createTime,
            String updateTime,
            ProcessorResponse processorResponse) {
        this.status = status;
        this.statusDetails = statusDetails;
        this.id = id;
        this.amount = amount;
        this.invoiceId = invoiceId;
        this.customId = customId;
        this.networkTransactionReference = networkTransactionReference;
        this.sellerProtection = sellerProtection;
        this.expirationTime = expirationTime;
        this.links = links;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.processorResponse = processorResponse;
    }

    /**
     * Getter for Status.
     * The status for the authorized payment.
     * @return Returns the AuthorizationStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The status for the authorized payment.
     * @param status Value for AuthorizationStatus
     */
    @JsonSetter("status")
    public void setStatus(AuthorizationStatus status) {
        this.status = status;
    }

    /**
     * Getter for StatusDetails.
     * The details of the authorized payment status.
     * @return Returns the AuthorizationStatusDetails
     */
    @JsonGetter("status_details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationStatusDetails getStatusDetails() {
        return statusDetails;
    }

    /**
     * Setter for StatusDetails.
     * The details of the authorized payment status.
     * @param statusDetails Value for AuthorizationStatusDetails
     */
    @JsonSetter("status_details")
    public void setStatusDetails(AuthorizationStatusDetails statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * Getter for Id.
     * The PayPal-generated ID for the authorized payment.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The PayPal-generated ID for the authorized payment.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Amount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @return Returns the Money
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @param amount Value for Money
     */
    @JsonSetter("amount")
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    /**
     * Getter for InvoiceId.
     * The API caller-provided external invoice number for this order. Appears in both the payer's
     * transaction history and the emails that the payer receives.
     * @return Returns the String
     */
    @JsonGetter("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Setter for InvoiceId.
     * The API caller-provided external invoice number for this order. Appears in both the payer's
     * transaction history and the emails that the payer receives.
     * @param invoiceId Value for String
     */
    @JsonSetter("invoice_id")
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * Getter for CustomId.
     * The API caller-provided external ID. Used to reconcile API caller-initiated transactions with
     * PayPal transactions. Appears in transaction and settlement reports.
     * @return Returns the String
     */
    @JsonGetter("custom_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomId() {
        return customId;
    }

    /**
     * Setter for CustomId.
     * The API caller-provided external ID. Used to reconcile API caller-initiated transactions with
     * PayPal transactions. Appears in transaction and settlement reports.
     * @param customId Value for String
     */
    @JsonSetter("custom_id")
    public void setCustomId(String customId) {
        this.customId = customId;
    }

    /**
     * Getter for NetworkTransactionReference.
     * Reference values used by the card network to identify a transaction.
     * @return Returns the NetworkTransactionReference
     */
    @JsonGetter("network_transaction_reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NetworkTransactionReference getNetworkTransactionReference() {
        return networkTransactionReference;
    }

    /**
     * Setter for NetworkTransactionReference.
     * Reference values used by the card network to identify a transaction.
     * @param networkTransactionReference Value for NetworkTransactionReference
     */
    @JsonSetter("network_transaction_reference")
    public void setNetworkTransactionReference(NetworkTransactionReference networkTransactionReference) {
        this.networkTransactionReference = networkTransactionReference;
    }

    /**
     * Getter for SellerProtection.
     * The level of protection offered as defined by [PayPal Seller Protection for
     * Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
     * @return Returns the SellerProtection
     */
    @JsonGetter("seller_protection")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerProtection getSellerProtection() {
        return sellerProtection;
    }

    /**
     * Setter for SellerProtection.
     * The level of protection offered as defined by [PayPal Seller Protection for
     * Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
     * @param sellerProtection Value for SellerProtection
     */
    @JsonSetter("seller_protection")
    public void setSellerProtection(SellerProtection sellerProtection) {
        this.sellerProtection = sellerProtection;
    }

    /**
     * Getter for ExpirationTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("expiration_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationTime() {
        return expirationTime;
    }

    /**
     * Setter for ExpirationTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @param expirationTime Value for String
     */
    @JsonSetter("expiration_time")
    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * Getter for Links.
     * An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
     * @return Returns the List of LinkDescription
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LinkDescription> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
     * @param links Value for List of LinkDescription
     */
    @JsonSetter("links")
    public void setLinks(List<LinkDescription> links) {
        this.links = links;
    }

    /**
     * Getter for CreateTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("create_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Setter for CreateTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @param createTime Value for String
     */
    @JsonSetter("create_time")
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for UpdateTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("update_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Setter for UpdateTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @param updateTime Value for String
     */
    @JsonSetter("update_time")
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Getter for ProcessorResponse.
     * The processor response information for payment requests, such as direct credit card
     * transactions.
     * @return Returns the ProcessorResponse
     */
    @JsonGetter("processor_response")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProcessorResponse getProcessorResponse() {
        return processorResponse;
    }

    /**
     * Setter for ProcessorResponse.
     * The processor response information for payment requests, such as direct credit card
     * transactions.
     * @param processorResponse Value for ProcessorResponse
     */
    @JsonSetter("processor_response")
    public void setProcessorResponse(ProcessorResponse processorResponse) {
        this.processorResponse = processorResponse;
    }

    /**
     * Converts this AuthorizationWithAdditionalData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuthorizationWithAdditionalData [" + "status=" + status + ", statusDetails="
                + statusDetails + ", id=" + id + ", amount=" + amount + ", invoiceId=" + invoiceId
                + ", customId=" + customId + ", networkTransactionReference="
                + networkTransactionReference + ", sellerProtection=" + sellerProtection
                + ", expirationTime=" + expirationTime + ", links=" + links + ", createTime="
                + createTime + ", updateTime=" + updateTime + ", processorResponse="
                + processorResponse + "]";
    }

    /**
     * Builds a new {@link AuthorizationWithAdditionalData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuthorizationWithAdditionalData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .statusDetails(getStatusDetails())
                .id(getId())
                .amount(getAmount())
                .invoiceId(getInvoiceId())
                .customId(getCustomId())
                .networkTransactionReference(getNetworkTransactionReference())
                .sellerProtection(getSellerProtection())
                .expirationTime(getExpirationTime())
                .links(getLinks())
                .createTime(getCreateTime())
                .updateTime(getUpdateTime())
                .processorResponse(getProcessorResponse());
        return builder;
    }

    /**
     * Class to build instances of {@link AuthorizationWithAdditionalData}.
     */
    public static class Builder {
        private AuthorizationStatus status;
        private AuthorizationStatusDetails statusDetails;
        private String id;
        private Money amount;
        private String invoiceId;
        private String customId;
        private NetworkTransactionReference networkTransactionReference;
        private SellerProtection sellerProtection;
        private String expirationTime;
        private List<LinkDescription> links;
        private String createTime;
        private String updateTime;
        private ProcessorResponse processorResponse;



        /**
         * Setter for status.
         * @param  status  AuthorizationStatus value for status.
         * @return Builder
         */
        public Builder status(AuthorizationStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for statusDetails.
         * @param  statusDetails  AuthorizationStatusDetails value for statusDetails.
         * @return Builder
         */
        public Builder statusDetails(AuthorizationStatusDetails statusDetails) {
            this.statusDetails = statusDetails;
            return this;
        }

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
         * Setter for amount.
         * @param  amount  Money value for amount.
         * @return Builder
         */
        public Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for invoiceId.
         * @param  invoiceId  String value for invoiceId.
         * @return Builder
         */
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        /**
         * Setter for customId.
         * @param  customId  String value for customId.
         * @return Builder
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * Setter for networkTransactionReference.
         * @param  networkTransactionReference  NetworkTransactionReference value for
         *         networkTransactionReference.
         * @return Builder
         */
        public Builder networkTransactionReference(
                NetworkTransactionReference networkTransactionReference) {
            this.networkTransactionReference = networkTransactionReference;
            return this;
        }

        /**
         * Setter for sellerProtection.
         * @param  sellerProtection  SellerProtection value for sellerProtection.
         * @return Builder
         */
        public Builder sellerProtection(SellerProtection sellerProtection) {
            this.sellerProtection = sellerProtection;
            return this;
        }

        /**
         * Setter for expirationTime.
         * @param  expirationTime  String value for expirationTime.
         * @return Builder
         */
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
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
         * Setter for createTime.
         * @param  createTime  String value for createTime.
         * @return Builder
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Setter for updateTime.
         * @param  updateTime  String value for updateTime.
         * @return Builder
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Setter for processorResponse.
         * @param  processorResponse  ProcessorResponse value for processorResponse.
         * @return Builder
         */
        public Builder processorResponse(ProcessorResponse processorResponse) {
            this.processorResponse = processorResponse;
            return this;
        }

        /**
         * Builds a new {@link AuthorizationWithAdditionalData} object using the set fields.
         * @return {@link AuthorizationWithAdditionalData}
         */
        public AuthorizationWithAdditionalData build() {
            return new AuthorizationWithAdditionalData(status, statusDetails, id, amount, invoiceId,
                    customId, networkTransactionReference, sellerProtection, expirationTime, links,
                    createTime, updateTime, processorResponse);
        }
    }
}
