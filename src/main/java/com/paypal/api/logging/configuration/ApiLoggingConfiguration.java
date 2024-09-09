/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.logging.configuration;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.event.Level;

import io.apimatic.core.logger.configurations.SdkLoggingConfiguration;
import io.apimatic.core.logger.configurations.SdkRequestLoggingConfiguration;
import io.apimatic.core.logger.configurations.SdkResponseLoggingConfiguration;
import io.apimatic.coreinterfaces.logger.configuration.LoggingConfiguration;

/**
 * Class to hold API logging Configuration.
 */
public class ApiLoggingConfiguration implements ReadonlyLoggingConfiguration {

    private final LoggingConfiguration configuration;
    private final ApiRequestLoggingConfiguration requestLoggingConfiguration;
    private final ApiResponseLoggingConfiguration responseLoggingConfiguration;
    
    private ApiLoggingConfiguration(SdkLoggingConfiguration.Builder builder,
            ApiRequestLoggingConfiguration.Builder requestLoggingConfigurationBuilder,
            ApiResponseLoggingConfiguration.Builder responseLoggingConfigurationBuilder) {
        configuration = builder.build();
        requestLoggingConfiguration = requestLoggingConfigurationBuilder.build();
        responseLoggingConfiguration = responseLoggingConfigurationBuilder.build();
    }
    
    /**
     * Getter for Logger.
     * @return Logger instance.
     */
    public Logger getLogger() {
        if (configuration.getLogger() == null) {
            return null;
        }

        return configuration.getLogger().getLogger();
    }

    /**
     * Getter for level.
     * @return Level of logging.
     */
    public Level getLevel() {
        return configuration.getLevel();
    }

    /**
     * Getter for mask sensitive header.
     * @return True if masking of sensitive headers is enabled, otherwise false.
     */
    public boolean getMaskSensitiveHeaders() {
        return configuration.getMaskSensitiveHeaders();
    }

    /**
     * Getter for the Request.
     * @return The Request object.
     */
    public ReadonlyRequestLoggingConfiguration getRequestConfig() {
        return requestLoggingConfiguration;
    }

    /**
     * Getter for the ResponseLoggingConfiguration.
     * @return The ResponseLoggingConfiguration object.
     */
    public ReadonlyResponseLoggingConfiguration getResponseConfig() {
        return responseLoggingConfiguration;
    }

    /**
     * Returns the SdkLoggingConfiguration instance.
     * @return ClientConfiguration
     */
    public LoggingConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * Converts this LoggingConfiguration into string format.
     * @return String representation of this class.
     */
    @Override
    public String toString() {
        return "ApiLoggingConfiguration [logger=" + getLogger() + " level=" + getLevel()
                + " maskSensitiveHeaders=" + getMaskSensitiveHeaders() + " requestLoggingConfiguration="
                + getRequestConfig() + " responseLoggingConfiguration=" + getResponseConfig() + "]";
    }

    /**
     * Builds a new {@link ApiLoggingConfiguration.Builder} object. Creates the
     * instance with the current state.
     * @return a new {@link ApiLoggingConfiguration.Builder} object.
     */
    public Builder newBuilder() {
        Builder builder = new Builder().logger(configuration.getLogger()).level(getLevel())
                .maskSensitiveHeaders(getMaskSensitiveHeaders());
        builder.apiRequestLoggingBuilder = 
                ((ApiRequestLoggingConfiguration) getRequestConfig()).newBuilder();
        builder.apiResponseLoggingBuilder = 
                ((ApiResponseLoggingConfiguration) getResponseConfig()).newBuilder();
        return builder;
    }

    /**
     * Class to build instances of {@link ApiLoggingConfiguration}.
     */
    public static class Builder {
        private final SdkLoggingConfiguration.Builder loggingBuilder =
                new SdkLoggingConfiguration.Builder();
        private ApiRequestLoggingConfiguration.Builder apiRequestLoggingBuilder = 
                new ApiRequestLoggingConfiguration.Builder();
        private ApiResponseLoggingConfiguration.Builder apiResponseLoggingBuilder = 
                new ApiResponseLoggingConfiguration.Builder();

