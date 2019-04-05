# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticatedGet**](DefaultApi.md#authenticatedGet) | **GET** /authenticated | 


<a name="authenticatedGet"></a>
# **authenticatedGet**
> authenticatedGet()



### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.authenticatedGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#authenticatedGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

