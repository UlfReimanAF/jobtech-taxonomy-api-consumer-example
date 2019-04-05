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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * Response38763
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-05T11:09:31.292+02:00")
public class Response38763 {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("preferred-term")
  private String preferredTerm = null;

  @JsonProperty("new-preferred-term")
  private String newPreferredTerm = null;

  @JsonProperty("old-preferred-term")
  private String oldPreferredTerm = null;

  @JsonProperty("deprecated")
  private Boolean deprecated = null;

  @JsonProperty("transaction-id")
  private Long transactionId = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("concept-id")
  private String conceptId = null;

  @JsonProperty("event-type")
  private String eventType = null;

  public Response38763 category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Response38763 preferredTerm(String preferredTerm) {
    this.preferredTerm = preferredTerm;
    return this;
  }

   /**
   * Get preferredTerm
   * @return preferredTerm
  **/
  @ApiModelProperty(value = "")
  public String getPreferredTerm() {
    return preferredTerm;
  }

  public void setPreferredTerm(String preferredTerm) {
    this.preferredTerm = preferredTerm;
  }

  public Response38763 newPreferredTerm(String newPreferredTerm) {
    this.newPreferredTerm = newPreferredTerm;
    return this;
  }

   /**
   * Get newPreferredTerm
   * @return newPreferredTerm
  **/
  @ApiModelProperty(value = "")
  public String getNewPreferredTerm() {
    return newPreferredTerm;
  }

  public void setNewPreferredTerm(String newPreferredTerm) {
    this.newPreferredTerm = newPreferredTerm;
  }

  public Response38763 oldPreferredTerm(String oldPreferredTerm) {
    this.oldPreferredTerm = oldPreferredTerm;
    return this;
  }

   /**
   * Get oldPreferredTerm
   * @return oldPreferredTerm
  **/
  @ApiModelProperty(value = "")
  public String getOldPreferredTerm() {
    return oldPreferredTerm;
  }

  public void setOldPreferredTerm(String oldPreferredTerm) {
    this.oldPreferredTerm = oldPreferredTerm;
  }

  public Response38763 deprecated(Boolean deprecated) {
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

  public Response38763 transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public Response38763 timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Response38763 conceptId(String conceptId) {
    this.conceptId = conceptId;
    return this;
  }

   /**
   * Get conceptId
   * @return conceptId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getConceptId() {
    return conceptId;
  }

  public void setConceptId(String conceptId) {
    this.conceptId = conceptId;
  }

  public Response38763 eventType(String eventType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response38763 response38763 = (Response38763) o;
    return Objects.equals(this.category, response38763.category) &&
        Objects.equals(this.preferredTerm, response38763.preferredTerm) &&
        Objects.equals(this.newPreferredTerm, response38763.newPreferredTerm) &&
        Objects.equals(this.oldPreferredTerm, response38763.oldPreferredTerm) &&
        Objects.equals(this.deprecated, response38763.deprecated) &&
        Objects.equals(this.transactionId, response38763.transactionId) &&
        Objects.equals(this.timestamp, response38763.timestamp) &&
        Objects.equals(this.conceptId, response38763.conceptId) &&
        Objects.equals(this.eventType, response38763.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, preferredTerm, newPreferredTerm, oldPreferredTerm, deprecated, transactionId, timestamp, conceptId, eventType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response38763 {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    preferredTerm: ").append(toIndentedString(preferredTerm)).append("\n");
    sb.append("    newPreferredTerm: ").append(toIndentedString(newPreferredTerm)).append("\n");
    sb.append("    oldPreferredTerm: ").append(toIndentedString(oldPreferredTerm)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    conceptId: ").append(toIndentedString(conceptId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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
