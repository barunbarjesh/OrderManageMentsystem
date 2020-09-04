package com.barun.testfeign.dto;

import java.io.Serializable;

public class OrderItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Long itemId;
	String productCode;
	String productName;
	Integer quantity;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
