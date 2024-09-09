/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.logging.configuration;

import java.util.List;

/**
 * Interface to hold response logging configuration.
 */
public interface ReadonlyResponseLoggingConfiguration {

    /**
     * Checks if logging of request body is enabled.
     * @return True if logging of request body is enabled, otherwise false.
     */
    boolean shouldLogBody();

    /**
     * Checks if logging of request headers is enabled.
     * @return True if logging of request headers is enabled, otherwise false.
     */
    boolean shouldLogHeaders();

    /**
     * Gets the list of headers to include in logging.
     * @return An unmodifiable list of headers to include.
     */
    List<String> getHeadersToInclude();

    /**
     * Gets the list of headers to exclude from logging.
     * @return An unmodifiable list of headers to exclude.
     */
    List<String> getHeadersToExclude();
}