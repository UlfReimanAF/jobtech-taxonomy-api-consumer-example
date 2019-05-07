# PrivateApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taxonomyPrivateConceptDelete**](PrivateApi.md#taxonomyPrivateConceptDelete) | **DELETE** /taxonomy/private/concept | Retract the concept with the given ID.
[**taxonomyPrivateConceptPost**](PrivateApi.md#taxonomyPrivateConceptPost) | **POST** /taxonomy/private/concept | Assert a new concept.
[**taxonomyPrivateReplaceConceptPost**](PrivateApi.md#taxonomyPrivateReplaceConceptPost) | **POST** /taxonomy/private/replace-concept | Replace old concept with a new concept.


<a name="taxonomyPrivateConceptDelete"></a>
# **taxonomyPrivateConceptDelete**
> taxonomyPrivateConceptDelete(id)

Retract the concept with the given ID.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String id = "id_example"; // String | 
try {
    apiInstance.taxonomyPrivateConceptDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#taxonomyPrivateConceptDelete");
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

<a name="taxonomyPrivateConceptPost"></a>
# **taxonomyPrivateConceptPost**
> taxonomyPrivateConceptPost(type, description, preferredTerm)

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
    apiInstance.taxonomyPrivateConceptPost(type, description, preferredTerm);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#taxonomyPrivateConceptPost");
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

<a name="taxonomyPrivateReplaceConceptPost"></a>
# **taxonomyPrivateReplaceConceptPost**
> taxonomyPrivateReplaceConceptPost(oldConceptId, newConceptId)

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
    apiInstance.taxonomyPrivateReplaceConceptPost(oldConceptId, newConceptId);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#taxonomyPrivateReplaceConceptPost");
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

