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
 * This is a model class for Refund type.
 */
public class Refund {
    private RefundStatus status;
    private RefundStatusDetails statusDetails;
    private String id;
    private Money amount;
    private String invoiceId;
    private String customId;
    private String acquirerReferenceNumber;
    private String noteToPayer;
    private SellerPayableBreakdown sellerPayableBreakdown;
    private PayeeBase payer;
    private List<LinkDescription> links;
    private String createTime;
    private String updateTime;

    /**
     * Default constructor.
     */
    public Refund() {
    }

    /**
     * Initialization constructor.
     * @param  status  RefundStatus value for status.
     * @param  statusDetails  RefundStatusDetails value for statusDetails.
     * @param  id  String value for id.
     * @param  amount  Money value for amount.
     * @param  invoiceId  String value for invoiceId.
     * @param  customId  String value for customId.
     * @param  acquirerReferenceNumber  String value for acquirerReferenceNumber.
     * @param  noteToPayer  String value for noteToPayer.
     * @param  sellerPayableBreakdown  SellerPayableBreakdown value for sellerPayableBreakdown.
     * @param  payer  PayeeBase value for payer.
     * @param  links  List of LinkDescription value for links.
     * @param  createTime  String value for createTime.
     * @param  updateTime  String value for updateTime.
     */
    public Refund(
            RefundStatus status,
            RefundStatusDetails statusDetails,
            String id,
            Money amount,
            String invoiceId,
            String customId,
            String acquirerReferenceNumber,
            String noteToPayer,
            SellerPayableBreakdown sellerPayableBreakdown,
            PayeeBase payer,
            List<LinkDescription> links,
            String createTime,
            String updateTime) {
        this.status = status;
        this.statusDetails = statusDetails;
        this.id = id;
        this.amount = amount;
        this.invoiceId = invoiceId;
        this.customId = customId;
        this.acquirerReferenceNumber = acquirerReferenceNumber;
        this.noteToPayer = noteToPayer;
        this.sellerPayableBreakdown = sellerPayableBreakdown;
        this.payer = payer;
        this.links = links;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * Getter for Status.
     * The status of the refund.
     * @return Returns the RefundStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RefundStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The status of the refund.
     * @param status Value for RefundStatus
     */
    @JsonSetter("status")
    public void setStatus(RefundStatus status) {
        this.status = status;
    }

    /**
     * Getter for StatusDetails.
     * The details of the refund status.
     * @return Returns the RefundStatusDetails
     */
    @JsonGetter("status_details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RefundStatusDetails getStatusDetails() {
        return statusDetails;
    }

    /**
     * Setter for StatusDetails.
     * The details of the refund status.
     * @param statusDetails Value for RefundStatusDetails
     */
    @JsonSetter("status_details")
    public void setStatusDetails(RefundStatusDetails statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * Getter for Id.
     * The PayPal-generated ID for the refund.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The PayPal-generated ID for the refund.
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
     * Getter for AcquirerReferenceNumber.
     * Reference ID issued for the card transaction. This ID can be used to track the transaction
     * across processors, card brands and issuing banks.
     * @return Returns the String
     */
    @JsonGetter("acquirer_reference_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAcquirerReferenceNumber() {
        return acquirerReferenceNumber;
    }

    /**
     * Setter for AcquirerReferenceNumber.
     * Reference ID issued for the card transaction. This ID can be used to track the transaction
     * across processors, card brands and issuing banks.
     * @param acquirerReferenceNumber Value for String
     */
    @JsonSetter("acquirer_reference_number")
    public void setAcquirerReferenceNumber(String acquirerReferenceNumber) {
        this.acquirerReferenceNumber = acquirerReferenceNumber;
    }

    /**
     * Getter for NoteToPayer.
     * The reason for the refund. Appears in both the payer's transaction history and the emails
     * that the payer receives.
     * @return Returns the String
     */
    @JsonGetter("note_to_payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNoteToPayer() {
        return noteToPayer;
    }

    /**
     * Setter for NoteToPayer.
     * The reason for the refund. Appears in both the payer's transaction history and the emails
     * that the payer receives.
     * @param noteToPayer Value for String
     */
    @JsonSetter("note_to_payer")
    public void setNoteToPayer(String noteToPayer) {
        this.noteToPayer = noteToPayer;
    }

    /**
     * Getter for SellerPayableBreakdown.
     * The breakdown of the refund.
     * @return Returns the SellerPayableBreakdown
     */
    @JsonGetter("seller_payable_breakdown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerPayableBreakdown getSellerPayableBreakdown() {
        return sellerPayableBreakdown;
    }

    /**
     * Setter for SellerPayableBreakdown.
     * The breakdown of the refund.
     * @param sellerPayableBreakdown Value for SellerPayableBreakdown
     */
    @JsonSetter("seller_payable_breakdown")
    public void setSellerPayableBreakdown(SellerPayableBreakdown sellerPayableBreakdown) {
        this.sellerPayableBreakdown = sellerPayableBreakdown;
    }

    /**
     * Getter for Payer.
     * The details for the merchant who receives the funds and fulfills the order. The merchant is
     * also known as the payee.
     * @return Returns the PayeeBase
     */
    @JsonGetter("payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayeeBase getPayer() {
        return payer;
    }

    /**
     * Setter for Payer.
     * The details for the merchant who receives the funds and fulfills the order. The merchant is
     * also known as the payee.
     * @param payer Value for PayeeBase
     */
    @JsonSetter("payer")
    public void setPayer(PayeeBase payer) {
        this.payer = payer;
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
     * Converts this Refund into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Refund [" + "status=" + status + ", statusDetails=" + statusDetails + ", id=" + id
                + ", amount=" + amount + ", invoiceId=" + invoiceId + ", customId=" + customId
                + ", acquirerReferenceNumber=" + acquirerReferenceNumber + ", noteToPayer="
                + noteToPayer + ", sellerPayableBreakdown=" + sellerPayableBreakdown + ", payer="
                + payer + ", links=" + links + ", createTime=" + createTime + ", updateTime="
                + updateTime + "]";
    }

    /**
     * Builds a new {@link Refund.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Refund.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .statusDetails(getStatusDetails())
                .id(getId())
                .amount(getAmount())
                .invoiceId(getInvoiceId())
                .customId(getCustomId())
                .acquirerReferenceNumber(getAcquirerReferenceNumber())
                .noteToPayer(getNoteToPayer())
                .sellerPayableBreakdown(getSellerPayableBreakdown())
                .payer(getPayer())
                .links(getLinks())
                .createTime(getCreateTime())
                .updateTime(getUpdateTime());
        return builder;
    }

    /**
     * Class to build instances of {@link Refund}.
     */
    public static class Builder {
        private RefundStatus status;
        private RefundStatusDetails statusDetails;
        private String id;
        private Money amount;
        private String invoiceId;
        private String customId;
        private String acquirerReferenceNumber;
        private String noteToPayer;
        private SellerPayableBreakdown sellerPayableBreakdown;
        private PayeeBase payer;
        private List<LinkDescription> links;
        private String createTime;
        private String updateTime;



        /**
         * Setter for status.
         * @param  status  RefundStatus value for status.
         * @return Builder
         */
        public Builder status(RefundStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for statusDetails.
         * @param  statusDetails  RefundStatusDetails value for statusDetails.
         * @return Builder
         */
        public Builder statusDetails(RefundStatusDetails statusDetails) {
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
         * Setter for acquirerReferenceNumber.
         * @param  acquirerReferenceNumber  String value for acquirerReferenceNumber.
         * @return Builder
         */
        public Builder acquirerReferenceNumber(String acquirerReferenceNumber) {
            this.acquirerReferenceNumber = acquirerReferenceNumber;
            return this;
        }

        /**
         * Setter for noteToPayer.
         * @param  noteToPayer  String value for noteToPayer.
         * @return Builder
         */
        public Builder noteToPayer(String noteToPayer) {
            this.noteToPayer = noteToPayer;
            return this;
        }

        /**
         * Setter for sellerPayableBreakdown.
         * @param  sellerPayableBreakdown  SellerPayableBreakdown value for sellerPayableBreakdown.
         * @return Builder
         */
        public Builder sellerPayableBreakdown(SellerPayableBreakdown sellerPayableBreakdown) {
            this.sellerPayableBreakdown = sellerPayableBreakdown;
            return this;
        }

        /**
         * Setter for payer.
         * @param  payer  PayeeBase value for payer.
         * @return Builder
         */
        public Builder payer(PayeeBase payer) {
            this.payer = payer;
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
         * Builds a new {@link Refund} object using the set fields.
         * @return {@link Refund}
         */
        public Refund build() {
            return new Refund(status, statusDetails, id, amount, invoiceId, customId,
                    acquirerReferenceNumber, noteToPayer, sellerPayableBreakdown, payer, links,
                    createTime, updateTime);
        }
    }
}
