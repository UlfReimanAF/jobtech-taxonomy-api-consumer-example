# PrivateApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v0TaxonomyPrivateConceptDelete**](PrivateApi.md#v0TaxonomyPrivateConceptDelete) | **DELETE** /v0/taxonomy/private/concept | Retract the concept with the given ID.
[**v0TaxonomyPrivateConceptPost**](PrivateApi.md#v0TaxonomyPrivateConceptPost) | **POST** /v0/taxonomy/private/concept | Assert a new concept.
[**v0TaxonomyPrivateRelationGraphRelationTypeGet**](PrivateApi.md#v0TaxonomyPrivateRelationGraphRelationTypeGet) | **GET** /v0/taxonomy/private/relation/graph/{relation-type} | Relation graphs.
[**v0TaxonomyPrivateRelationGraphRelationTypeIdGet**](PrivateApi.md#v0TaxonomyPrivateRelationGraphRelationTypeIdGet) | **GET** /v0/taxonomy/private/relation/graph/{relation-type}/{id} | Relation graphs.
[**v0TaxonomyPrivateRelationTypesGet**](PrivateApi.md#v0TaxonomyPrivateRelationTypesGet) | **GET** /v0/taxonomy/private/relation/types | Relation graphs.
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

<a name="v0TaxonomyPrivateRelationGraphRelationTypeGet"></a>
# **v0TaxonomyPrivateRelationGraphRelationTypeGet**
> ERRORUNKNOWN v0TaxonomyPrivateRelationGraphRelationTypeGet(relationType)

Relation graphs.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String relationType = "relationType_example"; // String | 
try {
    ERRORUNKNOWN result = apiInstance.v0TaxonomyPrivateRelationGraphRelationTypeGet(relationType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#v0TaxonomyPrivateRelationGraphRelationTypeGet");
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

<a name="v0TaxonomyPrivateRelationGraphRelationTypeIdGet"></a>
# **v0TaxonomyPrivateRelationGraphRelationTypeIdGet**
> ERRORUNKNOWN v0TaxonomyPrivateRelationGraphRelationTypeIdGet(relationType, id)

Relation graphs.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String relationType = "relationType_example"; // String | 
String id = "id_example"; // String | 
try {
    ERRORUNKNOWN result = apiInstance.v0TaxonomyPrivateRelationGraphRelationTypeIdGet(relationType, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#v0TaxonomyPrivateRelationGraphRelationTypeIdGet");
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

<a name="v0TaxonomyPrivateRelationTypesGet"></a>
# **v0TaxonomyPrivateRelationTypesGet**
> ERRORUNKNOWN v0TaxonomyPrivateRelationTypesGet()

Relation graphs.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.ApiException;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
try {
    ERRORUNKNOWN result = apiInstance.v0TaxonomyPrivateRelationTypesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#v0TaxonomyPrivateRelationTypesGet");
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

