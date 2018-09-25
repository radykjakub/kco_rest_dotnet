/*
 * Klarna Order Managment API
 * API to handle order lifecycle
 *
 * OpenAPI spec version: 1.0
 * Contact: developers-experience@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.model.order_management;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Refund
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:24:04.099Z")
public class Refund {
  @JsonProperty("refund_id")
  private String refundId = null;

  @JsonProperty("refunded_amount")
  private Long refundedAmount = null;

  @JsonProperty("refunded_at")
  private OffsetDateTime refundedAt = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("order_lines")
  private List<OrderLine> orderLines = null;

  @JsonProperty("processed_order_lines")
  private List<OrderLine> processedOrderLines = null;

  @JsonProperty("merchant_reversal")
  private Boolean merchantReversal = null;

  public Refund refundedAmount(Long refundedAmount) {
    this.refundedAmount = refundedAmount;
    return this;
  }

  /**
   * This API call is used to read information on a refund.

   * @return refund id
   **/
  @ApiModelProperty(value = "Refund ID.")
  public String getRefundId() {
    return description;
  }

  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }

   /**
   * Refunded amount in minor units.
   * @return refundedAmount
  **/
  @ApiModelProperty(value = "Refunded amount in minor units.")
  public Long getRefundedAmount() {
    return refundedAmount;
  }

  public void setRefundedAmount(Long refundedAmount) {
    this.refundedAmount = refundedAmount;
  }

  public Refund refundedAt(OffsetDateTime refundedAt) {
    this.refundedAt = refundedAt;
    return this;
  }

   /**
   * The time of the refund. ISO 8601.
   * @return refundedAt
  **/
  @ApiModelProperty(example = "2015-12-04T15:17:40.000Z", value = "The time of the refund. ISO 8601.")
  public OffsetDateTime getRefundedAt() {
    return refundedAt;
  }

  public void setRefundedAt(OffsetDateTime refundedAt) {
    this.refundedAt = refundedAt;
  }

  public Refund description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the refund shown to the customer. Max length is 255 characters.
   * @return description
  **/
  @ApiModelProperty(example = "The item was returned and the order refunded.", value = "Description of the refund shown to the customer. Max length is 255 characters.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Refund orderLines(List<OrderLine> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public Refund addOrderLinesItem(OrderLine orderLinesItem) {
    if (this.orderLines == null) {
      this.orderLines = new ArrayList<OrderLine>();
    }
    this.orderLines.add(orderLinesItem);
    return this;
  }

   /**
   * Order lines for the refund shown to the customer. Optional but increases the customer experience. Maximum 1000 order lines.
   * @return orderLines
  **/
  @ApiModelProperty(value = "Order lines for the refund shown to the customer. Optional but increases the customer experience. Maximum 1000 order lines.")
  public List<OrderLine> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<OrderLine> orderLines) {
    this.orderLines = orderLines;
  }


  /**
   * @return processedOrderLines
   **/
  @ApiModelProperty(value = "Order lines for the refund shown to the customer. Optional but increases the customer experience. Maximum 1000 order lines.")
  public List<OrderLine> getProcessedOrderLines() {
    return processedOrderLines;
  }

  public void setProcessedOrderLines(List<OrderLine> orderLines) {
    this.processedOrderLines = processedOrderLines;
  }

  public Refund processedOrderLines(List<OrderLine> processedOrderLines) {
    this.processedOrderLines = processedOrderLines;
    return this;
  }

  public Refund addProcessedOrderLinesItem(OrderLine processedOrderLinesItem) {
    if (this.processedOrderLines == null) {
      this.processedOrderLines = new ArrayList<OrderLine>();
    }
    this.processedOrderLines.add(processedOrderLinesItem);
    return this;
  }

  /**
   * Gets the merchant reversal flag.
   *
   * @return Reversal flag
   */
  public Boolean getMerchantReversal() {
    return this.merchantReversal;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Refund refund = (Refund) o;
    return Objects.equals(this.refundedAmount, refund.refundedAmount) &&
        Objects.equals(this.refundedAt, refund.refundedAt) &&
        Objects.equals(this.description, refund.description) &&
        Objects.equals(this.orderLines, refund.orderLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refundedAmount, refundedAt, description, orderLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Refund {\n");
    
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    refundedAt: ").append(toIndentedString(refundedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
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

