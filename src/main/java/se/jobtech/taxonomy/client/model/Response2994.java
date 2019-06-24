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

import java.util.Objects;

/**
 * Response2994
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-24T11:20:52.800+02:00")
public class Response2994 {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("definition")
    private String definition = null;

    @JsonProperty("preferredLabel")
    private String preferredLabel = null;

    @JsonProperty("deprecated")
    private Boolean deprecated = null;

    public Response2994 id( String id ) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public Response2994 type( String type ) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @ApiModelProperty(required = true, value = "")
    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }

    public Response2994 definition( String definition ) {
        this.definition = definition;
        return this;
    }

    /**
     * Get definition
     *
     * @return definition
     **/
    @ApiModelProperty(required = true, value = "")
    public String getDefinition() {
        return definition;
    }

    public void setDefinition( String definition ) {
        this.definition = definition;
    }

    public Response2994 preferredLabel( String preferredLabel ) {
        this.preferredLabel = preferredLabel;
        return this;
    }

    /**
     * Get preferredLabel
     *
     * @return preferredLabel
     **/
    @ApiModelProperty(required = true, value = "")
    public String getPreferredLabel() {
        return preferredLabel;
    }

    public void setPreferredLabel( String preferredLabel ) {
        this.preferredLabel = preferredLabel;
    }

    public Response2994 deprecated( Boolean deprecated ) {
        this.deprecated = deprecated;
        return this;
    }

    /**
     * Get deprecated
     *
     * @return deprecated
     **/
    @ApiModelProperty(value = "")
    public Boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated( Boolean deprecated ) {
        this.deprecated = deprecated;
    }


    @Override
    public boolean equals( java.lang.Object o ) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass( ) != o.getClass( )) {
            return false;
        }
        Response2994 response2994 = (Response2994) o;
        return Objects.equals( this.id, response2994.id ) &&
                Objects.equals( this.type, response2994.type ) &&
                Objects.equals( this.definition, response2994.definition ) &&
                Objects.equals( this.preferredLabel, response2994.preferredLabel ) &&
                Objects.equals( this.deprecated, response2994.deprecated );
    }

    @Override
    public int hashCode() {
        return Objects.hash( id, type, definition, preferredLabel, deprecated );
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder( );
        sb.append( "class Response2994 {\n" );

        sb.append( "    id: " ).append( toIndentedString( id ) ).append( "\n" );
        sb.append( "    type: " ).append( toIndentedString( type ) ).append( "\n" );
        sb.append( "    definition: " ).append( toIndentedString( definition ) ).append( "\n" );
        sb.append( "    preferredLabel: " ).append( toIndentedString( preferredLabel ) ).append( "\n" );
        sb.append( "    deprecated: " ).append( toIndentedString( deprecated ) ).append( "\n" );
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

