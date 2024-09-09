/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * PaymentAdviceCode to be used.
 */
public enum PaymentAdviceCode {
    ENUM_01,

    ENUM_02,

    ENUM_03,

    ENUM_21,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, PaymentAdviceCode> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_01.value = "01";
        ENUM_02.value = "02";
        ENUM_03.value = "03";
        ENUM_21.value = "21";
        _UNKNOWN.value = null;

        valueMap.put("01", ENUM_01);
        valueMap.put("02", ENUM_02);
        valueMap.put("03", ENUM_03);
        valueMap.put("21", ENUM_21);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PaymentAdviceCode constructFromString(String toConvert) throws IOException {
        PaymentAdviceCode enumValue = fromString(toConvert);
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
    public static PaymentAdviceCode fromString(String toConvert) {
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
     * Convert list of PaymentAdviceCode values to list of string values.
     * @param toConvert The list of PaymentAdviceCode values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PaymentAdviceCode> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PaymentAdviceCode enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 