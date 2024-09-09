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
 * ECIFlag to be used.
 */
public enum ECIFlag {
    MASTERCARD_NON_3D_SECURE_TRANSACTION,

    MASTERCARD_ATTEMPTED_AUTHENTICATION_TRANSACTION,

    MASTERCARD_FULLY_AUTHENTICATED_TRANSACTION,

    FULLY_AUTHENTICATED_TRANSACTION,

    ATTEMPTED_AUTHENTICATION_TRANSACTION,

    NON_3D_SECURE_TRANSACTION,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, ECIFlag> valueMap = new TreeMap<>();
    private String value;

    static {
        MASTERCARD_NON_3D_SECURE_TRANSACTION.value = "MASTERCARD_NON_3D_SECURE_TRANSACTION";
        MASTERCARD_ATTEMPTED_AUTHENTICATION_TRANSACTION.value = "MASTERCARD_ATTEMPTED_AUTHENTICATION_TRANSACTION";
        MASTERCARD_FULLY_AUTHENTICATED_TRANSACTION.value = "MASTERCARD_FULLY_AUTHENTICATED_TRANSACTION";
        FULLY_AUTHENTICATED_TRANSACTION.value = "FULLY_AUTHENTICATED_TRANSACTION";
        ATTEMPTED_AUTHENTICATION_TRANSACTION.value = "ATTEMPTED_AUTHENTICATION_TRANSACTION";
        NON_3D_SECURE_TRANSACTION.value = "NON_3D_SECURE_TRANSACTION";
        _UNKNOWN.value = null;

        valueMap.put("MASTERCARD_NON_3D_SECURE_TRANSACTION", MASTERCARD_NON_3D_SECURE_TRANSACTION);
        valueMap.put("MASTERCARD_ATTEMPTED_AUTHENTICATION_TRANSACTION", MASTERCARD_ATTEMPTED_AUTHENTICATION_TRANSACTION);
        valueMap.put("MASTERCARD_FULLY_AUTHENTICATED_TRANSACTION", MASTERCARD_FULLY_AUTHENTICATED_TRANSACTION);
        valueMap.put("FULLY_AUTHENTICATED_TRANSACTION", FULLY_AUTHENTICATED_TRANSACTION);
        valueMap.put("ATTEMPTED_AUTHENTICATION_TRANSACTION", ATTEMPTED_AUTHENTICATION_TRANSACTION);
        valueMap.put("NON_3D_SECURE_TRANSACTION", NON_3D_SECURE_TRANSACTION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ECIFlag constructFromString(String toConvert) throws IOException {
        ECIFlag enumValue = fromString(toConvert);
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
    public static ECIFlag fromString(String toConvert) {
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
     * Convert list of ECIFlag values to list of string values.
     * @param toConvert The list of ECIFlag values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ECIFlag> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ECIFlag enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 