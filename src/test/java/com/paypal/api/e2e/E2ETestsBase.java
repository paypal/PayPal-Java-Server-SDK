package com.paypal.api.e2e;

import com.paypal.sdk.Environment;
import com.paypal.sdk.PaypalServerSDKClient;
import com.paypal.sdk.authentication.ClientCredentialsAuthModel;

import io.github.cdimascio.dotenv.Dotenv;

import org.junit.Rule;
import org.junit.rules.Timeout;
import org.slf4j.event.Level;

/**
 * Base class for all test cases.
 */
public class E2ETestsBase {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 30;

    public static final double ASSERT_PRECISION = 0.01;

    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);

    /**
     * Create test configuration from Environment variables.
     */
    protected static PaypalServerSDKClient createConfigurationFromEnvironment() {
        PaypalServerSDKClient.Builder builder = new PaypalServerSDKClient.Builder();
        Dotenv dotenv = Dotenv.load();

        final String environment = "Sandbox";
        final String timeout = "3000";
        final String oAuthClientId = dotenv.get("CLIENT_ID");
        final String oAuthClientSecret = dotenv.get("CLIENT_SECRET");

        if (oAuthClientId != null && oAuthClientSecret != null) {
            builder.clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(oAuthClientId, oAuthClientSecret)
                    .build());
        }
        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    /**
     * Create test configuration.
     */
    protected static PaypalServerSDKClient createConfiguration() {
        // Set Configuration parameters for test execution
        PaypalServerSDKClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .loggingConfig(builder -> builder
                        .level(Level.DEBUG)
                        .requestConfig(logConfigBuilder -> logConfigBuilder.body(true))
                        .responseConfig(logConfigBuilder -> logConfigBuilder.headers(true)))
                .build();

        return config;
    }
}
