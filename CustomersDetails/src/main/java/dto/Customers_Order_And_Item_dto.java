package dto;

public class Customers_Order_And_Item_dto {
	public String id;
	public String order_id;
	public Customers_Order_And_Item_dto(String id, String order_id, String item_name, String item_sku, String item_rate,
			String ordered_qty, String order_total, String order_no, String payment_type, String order_date,
			String delivery_date) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.item_name = item_name;
		this.item_sku = item_sku;
		this.item_rate = item_rate;
		this.ordered_qty = ordered_qty;
		this.order_total = order_total;
		this.order_no = order_no;
		this.payment_type = payment_type;
		this.order_date = order_date;
		this.delivery_date = delivery_date;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String item_name;
	public String item_sku;
	public String item_rate;
	public String ordered_qty;
	public String order_total;
	public String order_no;
	public String payment_type;
	public String order_date;
	public String delivery_date;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_sku() {
		return item_sku;
	}
	public void setItem_sku(String item_sku) {
		this.item_sku = item_sku;
	}
	public String getItem_rate() {
		return item_rate;
	}
	public void setItem_rate(String item_rate) {
		this.item_rate = item_rate;
	}
	public String getOrdered_qty() {
		return ordered_qty;
	}
	public void setOrdered_qty(String ordered_qty) {
		this.ordered_qty = ordered_qty;
	}
	public String getOrder_total() {
		return order_total;
	}
	public void setOrder_total(String order_total) {
		this.order_total = order_total;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}
	
	
	

}
