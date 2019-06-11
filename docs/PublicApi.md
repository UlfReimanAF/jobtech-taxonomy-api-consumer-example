# PublicApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v0TaxonomyPublicChangesGet**](PublicApi.md#v0TaxonomyPublicChangesGet) | **GET** /v0/taxonomy/public/changes | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
[**v0TaxonomyPublicConceptTypesGet**](PublicApi.md#v0TaxonomyPublicConceptTypesGet) | **GET** /v0/taxonomy/public/concept/types | Return a list of all taxonomy types.
[**v0TaxonomyPublicConceptsGet**](PublicApi.md#v0TaxonomyPublicConceptsGet) | **GET** /v0/taxonomy/public/concepts | Get concepts.
[**v0TaxonomyPublicDeprecatedConceptHistorySinceGet**](PublicApi.md#v0TaxonomyPublicDeprecatedConceptHistorySinceGet) | **GET** /v0/taxonomy/public/deprecated-concept-history-since | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
[**v0TaxonomyPublicSearchGet**](PublicApi.md#v0TaxonomyPublicSearchGet) | **GET** /v0/taxonomy/public/search | get concepts by part of string


<a name="v0TaxonomyPublicChangesGet"></a>
# **v0TaxonomyPublicChangesGet**
> List&lt;Response2784&gt; v0TaxonomyPublicChangesGet(fromDateTime, offset, limit)

Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String fromDateTime = "fromDateTime_example"; // String | 
Long offset = 789L; // Long | 
Long limit = 789L; // Long | 
try {
    List<Response2784> result = apiInstance.v0TaxonomyPublicChangesGet(fromDateTime, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicChangesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDateTime** | **String**|  |
 **offset** | **Long**|  | [optional]
 **limit** | **Long**|  | [optional]

### Return type

[**List&lt;Response2784&gt;**](Response2784.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicConceptTypesGet"></a>
# **v0TaxonomyPublicConceptTypesGet**
> List&lt;String&gt; v0TaxonomyPublicConceptTypesGet()

Return a list of all taxonomy types.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    List<String> result = apiInstance.v0TaxonomyPublicConceptTypesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicConceptTypesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicConceptsGet"></a>
# **v0TaxonomyPublicConceptsGet**
> List&lt;Response2786&gt; v0TaxonomyPublicConceptsGet(id, preferredLabel, type, deprecated, offset, limit)

Get concepts.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String id = "id_example"; // String | 
String preferredLabel = "preferredLabel_example"; // String | 
String type = "type_example"; // String | 
Boolean deprecated = true; // Boolean | 
Long offset = 789L; // Long | 
Long limit = 789L; // Long | 
try {
    List<Response2786> result = apiInstance.v0TaxonomyPublicConceptsGet(id, preferredLabel, type, deprecated, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicConceptsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  | [optional]
 **preferredLabel** | **String**|  | [optional]
 **type** | **String**|  | [optional]
 **deprecated** | **Boolean**|  | [optional]
 **offset** | **Long**|  | [optional]
 **limit** | **Long**|  | [optional]

### Return type

[**List&lt;Response2786&gt;**](Response2786.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicDeprecatedConceptHistorySinceGet"></a>
# **v0TaxonomyPublicDeprecatedConceptHistorySinceGet**
> ERRORUNKNOWN v0TaxonomyPublicDeprecatedConceptHistorySinceGet(dateTime)

Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String dateTime = "dateTime_example"; // String | 
try {
    ERRORUNKNOWN result = apiInstance.v0TaxonomyPublicDeprecatedConceptHistorySinceGet(dateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicDeprecatedConceptHistorySinceGet");
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

<a name="v0TaxonomyPublicSearchGet"></a>
# **v0TaxonomyPublicSearchGet**
> List&lt;Response2788&gt; v0TaxonomyPublicSearchGet(q, type, offset, limit)

get concepts by part of string

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String q = "q_example"; // String | 
String type = "type_example"; // String | 
Long offset = 789L; // Long | 
Long limit = 789L; // Long | 
try {
    List<Response2788> result = apiInstance.v0TaxonomyPublicSearchGet(q, type, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**|  |
 **type** | **String**|  | [optional]
 **offset** | **Long**|  | [optional]
 **limit** | **Long**|  | [optional]

### Return type

[**List&lt;Response2788&gt;**](Response2788.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

