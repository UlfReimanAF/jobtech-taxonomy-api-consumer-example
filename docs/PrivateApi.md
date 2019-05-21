# PrivateApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v0TaxonomyPrivateConceptDelete**](PrivateApi.md#v0TaxonomyPrivateConceptDelete) | **DELETE** /v0/taxonomy/private/concept | Retract the concept with the given ID.
[**v0TaxonomyPrivateConceptPost**](PrivateApi.md#v0TaxonomyPrivateConceptPost) | **POST** /v0/taxonomy/private/concept | Assert a new concept.
[**v0TaxonomyPrivateReplaceConceptPost**](PrivateApi.md#v0TaxonomyPrivateReplaceConceptPost) | **POST** /v0/taxonomy/private/replace-concept | Replace old concept with a new concept.


<a name="v0TaxonomyPrivateConceptDelete"></a>
# **v0TaxonomyPrivateConceptDelete**
> v0TaxonomyPrivateConceptDelete(id)

Retract the concept with the given ID.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String id = "id_example"; // String | 
try {
    apiInstance.v0TaxonomyPrivateConceptDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#v0TaxonomyPrivateConceptDelete");
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

<a name="v0TaxonomyPrivateConceptPost"></a>
# **v0TaxonomyPrivateConceptPost**
> v0TaxonomyPrivateConceptPost(type, description, preferredTerm)

Assert a new concept.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String type = "type_example"; // String | 
String description = "description_example"; // String | 
String preferredTerm = "preferredTerm_example"; // String | 
try {
    apiInstance.v0TaxonomyPrivateConceptPost(type, description, preferredTerm);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#v0TaxonomyPrivateConceptPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  |
 **description** | **String**|  |
 **preferredTerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPrivateReplaceConceptPost"></a>
# **v0TaxonomyPrivateReplaceConceptPost**
> v0TaxonomyPrivateReplaceConceptPost(oldConceptId, newConceptId)

Replace old concept with a new concept.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String oldConceptId = "oldConceptId_example"; // String | 
String newConceptId = "newConceptId_example"; // String | 
try {
    apiInstance.v0TaxonomyPrivateReplaceConceptPost(oldConceptId, newConceptId);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#v0TaxonomyPrivateReplaceConceptPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oldConceptId** | **String**|  |
 **newConceptId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

