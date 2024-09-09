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
 * This is a model class for RequestTokenInput type.
 */
public class RequestTokenInput {
    private String grantType;
    private String authorization;
    private String scope;

    /**
     * Default constructor.
     */
    public RequestTokenInput() {
        grantType = "client_credentials";
    }

    /**
     * Initialization constructor.
     * @param  grantType  String value for grantType.
     * @param  authorization  String value for authorization.
     * @param  scope  String value for scope.
     */
    public RequestTokenInput(
            String grantType,
            String authorization,
            String scope) {
        this.grantType = grantType;
        this.authorization = authorization;
        this.scope = scope;
    }

    /**
     * Getter for GrantType.
     * Grant Type
     * @return Returns the String
     */
    @JsonGetter("grant_type")
    public String getGrantType() {
        return grantType;
    }

    /**
     * Setter for GrantType.
     * Grant Type
     * @param grantType Value for String
     */
    @JsonSetter("grant_type")
    private void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    /**
     * Getter for Authorization.
     * Authorization header in Basic auth format
     * @return Returns the String
     */
    @JsonGetter("Authorization")
    public String getAuthorization() {
        return authorization;
    }

    /**
     * Setter for Authorization.
     * Authorization header in Basic auth format
     * @param authorization Value for String
     */
    @JsonSetter("Authorization")
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    /**
     * Getter for Scope.
     * Requested scopes as a space-delimited list.
     * @return Returns the String
     */
    @JsonGetter("scope")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getScope() {
        return scope;
    }

    /**
     * Setter for Scope.
     * Requested scopes as a space-delimited list.
     * @param scope Value for String
     */
    @JsonSetter("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * Converts this RequestTokenInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RequestTokenInput [" + "grantType=" + grantType + ", authorization=" + authorization
                + ", scope=" + scope + "]";
    }

    /**
     * Builds a new {@link RequestTokenInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RequestTokenInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(grantType, authorization)
                .scope(getScope());
        return builder;
    }

    /**
     * Class to build instances of {@link RequestTokenInput}.
     */
    public static class Builder {
        private String grantType = "client_credentials";
        private String authorization;
        private String scope;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  grantType  String value for grantType.
         * @param  authorization  String value for authorization.
         */
        public Builder(String grantType, String authorization) {
            this.grantType = grantType;
            this.authorization = authorization;
        }

        /**
         * Setter for grantType.
         * @param  grantType  String value for grantType.
         * @return Builder
         */
        public Builder grantType(String grantType) {
            this.grantType = grantType;
            return this;
        }

        /**
         * Setter for authorization.
         * @param  authorization  String value for authorization.
         * @return Builder
         */
        public Builder authorization(String authorization) {
            this.authorization = authorization;
            return this;
        }

        /**
         * Setter for scope.
         * @param  scope  String value for scope.
         * @return Builder
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Builds a new {@link RequestTokenInput} object using the set fields.
         * @return {@link RequestTokenInput}
         */
        public RequestTokenInput build() {
            return new RequestTokenInput(grantType, authorization, scope);
        }
    }
}
