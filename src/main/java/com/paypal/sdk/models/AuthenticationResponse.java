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
 * This is a model class for AuthenticationResponse type.
 */
public class AuthenticationResponse {
    private LiabilityShiftIndicator liabilityShift;
    private ThreeDSecureAuthenticationResponse threeDSecure;

    /**
     * Default constructor.
     */
    public AuthenticationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  liabilityShift  LiabilityShiftIndicator value for liabilityShift.
     * @param  threeDSecure  ThreeDSecureAuthenticationResponse value for threeDSecure.
     */
    public AuthenticationResponse(
            LiabilityShiftIndicator liabilityShift,
            ThreeDSecureAuthenticationResponse threeDSecure) {
        this.liabilityShift = liabilityShift;
        this.threeDSecure = threeDSecure;
    }

    /**
     * Getter for LiabilityShift.
     * Liability shift indicator. The outcome of the issuer's authentication.
     * @return Returns the LiabilityShiftIndicator
     */
    @JsonGetter("liability_shift")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LiabilityShiftIndicator getLiabilityShift() {
        return liabilityShift;
    }

    /**
     * Setter for LiabilityShift.
     * Liability shift indicator. The outcome of the issuer's authentication.
     * @param liabilityShift Value for LiabilityShiftIndicator
     */
    @JsonSetter("liability_shift")
    public void setLiabilityShift(LiabilityShiftIndicator liabilityShift) {
        this.liabilityShift = liabilityShift;
    }

    /**
     * Getter for ThreeDSecure.
     * Results of 3D Secure Authentication.
     * @return Returns the ThreeDSecureAuthenticationResponse
     */
    @JsonGetter("three_d_secure")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ThreeDSecureAuthenticationResponse getThreeDSecure() {
        return threeDSecure;
    }

    /**
     * Setter for ThreeDSecure.
     * Results of 3D Secure Authentication.
     * @param threeDSecure Value for ThreeDSecureAuthenticationResponse
     */
    @JsonSetter("three_d_secure")
    public void setThreeDSecure(ThreeDSecureAuthenticationResponse threeDSecure) {
        this.threeDSecure = threeDSecure;
    }

    /**
     * Converts this AuthenticationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuthenticationResponse [" + "liabilityShift=" + liabilityShift + ", threeDSecure="
                + threeDSecure + "]";
    }

    /**
     * Builds a new {@link AuthenticationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuthenticationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .liabilityShift(getLiabilityShift())
                .threeDSecure(getThreeDSecure());
        return builder;
    }

    /**
     * Class to build instances of {@link AuthenticationResponse}.
     */
    public static class Builder {
        private LiabilityShiftIndicator liabilityShift;
        private ThreeDSecureAuthenticationResponse threeDSecure;



        /**
         * Setter for liabilityShift.
         * @param  liabilityShift  LiabilityShiftIndicator value for liabilityShift.
         * @return Builder
         */
        public Builder liabilityShift(LiabilityShiftIndicator liabilityShift) {
            this.liabilityShift = liabilityShift;
            return this;
        }

        /**
         * Setter for threeDSecure.
         * @param  threeDSecure  ThreeDSecureAuthenticationResponse value for threeDSecure.
         * @return Builder
         */
        public Builder threeDSecure(ThreeDSecureAuthenticationResponse threeDSecure) {
            this.threeDSecure = threeDSecure;
            return this;
        }

        /**
         * Builds a new {@link AuthenticationResponse} object using the set fields.
         * @return {@link AuthenticationResponse}
         */
        public AuthenticationResponse build() {
            return new AuthenticationResponse(liabilityShift, threeDSecure);
        }
    }
}
