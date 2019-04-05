# PublicApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taxonomyPublicApiConceptHistorySinceGet**](PublicApi.md#taxonomyPublicApiConceptHistorySinceGet) | **GET** /taxonomy/public-api/concept-history-since | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
[**taxonomyPublicApiDeprecatedConceptHistorySinceGet**](PublicApi.md#taxonomyPublicApiDeprecatedConceptHistorySinceGet) | **GET** /taxonomy/public-api/deprecated-concept-history-since | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
[**taxonomyPublicApiFullHistoryGet**](PublicApi.md#taxonomyPublicApiFullHistoryGet) | **GET** /taxonomy/public-api/full-history | Show the complete history.
[**taxonomyPublicApiTermGet**](PublicApi.md#taxonomyPublicApiTermGet) | **GET** /taxonomy/public-api/term | Search for a term across all taxonomies.
[**taxonomyPublicApiTermPartGet**](PublicApi.md#taxonomyPublicApiTermPartGet) | **GET** /taxonomy/public-api/term-part | get concepts by part of string


<a name="taxonomyPublicApiConceptHistorySinceGet"></a>
# **taxonomyPublicApiConceptHistorySinceGet**
> List&lt;Response38765&gt; taxonomyPublicApiConceptHistorySinceGet(dateTime)

Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String dateTime = "dateTime_example"; // String | 
try {
    List<Response38765> result = apiInstance.taxonomyPublicApiConceptHistorySinceGet(dateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicApiConceptHistorySinceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateTime** | **String**|  |

### Return type

[**List&lt;Response38765&gt;**](Response38765.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="taxonomyPublicApiDeprecatedConceptHistorySinceGet"></a>
# **taxonomyPublicApiDeprecatedConceptHistorySinceGet**
> ERRORUNKNOWN taxonomyPublicApiDeprecatedConceptHistorySinceGet(dateTime)

Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String dateTime = "dateTime_example"; // String | 
try {
    ERRORUNKNOWN result = apiInstance.taxonomyPublicApiDeprecatedConceptHistorySinceGet(dateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicApiDeprecatedConceptHistorySinceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateTime** | **String**|  |

### Return type

[**ERRORUNKNOWN**](ERRORUNKNOWN.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="taxonomyPublicApiFullHistoryGet"></a>
# **taxonomyPublicApiFullHistoryGet**
> List&lt;Response38763&gt; taxonomyPublicApiFullHistoryGet()

Show the complete history.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    List<Response38763> result = apiInstance.taxonomyPublicApiFullHistoryGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicApiFullHistoryGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Response38763&gt;**](Response38763.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="taxonomyPublicApiTermGet"></a>
# **taxonomyPublicApiTermGet**
> List&lt;Response38760&gt; taxonomyPublicApiTermGet(term)

Search for a term across all taxonomies.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String term = "term_example"; // String | 
try {
    List<Response38760> result = apiInstance.taxonomyPublicApiTermGet(term);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicApiTermGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |

### Return type

[**List&lt;Response38760&gt;**](Response38760.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="taxonomyPublicApiTermPartGet"></a>
# **taxonomyPublicApiTermPartGet**
> taxonomyPublicApiTermPartGet(term)

get concepts by part of string

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String term = "term_example"; // String | 
try {
    apiInstance.taxonomyPublicApiTermPartGet(term);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicApiTermPartGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

