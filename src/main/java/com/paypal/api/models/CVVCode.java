/*
 * PaypalServerSDKLib
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
 * CVVCode to be used.
 */
public enum CVVCode {
    E,

    I,

    M,

    N,

    P,

    S,

    U,

    X,

    ENUM_ALL_OTHERS,

    ENUM_0,

    ENUM_1,

    ENUM_2,

    ENUM_3,

    ENUM_4,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, CVVCode> valueMap = new TreeMap<>();
    private String value;

    static {
        E.value = "E";
        I.value = "I";
        M.value = "M";
        N.value = "N";
        P.value = "P";
        S.value = "S";
        U.value = "U";
        X.value = "X";
        ENUM_ALL_OTHERS.value = "All others";
        ENUM_0.value = "0";
        ENUM_1.value = "1";
        ENUM_2.value = "2";
        ENUM_3.value = "3";
        ENUM_4.value = "4";
        _UNKNOWN.value = null;

        valueMap.put("E", E);
        valueMap.put("I", I);
        valueMap.put("M", M);
        valueMap.put("N", N);
        valueMap.put("P", P);
        valueMap.put("S", S);
        valueMap.put("U", U);
        valueMap.put("X", X);
        valueMap.put("All others", ENUM_ALL_OTHERS);
        valueMap.put("0", ENUM_0);
        valueMap.put("1", ENUM_1);
        valueMap.put("2", ENUM_2);
        valueMap.put("3", ENUM_3);
        valueMap.put("4", ENUM_4);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CVVCode constructFromString(String toConvert) throws IOException {
        CVVCode enumValue = fromString(toConvert);
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
    public static CVVCode fromString(String toConvert) {
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
     * Convert list of CVVCode values to list of string values.
     * @param toConvert The list of CVVCode values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CVVCode> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CVVCode enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 