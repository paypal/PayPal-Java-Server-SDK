/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.controllers;

import com.paypal.sdk.ApiHelper;
import com.paypal.sdk.Server;
import com.paypal.sdk.exceptions.ApiException;
import com.paypal.sdk.exceptions.OAuthProviderException;
import com.paypal.sdk.http.request.HttpMethod;
import com.paypal.sdk.http.response.ApiResponse;
import com.paypal.sdk.models.OAuthToken;
import com.paypal.sdk.models.RequestTokenInput;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class OAuthAuthorizationController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public OAuthAuthorizationController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Create a new OAuth 2 token.
     * @param  input  RequestTokenInput object containing request parameters
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
     * @return    Returns the OAuthToken wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<OAuthToken> requestToken(
            final RequestTokenInput input,
            final Map<String, Object> fieldParameters) throws ApiException, IOException {
        return prepareRequestTokenRequest(input, fieldParameters).execute();
    }

    /**
     * Create a new OAuth 2 token.
     * @param  input  RequestTokenInput object containing request parameters
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
     * @return    Returns the OAuthToken wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<OAuthToken>> requestTokenAsync(
            final RequestTokenInput input,
            final Map<String, Object> fieldParameters) {
        try { 
            return prepareRequestTokenRequest(input, fieldParameters).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for requestToken.
     */
    private ApiCall<ApiResponse<OAuthToken>, ApiException> prepareRequestTokenRequest(
            final RequestTokenInput input,
            final Map<String, Object> fieldParameters) throws IOException {
        return new ApiCall.Builder<ApiResponse<OAuthToken>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v1/oauth2/token")
                        .formParam(param -> param.key("grant_type")
                                .value("client_credentials").isRequired(false))
                        .formParam(param -> param.key("scope")
                                .value(input.getScope()).isRequired(false))
                        .formParam(fieldParameters)
                        .headerParam(param -> param.key("Authorization")
                                .value(input.getAuthorization()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, OAuthToken.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("OAuth 2 provider returned an error.",
                                (reason, context) -> new OAuthProviderException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("OAuth 2 provider says client authentication failed.",
                                (reason, context) -> new OAuthProviderException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}