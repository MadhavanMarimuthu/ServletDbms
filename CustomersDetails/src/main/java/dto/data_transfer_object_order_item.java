package dto;



public class data_transfer_object_order_item{
	public String order_id;
	public String item_name;
	public String item_sku;
	public String item_rate;
	public String ordered_qty;
	public String order_total;
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
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
	public data_transfer_object_order_item(String order_id, String item_name, String item_sku, String item_rate,
			String ordered_qty, String order_total) {
		super();
		this.order_id = order_id;
		this.item_name = item_name;
		this.item_sku = item_sku;
		this.item_rate = item_rate;
		this.ordered_qty = ordered_qty;
		this.order_total = order_total;
	}
	
}