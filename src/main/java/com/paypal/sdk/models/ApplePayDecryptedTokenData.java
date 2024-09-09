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
 * This is a model class for ApplePayDecryptedTokenData type.
 */
public class ApplePayDecryptedTokenData {
    private Money transactionAmount;
    private ApplePayTokenizedCard tokenizedCard;
    private String deviceManufacturerId;
    private ApplePayPaymentDataType paymentDataType;
    private ApplePayPaymentData paymentData;

    /**
     * Default constructor.
     */
    public ApplePayDecryptedTokenData() {
    }

    /**
     * Initialization constructor.
     * @param  tokenizedCard  ApplePayTokenizedCard value for tokenizedCard.
     * @param  transactionAmount  Money value for transactionAmount.
     * @param  deviceManufacturerId  String value for deviceManufacturerId.
     * @param  paymentDataType  ApplePayPaymentDataType value for paymentDataType.
     * @param  paymentData  ApplePayPaymentData value for paymentData.
     */
    public ApplePayDecryptedTokenData(
            ApplePayTokenizedCard tokenizedCard,
            Money transactionAmount,
            String deviceManufacturerId,
            ApplePayPaymentDataType paymentDataType,
            ApplePayPaymentData paymentData) {
        this.transactionAmount = transactionAmount;
        this.tokenizedCard = tokenizedCard;
        this.deviceManufacturerId = deviceManufacturerId;
        this.paymentDataType = paymentDataType;
        this.paymentData = paymentData;
    }

    /**
     * Getter for TransactionAmount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @return Returns the Money
     */
    @JsonGetter("transaction_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Setter for TransactionAmount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @param transactionAmount Value for Money
     */
    @JsonSetter("transaction_amount")
    public void setTransactionAmount(Money transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * Getter for TokenizedCard.
     * The payment card to use to fund a payment. Can be a credit or debit card.
     * @return Returns the ApplePayTokenizedCard
     */
    @JsonGetter("tokenized_card")
    public ApplePayTokenizedCard getTokenizedCard() {
        return tokenizedCard;
    }

    /**
     * Setter for TokenizedCard.
     * The payment card to use to fund a payment. Can be a credit or debit card.
     * @param tokenizedCard Value for ApplePayTokenizedCard
     */
    @JsonSetter("tokenized_card")
    public void setTokenizedCard(ApplePayTokenizedCard tokenizedCard) {
        this.tokenizedCard = tokenizedCard;
    }

    /**
     * Getter for DeviceManufacturerId.
     * Apple Pay Hex-encoded device manufacturer identifier. The pattern is defined by an external
     * party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("device_manufacturer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeviceManufacturerId() {
        return deviceManufacturerId;
    }

    /**
     * Setter for DeviceManufacturerId.
     * Apple Pay Hex-encoded device manufacturer identifier. The pattern is defined by an external
     * party and supports Unicode.
     * @param deviceManufacturerId Value for String
     */
    @JsonSetter("device_manufacturer_id")
    public void setDeviceManufacturerId(String deviceManufacturerId) {
        this.deviceManufacturerId = deviceManufacturerId;
    }

    /**
     * Getter for PaymentDataType.
     * Indicates the type of payment data passed, in case of Non China the payment data is 3DSECURE
     * and for China it is EMV.
     * @return Returns the ApplePayPaymentDataType
     */
    @JsonGetter("payment_data_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayPaymentDataType getPaymentDataType() {
        return paymentDataType;
    }

    /**
     * Setter for PaymentDataType.
     * Indicates the type of payment data passed, in case of Non China the payment data is 3DSECURE
     * and for China it is EMV.
     * @param paymentDataType Value for ApplePayPaymentDataType
     */
    @JsonSetter("payment_data_type")
    public void setPaymentDataType(ApplePayPaymentDataType paymentDataType) {
        this.paymentDataType = paymentDataType;
    }

    /**
     * Getter for PaymentData.
     * Information about the decrypted apple pay payment data for the token like cryptogram, eci
     * indicator.
     * @return Returns the ApplePayPaymentData
     */
    @JsonGetter("payment_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayPaymentData getPaymentData() {
        return paymentData;
    }

    /**
     * Setter for PaymentData.
     * Information about the decrypted apple pay payment data for the token like cryptogram, eci
     * indicator.
     * @param paymentData Value for ApplePayPaymentData
     */
    @JsonSetter("payment_data")
    public void setPaymentData(ApplePayPaymentData paymentData) {
        this.paymentData = paymentData;
    }

    /**
     * Converts this ApplePayDecryptedTokenData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplePayDecryptedTokenData [" + "tokenizedCard=" + tokenizedCard
                + ", transactionAmount=" + transactionAmount + ", deviceManufacturerId="
                + deviceManufacturerId + ", paymentDataType=" + paymentDataType + ", paymentData="
                + paymentData + "]";
    }

    /**
     * Builds a new {@link ApplePayDecryptedTokenData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplePayDecryptedTokenData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(tokenizedCard)
                .transactionAmount(getTransactionAmount())
                .deviceManufacturerId(getDeviceManufacturerId())
                .paymentDataType(getPaymentDataType())
                .paymentData(getPaymentData());
        return builder;
    }

    /**
     * Class to build instances of {@link ApplePayDecryptedTokenData}.
     */
    public static class Builder {
        private ApplePayTokenizedCard tokenizedCard;
        private Money transactionAmount;
        private String deviceManufacturerId;
        private ApplePayPaymentDataType paymentDataType;
        private ApplePayPaymentData paymentData;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  tokenizedCard  ApplePayTokenizedCard value for tokenizedCard.
         */
        public Builder(ApplePayTokenizedCard tokenizedCard) {
            this.tokenizedCard = tokenizedCard;
        }

        /**
         * Setter for tokenizedCard.
         * @param  tokenizedCard  ApplePayTokenizedCard value for tokenizedCard.
         * @return Builder
         */
        public Builder tokenizedCard(ApplePayTokenizedCard tokenizedCard) {
            this.tokenizedCard = tokenizedCard;
            return this;
        }

        /**
         * Setter for transactionAmount.
         * @param  transactionAmount  Money value for transactionAmount.
         * @return Builder
         */
        public Builder transactionAmount(Money transactionAmount) {
            this.transactionAmount = transactionAmount;
            return this;
        }

        /**
         * Setter for deviceManufacturerId.
         * @param  deviceManufacturerId  String value for deviceManufacturerId.
         * @return Builder
         */
        public Builder deviceManufacturerId(String deviceManufacturerId) {
            this.deviceManufacturerId = deviceManufacturerId;
            return this;
        }

        /**
         * Setter for paymentDataType.
         * @param  paymentDataType  ApplePayPaymentDataType value for paymentDataType.
         * @return Builder
         */
        public Builder paymentDataType(ApplePayPaymentDataType paymentDataType) {
            this.paymentDataType = paymentDataType;
            return this;
        }

        /**
         * Setter for paymentData.
         * @param  paymentData  ApplePayPaymentData value for paymentData.
         * @return Builder
         */
        public Builder paymentData(ApplePayPaymentData paymentData) {
            this.paymentData = paymentData;
            return this;
        }

        /**
         * Builds a new {@link ApplePayDecryptedTokenData} object using the set fields.
         * @return {@link ApplePayDecryptedTokenData}
         */
        public ApplePayDecryptedTokenData build() {
            return new ApplePayDecryptedTokenData(tokenizedCard, transactionAmount,
                    deviceManufacturerId, paymentDataType, paymentData);
        }
    }
}
