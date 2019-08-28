package se.jobtech.taxonomy.client.api;

import se.jobtech.taxonomy.client.invoker.ApiClient;

import se.jobtech.taxonomy.client.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-27T11:15:31.744+02:00")
@Component("se.jobtech.taxonomy.client.api.PublicApi")
public class PublicApi {
    private ApiClient apiClient;

    public PublicApi() {
        this(new ApiClient());
    }

    @Autowired
    public PublicApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Show the history from a given version.
     * 
     * <p><b>200</b> - 
     * <p><b>500</b> - 
     * @param fromVersion 
     * @param toVersion 
     * @param offset 
     * @param limit 
     * @return List&lt;Response3164&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response3164> v0TaxonomyPublicChangesGet(Long fromVersion, Long toVersion, Long offset, Long limit) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'fromVersion' is set
        if (fromVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fromVersion' when calling v0TaxonomyPublicChangesGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/v0/taxonomy/public/changes").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromVersion", fromVersion));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "toVersion", toVersion));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] accepts = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Response3164>> returnType = new ParameterizedTypeReference<List<Response3164>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Return a list of all taxonomy types.
     * 
     * <p><b>200</b> - 
     * <p><b>500</b> - 
     * @param version 
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> v0TaxonomyPublicConceptTypesGet(Long version) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/v0/taxonomy/public/concept/types").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] accepts = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get concepts.
     * 
     * <p><b>200</b> - 
     * <p><b>500</b> - 
     * @param id 
     * @param preferredLabel 
     * @param type 
     * @param deprecated 
     * @param offset 
     * @param limit 
     * @param version 
     * @return List&lt;Response3166&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response3166> v0TaxonomyPublicConceptsGet(String id, String preferredLabel, String type, Boolean deprecated, Long offset, Long limit, Long version) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/v0/taxonomy/public/concepts").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "preferredLabel", preferredLabel));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "deprecated", deprecated));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] accepts = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Response3166>> returnType = new ParameterizedTypeReference<List<Response3166>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Show the history of concepts being replaced from a given version.
     * 
     * <p><b>200</b> - 
     * <p><b>500</b> - 
     * @param fromVersion 
     * @param toVersion 
     * @return Response3179Concept
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Response3179Concept v0TaxonomyPublicReplacedByChangesGet(Long fromVersion, Long toVersion) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'fromVersion' is set
        if (fromVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fromVersion' when calling v0TaxonomyPublicReplacedByChangesGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/v0/taxonomy/public/replaced-by-changes").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromVersion", fromVersion));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "toVersion", toVersion));

        final String[] accepts = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Response3179Concept> returnType = new ParameterizedTypeReference<Response3179Concept>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Autocomplete from query string
     * 
     * <p><b>200</b> - 
     * <p><b>500</b> - 
     * @param q 
     * @param type 
     * @param offset 
     * @param limit 
     * @param version 
     * @return List&lt;Response3168&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response3168> v0TaxonomyPublicSearchGet(String q, String type, Long offset, Long limit, Long version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling v0TaxonomyPublicSearchGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/v0/taxonomy/public/search").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] accepts = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Response3168>> returnType = new ParameterizedTypeReference<List<Response3168>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Return a list of all Taxonomy versions.
     * 
     * <p><b>200</b> - 
     * <p><b>500</b> - 
     * @return List&lt;Response3162&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response3162> v0TaxonomyPublicVersionsGet() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/v0/taxonomy/public/versions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Response3162>> returnType = new ParameterizedTypeReference<List<Response3162>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
