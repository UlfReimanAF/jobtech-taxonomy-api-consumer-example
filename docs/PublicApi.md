# PublicApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v0TaxonomyPublicChangesGet**](PublicApi.md#v0TaxonomyPublicChangesGet) | **GET** /v0/taxonomy/public/changes | Show the history from a given version.
[**v0TaxonomyPublicConceptTypesGet**](PublicApi.md#v0TaxonomyPublicConceptTypesGet) | **GET** /v0/taxonomy/public/concept/types | Return a list of all taxonomy types.
[**v0TaxonomyPublicConceptsGet**](PublicApi.md#v0TaxonomyPublicConceptsGet) | **GET** /v0/taxonomy/public/concepts | Get concepts.
[**v0TaxonomyPublicParseTextPost**](PublicApi.md#v0TaxonomyPublicParseTextPost) | **POST** /v0/taxonomy/public/parse-text | Finds all concepts in a text.
[**v0TaxonomyPublicReplacedByChangesGet**](PublicApi.md#v0TaxonomyPublicReplacedByChangesGet) | **GET** /v0/taxonomy/public/replaced-by-changes | Show the history of concepts being replaced from a given version.
[**v0TaxonomyPublicSearchGet**](PublicApi.md#v0TaxonomyPublicSearchGet) | **GET** /v0/taxonomy/public/search | Autocomplete from query string
[**v0TaxonomyPublicVersionsGet**](PublicApi.md#v0TaxonomyPublicVersionsGet) | **GET** /v0/taxonomy/public/versions | Return a list of all Taxonomy versions.


<a name="v0TaxonomyPublicChangesGet"></a>
# **v0TaxonomyPublicChangesGet**
> List&lt;Response3164&gt; v0TaxonomyPublicChangesGet(fromVersion, toVersion, offset, limit)

Show the history from a given version.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Long fromVersion = 789L; // Long | 
Long toVersion = 789L; // Long | 
Long offset = 789L; // Long | 
Long limit = 789L; // Long | 
try {
    List<Response3164> result = apiInstance.v0TaxonomyPublicChangesGet(fromVersion, toVersion, offset, limit);
    System.out.println(result);
} catch (Exception e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicChangesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromVersion** | **Long**|  |
 **toVersion** | **Long**|  | [optional]
 **offset** | **Long**|  | [optional]
 **limit** | **Long**|  | [optional]

### Return type

[**List&lt;Response3164&gt;**](Response3164.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicConceptTypesGet"></a>
# **v0TaxonomyPublicConceptTypesGet**
> List&lt;String&gt; v0TaxonomyPublicConceptTypesGet(version)

Return a list of all taxonomy types.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Long version = 789L; // Long | 
try {
    List<String> result = apiInstance.v0TaxonomyPublicConceptTypesGet(version);
    System.out.println(result);
} catch (Exception e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicConceptTypesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **Long**|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicConceptsGet"></a>
# **v0TaxonomyPublicConceptsGet**
> List&lt;Response3166&gt; v0TaxonomyPublicConceptsGet(id, preferredLabel, type, deprecated, offset, limit, version)

Get concepts.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String id = "id_example"; // String | 
String preferredLabel = "preferredLabel_example"; // String | 
String type = "type_example"; // String | 
Boolean deprecated = true; // Boolean | 
Long offset = 789L; // Long | 
Long limit = 789L; // Long | 
Long version = 789L; // Long | 
try {
    List<Response3166> result = apiInstance.v0TaxonomyPublicConceptsGet(id, preferredLabel, type, deprecated, offset, limit, version);
    System.out.println(result);
} catch (Exception e) {
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
 **version** | **Long**|  | [optional]

### Return type

[**List&lt;Response3166&gt;**](Response3166.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicParseTextPost"></a>
# **v0TaxonomyPublicParseTextPost**
> List&lt;ERRORUNKNOWN&gt; v0TaxonomyPublicParseTextPost(text)

Finds all concepts in a text.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String text = "text_example"; // String | 
try {
    List<ERRORUNKNOWN> result = apiInstance.v0TaxonomyPublicParseTextPost(text);
    System.out.println(result);
} catch (Exception e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicParseTextPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**|  |

### Return type

[**List&lt;ERRORUNKNOWN&gt;**](ERRORUNKNOWN.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicReplacedByChangesGet"></a>
# **v0TaxonomyPublicReplacedByChangesGet**
> ERRORUNKNOWN v0TaxonomyPublicReplacedByChangesGet(fromVersion, toVersion)

Show the history of concepts being replaced from a given version.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Long fromVersion = 789L; // Long | 
Long toVersion = 789L; // Long | 
try {
    ERRORUNKNOWN result = apiInstance.v0TaxonomyPublicReplacedByChangesGet(fromVersion, toVersion);
    System.out.println(result);
} catch (Exception e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicReplacedByChangesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromVersion** | **Long**|  |
 **toVersion** | **Long**|  | [optional]

### Return type

[**ERRORUNKNOWN**](ERRORUNKNOWN.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicSearchGet"></a>
# **v0TaxonomyPublicSearchGet**
> List&lt;Response3168&gt; v0TaxonomyPublicSearchGet(q, type, offset, limit, version)

Autocomplete from query string

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String q = "q_example"; // String | 
String type = "type_example"; // String | 
Long offset = 789L; // Long | 
Long limit = 789L; // Long | 
Long version = 789L; // Long | 
try {
    List<Response3168> result = apiInstance.v0TaxonomyPublicSearchGet(q, type, offset, limit, version);
    System.out.println(result);
} catch (Exception e) {
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
 **version** | **Long**|  | [optional]

### Return type

[**List&lt;Response3168&gt;**](Response3168.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPublicVersionsGet"></a>
# **v0TaxonomyPublicVersionsGet**
> List&lt;Response3162&gt; v0TaxonomyPublicVersionsGet()

Return a list of all Taxonomy versions.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    List<Response3162> result = apiInstance.v0TaxonomyPublicVersionsGet();
    System.out.println(result);
} catch (Exception e) {
    System.err.println("Exception when calling PublicApi#v0TaxonomyPublicVersionsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Response3162&gt;**](Response3162.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

