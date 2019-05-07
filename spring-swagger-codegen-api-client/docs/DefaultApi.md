# DefaultApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticatedGet**](DefaultApi.md#authenticatedGet) | **GET** /authenticated | 
[**relationGraphGet**](DefaultApi.md#relationGraphGet) | **GET** /relation/graph | Relation graphs.
[**relationTypesGet**](DefaultApi.md#relationTypesGet) | **GET** /relation/types | Relation graphs.


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

<a name="relationGraphGet"></a>
# **relationGraphGet**
> ERRORUNKNOWN relationGraphGet(relationType)

Relation graphs.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String relationType = "relationType_example"; // String | 
try {
    ERRORUNKNOWN result = apiInstance.relationGraphGet(relationType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#relationGraphGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationType** | **String**|  |

### Return type

[**ERRORUNKNOWN**](ERRORUNKNOWN.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="relationTypesGet"></a>
# **relationTypesGet**
> ERRORUNKNOWN relationTypesGet()

Relation graphs.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ERRORUNKNOWN result = apiInstance.relationTypesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#relationTypesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ERRORUNKNOWN**](ERRORUNKNOWN.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

