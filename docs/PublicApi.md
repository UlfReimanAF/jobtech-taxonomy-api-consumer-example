# PublicApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taxonomyPublicConceptAllGet**](PublicApi.md#taxonomyPublicConceptAllGet) | **GET** /taxonomy/public/concept/all | Read all concepts of the given type.
[**taxonomyPublicConceptGet**](PublicApi.md#taxonomyPublicConceptGet) | **GET** /taxonomy/public/concept | Read a concept by ID.
[**taxonomyPublicConceptHistorySinceGet**](PublicApi.md#taxonomyPublicConceptHistorySinceGet) | **GET** /taxonomy/public/concept-history-since | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
[**taxonomyPublicConceptTypesGet**](PublicApi.md#taxonomyPublicConceptTypesGet) | **GET** /taxonomy/public/concept/types | Read a list of all taxonomy types.
[**taxonomyPublicDeprecatedConceptHistorySinceGet**](PublicApi.md#taxonomyPublicDeprecatedConceptHistorySinceGet) | **GET** /taxonomy/public/deprecated-concept-history-since | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
[**taxonomyPublicFullHistoryGet**](PublicApi.md#taxonomyPublicFullHistoryGet) | **GET** /taxonomy/public/full-history | Show the complete history.
[**taxonomyPublicTermGet**](PublicApi.md#taxonomyPublicTermGet) | **GET** /taxonomy/public/term | Search for a term across all taxonomies.
[**taxonomyPublicTermPartGet**](PublicApi.md#taxonomyPublicTermPartGet) | **GET** /taxonomy/public/term-part | get concepts by part of string


<a name="taxonomyPublicConceptAllGet"></a>
# **taxonomyPublicConceptAllGet**
> taxonomyPublicConceptAllGet(type)

Read all concepts of the given type.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String type = "type_example"; // String | 
try {
    apiInstance.taxonomyPublicConceptAllGet(type);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicConceptAllGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="taxonomyPublicConceptGet"></a>
# **taxonomyPublicConceptGet**
> taxonomyPublicConceptGet(id)

Read a concept by ID.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String id = "id_example"; // String | 
try {
    apiInstance.taxonomyPublicConceptGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicConceptGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="taxonomyPublicConceptHistorySinceGet"></a>
# **taxonomyPublicConceptHistorySinceGet**
> List&lt;Response2794&gt; taxonomyPublicConceptHistorySinceGet(dateTime)

Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String dateTime = "dateTime_example"; // String | 
try {
    List<Response2794> result = apiInstance.taxonomyPublicConceptHistorySinceGet(dateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicConceptHistorySinceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateTime** | **String**|  |

### Return type

[**List&lt;Response2794&gt;**](Response2794.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="taxonomyPublicConceptTypesGet"></a>
# **taxonomyPublicConceptTypesGet**
> taxonomyPublicConceptTypesGet()

Read a list of all taxonomy types.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    apiInstance.taxonomyPublicConceptTypesGet();
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicConceptTypesGet");
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

<a name="taxonomyPublicDeprecatedConceptHistorySinceGet"></a>
# **taxonomyPublicDeprecatedConceptHistorySinceGet**
> ERRORUNKNOWN taxonomyPublicDeprecatedConceptHistorySinceGet(dateTime)

Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String dateTime = "dateTime_example"; // String | 
try {
    ERRORUNKNOWN result = apiInstance.taxonomyPublicDeprecatedConceptHistorySinceGet(dateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicDeprecatedConceptHistorySinceGet");
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

<a name="taxonomyPublicFullHistoryGet"></a>
# **taxonomyPublicFullHistoryGet**
> List&lt;Response2792&gt; taxonomyPublicFullHistoryGet()

Show the complete history.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    List<Response2792> result = apiInstance.taxonomyPublicFullHistoryGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicFullHistoryGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Response2792&gt;**](Response2792.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="taxonomyPublicTermGet"></a>
# **taxonomyPublicTermGet**
> List&lt;Response2786&gt; taxonomyPublicTermGet(term)

Search for a term across all taxonomies.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String term = "term_example"; // String | 
try {
    List<Response2786> result = apiInstance.taxonomyPublicTermGet(term);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicTermGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |

### Return type

[**List&lt;Response2786&gt;**](Response2786.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="taxonomyPublicTermPartGet"></a>
# **taxonomyPublicTermPartGet**
> List&lt;Response2789&gt; taxonomyPublicTermPartGet(term)

get concepts by part of string

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String term = "term_example"; // String | 
try {
    List<Response2789> result = apiInstance.taxonomyPublicTermPartGet(term);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#taxonomyPublicTermPartGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |

### Return type

[**List&lt;Response2789&gt;**](Response2789.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

