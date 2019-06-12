package se.jobtech.taxonomy.client.api;


import org.junit.Test;
import se.jobtech.taxonomy.client.model.Response2784;
import se.jobtech.taxonomy.client.model.Response2786;
import se.jobtech.taxonomy.client.model.Response2788;

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
        List<Response2784> response = api.v0TaxonomyPublicChangesGet( fromDateTime, offset, limit );

        assertNotNull( response );
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
        Boolean deprecated = null;
        Long offset = null;
        Long limit = null;
        List<Response2786> response = api.v0TaxonomyPublicConceptsGet( id, preferredLabel, type, deprecated, offset, limit );

        // TODO: test validations
        assertNotNull( response );
    }

    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * @throws Exception if the Api call fails
     */
//@Test
    public void v0TaxonomyPublicDeprecatedConceptHistorySinceGetTest() {
        String fromDateTime = "2018-08-08 14:00:00";
        ERRORUNKNOWN response = api.v0TaxonomyPublicDeprecatedConceptHistorySinceGet( fromDateTime );

        // TODO: test validations
    }

    /**
     * get concepts by part of string
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void v0TaxonomyPublicSearchGetTest() {
        String q = "ja";
        String type = "language";
        Long offset = 0L;
        Long limit = 1L;
        List<Response2788> response = api.v0TaxonomyPublicSearchGet(q, type, offset, limit);


        // TODO: test validations
    }

}
