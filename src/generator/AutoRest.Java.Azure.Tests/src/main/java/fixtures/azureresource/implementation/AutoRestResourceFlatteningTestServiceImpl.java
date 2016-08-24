/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureresource.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.Resource;
import com.microsoft.azure.RestClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import fixtures.azureresource.AutoRestResourceFlatteningTestService;
import fixtures.azureresource.models.ErrorException;
import fixtures.azureresource.models.FlattenedProduct;
import fixtures.azureresource.models.ResourceCollection;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the AutoRestResourceFlatteningTestServiceImpl class.
 */
public final class AutoRestResourceFlatteningTestServiceImpl extends AzureServiceClient implements AutoRestResourceFlatteningTestService {
    /** The Retrofit service to perform REST calls. */
    private AutoRestResourceFlatteningTestServiceService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutoRestResourceFlatteningTestServiceImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutoRestResourceFlatteningTestServiceImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutoRestResourceFlatteningTestServiceImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestResourceFlatteningTestServiceImpl(ServiceClientCredentials credentials) {
        this("http://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestResourceFlatteningTestServiceImpl(String baseUrl, ServiceClientCredentials credentials) {
        this(new RestClient.Builder()
                .withBaseUrl(baseUrl)
                .withCredentials(credentials)
                .build());
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AutoRestResourceFlatteningTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.azureClient = new AzureClient(this);
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("Azure-SDK-For-Java/%s (%s)",
                getClass().getPackage().getImplementationVersion(),
                "AutoRestResourceFlatteningTestService, 1.0.0");
    }

    private void initializeService() {
        service = restClient().retrofit().create(AutoRestResourceFlatteningTestServiceService.class);
    }

    /**
     * The interface defining all the services for AutoRestResourceFlatteningTestService to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AutoRestResourceFlatteningTestServiceService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("azure/resource-flatten/array")
        Observable<Response<ResponseBody>> putArray(@Body List<Resource> resourceArray, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azure/resource-flatten/array")
        Observable<Response<ResponseBody>> getArray(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("azure/resource-flatten/dictionary")
        Observable<Response<ResponseBody>> putDictionary(@Body Map<String, FlattenedProduct> resourceDictionary, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azure/resource-flatten/dictionary")
        Observable<Response<ResponseBody>> getDictionary(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("azure/resource-flatten/resourcecollection")
        Observable<Response<ResponseBody>> putResourceCollection(@Body ResourceCollection resourceComplexObject, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azure/resource-flatten/resourcecollection")
        Observable<Response<ResponseBody>> getResourceCollection(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Put External Resource as an Array.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putArray() throws ErrorException, IOException {
        return putArrayAsync().toBlocking().single();
    }

    /**
     * Put External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putArrayAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putArrayAsync(), serviceCallback);
    }

    /**
     * Put External Resource as an Array.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putArrayAsync() {
        final List<Resource> resourceArray = null;
        return service.putArray(resourceArray, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putArrayDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putArray(List<Resource> resourceArray) throws ErrorException, IOException {
        return putArrayAsync(resourceArray).toBlocking().single();
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putArrayAsync(List<Resource> resourceArray, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putArrayAsync(resourceArray), serviceCallback);
    }

    /**
     * Put External Resource as an Array.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putArrayAsync(List<Resource> resourceArray) {
        Validator.validate(resourceArray);
        return service.putArray(resourceArray, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putArrayDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putArrayDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get External Resource as an Array.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;FlattenedProduct&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<FlattenedProduct>> getArray() throws ErrorException, IOException {
        return getArrayAsync().toBlocking().single();
    }

    /**
     * Get External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<List<FlattenedProduct>> getArrayAsync(final ServiceCallback<List<FlattenedProduct>> serviceCallback) {
        return ServiceCall.create(getArrayAsync(), serviceCallback);
    }

    /**
     * Get External Resource as an Array.
     *
     * @return the List&lt;FlattenedProduct&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<List<FlattenedProduct>>> getArrayAsync() {
        return service.getArray(this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<FlattenedProduct>>>>() {
                @Override
                public Observable<ServiceResponse<List<FlattenedProduct>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<FlattenedProduct>> clientResponse = getArrayDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<FlattenedProduct>> getArrayDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<List<FlattenedProduct>, ErrorException>(this.mapperAdapter())
                .register(200, new TypeToken<List<FlattenedProduct>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putDictionary() throws ErrorException, IOException {
        return putDictionaryAsync().toBlocking().single();
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putDictionaryAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putDictionaryAsync(), serviceCallback);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putDictionaryAsync() {
        final Map<String, FlattenedProduct> resourceDictionary = null;
        return service.putDictionary(resourceDictionary, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putDictionaryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putDictionary(Map<String, FlattenedProduct> resourceDictionary) throws ErrorException, IOException {
        return putDictionaryAsync(resourceDictionary).toBlocking().single();
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putDictionaryAsync(resourceDictionary), serviceCallback);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary) {
        Validator.validate(resourceDictionary);
        return service.putDictionary(resourceDictionary, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putDictionaryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putDictionaryDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Map&lt;String, FlattenedProduct&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Map<String, FlattenedProduct>> getDictionary() throws ErrorException, IOException {
        return getDictionaryAsync().toBlocking().single();
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Map<String, FlattenedProduct>> getDictionaryAsync(final ServiceCallback<Map<String, FlattenedProduct>> serviceCallback) {
        return ServiceCall.create(getDictionaryAsync(), serviceCallback);
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @return the Map&lt;String, FlattenedProduct&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Map<String, FlattenedProduct>>> getDictionaryAsync() {
        return service.getDictionary(this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Map<String, FlattenedProduct>>>>() {
                @Override
                public Observable<ServiceResponse<Map<String, FlattenedProduct>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Map<String, FlattenedProduct>> clientResponse = getDictionaryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Map<String, FlattenedProduct>> getDictionaryDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Map<String, FlattenedProduct>, ErrorException>(this.mapperAdapter())
                .register(200, new TypeToken<Map<String, FlattenedProduct>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putResourceCollection() throws ErrorException, IOException {
        return putResourceCollectionAsync().toBlocking().single();
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putResourceCollectionAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putResourceCollectionAsync(), serviceCallback);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putResourceCollectionAsync() {
        final ResourceCollection resourceComplexObject = null;
        return service.putResourceCollection(resourceComplexObject, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putResourceCollectionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putResourceCollection(ResourceCollection resourceComplexObject) throws ErrorException, IOException {
        return putResourceCollectionAsync(resourceComplexObject).toBlocking().single();
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putResourceCollectionAsync(ResourceCollection resourceComplexObject, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putResourceCollectionAsync(resourceComplexObject), serviceCallback);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putResourceCollectionAsync(ResourceCollection resourceComplexObject) {
        Validator.validate(resourceComplexObject);
        return service.putResourceCollection(resourceComplexObject, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putResourceCollectionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putResourceCollectionDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ResourceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ResourceCollection> getResourceCollection() throws ErrorException, IOException {
        return getResourceCollectionAsync().toBlocking().single();
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<ResourceCollection> getResourceCollectionAsync(final ServiceCallback<ResourceCollection> serviceCallback) {
        return ServiceCall.create(getResourceCollectionAsync(), serviceCallback);
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @return the ResourceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<ResourceCollection>> getResourceCollectionAsync() {
        return service.getResourceCollection(this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceCollection>>>() {
                @Override
                public Observable<ServiceResponse<ResourceCollection>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceCollection> clientResponse = getResourceCollectionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceCollection> getResourceCollectionDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<ResourceCollection, ErrorException>(this.mapperAdapter())
                .register(200, new TypeToken<ResourceCollection>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
