/*
 * Jobtech Taxonomy
 * Jobtech taxonomy services
 *
 * OpenAPI spec version: 1.0.0
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
 * Response2789
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-17T13:28:16.089+02:00")
public class Response2789 {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("definition")
    private String definition = null;

    @JsonProperty("instanceType")
    private String instanceType = null;

    @JsonProperty("preferredLabel")
    private String preferredLabel = null;

    @JsonProperty("deprecated")
    private Boolean deprecated = null;

    public Response2789 id( String id ) {
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

    public Response2789 definition( String definition ) {
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

    public Response2789 instanceType( String instanceType ) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * Get instanceType
     *
     * @return instanceType
     **/
    @ApiModelProperty(required = true, value = "")
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType( String instanceType ) {
        this.instanceType = instanceType;
    }

    public Response2789 preferredLabel( String preferredLabel ) {
        this.preferredLabel = preferredLabel;
        return this;
    }

    /**
     * Get preferredLabel
     *
     * @return preferredLabel
     **/
    @ApiModelProperty(value = "")
    public String getPreferredLabel() {
        return preferredLabel;
    }

    public void setPreferredLabel( String preferredLabel ) {
        this.preferredLabel = preferredLabel;
    }

    public Response2789 deprecated( Boolean deprecated ) {
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
        Response2789 response2789 = (Response2789) o;
        return Objects.equals( this.id, response2789.id ) &&
                Objects.equals( this.definition, response2789.definition ) &&
                Objects.equals( this.instanceType, response2789.instanceType ) &&
                Objects.equals( this.preferredLabel, response2789.preferredLabel ) &&
                Objects.equals( this.deprecated, response2789.deprecated );
    }

    @Override
    public int hashCode() {
        return Objects.hash( id, definition, instanceType, preferredLabel, deprecated );
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder( );
        sb.append( "class Response2789 {\n" );

        sb.append( "    id: " ).append( toIndentedString( id ) ).append( "\n" );
        sb.append( "    definition: " ).append( toIndentedString( definition ) ).append( "\n" );
        sb.append( "    instanceType: " ).append( toIndentedString( instanceType ) ).append( "\n" );
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

