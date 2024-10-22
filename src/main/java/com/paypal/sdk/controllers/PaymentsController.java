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
import com.paypal.sdk.models.AuthorizationsCaptureInput;
import com.paypal.sdk.models.AuthorizationsReauthorizeInput;
import com.paypal.sdk.models.AuthorizationsVoidInput;
import com.paypal.sdk.models.CapturedPayment;
import com.paypal.sdk.models.CapturesRefundInput;
import com.paypal.sdk.models.PaymentAuthorization;
import com.paypal.sdk.models.Refund;
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
public final class PaymentsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public PaymentsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Shows details for an authorized payment, by ID.
     * @param  authorizationId  Required parameter: The ID of the authorized payment for which to
     *         show details.
     * @return    Returns the PaymentAuthorization wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<PaymentAuthorization> authorizationsGet(
            final String authorizationId) throws ApiException, IOException {
        return prepareAuthorizationsGetRequest(authorizationId).execute();
    }

    /**
     * Shows details for an authorized payment, by ID.
     * @param  authorizationId  Required parameter: The ID of the authorized payment for which to
     *         show details.
     * @return    Returns the PaymentAuthorization wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<PaymentAuthorization>> authorizationsGetAsync(
            final String authorizationId) {
        try { 
            return prepareAuthorizationsGetRequest(authorizationId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for authorizationsGet.
     */
    private ApiCall<ApiResponse<PaymentAuthorization>, ApiException> prepareAuthorizationsGetRequest(
            final String authorizationId) throws IOException {
        return new ApiCall.Builder<ApiResponse<PaymentAuthorization>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v2/payments/authorizations/{authorization_id}")
                        .templateParam(param -> param.key("authorization_id").value(authorizationId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, PaymentAuthorization.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication failed due to missing authorization header, or invalid authentication credentials.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("The request failed because the caller has insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The request failed because the resource does not exist.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("The request failed because an internal server error occurred.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("The error response.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Captures an authorized payment, by ID.
     * @param  input  AuthorizationsCaptureInput object containing request parameters
     * @return    Returns the CapturedPayment wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<CapturedPayment> authorizationsCapture(
            final AuthorizationsCaptureInput input) throws ApiException, IOException {
        return prepareAuthorizationsCaptureRequest(input).execute();
    }

    /**
     * Captures an authorized payment, by ID.
     * @param  input  AuthorizationsCaptureInput object containing request parameters
     * @return    Returns the CapturedPayment wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<CapturedPayment>> authorizationsCaptureAsync(
            final AuthorizationsCaptureInput input) {
        try { 
            return prepareAuthorizationsCaptureRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for authorizationsCapture.
     */
    private ApiCall<ApiResponse<CapturedPayment>, ApiException> prepareAuthorizationsCaptureRequest(
            final AuthorizationsCaptureInput input) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<CapturedPayment>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v2/payments/authorizations/{authorization_id}/capture")
                        .bodyParam(param -> param.value(input.getBody()).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(input.getBody()))
                        .templateParam(param -> param.key("authorization_id").value(input.getAuthorizationId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("PayPal-Request-Id")
                                .value(input.getPaypalRequestId()).isRequired(false))
                        .headerParam(param -> param.key("Prefer")
                                .value(input.getPrefer()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, CapturedPayment.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("The request failed because it is not well-formed or is syntactically incorrect or violates schema.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication failed due to missing authorization header, or invalid authentication credentials.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("The request failed because the caller has insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The request failed because the resource does not exist.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setReason("The server has detected a conflict while processing this request.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The request failed because it is semantically incorrect or failed business validation.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("The request failed because an internal server error occurred.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("The error response.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Voids, or cancels, an authorized payment, by ID. You cannot void an authorized payment that
     * has been fully captured.
     * @param  input  AuthorizationsVoidInput object containing request parameters
     * @return    Returns the PaymentAuthorization wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<PaymentAuthorization> authorizationsVoid(
            final AuthorizationsVoidInput input) throws ApiException, IOException {
        return prepareAuthorizationsVoidRequest(input).execute();
    }

    /**
     * Voids, or cancels, an authorized payment, by ID. You cannot void an authorized payment that
     * has been fully captured.
     * @param  input  AuthorizationsVoidInput object containing request parameters
     * @return    Returns the PaymentAuthorization wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<PaymentAuthorization>> authorizationsVoidAsync(
            final AuthorizationsVoidInput input) {
        try { 
            return prepareAuthorizationsVoidRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for authorizationsVoid.
     */
    private ApiCall<ApiResponse<PaymentAuthorization>, ApiException> prepareAuthorizationsVoidRequest(
            final AuthorizationsVoidInput input) throws IOException {
        return new ApiCall.Builder<ApiResponse<PaymentAuthorization>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v2/payments/authorizations/{authorization_id}/void")
                        .templateParam(param -> param.key("authorization_id").value(input.getAuthorizationId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("PayPal-Auth-Assertion")
                                .value(input.getPaypalAuthAssertion()).isRequired(false))
                        .headerParam(param -> param.key("Prefer")
                                .value(input.getPrefer()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, PaymentAuthorization.class))
                        .nullableResponseType(true)
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("The request failed because it is not well-formed or is syntactically incorrect or violates schema.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication failed due to missing authorization header, or invalid authentication credentials.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("The request failed because the caller has insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The request failed because the resource does not exist.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setReason("The request failed because a previous call for the given resource is in progress.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The request failed because it either is semantically incorrect or failed business validation.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("The request failed because an internal server error occurred.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("The error response.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Reauthorizes an authorized PayPal account payment, by ID. To ensure that funds are still
     * available, reauthorize a payment after its initial three-day honor period expires. Within the
     * 29-day authorization period, you can issue multiple re-authorizations after the honor period
     * expires.&lt;br/&gt;&lt;br/&gt;If 30 days have transpired since the date of the original authorization,
     * you must create an authorized payment instead of reauthorizing the original authorized
     * payment.&lt;br/&gt;&lt;br/&gt;A reauthorized payment itself has a new honor period of three
     * days.&lt;br/&gt;&lt;br/&gt;You can reauthorize an authorized payment from 4 to 29 days after the 3-day
     * honor period. The allowed amount depends on context and geography, for example in US it is up
     * to 115% of the original authorized amount, not to exceed an increase of $75
     * USD.&lt;br/&gt;&lt;br/&gt;Supports only the `amount` request parameter.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt;
     * This request is currently not supported for Partner use cases.&lt;/blockquote&gt;.
     * @param  input  AuthorizationsReauthorizeInput object containing request parameters
     * @return    Returns the PaymentAuthorization wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<PaymentAuthorization> authorizationsReauthorize(
            final AuthorizationsReauthorizeInput input) throws ApiException, IOException {
        return prepareAuthorizationsReauthorizeRequest(input).execute();
    }

    /**
     * Reauthorizes an authorized PayPal account payment, by ID. To ensure that funds are still
     * available, reauthorize a payment after its initial three-day honor period expires. Within the
     * 29-day authorization period, you can issue multiple re-authorizations after the honor period
     * expires.&lt;br/&gt;&lt;br/&gt;If 30 days have transpired since the date of the original authorization,
     * you must create an authorized payment instead of reauthorizing the original authorized
     * payment.&lt;br/&gt;&lt;br/&gt;A reauthorized payment itself has a new honor period of three
     * days.&lt;br/&gt;&lt;br/&gt;You can reauthorize an authorized payment from 4 to 29 days after the 3-day
     * honor period. The allowed amount depends on context and geography, for example in US it is up
     * to 115% of the original authorized amount, not to exceed an increase of $75
     * USD.&lt;br/&gt;&lt;br/&gt;Supports only the `amount` request parameter.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt;
     * This request is currently not supported for Partner use cases.&lt;/blockquote&gt;.
     * @param  input  AuthorizationsReauthorizeInput object containing request parameters
     * @return    Returns the PaymentAuthorization wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<PaymentAuthorization>> authorizationsReauthorizeAsync(
            final AuthorizationsReauthorizeInput input) {
        try { 
            return prepareAuthorizationsReauthorizeRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for authorizationsReauthorize.
     */
    private ApiCall<ApiResponse<PaymentAuthorization>, ApiException> prepareAuthorizationsReauthorizeRequest(
            final AuthorizationsReauthorizeInput input) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<PaymentAuthorization>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v2/payments/authorizations/{authorization_id}/reauthorize")
                        .bodyParam(param -> param.value(input.getBody()).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(input.getBody()))
                        .templateParam(param -> param.key("authorization_id").value(input.getAuthorizationId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("PayPal-Request-Id")
                                .value(input.getPaypalRequestId()).isRequired(false))
                        .headerParam(param -> param.key("Prefer")
                                .value(input.getPrefer()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, PaymentAuthorization.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("The request failed because it is not well-formed or is syntactically incorrect or violates schema.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication failed due to missing authorization header, or invalid authentication credentials.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("The request failed because the caller has insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The request failed because the resource does not exist.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The request failed because it either is semantically incorrect or failed business validation.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("The request failed because an internal server error occurred.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("The error response.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Shows details for a captured payment, by ID.
     * @param  captureId  Required parameter: The PayPal-generated ID for the captured payment for
     *         which to show details.
     * @return    Returns the CapturedPayment wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<CapturedPayment> capturesGet(
            final String captureId) throws ApiException, IOException {
        return prepareCapturesGetRequest(captureId).execute();
    }

    /**
     * Shows details for a captured payment, by ID.
     * @param  captureId  Required parameter: The PayPal-generated ID for the captured payment for
     *         which to show details.
     * @return    Returns the CapturedPayment wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<CapturedPayment>> capturesGetAsync(
            final String captureId) {
        try { 
            return prepareCapturesGetRequest(captureId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for capturesGet.
     */
    private ApiCall<ApiResponse<CapturedPayment>, ApiException> prepareCapturesGetRequest(
            final String captureId) throws IOException {
        return new ApiCall.Builder<ApiResponse<CapturedPayment>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v2/payments/captures/{capture_id}")
                        .templateParam(param -> param.key("capture_id").value(captureId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, CapturedPayment.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication failed due to missing authorization header, or invalid authentication credentials.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("The request failed because the caller has insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The request failed because the resource does not exist.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("The request failed because an internal server error occurred.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("The error response.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Refunds a captured payment, by ID. For a full refund, include an empty payload in the JSON
     * request body. For a partial refund, include an &lt;code&gt;amount&lt;/code&gt; object in the JSON request
     * body.
     * @param  input  CapturesRefundInput object containing request parameters
     * @return    Returns the Refund wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Refund> capturesRefund(
            final CapturesRefundInput input) throws ApiException, IOException {
        return prepareCapturesRefundRequest(input).execute();
    }

    /**
     * Refunds a captured payment, by ID. For a full refund, include an empty payload in the JSON
     * request body. For a partial refund, include an &lt;code&gt;amount&lt;/code&gt; object in the JSON request
     * body.
     * @param  input  CapturesRefundInput object containing request parameters
     * @return    Returns the Refund wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Refund>> capturesRefundAsync(
            final CapturesRefundInput input) {
        try { 
            return prepareCapturesRefundRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for capturesRefund.
     */
    private ApiCall<ApiResponse<Refund>, ApiException> prepareCapturesRefundRequest(
            final CapturesRefundInput input) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<Refund>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v2/payments/captures/{capture_id}/refund")
                        .bodyParam(param -> param.value(input.getBody()).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(input.getBody()))
                        .templateParam(param -> param.key("capture_id").value(input.getCaptureId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("PayPal-Request-Id")
                                .value(input.getPaypalRequestId()).isRequired(false))
                        .headerParam(param -> param.key("Prefer")
                                .value(input.getPrefer()).isRequired(false))
                        .headerParam(param -> param.key("PayPal-Auth-Assertion")
                                .value(input.getPaypalAuthAssertion()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, Refund.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("The request failed because it is not well-formed or is syntactically incorrect or violates schema.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication failed due to missing authorization header, or invalid authentication credentials.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("The request failed because the caller has insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The request failed because the resource does not exist.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setReason("The request failed because a previous call for the given resource is in progress.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The request failed because it either is semantically incorrect or failed business validation.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("The request failed because an internal server error occurred.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("The error response.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Shows details for a refund, by ID.
     * @param  refundId  Required parameter: The PayPal-generated ID for the refund for which to
     *         show details.
     * @return    Returns the Refund wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Refund> refundsGet(
            final String refundId) throws ApiException, IOException {
        return prepareRefundsGetRequest(refundId).execute();
    }

    /**
     * Shows details for a refund, by ID.
     * @param  refundId  Required parameter: The PayPal-generated ID for the refund for which to
     *         show details.
     * @return    Returns the Refund wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Refund>> refundsGetAsync(
            final String refundId) {
        try { 
            return prepareRefundsGetRequest(refundId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for refundsGet.
     */
    private ApiCall<ApiResponse<Refund>, ApiException> prepareRefundsGetRequest(
            final String refundId) throws IOException {
        return new ApiCall.Builder<ApiResponse<Refund>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v2/payments/refunds/{refund_id}")
                        .templateParam(param -> param.key("refund_id").value(refundId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, Refund.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication failed due to missing authorization header, or invalid authentication credentials.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("The request failed because the caller has insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The request failed because the resource does not exist.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("The request failed because an internal server error occurred.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("The error response.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}