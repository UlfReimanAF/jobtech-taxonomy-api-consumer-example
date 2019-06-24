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


package se.jobtech.taxonomy.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Response2992
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-24T11:20:52.800+02:00")
public class Response2992 {
    @JsonProperty("eventType")
    private String eventType = null;

    @JsonProperty("transactionId")
    private Long transactionId = null;

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp = null;

    @JsonProperty("concept")
    private Response2992Concept concept = null;

    public Response2992 eventType( String eventType ) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get eventType
     *
     * @return eventType
     **/
    @ApiModelProperty(required = true, value = "")
    public String getEventType() {
        return eventType;
    }

    public void setEventType( String eventType ) {
        this.eventType = eventType;
    }

    public Response2992 transactionId( Long transactionId ) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Get transactionId
     *
     * @return transactionId
     **/
    @ApiModelProperty(required = true, value = "")
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId( Long transactionId ) {
        this.transactionId = transactionId;
    }

    public Response2992 timestamp( OffsetDateTime timestamp ) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @ApiModelProperty(required = true, value = "")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp( OffsetDateTime timestamp ) {
        this.timestamp = timestamp;
    }

    public Response2992 concept( Response2992Concept concept ) {
        this.concept = concept;
        return this;
    }

    /**
     * Get concept
     *
     * @return concept
     **/
    @ApiModelProperty(required = true, value = "")
    public Response2992Concept getConcept() {
        return concept;
    }

    public void setConcept( Response2992Concept concept ) {
        this.concept = concept;
    }


    @Override
    public boolean equals( java.lang.Object o ) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass( ) != o.getClass( )) {
            return false;
        }
        Response2992 response2992 = (Response2992) o;
        return Objects.equals( this.eventType, response2992.eventType ) &&
                Objects.equals( this.transactionId, response2992.transactionId ) &&
                Objects.equals( this.timestamp, response2992.timestamp ) &&
                Objects.equals( this.concept, response2992.concept );
    }

    @Override
    public int hashCode() {
        return Objects.hash( eventType, transactionId, timestamp, concept );
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder( );
        sb.append( "class Response2992 {\n" );

        sb.append( "    eventType: " ).append( toIndentedString( eventType ) ).append( "\n" );
        sb.append( "    transactionId: " ).append( toIndentedString( transactionId ) ).append( "\n" );
        sb.append( "    timestamp: " ).append( toIndentedString( timestamp ) ).append( "\n" );
        sb.append( "    concept: " ).append( toIndentedString( concept ) ).append( "\n" );
        sb.append( "}" );
        return sb.toString( );
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString( java.lang.Object o ) {
        if (o == null) {
            return "null";
        }
        return o.toString( ).replace( "\n", "\n    " );
    }

}
