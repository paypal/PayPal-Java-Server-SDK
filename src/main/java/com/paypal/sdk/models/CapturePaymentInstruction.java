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
 * This is a model class for CapturePaymentInstruction type.
 */
public class CapturePaymentInstruction {
    private List<PlatformFee> platformFees;
    private DisbursementMode disbursementMode;
    private String payeeReceivableFxRateId;

    /**
     * Default constructor.
     */
    public CapturePaymentInstruction() {
        disbursementMode = DisbursementMode.INSTANT;
    }

    /**
     * Initialization constructor.
     * @param  platformFees  List of PlatformFee value for platformFees.
     * @param  disbursementMode  DisbursementMode value for disbursementMode.
     * @param  payeeReceivableFxRateId  String value for payeeReceivableFxRateId.
     */
    public CapturePaymentInstruction(
            List<PlatformFee> platformFees,
            DisbursementMode disbursementMode,
            String payeeReceivableFxRateId) {
        this.platformFees = platformFees;
        this.disbursementMode = disbursementMode;
        this.payeeReceivableFxRateId = payeeReceivableFxRateId;
    }

    /**
     * Getter for PlatformFees.
     * An array of platform or partner fees, commissions, or brokerage fees that associated with the
     * captured payment.
     * @return Returns the List of PlatformFee
     */
    @JsonGetter("platform_fees")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PlatformFee> getPlatformFees() {
        return platformFees;
    }

    /**
     * Setter for PlatformFees.
     * An array of platform or partner fees, commissions, or brokerage fees that associated with the
     * captured payment.
     * @param platformFees Value for List of PlatformFee
     */
    @JsonSetter("platform_fees")
    public void setPlatformFees(List<PlatformFee> platformFees) {
        this.platformFees = platformFees;
    }

    /**
     * Getter for DisbursementMode.
     * The funds that are held on behalf of the merchant.
     * @return Returns the DisbursementMode
     */
    @JsonGetter("disbursement_mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DisbursementMode getDisbursementMode() {
        return disbursementMode;
    }

    /**
     * Setter for DisbursementMode.
     * The funds that are held on behalf of the merchant.
     * @param disbursementMode Value for DisbursementMode
     */
    @JsonSetter("disbursement_mode")
    public void setDisbursementMode(DisbursementMode disbursementMode) {
        this.disbursementMode = disbursementMode;
    }

    /**
     * Getter for PayeeReceivableFxRateId.
     * FX identifier generated returned by PayPal to be used for payment processing in order to
     * honor FX rate (for eligible integrations) to be used when amount is settled/received into the
     * payee account.
     * @return Returns the String
     */
    @JsonGetter("payee_receivable_fx_rate_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayeeReceivableFxRateId() {
        return payeeReceivableFxRateId;
    }

    /**
     * Setter for PayeeReceivableFxRateId.
     * FX identifier generated returned by PayPal to be used for payment processing in order to
     * honor FX rate (for eligible integrations) to be used when amount is settled/received into the
     * payee account.
     * @param payeeReceivableFxRateId Value for String
     */
    @JsonSetter("payee_receivable_fx_rate_id")
    public void setPayeeReceivableFxRateId(String payeeReceivableFxRateId) {
        this.payeeReceivableFxRateId = payeeReceivableFxRateId;
    }

    /**
     * Converts this CapturePaymentInstruction into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CapturePaymentInstruction [" + "platformFees=" + platformFees
                + ", disbursementMode=" + disbursementMode + ", payeeReceivableFxRateId="
                + payeeReceivableFxRateId + "]";
    }

    /**
     * Builds a new {@link CapturePaymentInstruction.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CapturePaymentInstruction.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .platformFees(getPlatformFees())
                .disbursementMode(getDisbursementMode())
                .payeeReceivableFxRateId(getPayeeReceivableFxRateId());
        return builder;
    }

    /**
     * Class to build instances of {@link CapturePaymentInstruction}.
     */
    public static class Builder {
        private List<PlatformFee> platformFees;
        private DisbursementMode disbursementMode = DisbursementMode.INSTANT;
        private String payeeReceivableFxRateId;



        /**
         * Setter for platformFees.
         * @param  platformFees  List of PlatformFee value for platformFees.
         * @return Builder
         */
        public Builder platformFees(List<PlatformFee> platformFees) {
            this.platformFees = platformFees;
            return this;
        }

        /**
         * Setter for disbursementMode.
         * @param  disbursementMode  DisbursementMode value for disbursementMode.
         * @return Builder
         */
        public Builder disbursementMode(DisbursementMode disbursementMode) {
            this.disbursementMode = disbursementMode;
            return this;
        }

        /**
         * Setter for payeeReceivableFxRateId.
         * @param  payeeReceivableFxRateId  String value for payeeReceivableFxRateId.
         * @return Builder
         */
        public Builder payeeReceivableFxRateId(String payeeReceivableFxRateId) {
            this.payeeReceivableFxRateId = payeeReceivableFxRateId;
            return this;
        }

        /**
         * Builds a new {@link CapturePaymentInstruction} object using the set fields.
         * @return {@link CapturePaymentInstruction}
         */
        public CapturePaymentInstruction build() {
            return new CapturePaymentInstruction(platformFees, disbursementMode,
                    payeeReceivableFxRateId);
        }
    }
}
