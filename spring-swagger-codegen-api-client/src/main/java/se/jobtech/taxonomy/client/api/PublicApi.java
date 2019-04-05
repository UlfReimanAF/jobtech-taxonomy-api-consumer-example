package se.jobtech.taxonomy.client.api;

import se.jobtech.taxonomy.client.invoker.ApiClient;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import se.jobtech.taxonomy.client.model.Response38760;
import se.jobtech.taxonomy.client.model.Response38763;
import se.jobtech.taxonomy.client.model.Response38765;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-05T11:09:31.292+02:00")
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
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     * 
     * <p><b>200</b> - 
     * <p><b>404</b> - 
     * <p><b>500</b> - 
     * @param dateTime 
     * @return List&lt;Response38765&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response38765> taxonomyPublicApiConceptHistorySinceGet(String dateTime) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dateTime' is set
        if (dateTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTime' when calling taxonomyPublicApiConceptHistorySinceGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/taxonomy/public-api/concept-history-since").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date-time", dateTime));

        final String[] accepts = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Response38765>> returnType = new ParameterizedTypeReference<List<Response38765>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     * 
     * <p><b>200</b> - 
     * <p><b>404</b> - 
     * <p><b>500</b> - 
     * @param dateTime 
     * @return ERRORUNKNOWN
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ERRORUNKNOWN taxonomyPublicApiDeprecatedConceptHistorySinceGet(String dateTime) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dateTime' is set
        if (dateTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTime' when calling taxonomyPublicApiDeprecatedConceptHistorySinceGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/taxonomy/public-api/deprecated-concept-history-since").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date-time", dateTime));

        final String[] accepts = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ERRORUNKNOWN> returnType = new ParameterizedTypeReference<ERRORUNKNOWN>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Show the complete history.
     * 
     * <p><b>200</b> - 
     * <p><b>500</b> - 
     * @return List&lt;Response38763&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response38763> taxonomyPublicApiFullHistoryGet() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/taxonomy/public-api/full-history").build().toUriString();
        
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

        ParameterizedTypeReference<List<Response38763>> returnType = new ParameterizedTypeReference<List<Response38763>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Search for a term across all taxonomies.
     * 
     * <p><b>200</b> - 
     * <p><b>404</b> - 
     * <p><b>500</b> - 
     * @param term 
     * @return List&lt;Response38760&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response38760> taxonomyPublicApiTermGet(String term) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'term' is set
        if (term == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'term' when calling taxonomyPublicApiTermGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/taxonomy/public-api/term").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "term", term));

        final String[] accepts = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Response38760>> returnType = new ParameterizedTypeReference<List<Response38760>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * get concepts by part of string
     * 
     * <p><b>0</b> - 
     * @param term 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void taxonomyPublicApiTermPartGet(String term) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'term' is set
        if (term == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'term' when calling taxonomyPublicApiTermPartGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/taxonomy/public-api/term-part").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "term", term));

        final String[] accepts = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
