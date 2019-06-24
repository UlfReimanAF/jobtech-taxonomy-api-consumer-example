package se.jobtech.taxonomy.client.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;
import se.jobtech.taxonomy.client.invoker.ApiClient;
import se.jobtech.taxonomy.client.model.Response2992;
import se.jobtech.taxonomy.client.model.Response2994;
import se.jobtech.taxonomy.client.model.Response2996;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-24T11:20:52.800+02:00")
@Component("se.jobtech.taxonomy.client.api.PublicApi")
public class PublicApi {
    private ApiClient apiClient;

    public PublicApi() {
        this( new ApiClient( ) );
    }

    @Autowired
    public PublicApi( ApiClient apiClient ) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient( ApiClient apiClient ) {
        this.apiClient = apiClient;
    }

    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * <p><b>200</b> -
     * <p><b>500</b> -
     *
     * @param fromDateTime
     * @param offset
     * @param limit
     * @return List&lt;Response2992&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response2992> v0TaxonomyPublicChangesGet( String fromDateTime, Long offset, Long limit ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'fromDateTime' is set
        if (fromDateTime == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'fromDateTime' when calling v0TaxonomyPublicChangesGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/changes" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "fromDateTime", fromDateTime ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "offset", offset ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "limit", limit ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<List<Response2992>> returnType = new ParameterizedTypeReference<List<Response2992>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Return a list of all taxonomy types.
     *
     * <p><b>200</b> -
     * <p><b>500</b> -
     *
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> v0TaxonomyPublicConceptTypesGet() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/concept/types" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Get concepts.
     *
     * <p><b>200</b> -
     * <p><b>500</b> -
     *
     * @param id
     * @param preferredLabel
     * @param type
     * @param deprecated
     * @param offset
     * @param limit
     * @return List&lt;Response2994&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response2994> v0TaxonomyPublicConceptsGet( String id, String preferredLabel, String type, Boolean deprecated, Long offset, Long limit ) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/concepts" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "id", id ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "preferredLabel", preferredLabel ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "type", type ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "deprecated", deprecated ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "offset", offset ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "limit", limit ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<List<Response2994>> returnType = new ParameterizedTypeReference<List<Response2994>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * <p><b>200</b> -
     * <p><b>500</b> -
     *
     * @param dateTime
     * @return ERRORUNKNOWN
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ERRORUNKNOWN v0TaxonomyPublicDeprecatedConceptHistorySinceGet( String dateTime ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'dateTime' is set
        if (dateTime == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTime' when calling v0TaxonomyPublicDeprecatedConceptHistorySinceGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/deprecated-concept-history-since" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "date-time", dateTime ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<ERRORUNKNOWN> returnType = new ParameterizedTypeReference<ERRORUNKNOWN>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * get concepts by part of string
     *
     * <p><b>200</b> -
     * <p><b>500</b> -
     *
     * @param q
     * @param type
     * @param offset
     * @param limit
     * @return List&lt;Response2996&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response2996> v0TaxonomyPublicSearchGet( String q, String type, Long offset, Long limit ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling v0TaxonomyPublicSearchGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/search" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "q", q ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "type", type ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "offset", offset ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "limit", limit ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<List<Response2996>> returnType = new ParameterizedTypeReference<List<Response2996>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }
}
