/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api;

import com.paypal.api.authentication.ClientCredentialsAuthModel;
import com.paypal.api.http.client.ReadonlyHttpClientConfiguration;
import com.paypal.api.logging.configuration.ReadonlyLoggingConfiguration;

/**
 * Configuration Interface for the library.
 */
public interface Configuration {

    /**
     * Current API environment.
     * @return a copy of environment
     */
    Environment getEnvironment();

    /**
     * Http Client Configuration instance.
     * @return a copy of httpClientConfig
     */
    ReadonlyHttpClientConfiguration getHttpClientConfig();

    /**
     * Logging Configuration instance.
     * @return a copy of loggingConfig
     */
    ReadonlyLoggingConfiguration getLoggingConfig();

    /**
     * The timeout to use for making HTTP requests. The timeout to use for making HTTP requests.
     * @return a copy of timeout
     */
    long timeout();

    /**
     * The credentials to use with ClientCredentialsAuth.
     * @return clientCredentialsAuth
     */
    ClientCredentialsAuth getClientCredentialsAuth();

    /**
     * The auth credential model for ClientCredentialsAuth.
     * @return the instance of ClientCredentialsAuthModel
     */
    ClientCredentialsAuthModel getClientCredentialsAuthModel();

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    String getBaseUri(Server server);

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    String getBaseUri();
}