/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * PaypalExperienceLandingPage to be used.
 */
public enum PaypalExperienceLandingPage {
    /**
     * When the customer clicks PayPal Checkout, the customer is redirected to a page to log in to PayPal and approve the payment.
     */
    LOGIN,

    /**
     * When the customer clicks PayPal Checkout, the customer is redirected to a page to enter credit or debit card and other relevant billing information required to complete the purchase. This option has previously been also called as 'BILLING'
     */
    GUEST_CHECKOUT,

    /**
     * When the customer clicks PayPal Checkout, the customer is redirected to either a page to log in to PayPal and approve the payment or to a page to enter credit or debit card and other relevant billing information required to complete the purchase, depending on their previous interaction with PayPal.
     */
    NO_PREFERENCE,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, PaypalExperienceLandingPage> valueMap = new TreeMap<>();
    private String value;

    static {
        LOGIN.value = "LOGIN";
        GUEST_CHECKOUT.value = "GUEST_CHECKOUT";
        NO_PREFERENCE.value = "NO_PREFERENCE";
        _UNKNOWN.value = null;

        valueMap.put("LOGIN", LOGIN);
        valueMap.put("GUEST_CHECKOUT", GUEST_CHECKOUT);
        valueMap.put("NO_PREFERENCE", NO_PREFERENCE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PaypalExperienceLandingPage constructFromString(String toConvert) throws IOException {
        PaypalExperienceLandingPage enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static PaypalExperienceLandingPage fromString(String toConvert) {
        if (!valueMap.containsKey(toConvert)) {
            return _UNKNOWN;
        }
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

    /**
     * Convert list of PaypalExperienceLandingPage values to list of string values.
     * @param toConvert The list of PaypalExperienceLandingPage values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PaypalExperienceLandingPage> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PaypalExperienceLandingPage enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 