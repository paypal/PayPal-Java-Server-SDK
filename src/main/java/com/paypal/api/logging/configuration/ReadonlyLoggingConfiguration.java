/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.logging.configuration;

import org.slf4j.Logger;
import org.slf4j.event.Level;

/**
 * Interface to hold logging Configuration.
 */
public interface ReadonlyLoggingConfiguration {

    /***
     * Getter for Logger
     * @return Logger Instance
     */
    Logger getLogger();

    /**
     * Getter for level.
     * @return Level of logging.
     */
    Level getLevel();

    /**
     * Getter for mask sensitive header
     * @return True if masking of sensitive headers is enabled, otherwise false.
     */
    boolean getMaskSensitiveHeaders();

    /**
     * Getter for ReadonlyRequestLoggingConfiguration
     * @return ReadonlyRequestLoggingConfiguration
     */
    ReadonlyRequestLoggingConfiguration getRequestConfig();

    /**
     * Getter for ReadonlyResponseLoggingConfiguration
     * @return {@link ReadonlyResponseLoggingConfiguration}
     */
    ReadonlyResponseLoggingConfiguration getResponseConfig();
}