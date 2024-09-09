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
 * LinkHTTPMethod to be used.
 */
public enum LinkHTTPMethod {
    GET,

    POST,

    PUT,

    DELETE,

    HEAD,

    CONNECT,

    OPTIONS,

    PATCH,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, LinkHTTPMethod> valueMap = new TreeMap<>();
    private String value;

    static {
        GET.value = "GET";
        POST.value = "POST";
        PUT.value = "PUT";
        DELETE.value = "DELETE";
        HEAD.value = "HEAD";
        CONNECT.value = "CONNECT";
        OPTIONS.value = "OPTIONS";
        PATCH.value = "PATCH";
        _UNKNOWN.value = null;

        valueMap.put("GET", GET);
        valueMap.put("POST", POST);
        valueMap.put("PUT", PUT);
        valueMap.put("DELETE", DELETE);
        valueMap.put("HEAD", HEAD);
        valueMap.put("CONNECT", CONNECT);
        valueMap.put("OPTIONS", OPTIONS);
        valueMap.put("PATCH", PATCH);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static LinkHTTPMethod constructFromString(String toConvert) throws IOException {
        LinkHTTPMethod enumValue = fromString(toConvert);
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
    public static LinkHTTPMethod fromString(String toConvert) {
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
     * Convert list of LinkHTTPMethod values to list of string values.
     * @param toConvert The list of LinkHTTPMethod values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<LinkHTTPMethod> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (LinkHTTPMethod enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 