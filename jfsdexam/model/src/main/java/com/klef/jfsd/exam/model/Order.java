package com.klef.jfsd.exam.model;
import java.util.Date;
@Entity
@Table(name = "orders")
public class Order {
	 @Id
	    @Column(name = "order_id", nullable = false, unique = true)
	    private Long orderId;

	    @Column(name = "product_name", nullable = false, unique = false)
	    private String productName;

	    @Column(name = "quantity", nullable = false, unique = false)
	    private Integer quantity;

	    @Column(name = "order_date", nullable = false, unique = false)
	    @Temporal(TemporalType.DATE)
	    private Date orderDate;

	    @Column(name = "customer_name", nullable = false, unique = false)
	    private String customerName;

	    public Long getOrderId() {
	        return orderId;
	    }
	    public void setOrderId(Long orderId) {
	        this.orderId = orderId;
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

	    public Date getOrderDate() {
	        return orderDate;
	    }

	    public void setOrderDate(Date orderDate) {
	        this.orderDate = orderDate;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }
}
