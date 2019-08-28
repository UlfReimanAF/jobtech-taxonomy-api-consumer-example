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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import se.jobtech.taxonomy.client.model.Response3164Concept;

/**
 * Response3164
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-27T11:15:31.744+02:00")
public class Response3164 {
  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("version")
  private Long version = null;

  @JsonProperty("concept")
  private Response3164Concept concept = null;

  public Response3164 eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Response3164 version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public Response3164 concept(Response3164Concept concept) {
    this.concept = concept;
    return this;
  }

   /**
   * Get concept
   * @return concept
  **/
  @ApiModelProperty(required = true, value = "")
  public Response3164Concept getConcept() {
    return concept;
  }

  public void setConcept(Response3164Concept concept) {
    this.concept = concept;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response3164 response3164 = (Response3164) o;
    return Objects.equals(this.eventType, response3164.eventType) &&
        Objects.equals(this.version, response3164.version) &&
        Objects.equals(this.concept, response3164.concept);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, version, concept);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response3164 {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    concept: ").append(toIndentedString(concept)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

