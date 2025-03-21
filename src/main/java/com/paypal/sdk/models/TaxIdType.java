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
 * TaxIdType to be used.
 */
public enum TaxIdType {
    /**
     * The individual tax ID type, typically is 11 characters long.
     */
    BR_CPF,

    /**
     * The business tax ID type, typically is 14 characters long.
     */
    BR_CNPJ,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, TaxIdType> valueMap = new TreeMap<>();
    private String value;

    static {
        BR_CPF.value = "BR_CPF";
        BR_CNPJ.value = "BR_CNPJ";
        _UNKNOWN.value = null;

        valueMap.put("BR_CPF", BR_CPF);
        valueMap.put("BR_CNPJ", BR_CNPJ);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TaxIdType constructFromString(String toConvert) throws IOException {
        TaxIdType enumValue = fromString(toConvert);
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
    public static TaxIdType fromString(String toConvert) {
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
     * Convert list of TaxIdType values to list of string values.
     * @param toConvert The list of TaxIdType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TaxIdType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TaxIdType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 