        /***
         * Set Logger for logging.
         * @param logger The slf4j logger implementation.
         * @return {@link ApiLoggingConfiguration.Builder}.
         */
        public Builder logger(Logger logger) {
            loggingBuilder.logger(logger);
            return this;
        }

        /***
         * Set Logger wrapper for logging.
         * @param logger The logger wrapper instance
         * @return {@link ApiLoggingConfiguration.Builder}.
         */
        private Builder logger(io.apimatic.coreinterfaces.logger.Logger logger) {
            loggingBuilder.logger(logger);
            return this;
        }

        /**
         * Set level for logging.
         * @param level specify level of all logs.
         * @return {@link ApiLoggingConfiguration.Builder}.
         */
        public Builder level(Level level) {
            loggingBuilder.level(level);
            return this;
        }

        /**
         * Set mask sensitive headers flag.
         * @param maskSensitiveHeaders flag to enable disable masking.
         * @return {@link ApiLoggingConfiguration.Builder}.
         */
        public Builder maskSensitiveHeaders(boolean maskSensitiveHeaders) {
            loggingBuilder.maskSensitiveHeaders(maskSensitiveHeaders);
            return this;
        }

        /**
         * Sets the RequestLoggingConfiguration.Builder for the builder.
         * @param action The {@link ApiRequestLoggingConfiguration} Builder object.
         * @return {@link ApiLoggingConfiguration.Builder}.
         */
        public Builder requestConfig(Consumer<ApiRequestLoggingConfiguration.Builder> action) {
            if (action != null) {
                action.accept(apiRequestLoggingBuilder);
            }
            ApiRequestLoggingConfiguration obj = apiRequestLoggingBuilder.build();
            
            SdkRequestLoggingConfiguration.Builder requestConfigBuilder = 
                    new SdkRequestLoggingConfiguration.Builder().body(obj.shouldLogBody())
                            .headers(obj.shouldLogHeaders())
                            .includeQueryInPath(obj.shouldIncludeQueryInPath())
                            .excludeHeaders(obj.getHeadersToExclude().toArray(new String[0]))
                            .includeHeaders(obj.getHeadersToInclude().toArray(new String[0]))
                            .unmaskHeaders(obj.getHeadersToUnmask().toArray(new String[0]));

            loggingBuilder.requestConfig(requestConfigBuilder);
            return this;
        }

        /**
         * Sets the ResponseLoggingConfiguration.Builder for the builder.
         * @param action The {@link ApiResponseLoggingConfiguration} Builder object.
         * @return {@link ApiLoggingConfiguration.Builder}.
         */
        public Builder responseConfig(Consumer<ApiResponseLoggingConfiguration.Builder> action) {
            if (action != null) {
                action.accept(apiResponseLoggingBuilder);
            }
            ApiResponseLoggingConfiguration obj = apiResponseLoggingBuilder.build();

            SdkResponseLoggingConfiguration.Builder responseConfigBuilder =
                    new SdkResponseLoggingConfiguration.Builder().body(obj.shouldLogBody())
                            .headers(obj.shouldLogHeaders())
                            .excludeHeaders(obj.getHeadersToExclude().toArray(new String[0]))
                            .includeHeaders(obj.getHeadersToInclude().toArray(new String[0]))
                            .unmaskHeaders(obj.getHeadersToUnmask().toArray(new String[0]));

            loggingBuilder.responseConfig(responseConfigBuilder);
            return this;
        }

        /**
         * Sets the logger instance to ConsoleLogger.
         * @return {@link ApiLoggingConfiguration.Builder}.
         */
        public Builder useDefaultLogger() {
            loggingBuilder.useDefaultLogger();
            return this;
        }

        /**
         * Builds a new LoggingConfiguration object using the set fields.
         * @return {@link ApiLoggingConfiguration}.
         */
        public ApiLoggingConfiguration build() {
            return new ApiLoggingConfiguration(loggingBuilder, apiRequestLoggingBuilder,
                    apiResponseLoggingBuilder);
        }
    }
}