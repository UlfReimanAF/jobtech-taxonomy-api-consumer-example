# PublicApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v0TaxonomyPublicChangesGet**](PublicApi.md#v0TaxonomyPublicChangesGet) | **GET** /v0/taxonomy/public/changes | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
[**v0TaxonomyPublicConceptAllGet**](PublicApi.md#v0TaxonomyPublicConceptAllGet) | **GET** /v0/taxonomy/public/concept/all | Read all concepts of the given type.
[**v0TaxonomyPublicConceptGet**](PublicApi.md#v0TaxonomyPublicConceptGet) | **GET** /v0/taxonomy/public/concept | Read a concept by ID.
[**v0TaxonomyPublicConceptHistorySinceGet**](PublicApi.md#v0TaxonomyPublicConceptHistorySinceGet) | **GET** /v0/taxonomy/public/concept-history-since | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
[**v0TaxonomyPublicConceptTypesGet**](PublicApi.md#v0TaxonomyPublicConceptTypesGet) | **GET** /v0/taxonomy/public/concept/types | Read a list of all taxonomy types.
[**v0TaxonomyPublicConceptsGet**](PublicApi.md#v0TaxonomyPublicConceptsGet) | **GET** /v0/taxonomy/public/concepts | Get concepts.
[**v0TaxonomyPublicDeprecatedConceptHistorySinceGet**](PublicApi.md#v0TaxonomyPublicDeprecatedConceptHistorySinceGet) | **GET** /v0/taxonomy/public/deprecated-concept-history-since | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
[**v0TaxonomyPublicFullHistoryGet**](PublicApi.md#v0TaxonomyPublicFullHistoryGet) | **GET** /v0/taxonomy/public/full-history | Show the complete history.
[**v0TaxonomyPublicRelationGraphRelationTypeGet**](PublicApi.md#v0TaxonomyPublicRelationGraphRelationTypeGet) | **GET** /v0/taxonomy/public/relation/graph/{relation-type} | Relation graphs.
[**v0TaxonomyPublicRelationGraphRelationTypeIdGet**](PublicApi.md#v0TaxonomyPublicRelationGraphRelationTypeIdGet) | **GET** /v0/taxonomy/public/relation/graph/{relation-type}/{id} | Relation graphs.
[**v0TaxonomyPublicRelationTypesGet**](PublicApi.md#v0TaxonomyPublicRelationTypesGet) | **GET** /v0/taxonomy/public/relation/types | Relation graphs.
[**v0TaxonomyPublicSearchGet**](PublicApi.md#v0TaxonomyPublicSearchGet) | **GET** /v0/taxonomy/public/search | get concepts by part of string
[**v0TaxonomyPublicTermGet**](PublicApi.md#v0TaxonomyPublicTermGet) | **GET** /v0/taxonomy/public/term | Search for a term across all taxonomies.
[**v0TaxonomyPublicTermPartGet**](PublicApi.md#v0TaxonomyPublicTermPartGet) | **GET** /v0/taxonomy/public/term-part | get concepts by part of string


<a name="v0TaxonomyPublicChangesGet"></a>
# **v0TaxonomyPublicChangesGet**
> List&lt;Response3254&gt; v0TaxonomyPublicChangesGet(fromDateTime, offset, limit)

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
    List<Response3254> result = apiInstance.v0TaxonomyPublicChangesGet(fromDateTime, offset, limit);
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

[**List&lt;Response3254&gt;**](Response3254.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicConceptAllGet"></a>
# **v0TaxonomyPublicConceptAllGet**
> v0TaxonomyPublicConceptAllGet(type)

Read all concepts of the given type.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String type = "type_example"; // String | 
try {
    apiInstance.v0TaxonomyPublicConceptAllGet(type);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicConceptAllGet");
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

<a name="v0TaxonomyPublicConceptGet"></a>
# **v0TaxonomyPublicConceptGet**
> v0TaxonomyPublicConceptGet(id)

Read a concept by ID.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String id = "id_example"; // String | 
try {
    apiInstance.v0TaxonomyPublicConceptGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicConceptGet");
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

<a name="v0TaxonomyPublicConceptHistorySinceGet"></a>
# **v0TaxonomyPublicConceptHistorySinceGet**
> List&lt;Response3278&gt; v0TaxonomyPublicConceptHistorySinceGet(dateTime)

Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String dateTime = "dateTime_example"; // String | 
try {
    List<Response3278> result = apiInstance.v0TaxonomyPublicConceptHistorySinceGet(dateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicConceptHistorySinceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateTime** | **String**|  |

### Return type

[**List&lt;Response3278&gt;**](Response3278.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicConceptTypesGet"></a>
# **v0TaxonomyPublicConceptTypesGet**
> v0TaxonomyPublicConceptTypesGet()

Read a list of all taxonomy types.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    apiInstance.v0TaxonomyPublicConceptTypesGet();
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicConceptTypesGet");
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

<a name="v0TaxonomyPublicConceptsGet"></a>
# **v0TaxonomyPublicConceptsGet**
> List&lt;Response3257&gt; v0TaxonomyPublicConceptsGet(id, preferredLabel, type, deprecated, offset, limit)

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
    List<Response3257> result = apiInstance.v0TaxonomyPublicConceptsGet(id, preferredLabel, type, deprecated, offset, limit);
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

[**List&lt;Response3257&gt;**](Response3257.md)

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

<a name="v0TaxonomyPublicFullHistoryGet"></a>
# **v0TaxonomyPublicFullHistoryGet**
> List&lt;Response3276&gt; v0TaxonomyPublicFullHistoryGet()

Show the complete history.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    List<Response3276> result = apiInstance.v0TaxonomyPublicFullHistoryGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicFullHistoryGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Response3276&gt;**](Response3276.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicRelationGraphRelationTypeGet"></a>
# **v0TaxonomyPublicRelationGraphRelationTypeGet**
> ERRORUNKNOWN v0TaxonomyPublicRelationGraphRelationTypeGet(relationType)

Relation graphs.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String relationType = "relationType_example"; // String | 
try {
    ERRORUNKNOWN result = apiInstance.v0TaxonomyPublicRelationGraphRelationTypeGet(relationType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicRelationGraphRelationTypeGet");
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

<a name="v0TaxonomyPublicRelationGraphRelationTypeIdGet"></a>
# **v0TaxonomyPublicRelationGraphRelationTypeIdGet**
> ERRORUNKNOWN v0TaxonomyPublicRelationGraphRelationTypeIdGet(relationType, id)

Relation graphs.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String relationType = "relationType_example"; // String | 
String id = "id_example"; // String | 
try {
    ERRORUNKNOWN result = apiInstance.v0TaxonomyPublicRelationGraphRelationTypeIdGet(relationType, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicRelationGraphRelationTypeIdGet");
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

<a name="v0TaxonomyPublicRelationTypesGet"></a>
# **v0TaxonomyPublicRelationTypesGet**
> ERRORUNKNOWN v0TaxonomyPublicRelationTypesGet()

Relation graphs.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    ERRORUNKNOWN result = apiInstance.v0TaxonomyPublicRelationTypesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicRelationTypesGet");
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

<a name="v0TaxonomyPublicSearchGet"></a>
# **v0TaxonomyPublicSearchGet**
> List&lt;Response3259&gt; v0TaxonomyPublicSearchGet(q, type, offset, limit)

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
    List<Response3259> result = apiInstance.v0TaxonomyPublicSearchGet(q, type, offset, limit);
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

[**List&lt;Response3259&gt;**](Response3259.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicTermGet"></a>
# **v0TaxonomyPublicTermGet**
> List&lt;Response3270&gt; v0TaxonomyPublicTermGet(term)

Search for a term across all taxonomies.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String term = "term_example"; // String | 
try {
    List<Response3270> result = apiInstance.v0TaxonomyPublicTermGet(term);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicTermGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |

### Return type

[**List&lt;Response3270&gt;**](Response3270.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicTermPartGet"></a>
# **v0TaxonomyPublicTermPartGet**
> List&lt;Response3273&gt; v0TaxonomyPublicTermPartGet(term)

get concepts by part of string

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String term = "term_example"; // String | 
try {
    List<Response3273> result = apiInstance.v0TaxonomyPublicTermPartGet(term);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicTermPartGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |

### Return type

[**List&lt;Response3273&gt;**](Response3273.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

