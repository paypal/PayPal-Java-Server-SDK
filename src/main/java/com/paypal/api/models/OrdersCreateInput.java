/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for OrdersCreateInput type.
 */
public class OrdersCreateInput {
    private String contentType;
    private OrderRequest body;
    private String payPalRequestId;
    private String payPalPartnerAttributionId;
    private String payPalClientMetadataId;
    private String prefer;

    /**
     * Default constructor.
     */
    public OrdersCreateInput() {
        contentType = "application/json";
        prefer = "return=minimal";
    }

    /**
     * Initialization constructor.
     * @param  contentType  String value for contentType.
     * @param  body  OrderRequest value for body.
     * @param  payPalRequestId  String value for payPalRequestId.
     * @param  payPalPartnerAttributionId  String value for payPalPartnerAttributionId.
     * @param  payPalClientMetadataId  String value for payPalClientMetadataId.
     * @param  prefer  String value for prefer.
     */
    public OrdersCreateInput(
            String contentType,
            OrderRequest body,
            String payPalRequestId,
            String payPalPartnerAttributionId,
            String payPalClientMetadataId,
            String prefer) {
        this.contentType = contentType;
        this.body = body;
        this.payPalRequestId = payPalRequestId;
        this.payPalPartnerAttributionId = payPalPartnerAttributionId;
        this.payPalClientMetadataId = payPalClientMetadataId;
        this.prefer = prefer;
    }

    /**
     * Getter for ContentType.
     * @return Returns the String
     */
    @JsonGetter("Content-Type")
    public String getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType.
     * @param contentType Value for String
     */
    @JsonSetter("Content-Type")
    private void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Getter for Body.
     * @return Returns the OrderRequest
     */
    @JsonGetter("body")
    public OrderRequest getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for OrderRequest
     */
    @JsonSetter("body")
    public void setBody(OrderRequest body) {
        this.body = body;
    }

    /**
     * Getter for PayPalRequestId.
     * The server stores keys for 6 hours. The API callers can request the times to up to 72 hours
     * by speaking to their Account Manager.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Request-Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayPalRequestId() {
        return payPalRequestId;
    }

    /**
     * Setter for PayPalRequestId.
     * The server stores keys for 6 hours. The API callers can request the times to up to 72 hours
     * by speaking to their Account Manager.
     * @param payPalRequestId Value for String
     */
    @JsonSetter("PayPal-Request-Id")
    public void setPayPalRequestId(String payPalRequestId) {
        this.payPalRequestId = payPalRequestId;
    }

    /**
     * Getter for PayPalPartnerAttributionId.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Partner-Attribution-Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayPalPartnerAttributionId() {
        return payPalPartnerAttributionId;
    }

    /**
     * Setter for PayPalPartnerAttributionId.
     * @param payPalPartnerAttributionId Value for String
     */
    @JsonSetter("PayPal-Partner-Attribution-Id")
    public void setPayPalPartnerAttributionId(String payPalPartnerAttributionId) {
        this.payPalPartnerAttributionId = payPalPartnerAttributionId;
    }

    /**
     * Getter for PayPalClientMetadataId.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Client-Metadata-Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayPalClientMetadataId() {
        return payPalClientMetadataId;
    }

    /**
     * Setter for PayPalClientMetadataId.
     * @param payPalClientMetadataId Value for String
     */
    @JsonSetter("PayPal-Client-Metadata-Id")
    public void setPayPalClientMetadataId(String payPalClientMetadataId) {
        this.payPalClientMetadataId = payPalClientMetadataId;
    }

    /**
     * Getter for Prefer.
     * The preferred server response upon successful completion of the request. Value
     * is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return=minimal&lt;/code&gt;. The server returns a minimal response to optimize
     * communication between the API caller and the server. A minimal response includes the
     * &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS
     * links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return=representation&lt;/code&gt;. The server returns a complete resource
     * representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt;
     * @return Returns the String
     */
    @JsonGetter("Prefer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrefer() {
        return prefer;
    }

    /**
     * Setter for Prefer.
     * The preferred server response upon successful completion of the request. Value
     * is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return=minimal&lt;/code&gt;. The server returns a minimal response to optimize
     * communication between the API caller and the server. A minimal response includes the
     * &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS
     * links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return=representation&lt;/code&gt;. The server returns a complete resource
     * representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt;
     * @param prefer Value for String
     */
    @JsonSetter("Prefer")
    public void setPrefer(String prefer) {
        this.prefer = prefer;
    }

    /**
     * Converts this OrdersCreateInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrdersCreateInput [" + "contentType=" + contentType + ", body=" + body
                + ", payPalRequestId=" + payPalRequestId + ", payPalPartnerAttributionId="
                + payPalPartnerAttributionId + ", payPalClientMetadataId=" + payPalClientMetadataId
                + ", prefer=" + prefer + "]";
    }

    /**
     * Builds a new {@link OrdersCreateInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrdersCreateInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(contentType, body)
                .payPalRequestId(getPayPalRequestId())
                .payPalPartnerAttributionId(getPayPalPartnerAttributionId())
                .payPalClientMetadataId(getPayPalClientMetadataId())
                .prefer(getPrefer());
        return builder;
    }

    /**
     * Class to build instances of {@link OrdersCreateInput}.
     */
    public static class Builder {
        private String contentType = "application/json";
        private OrderRequest body;
        private String payPalRequestId;
        private String payPalPartnerAttributionId;
        private String payPalClientMetadataId;
        private String prefer = "return=minimal";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  contentType  String value for contentType.
         * @param  body  OrderRequest value for body.
         */
        public Builder(String contentType, OrderRequest body) {
            this.contentType = contentType;
            this.body = body;
        }

        /**
         * Setter for contentType.
         * @param  contentType  String value for contentType.
         * @return Builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Setter for body.
         * @param  body  OrderRequest value for body.
         * @return Builder
         */
        public Builder body(OrderRequest body) {
            this.body = body;
            return this;
        }

        /**
         * Setter for payPalRequestId.
         * @param  payPalRequestId  String value for payPalRequestId.
         * @return Builder
         */
        public Builder payPalRequestId(String payPalRequestId) {
            this.payPalRequestId = payPalRequestId;
            return this;
        }

        /**
         * Setter for payPalPartnerAttributionId.
         * @param  payPalPartnerAttributionId  String value for payPalPartnerAttributionId.
         * @return Builder
         */
        public Builder payPalPartnerAttributionId(String payPalPartnerAttributionId) {
            this.payPalPartnerAttributionId = payPalPartnerAttributionId;
            return this;
        }

        /**
         * Setter for payPalClientMetadataId.
         * @param  payPalClientMetadataId  String value for payPalClientMetadataId.
         * @return Builder
         */
        public Builder payPalClientMetadataId(String payPalClientMetadataId) {
            this.payPalClientMetadataId = payPalClientMetadataId;
            return this;
        }

        /**
         * Setter for prefer.
         * @param  prefer  String value for prefer.
         * @return Builder
         */
        public Builder prefer(String prefer) {
            this.prefer = prefer;
            return this;
        }

        /**
         * Builds a new {@link OrdersCreateInput} object using the set fields.
         * @return {@link OrdersCreateInput}
         */
        public OrdersCreateInput build() {
            return new OrdersCreateInput(contentType, body, payPalRequestId,
                    payPalPartnerAttributionId, payPalClientMetadataId, prefer);
        }
    }
}