/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AuthorizationsReauthorizeInput type.
 */
public class AuthorizationsReauthorizeInput {
    private String authorizationId;
    private String contentType;
    private String payPalRequestId;
    private String prefer;
    private ReauthorizeRequest body;

    /**
     * Default constructor.
     */
    public AuthorizationsReauthorizeInput() {
        contentType = "application/json";
        prefer = "return=minimal";
    }

    /**
     * Initialization constructor.
     * @param  authorizationId  String value for authorizationId.
     * @param  contentType  String value for contentType.
     * @param  payPalRequestId  String value for payPalRequestId.
     * @param  prefer  String value for prefer.
     * @param  body  ReauthorizeRequest value for body.
     */
    public AuthorizationsReauthorizeInput(
            String authorizationId,
            String contentType,
            String payPalRequestId,
            String prefer,
            ReauthorizeRequest body) {
        this.authorizationId = authorizationId;
        this.contentType = contentType;
        this.payPalRequestId = payPalRequestId;
        this.prefer = prefer;
        this.body = body;
    }

    /**
     * Getter for AuthorizationId.
     * The PayPal-generated ID for the authorized payment to reauthorize.
     * @return Returns the String
     */
    @JsonGetter("authorization_id")
    public String getAuthorizationId() {
        return authorizationId;
    }

    /**
     * Setter for AuthorizationId.
     * The PayPal-generated ID for the authorized payment to reauthorize.
     * @param authorizationId Value for String
     */
    @JsonSetter("authorization_id")
    public void setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
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
     * Getter for PayPalRequestId.
     * The server stores keys for 45 days.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Request-Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayPalRequestId() {
        return payPalRequestId;
    }

    /**
     * Setter for PayPalRequestId.
     * The server stores keys for 45 days.
     * @param payPalRequestId Value for String
     */
    @JsonSetter("PayPal-Request-Id")
    public void setPayPalRequestId(String payPalRequestId) {
        this.payPalRequestId = payPalRequestId;
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
     * Getter for Body.
     * @return Returns the ReauthorizeRequest
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReauthorizeRequest getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for ReauthorizeRequest
     */
    @JsonSetter("body")
    public void setBody(ReauthorizeRequest body) {
        this.body = body;
    }

    /**
     * Converts this AuthorizationsReauthorizeInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuthorizationsReauthorizeInput [" + "authorizationId=" + authorizationId
                + ", contentType=" + contentType + ", payPalRequestId=" + payPalRequestId
                + ", prefer=" + prefer + ", body=" + body + "]";
    }

    /**
     * Builds a new {@link AuthorizationsReauthorizeInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuthorizationsReauthorizeInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(authorizationId, contentType)
                .payPalRequestId(getPayPalRequestId())
                .prefer(getPrefer())
                .body(getBody());
        return builder;
    }

    /**
     * Class to build instances of {@link AuthorizationsReauthorizeInput}.
     */
    public static class Builder {
        private String authorizationId;
        private String contentType = "application/json";
        private String payPalRequestId;
        private String prefer = "return=minimal";
        private ReauthorizeRequest body;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  authorizationId  String value for authorizationId.
         * @param  contentType  String value for contentType.
         */
        public Builder(String authorizationId, String contentType) {
            this.authorizationId = authorizationId;
            this.contentType = contentType;
        }

        /**
         * Setter for authorizationId.
         * @param  authorizationId  String value for authorizationId.
         * @return Builder
         */
        public Builder authorizationId(String authorizationId) {
            this.authorizationId = authorizationId;
            return this;
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
         * Setter for payPalRequestId.
         * @param  payPalRequestId  String value for payPalRequestId.
         * @return Builder
         */
        public Builder payPalRequestId(String payPalRequestId) {
            this.payPalRequestId = payPalRequestId;
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
         * Setter for body.
         * @param  body  ReauthorizeRequest value for body.
         * @return Builder
         */
        public Builder body(ReauthorizeRequest body) {
            this.body = body;
            return this;
        }

        /**
         * Builds a new {@link AuthorizationsReauthorizeInput} object using the set fields.
         * @return {@link AuthorizationsReauthorizeInput}
         */
        public AuthorizationsReauthorizeInput build() {
            return new AuthorizationsReauthorizeInput(authorizationId, contentType, payPalRequestId,
                    prefer, body);
        }
    }
}
