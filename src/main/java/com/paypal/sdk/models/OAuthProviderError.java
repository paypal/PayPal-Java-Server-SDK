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
 * OAuthProviderError to be used.
 */
public enum OAuthProviderError {
    /**
     * The request is missing a required parameter, includes an unsupported parameter value (other than grant type), repeats a parameter, includes multiple credentials, utilizes more than one mechanism for authenticating the client, or is otherwise malformed.
     */
    INVALID_REQUEST,

    /**
     * Client authentication failed (e.g., unknown client, no client authentication included, or unsupported authentication method).
     */
    INVALID_CLIENT,

    /**
     * The provided authorization grant (e.g., authorization code, resource owner credentials) or refresh token is invalid, expired, revoked, does not match the redirection URI used in the authorization request, or was issued to another client.
     */
    INVALID_GRANT,

    /**
     * The authenticated client is not authorized to use this authorization grant type.
     */
    UNAUTHORIZED_CLIENT,

    /**
     * The authorization grant type is not supported by the authorization server.
     */
    UNSUPPORTED_GRANT_TYPE,

    /**
     * The requested scope is invalid, unknown, malformed, or exceeds the scope granted by the resource owner.
     */
    INVALID_SCOPE;


    private static TreeMap<String, OAuthProviderError> valueMap = new TreeMap<>();
    private String value;

    static {
        INVALID_REQUEST.value = "invalid_request";
        INVALID_CLIENT.value = "invalid_client";
        INVALID_GRANT.value = "invalid_grant";
        UNAUTHORIZED_CLIENT.value = "unauthorized_client";
        UNSUPPORTED_GRANT_TYPE.value = "unsupported_grant_type";
        INVALID_SCOPE.value = "invalid_scope";

        valueMap.put("invalid_request", INVALID_REQUEST);
        valueMap.put("invalid_client", INVALID_CLIENT);
        valueMap.put("invalid_grant", INVALID_GRANT);
        valueMap.put("unauthorized_client", UNAUTHORIZED_CLIENT);
        valueMap.put("unsupported_grant_type", UNSUPPORTED_GRANT_TYPE);
        valueMap.put("invalid_scope", INVALID_SCOPE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OAuthProviderError constructFromString(String toConvert) throws IOException {
        OAuthProviderError enumValue = fromString(toConvert);
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
    public static OAuthProviderError fromString(String toConvert) {
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
        return value.toString();
    }

    /**
     * Convert list of OAuthProviderError values to list of string values.
     * @param toConvert The list of OAuthProviderError values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OAuthProviderError> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OAuthProviderError enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 