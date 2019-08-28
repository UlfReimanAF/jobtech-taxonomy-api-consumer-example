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

/**
 * Response3179ConceptReplacedBy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-27T11:15:31.744+02:00")
public class Response3179ConceptReplacedBy {
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

  public Response3179ConceptReplacedBy id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Response3179ConceptReplacedBy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Response3179ConceptReplacedBy definition(String definition) {
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public Response3179ConceptReplacedBy preferredLabel(String preferredLabel) {
    this.preferredLabel = preferredLabel;
    return this;
  }

   /**
   * Get preferredLabel
   * @return preferredLabel
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPreferredLabel() {
    return preferredLabel;
  }

  public void setPreferredLabel(String preferredLabel) {
    this.preferredLabel = preferredLabel;
  }

  public Response3179ConceptReplacedBy deprecated(Boolean deprecated) {
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Get deprecated
   * @return deprecated
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeprecated() {
    return deprecated;
  }

  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response3179ConceptReplacedBy response3179ConceptReplacedBy = (Response3179ConceptReplacedBy) o;
    return Objects.equals(this.id, response3179ConceptReplacedBy.id) &&
        Objects.equals(this.type, response3179ConceptReplacedBy.type) &&
        Objects.equals(this.definition, response3179ConceptReplacedBy.definition) &&
        Objects.equals(this.preferredLabel, response3179ConceptReplacedBy.preferredLabel) &&
        Objects.equals(this.deprecated, response3179ConceptReplacedBy.deprecated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, definition, preferredLabel, deprecated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response3179ConceptReplacedBy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    preferredLabel: ").append(toIndentedString(preferredLabel)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
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
