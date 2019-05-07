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
import se.jobtech.taxonomy.client.model.Response38922;
import se.jobtech.taxonomy.client.model.Response38925;
import se.jobtech.taxonomy.client.model.Response38928;
import se.jobtech.taxonomy.client.model.Response38930;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-07T09:41:34.700+02:00")
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
     * Read all concepts of the given type.
     *
     * <p><b>0</b> -
     *
     * @param type
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void taxonomyPublicConceptAllGet( String type ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling taxonomyPublicConceptAllGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/taxonomy/public/concept/all" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "type", type ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>( ) {
        };
        apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Read a concept by ID.
     *
     * <p><b>0</b> -
     *
     * @param id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void taxonomyPublicConceptGet( String id ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling taxonomyPublicConceptGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/taxonomy/public/concept" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "id", id ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>( ) {
        };
        apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * <p><b>200</b> -
     * <p><b>404</b> -
     * <p><b>500</b> -
     *
     * @param dateTime
     * @return List&lt;Response38930&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response38930> taxonomyPublicConceptHistorySinceGet( String dateTime ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'dateTime' is set
        if (dateTime == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTime' when calling taxonomyPublicConceptHistorySinceGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/taxonomy/public/concept-history-since" ).build( ).toUriString( );

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

        ParameterizedTypeReference<List<Response38930>> returnType = new ParameterizedTypeReference<List<Response38930>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Read a list of all taxonomy types.
     *
     * <p><b>0</b> -
     *
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void taxonomyPublicConceptTypesGet() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath( "/taxonomy/public/concept/types" ).build( ).toUriString( );

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>( ) {
        };
        apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * <p><b>200</b> -
     * <p><b>404</b> -
     * <p><b>500</b> -
     *
     * @param dateTime
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String taxonomyPublicDeprecatedConceptHistorySinceGet( String dateTime ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'dateTime' is set
        if (dateTime == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTime' when calling taxonomyPublicDeprecatedConceptHistorySinceGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/taxonomy/public/deprecated-concept-history-since" ).build( ).toUriString( );

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

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Show the complete history.
     *
     * <p><b>200</b> -
     * <p><b>500</b> -
     *
     * @return List&lt;Response38928&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response38928> taxonomyPublicFullHistoryGet() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath( "/taxonomy/public/full-history" ).build( ).toUriString( );

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

        ParameterizedTypeReference<List<Response38928>> returnType = new ParameterizedTypeReference<List<Response38928>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Search for a term across all taxonomies.
     *
     * <p><b>200</b> -
     * <p><b>404</b> -
     * <p><b>500</b> -
     *
     * @param term
     * @return List&lt;Response38922&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response38922> taxonomyPublicTermGet( String term ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'term' is set
        if (term == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'term' when calling taxonomyPublicTermGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/taxonomy/public/term" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "term", term ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<List<Response38922>> returnType = new ParameterizedTypeReference<List<Response38922>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * get concepts by part of string
     *
     * <p><b>200</b> -
     * <p><b>404</b> -
     * <p><b>500</b> -
     *
     * @param term
     * @return List&lt;Response38925&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response38925> taxonomyPublicTermPartGet( String term ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'term' is set
        if (term == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'term' when calling taxonomyPublicTermPartGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/taxonomy/public/term-part" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "term", term ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<List<Response38925>> returnType = new ParameterizedTypeReference<List<Response38925>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }
}
