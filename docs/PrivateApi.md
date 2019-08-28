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
[**v0TaxonomyPrivateVersionsPost**](PrivateApi.md#v0TaxonomyPrivateVersionsPost) | **POST** /v0/taxonomy/private/versions | Creates a new version tag in the database.


<a name="v0TaxonomyPrivateConceptDelete"></a>
# **v0TaxonomyPrivateConceptDelete**
> Response3176 v0TaxonomyPrivateConceptDelete(id)

Retract the concept with the given ID.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String id = "id_example"; // String | 
try {
    Response3176 result = apiInstance.v0TaxonomyPrivateConceptDelete(id);
    System.out.println(result);
} catch (Exception e) {
    System.err.println("Exception when calling PrivateApi#v0TaxonomyPrivateConceptDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Response3176**](Response3176.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

<a name="v0TaxonomyPrivateConceptPost"></a>
# **v0TaxonomyPrivateConceptPost**
> Response3179 v0TaxonomyPrivateConceptPost(type, definition, preferredLabel)

Assert a new concept.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String type = "type_example"; // String | 
String definition = "definition_example"; // String | 
String preferredLabel = "preferredLabel_example"; // String | 
try {
    Response3179 result = apiInstance.v0TaxonomyPrivateConceptPost(type, definition, preferredLabel);
    System.out.println(result);
} catch (Exception e) {
    System.err.println("Exception when calling PrivateApi#v0TaxonomyPrivateConceptPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  |
 **definition** | **String**|  |
 **preferredLabel** | **String**|  |

### Return type

[**Response3179**](Response3179.md)

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
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String relationType = "relationType_example"; // String | 
try {
    ERRORUNKNOWN result = apiInstance.v0TaxonomyPrivateRelationGraphRelationTypeGet(relationType);
    System.out.println(result);
} catch (Exception e) {
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
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String relationType = "relationType_example"; // String | 
String id = "id_example"; // String | 
try {
    ERRORUNKNOWN result = apiInstance.v0TaxonomyPrivateRelationGraphRelationTypeIdGet(relationType, id);
    System.out.println(result);
} catch (Exception e) {
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
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
try {
    ERRORUNKNOWN result = apiInstance.v0TaxonomyPrivateRelationTypesGet();
    System.out.println(result);
} catch (Exception e) {
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
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
String oldConceptId = "oldConceptId_example"; // String | 
String newConceptId = "newConceptId_example"; // String | 
try {
    apiInstance.v0TaxonomyPrivateReplaceConceptPost(oldConceptId, newConceptId);
} catch (Exception e) {
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

<a name="v0TaxonomyPrivateVersionsPost"></a>
# **v0TaxonomyPrivateVersionsPost**
> Response3182 v0TaxonomyPrivateVersionsPost(newVersionId)

Creates a new version tag in the database.

### Example
```java
// Import classes:
//import se.jobtech.taxonomy.client.invoker.Exception;
//import se.jobtech.taxonomy.client.api.PrivateApi;


PrivateApi apiInstance = new PrivateApi();
Long newVersionId = 789L; // Long | 
try {
    Response3182 result = apiInstance.v0TaxonomyPrivateVersionsPost(newVersionId);
    System.out.println(result);
} catch (Exception e) {
    System.err.println("Exception when calling PrivateApi#v0TaxonomyPrivateVersionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newVersionId** | **Long**|  |

### Return type

[**Response3182**](Response3182.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/transit+msgpack, application/transit+json, application/edn
 - **Accept**: application/json, application/transit+msgpack, application/transit+json, application/edn

