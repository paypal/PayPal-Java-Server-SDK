/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ThreeDSecureAuthenticationResponse type.
 */
public class ThreeDSecureAuthenticationResponse {
    private PAResStatus authenticationStatus;
    private EnrollmentStatus enrollmentStatus;

    /**
     * Default constructor.
     */
    public ThreeDSecureAuthenticationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  authenticationStatus  PAResStatus value for authenticationStatus.
     * @param  enrollmentStatus  EnrollmentStatus value for enrollmentStatus.
     */
    public ThreeDSecureAuthenticationResponse(
            PAResStatus authenticationStatus,
            EnrollmentStatus enrollmentStatus) {
        this.authenticationStatus = authenticationStatus;
        this.enrollmentStatus = enrollmentStatus;
    }

    /**
     * Getter for AuthenticationStatus.
     * Transactions status result identifier. The outcome of the issuer's authentication.
     * @return Returns the PAResStatus
     */
    @JsonGetter("authentication_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PAResStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    /**
     * Setter for AuthenticationStatus.
     * Transactions status result identifier. The outcome of the issuer's authentication.
     * @param authenticationStatus Value for PAResStatus
     */
    @JsonSetter("authentication_status")
    public void setAuthenticationStatus(PAResStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    /**
     * Getter for EnrollmentStatus.
     * Status of Authentication eligibility.
     * @return Returns the EnrollmentStatus
     */
    @JsonGetter("enrollment_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EnrollmentStatus getEnrollmentStatus() {
        return enrollmentStatus;
    }

    /**
     * Setter for EnrollmentStatus.
     * Status of Authentication eligibility.
     * @param enrollmentStatus Value for EnrollmentStatus
     */
    @JsonSetter("enrollment_status")
    public void setEnrollmentStatus(EnrollmentStatus enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    /**
     * Converts this ThreeDSecureAuthenticationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ThreeDSecureAuthenticationResponse [" + "authenticationStatus="
                + authenticationStatus + ", enrollmentStatus=" + enrollmentStatus + "]";
    }

    /**
     * Builds a new {@link ThreeDSecureAuthenticationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ThreeDSecureAuthenticationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .authenticationStatus(getAuthenticationStatus())
                .enrollmentStatus(getEnrollmentStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link ThreeDSecureAuthenticationResponse}.
     */
    public static class Builder {
        private PAResStatus authenticationStatus;
        private EnrollmentStatus enrollmentStatus;



        /**
         * Setter for authenticationStatus.
         * @param  authenticationStatus  PAResStatus value for authenticationStatus.
         * @return Builder
         */
        public Builder authenticationStatus(PAResStatus authenticationStatus) {
            this.authenticationStatus = authenticationStatus;
            return this;
        }

        /**
         * Setter for enrollmentStatus.
         * @param  enrollmentStatus  EnrollmentStatus value for enrollmentStatus.
         * @return Builder
         */
        public Builder enrollmentStatus(EnrollmentStatus enrollmentStatus) {
            this.enrollmentStatus = enrollmentStatus;
            return this;
        }

        /**
         * Builds a new {@link ThreeDSecureAuthenticationResponse} object using the set fields.
         * @return {@link ThreeDSecureAuthenticationResponse}
         */
        public ThreeDSecureAuthenticationResponse build() {
            return new ThreeDSecureAuthenticationResponse(authenticationStatus, enrollmentStatus);
        }
    }
}