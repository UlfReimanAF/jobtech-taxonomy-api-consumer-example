/*
 * Jobtech Taxonomy
 * Jobtech taxonomy services
 *
 * OpenAPI spec version: 0.9.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package se.jobtech.taxonomy.client.api;

import org.junit.Ignore;
import org.junit.Test;
import se.jobtech.taxonomy.client.model.*;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * API tests for PublicApi
 */

public class PublicApiTest {

    private final PublicApi api = new PublicApi( );


    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void v0TaxonomyPublicChangesGetTest() {
        String fromDateTime = "2018-08-08 14:00:00";
        Long offset = null;
        Long limit = null;
        List<Response2992> response = api.v0TaxonomyPublicChangesGet( fromDateTime, offset, limit );

        // TODO: test validations
    }

    /**
     * Return a list of all taxonomy types.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void v0TaxonomyPublicConceptTypesGetTest() {
        List<String> response = api.v0TaxonomyPublicConceptTypesGet( );

        assertNotNull( response );
    }

    /**
     * Get concepts.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void v0TaxonomyPublicConceptsGetTest() {
        String id = "vVTg_C9s_8NG";
        String preferredLabel = "Drejare";
        String type = "occupation-name";
        Boolean deprecated = false;
        Long offset = null;
        Long limit = null;
        List<Response2994> response = api.v0TaxonomyPublicConceptsGet( id, preferredLabel, type, deprecated, offset, limit );
        assertNotNull( response );

    }

    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * @throws Exception if the Api call fails
     */
    // @Test
    public void v0TaxonomyPublicDeprecatedConceptHistorySinceGetTest() {
        String dateTime = null;
        ERRORUNKNOWN response = api.v0TaxonomyPublicDeprecatedConceptHistorySinceGet( dateTime );


    }

    /**
     * get concepts by part of string
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void v0TaxonomyPublicSearchGetTest() {
        String q = "j";
        String type = "skill";
        Long offset = 0L;
        Long limit = 1L;
        List<Response2996> response = api.v0TaxonomyPublicSearchGet( q, type, offset, limit );

        assertNotNull( response );
    }


    @Test
    public void v0TaxonomyPublicSearchLoadTest() {
        for (int i = 0; i < 50; i++) {
            char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            for (char c : alphabet) {
                List<Response2996> responseS = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "skill", null, null );
                List<Response2996> responseOn = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "occupation-name", null, null );
                List<Response2996> responseOg = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "occupation-group", null, null );
                List<Response2996> responseOf = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "occupation-field", null, null );
                List<Response2996> responseD = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "driving-license", null, null );
                List<Response2996> responseSH = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "skill-headline", null, null );
                List<Response2996> responseL = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "language", null, null );
                assertNotNull( responseS );
                assertNotNull( responseOn );
                assertNotNull( responseOg );
                assertNotNull( responseOf );
                assertNotNull( responseD );
                assertNotNull( responseSH );
                assertNotNull( responseL );


            }

        }
    }
}