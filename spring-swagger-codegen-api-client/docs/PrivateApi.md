# PrivateApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taxonomyPrivateApiConceptAllGet**](PrivateApi.md#taxonomyPrivateApiConceptAllGet) | **GET** /taxonomy/private-api/concept/all | Read all concepts of the given type.
[**taxonomyPrivateApiConceptDelete**](PrivateApi.md#taxonomyPrivateApiConceptDelete) | **DELETE** /taxonomy/private-api/concept | Retract the concept with the given ID.
[**taxonomyPrivateApiConceptGet**](PrivateApi.md#taxonomyPrivateApiConceptGet) | **GET** /taxonomy/private-api/concept | Read a concept by ID.
[**taxonomyPrivateApiConceptPost**](PrivateApi.md#taxonomyPrivateApiConceptPost) | **POST** /taxonomy/private-api/concept | Assert a new concept.
[**taxonomyPrivateApiConceptTypesGet**](PrivateApi.md#taxonomyPrivateApiConceptTypesGet) | **GET** /taxonomy/private-api/concept/types | Read a list of all taxonomy types.
[**taxonomyPrivateApiReplaceConceptPost**](PrivateApi.md#taxonomyPrivateApiReplaceConceptPost) | **POST** /taxonomy/private-api/replace-concept | Replace old concept with a new concept.


<a name="taxonomyPrivateApiConceptAllGet"></a>
# **taxonomyPrivateApiConceptAllGet**
> taxonomyPrivateApiConceptAllGet(type)

Read all concepts of the given type.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String type = "type_example"; // String | 
try {
    apiInstance.taxonomyPrivateApiConceptAllGet(type);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#taxonomyPrivateApiConceptAllGet");
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

<a name="taxonomyPrivateApiConceptDelete"></a>
# **taxonomyPrivateApiConceptDelete**
> taxonomyPrivateApiConceptDelete(id)

Retract the concept with the given ID.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String id = "id_example"; // String | 
try {
    apiInstance.taxonomyPrivateApiConceptDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#taxonomyPrivateApiConceptDelete");
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

<a name="taxonomyPrivateApiConceptGet"></a>
# **taxonomyPrivateApiConceptGet**
> taxonomyPrivateApiConceptGet(id)

Read a concept by ID.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String id = "id_example"; // String | 
try {
    apiInstance.taxonomyPrivateApiConceptGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#taxonomyPrivateApiConceptGet");
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

<a name="taxonomyPrivateApiConceptPost"></a>
# **taxonomyPrivateApiConceptPost**
> taxonomyPrivateApiConceptPost(type, description, preferredTerm)

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
    apiInstance.taxonomyPrivateApiConceptPost(type, description, preferredTerm);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#taxonomyPrivateApiConceptPost");
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

<a name="taxonomyPrivateApiConceptTypesGet"></a>
# **taxonomyPrivateApiConceptTypesGet**
> taxonomyPrivateApiConceptTypesGet()

Read a list of all taxonomy types.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
try {
    apiInstance.taxonomyPrivateApiConceptTypesGet();
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#taxonomyPrivateApiConceptTypesGet");
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

<a name="taxonomyPrivateApiReplaceConceptPost"></a>
# **taxonomyPrivateApiReplaceConceptPost**
> taxonomyPrivateApiReplaceConceptPost(oldConceptId, newConceptId)

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
    apiInstance.taxonomyPrivateApiReplaceConceptPost(oldConceptId, newConceptId);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#taxonomyPrivateApiReplaceConceptPost");
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

