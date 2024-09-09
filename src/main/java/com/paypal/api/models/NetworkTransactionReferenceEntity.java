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
 * This is a model class for NetworkTransactionReferenceEntity type.
 */
public class NetworkTransactionReferenceEntity {
    private String id;
    private String date;
    private CardBrand network;
    private String time;

    /**
     * Default constructor.
     */
    public NetworkTransactionReferenceEntity() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  date  String value for date.
     * @param  network  CardBrand value for network.
     * @param  time  String value for time.
     */
    public NetworkTransactionReferenceEntity(
            String id,
            String date,
            CardBrand network,
            String time) {
        this.id = id;
        this.date = date;
        this.network = network;
        this.time = time;
    }

    /**
     * Getter for Id.
     * Transaction reference id returned by the scheme. For Visa and Amex, this is the "Tran id"
     * field in response. For MasterCard, this is the "BankNet reference id" field in response. For
     * Discover, this is the "NRID" field in response. The pattern we expect for this field from
     * Visa/Amex/CB/Discover is numeric, Mastercard/BNPP is alphanumeric and Paysecure is
     * alphanumeric with special character -.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Transaction reference id returned by the scheme. For Visa and Amex, this is the "Tran id"
     * field in response. For MasterCard, this is the "BankNet reference id" field in response. For
     * Discover, this is the "NRID" field in response. The pattern we expect for this field from
     * Visa/Amex/CB/Discover is numeric, Mastercard/BNPP is alphanumeric and Paysecure is
     * alphanumeric with special character -.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Date.
     * The date that the transaction was authorized by the scheme. This field may not be returned
     * for all networks. MasterCard refers to this field as "BankNet reference date.
     * @return Returns the String
     */
    @JsonGetter("date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDate() {
        return date;
    }

    /**
     * Setter for Date.
     * The date that the transaction was authorized by the scheme. This field may not be returned
     * for all networks. MasterCard refers to this field as "BankNet reference date.
     * @param date Value for String
     */
    @JsonSetter("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Getter for Network.
     * The card network or brand. Applies to credit, debit, gift, and payment cards.
     * @return Returns the CardBrand
     */
    @JsonGetter("network")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardBrand getNetwork() {
        return network;
    }

    /**
     * Setter for Network.
     * The card network or brand. Applies to credit, debit, gift, and payment cards.
     * @param network Value for CardBrand
     */
    @JsonSetter("network")
    public void setNetwork(CardBrand network) {
        this.network = network;
    }

    /**
     * Getter for Time.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTime() {
        return time;
    }

    /**
     * Setter for Time.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @param time Value for String
     */
    @JsonSetter("time")
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Converts this NetworkTransactionReferenceEntity into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NetworkTransactionReferenceEntity [" + "id=" + id + ", date=" + date + ", network="
                + network + ", time=" + time + "]";
    }

    /**
     * Builds a new {@link NetworkTransactionReferenceEntity.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NetworkTransactionReferenceEntity.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id)
                .date(getDate())
                .network(getNetwork())
                .time(getTime());
        return builder;
    }

    /**
     * Class to build instances of {@link NetworkTransactionReferenceEntity}.
     */
    public static class Builder {
        private String id;
        private String date;
        private CardBrand network;
        private String time;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         */
        public Builder(String id) {
            this.id = id;
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
         * Setter for date.
         * @param  date  String value for date.
         * @return Builder
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }

        /**
         * Setter for network.
         * @param  network  CardBrand value for network.
         * @return Builder
         */
        public Builder network(CardBrand network) {
            this.network = network;
            return this;
        }

        /**
         * Setter for time.
         * @param  time  String value for time.
         * @return Builder
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * Builds a new {@link NetworkTransactionReferenceEntity} object using the set fields.
         * @return {@link NetworkTransactionReferenceEntity}
         */
        public NetworkTransactionReferenceEntity build() {
            return new NetworkTransactionReferenceEntity(id, date, network, time);
        }
    }
}
