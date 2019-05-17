# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticatedGet**](DefaultApi.md#authenticatedGet) | **GET** /authenticated | 
[**relationGraphRelationTypeGet**](DefaultApi.md#relationGraphRelationTypeGet) | **GET** /relation/graph/{relation-type} | Relation graphs.
[**relationGraphRelationTypeIdGet**](DefaultApi.md#relationGraphRelationTypeIdGet) | **GET** /relation/graph/{relation-type}/{id} | Relation graphs.
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

<a name="relationGraphRelationTypeGet"></a>
# **relationGraphRelationTypeGet**
> ERRORUNKNOWN relationGraphRelationTypeGet(relationType)

Relation graphs.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String relationType = "relationType_example"; // String | 
try {
    ERRORUNKNOWN result = apiInstance.relationGraphRelationTypeGet(relationType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#relationGraphRelationTypeGet");
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

<a name="relationGraphRelationTypeIdGet"></a>
# **relationGraphRelationTypeIdGet**
> ERRORUNKNOWN relationGraphRelationTypeIdGet(relationType, id)

Relation graphs.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String relationType = "relationType_example"; // String | 
String id = "id_example"; // String | 
try {
    ERRORUNKNOWN result = apiInstance.relationGraphRelationTypeIdGet(relationType, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#relationGraphRelationTypeIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationType** | **String**|  |
 **id** | **String**|  |

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

