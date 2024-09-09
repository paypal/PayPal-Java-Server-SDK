/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for RefundPaymentInstruction type.
 */
public class RefundPaymentInstruction {
    private List<RefundPlatformFee> platformFees;

    /**
     * Default constructor.
     */
    public RefundPaymentInstruction() {
    }

    /**
     * Initialization constructor.
     * @param  platformFees  List of RefundPlatformFee value for platformFees.
     */
    public RefundPaymentInstruction(
            List<RefundPlatformFee> platformFees) {
        this.platformFees = platformFees;
    }

    /**
     * Getter for PlatformFees.
     * Specifies the amount that the API caller will contribute to the refund being processed. The
     * amount needs to be lower than platform_fees amount originally captured or the amount that is
     * remaining if multiple refunds have been processed. This field is only applicable to merchants
     * that have been enabled for PayPal Commerce Platform for Marketplaces and Platforms
     * capability. Please speak to your account manager if you want to use this capability.
     * @return Returns the List of RefundPlatformFee
     */
    @JsonGetter("platform_fees")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<RefundPlatformFee> getPlatformFees() {
        return platformFees;
    }

    /**
     * Setter for PlatformFees.
     * Specifies the amount that the API caller will contribute to the refund being processed. The
     * amount needs to be lower than platform_fees amount originally captured or the amount that is
     * remaining if multiple refunds have been processed. This field is only applicable to merchants
     * that have been enabled for PayPal Commerce Platform for Marketplaces and Platforms
     * capability. Please speak to your account manager if you want to use this capability.
     * @param platformFees Value for List of RefundPlatformFee
     */
    @JsonSetter("platform_fees")
    public void setPlatformFees(List<RefundPlatformFee> platformFees) {
        this.platformFees = platformFees;
    }

    /**
     * Converts this RefundPaymentInstruction into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundPaymentInstruction [" + "platformFees=" + platformFees + "]";
    }

    /**
     * Builds a new {@link RefundPaymentInstruction.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundPaymentInstruction.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .platformFees(getPlatformFees());
        return builder;
    }

    /**
     * Class to build instances of {@link RefundPaymentInstruction}.
     */
    public static class Builder {
        private List<RefundPlatformFee> platformFees;



        /**
         * Setter for platformFees.
         * @param  platformFees  List of RefundPlatformFee value for platformFees.
         * @return Builder
         */
        public Builder platformFees(List<RefundPlatformFee> platformFees) {
            this.platformFees = platformFees;
            return this;
        }

        /**
         * Builds a new {@link RefundPaymentInstruction} object using the set fields.
         * @return {@link RefundPaymentInstruction}
         */
        public RefundPaymentInstruction build() {
            return new RefundPaymentInstruction(platformFees);
        }
    }
}
