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
 * Response3001
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-24T11:20:52.800+02:00")
public class Response3001 {
    @JsonProperty("type")
    private String type = null;

    @JsonProperty("message")
    private String message = null;

    public Response3001 type( String type ) {
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

    public Response3001 message( String message ) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     **/
    @ApiModelProperty(required = true, value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage( String message ) {
        this.message = message;
    }


    @Override
    public boolean equals( java.lang.Object o ) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass( ) != o.getClass( )) {
            return false;
        }
        Response3001 response3001 = (Response3001) o;
        return Objects.equals( this.type, response3001.type ) &&
                Objects.equals( this.message, response3001.message );
    }

    @Override
    public int hashCode() {
        return Objects.hash( type, message );
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder( );
        sb.append( "class Response3001 {\n" );

        sb.append( "    type: " ).append( toIndentedString( type ) ).append( "\n" );
        sb.append( "    message: " ).append( toIndentedString( message ) ).append( "\n" );
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

