/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.paypal.sdk.ApiHelper;
import com.paypal.sdk.Server;
import com.paypal.sdk.exceptions.ApiException;
import com.paypal.sdk.exceptions.ErrorException;
import com.paypal.sdk.http.request.HttpMethod;
import com.paypal.sdk.http.response.ApiResponse;
import com.paypal.sdk.models.CreatePaymentTokenInput;
import com.paypal.sdk.models.CreateSetupTokenInput;
import com.paypal.sdk.models.CustomerVaultPaymentTokensResponse;
import com.paypal.sdk.models.ListCustomerPaymentTokensInput;
import com.paypal.sdk.models.PaymentTokenResponse;
import com.paypal.sdk.models.SetupTokenResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class VaultController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public VaultController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates a Payment Token from the given payment source and adds it to the Vault of the
     * associated customer.
     * @param  input  CreatePaymentTokenInput object containing request parameters
     * @return    Returns the PaymentTokenResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<PaymentTokenResponse> createPaymentToken(
            final CreatePaymentTokenInput input) throws ApiException, IOException {
        return prepareCreatePaymentTokenRequest(input).execute();
    }

    /**
     * Creates a Payment Token from the given payment source and adds it to the Vault of the
     * associated customer.
     * @param  input  CreatePaymentTokenInput object containing request parameters
     * @return    Returns the PaymentTokenResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<PaymentTokenResponse>> createPaymentTokenAsync(
            final CreatePaymentTokenInput input) {
        try { 
            return prepareCreatePaymentTokenRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for createPaymentToken.
     */
    private ApiCall<ApiResponse<PaymentTokenResponse>, ApiException> prepareCreatePaymentTokenRequest(
            final CreatePaymentTokenInput input) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<PaymentTokenResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v3/vault/payment-tokens")
                        .bodyParam(param -> param.value(input.getBody()))
                        .bodySerializer(() ->  ApiHelper.serialize(input.getBody()))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("PayPal-Request-Id")
                                .value(input.getPaypalRequestId()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, PaymentTokenResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Request is not well-formed, syntactically incorrect, or violates schema.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Authorization failed due to insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Request contains reference to resources that do not exist.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The requested action could not be performed, semantically incorrect, or failed business validation.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("An internal server error has occurred.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns all payment tokens for a customer.
     * @param  input  ListCustomerPaymentTokensInput object containing request parameters
     * @return    Returns the CustomerVaultPaymentTokensResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<CustomerVaultPaymentTokensResponse> listCustomerPaymentTokens(
            final ListCustomerPaymentTokensInput input) throws ApiException, IOException {
        return prepareListCustomerPaymentTokensRequest(input).execute();
    }

    /**
     * Returns all payment tokens for a customer.
     * @param  input  ListCustomerPaymentTokensInput object containing request parameters
     * @return    Returns the CustomerVaultPaymentTokensResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<CustomerVaultPaymentTokensResponse>> listCustomerPaymentTokensAsync(
            final ListCustomerPaymentTokensInput input) {
        try { 
            return prepareListCustomerPaymentTokensRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listCustomerPaymentTokens.
     */
    private ApiCall<ApiResponse<CustomerVaultPaymentTokensResponse>, ApiException> prepareListCustomerPaymentTokensRequest(
            final ListCustomerPaymentTokensInput input) throws IOException {
        return new ApiCall.Builder<ApiResponse<CustomerVaultPaymentTokensResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v3/vault/payment-tokens")
                        .queryParam(param -> param.key("customer_id")
                                .value(input.getCustomerId()))
                        .queryParam(param -> param.key("page_size")
                                .value(input.getPageSize()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("total_required")
                                .value(input.getTotalRequired()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, CustomerVaultPaymentTokensResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Request is not well-formed, syntactically incorrect, or violates schema.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Authorization failed due to insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("An internal server error has occurred.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a readable representation of vaulted payment source associated with the payment token
     * id.
     * @param  id  Required parameter: ID of the payment token.
     * @return    Returns the PaymentTokenResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<PaymentTokenResponse> getPaymentToken(
            final String id) throws ApiException, IOException {
        return prepareGetPaymentTokenRequest(id).execute();
    }

    /**
     * Returns a readable representation of vaulted payment source associated with the payment token
     * id.
     * @param  id  Required parameter: ID of the payment token.
     * @return    Returns the PaymentTokenResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<PaymentTokenResponse>> getPaymentTokenAsync(
            final String id) {
        try { 
            return prepareGetPaymentTokenRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getPaymentToken.
     */
    private ApiCall<ApiResponse<PaymentTokenResponse>, ApiException> prepareGetPaymentTokenRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<ApiResponse<PaymentTokenResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v3/vault/payment-tokens/{id}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, PaymentTokenResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Authorization failed due to insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The specified resource does not exist.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The requested action could not be performed, semantically incorrect, or failed business validation.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("An internal server error has occurred.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Delete the payment token associated with the payment token id.
     * @param  id  Required parameter: ID of the payment token.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Void> deletePaymentToken(
            final String id) throws ApiException, IOException {
        return prepareDeletePaymentTokenRequest(id).execute();
    }

    /**
     * Delete the payment token associated with the payment token id.
     * @param  id  Required parameter: ID of the payment token.
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Void>> deletePaymentTokenAsync(
            final String id) {
        try { 
            return prepareDeletePaymentTokenRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for deletePaymentToken.
     */
    private ApiCall<ApiResponse<Void>, ApiException> prepareDeletePaymentTokenRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<ApiResponse<Void>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v3/vault/payment-tokens/{id}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Request is not well-formed, syntactically incorrect, or violates schema.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Authorization failed due to insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("An internal server error has occurred.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates a Setup Token from the given payment source and adds it to the Vault of the
     * associated customer.
     * @param  input  CreateSetupTokenInput object containing request parameters
     * @return    Returns the SetupTokenResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SetupTokenResponse> createSetupToken(
            final CreateSetupTokenInput input) throws ApiException, IOException {
        return prepareCreateSetupTokenRequest(input).execute();
    }

    /**
     * Creates a Setup Token from the given payment source and adds it to the Vault of the
     * associated customer.
     * @param  input  CreateSetupTokenInput object containing request parameters
     * @return    Returns the SetupTokenResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SetupTokenResponse>> createSetupTokenAsync(
            final CreateSetupTokenInput input) {
        try { 
            return prepareCreateSetupTokenRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for createSetupToken.
     */
    private ApiCall<ApiResponse<SetupTokenResponse>, ApiException> prepareCreateSetupTokenRequest(
            final CreateSetupTokenInput input) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<SetupTokenResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v3/vault/setup-tokens")
                        .bodyParam(param -> param.value(input.getBody()))
                        .bodySerializer(() ->  ApiHelper.serialize(input.getBody()))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("PayPal-Request-Id")
                                .value(input.getPaypalRequestId()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, SetupTokenResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Request is not well-formed, syntactically incorrect, or violates schema.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Authorization failed due to insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The requested action could not be performed, semantically incorrect, or failed business validation.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("An internal server error has occurred.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a readable representation of temporarily vaulted payment source associated with the
     * setup token id.
     * @param  id  Required parameter: ID of the setup token.
     * @return    Returns the SetupTokenResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SetupTokenResponse> getSetupToken(
            final String id) throws ApiException, IOException {
        return prepareGetSetupTokenRequest(id).execute();
    }

    /**
     * Returns a readable representation of temporarily vaulted payment source associated with the
     * setup token id.
     * @param  id  Required parameter: ID of the setup token.
     * @return    Returns the SetupTokenResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SetupTokenResponse>> getSetupTokenAsync(
            final String id) {
        try { 
            return prepareGetSetupTokenRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getSetupToken.
     */
    private ApiCall<ApiResponse<SetupTokenResponse>, ApiException> prepareGetSetupTokenRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<ApiResponse<SetupTokenResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v3/vault/setup-tokens/{id}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, SetupTokenResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Authorization failed due to insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The specified resource does not exist.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The requested action could not be performed, semantically incorrect, or failed business validation.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("An internal server error has occurred.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}