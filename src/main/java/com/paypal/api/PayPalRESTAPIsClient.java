/*
 * PayPalRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api;

import com.paypal.api.authentication.ClientCredentialsAuthManager;
import com.paypal.api.authentication.ClientCredentialsAuthModel;
import com.paypal.api.controllers.OAuthAuthorizationController;
import com.paypal.api.controllers.OrdersController;
import com.paypal.api.controllers.PaymentsController;
import com.paypal.api.controllers.VaultController;
import com.paypal.api.http.client.HttpCallback;
import com.paypal.api.http.client.HttpClientConfiguration;
import com.paypal.api.http.client.ReadonlyHttpClientConfiguration;
import com.paypal.api.logging.configuration.ApiLoggingConfiguration;
import com.paypal.api.logging.configuration.ReadonlyLoggingConfiguration;
import com.paypal.api.models.OAuthToken;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class PayPalRESTAPIsClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private OrdersController orders;
    private PaymentsController payments;
    private VaultController vault;
    private OAuthAuthorizationController oAuthAuthorization;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "PayPal REST API Java SDK, Version: 2.16.0, on OS {os-info}";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * Logging Configuration instance.
     */
    private final ReadonlyLoggingConfiguration loggingConfig;

    /**
     * ClientCredentialsAuthManager.
     */
    private ClientCredentialsAuthManager clientCredentialsAuthManager;

    /**
     * The instance of ClientCredentialsAuthModel.
     */
    private ClientCredentialsAuthModel clientCredentialsAuthModel;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications = new HashMap<String, Authentication>();

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private PayPalRESTAPIsClient(Environment environment, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig,
            ReadonlyLoggingConfiguration loggingConfig,
            ClientCredentialsAuthModel clientCredentialsAuthModel, HttpCallback httpCallback) {
        this.environment = environment;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.loggingConfig = loggingConfig;
        this.httpCallback = httpCallback;

        this.clientCredentialsAuthModel = clientCredentialsAuthModel;

        this.clientCredentialsAuthManager = new ClientCredentialsAuthManager(
                clientCredentialsAuthModel);
        this.authentications.put("Oauth2", clientCredentialsAuthManager);

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .compatibilityFactory(compatibilityFactory)
                .authentication(this.authentications)
                .callback(httpCallback)
                .userAgent(userAgent)
                .loggingConfiguration(((ApiLoggingConfiguration) loggingConfig).getConfiguration())
                .build();
        this.clientCredentialsAuthManager.applyGlobalConfiguration(globalConfig);

        orders = new OrdersController(globalConfig);
        payments = new PaymentsController(globalConfig);
        vault = new VaultController(globalConfig);
        oAuthAuthorization = new OAuthAuthorizationController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of OrdersController.
     * @return orders
     */
    public OrdersController getOrdersController() {
        return orders;
    }

    /**
     * Get the instance of PaymentsController.
     * @return payments
     */
    public PaymentsController getPaymentsController() {
        return payments;
    }

    /**
     * Get the instance of VaultController.
     * @return vault
     */
    public VaultController getVaultController() {
        return vault;
    }

    /**
     * Get the instance of OAuthAuthorizationController.
     * @return oAuthAuthorization
     */
    public OAuthAuthorizationController getOAuthAuthorizationController() {
        return oAuthAuthorization;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * Logging Configuration instance.
     * @return loggingConfig
     */
    public ReadonlyLoggingConfiguration getLoggingConfig() {
        return loggingConfig;
    }

    /**
     * The credentials to use with ClientCredentialsAuth.
     * @return clientCredentialsAuth
     */
    public ClientCredentialsAuth getClientCredentialsAuth() {
        return clientCredentialsAuthManager;
    }

    /**
     * The auth credential model for ClientCredentialsAuth.
     * @return the instance of ClientCredentialsAuthModel
     */
    public ClientCredentialsAuthModel getClientCredentialsAuthModel() {
        return clientCredentialsAuthModel;
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://api-m.paypal.com";
            }
        }
        if (environment.equals(Environment.SANDBOX)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://api-m.sandbox.paypal.com";
            }
        }
        return "https://api-m.sandbox.paypal.com";
    }

    /**
     * Converts this PayPalRESTAPIsClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayPalRESTAPIsClient [" + "environment=" + environment + ", httpClientConfig="
                + httpClientConfig + ", loggingConfig=" + loggingConfig + ", authentications="
                + authentications + "]";
    }

    /**
     * Builds a new {@link PayPalRESTAPIsClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link PayPalRESTAPIsClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.httpClient = getHttpClient();
        builder.clientCredentialsAuth(getClientCredentialsAuthModel()
                .toBuilder().build());
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(() -> ((HttpClientConfiguration) httpClientConfig).newBuilder());
        builder.loggingConfig(() -> ((ApiLoggingConfiguration) loggingConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link PayPalRESTAPIsClient}.
     */
    public static class Builder {

        private Environment environment = Environment.SANDBOX;
        private HttpClient httpClient;
        private ClientCredentialsAuthModel clientCredentialsAuthModel =
                new ClientCredentialsAuthModel.Builder("", "").build();
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();
        private ApiLoggingConfiguration.Builder loggingConfigBuilder = null;


        /**
         * Credentials setter for ClientCredentialsAuth.
         * @param oAuthClientId String value for oAuthClientId.
         * @param oAuthClientSecret String value for oAuthClientSecret.
         * @deprecated This builder method is deprecated.
         * Use {@link #clientCredentialsAuth(ClientCredentialsAuthModel) clientCredentialsAuth} instead.
         * @return The current instance of builder.
         */
        @Deprecated
        public Builder clientCredentialsAuthCredentials(String oAuthClientId,
                String oAuthClientSecret) {
            clientCredentialsAuthModel = clientCredentialsAuthModel.toBuilder()
                .oAuthClientId(oAuthClientId)
                .oAuthClientSecret(oAuthClientSecret)
                .build();
            return this;
        }

        /**
         * Credentials setter for ClientCredentialsAuth.
         * @param oAuthToken OAuthToken value for oAuthToken.
         * @deprecated This builder method is deprecated.
         * Use {@link #clientCredentialsAuth(ClientCredentialsAuthModel) clientCredentialsAuth} instead.
         * @return Builder
         */
        @Deprecated
        public Builder oAuthToken(OAuthToken oAuthToken) {
            clientCredentialsAuthModel = clientCredentialsAuthModel.toBuilder()
                .oAuthToken(oAuthToken)
                .build();
            return this;
        }

        /**
         * Credentials setter for ClientCredentialsAuth.
         * @param clientCredentialsAuthModel The instance of ClientCredentialsAuthModel.
         * @return The current instance of builder.
         */
        public Builder clientCredentialsAuth(
                ClientCredentialsAuthModel clientCredentialsAuthModel) {
            this.clientCredentialsAuthModel = clientCredentialsAuthModel;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * Setter for the Builder of LoggingConfiguration, takes in an operation to be
         * performed on the builder instance of logging configuration.
         * @param action Consumer for the builder of LoggingConfiguration.
         * @return Builder
         */
        public Builder loggingConfig(Consumer<ApiLoggingConfiguration.Builder> action) {
            if (loggingConfigBuilder == null) {
                loggingConfigBuilder = new ApiLoggingConfiguration.Builder();
            }

            if (loggingConfigBuilder.build().getLogger() == null) {
                loggingConfigBuilder.useDefaultLogger();
            }

            action.accept(loggingConfigBuilder);
            return this;
        }

        /**
         * Setter for the Builder of LoggingConfiguration with Console Logging.
         *
         * @return Builder
         */
        public Builder loggingConfig() {
            loggingConfigBuilder = new ApiLoggingConfiguration.Builder();
            loggingConfigBuilder.useDefaultLogger();
            return this;
        }

		/**
		 * Private setter for the Builder of LoggingConfiguration, takes in an operation to be
		 * performed on the builder instance of logging configuration.
		 * 
		 * @param supplier Supplier for the builder of LoggingConfiguration.
		 * @return Builder
		 */
		private Builder loggingConfig(Supplier<ApiLoggingConfiguration.Builder> supplier) {
			loggingConfigBuilder = supplier.get();
			return this;
		}

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Private Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param supplier Supplier for the builder of httpClientConfiguration.
         * @return Builder
         */
        private Builder httpClientConfig(Supplier<HttpClientConfiguration.Builder> supplier) {
            httpClientConfigBuilder = supplier.get();
            return this;
        }

        /**
         * Builds a new PayPalRESTAPIsClient object using the set fields.
         * @return PayPalRESTAPIsClient
         */
        public PayPalRESTAPIsClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            ReadonlyLoggingConfiguration loggingConfig = loggingConfigBuilder != null ? loggingConfigBuilder.build() 
                    : new ApiLoggingConfiguration.Builder().build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new PayPalRESTAPIsClient(environment, httpClient, httpClientConfig,
                    loggingConfig, clientCredentialsAuthModel, httpCallback);
        }
    }
}