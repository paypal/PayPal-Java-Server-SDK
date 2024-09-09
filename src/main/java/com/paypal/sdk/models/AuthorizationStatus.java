/*
 * PaypalServerSDKLib
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
 * AuthorizationStatus to be used.
 */
public enum AuthorizationStatus {
    CREATED,

    CAPTURED,

    DENIED,

    PARTIALLY_CAPTURED,

    VOIDED,

    PENDING,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, AuthorizationStatus> valueMap = new TreeMap<>();
    private String value;

    static {
        CREATED.value = "CREATED";
        CAPTURED.value = "CAPTURED";
        DENIED.value = "DENIED";
        PARTIALLY_CAPTURED.value = "PARTIALLY_CAPTURED";
        VOIDED.value = "VOIDED";
        PENDING.value = "PENDING";
        _UNKNOWN.value = null;

        valueMap.put("CREATED", CREATED);
        valueMap.put("CAPTURED", CAPTURED);
        valueMap.put("DENIED", DENIED);
        valueMap.put("PARTIALLY_CAPTURED", PARTIALLY_CAPTURED);
        valueMap.put("VOIDED", VOIDED);
        valueMap.put("PENDING", PENDING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AuthorizationStatus constructFromString(String toConvert) throws IOException {
        AuthorizationStatus enumValue = fromString(toConvert);
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
    public static AuthorizationStatus fromString(String toConvert) {
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
     * Convert list of AuthorizationStatus values to list of string values.
     * @param toConvert The list of AuthorizationStatus values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AuthorizationStatus> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AuthorizationStatus enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 