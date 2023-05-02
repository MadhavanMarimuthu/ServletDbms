package dto;

public class Status_And_Addresstype {
	private String id;
    private String name;
    private String code;
    private String phone;
    private String contact_Person_Name;
    private String contact_Person_Phone;
    private String status;
	 private String  address_Type;
	 private String address_Line1;
	 private String city;
	 private String state;
	 private String country;
	 private String postal_Code;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getContact_Person_Name() {
		return contact_Person_Name;
	}
	public void setContact_Person_Name(String contact_Person_Name) {
		this.contact_Person_Name = contact_Person_Name;
	}
	public String getContact_Person_Phone() {
		return contact_Person_Phone;
	}
	public void setContact_Person_Phone(String contact_Person_Phone) {
		this.contact_Person_Phone = contact_Person_Phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getAddress_Type() {
		return address_Type;
	}
	public void setAddress_Type(String address_Type) {
		this.address_Type = address_Type;
	}
	public String getAddress_Line1() {
		return address_Line1;
	}
	public void setAddress_Line1(String address_Line1) {
		this.address_Line1 = address_Line1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostal_Code() {
		return postal_Code;
	}
	public void setPostal_Code(String postal_Code) {
		this.postal_Code = postal_Code;
	}
	public Status_And_Addresstype(String id, String name, String code,  String phone,
			String contact_Person_Name, String contact_Person_Phone, String status,
		String address_Type, String address_Line1,
			String city, String state, String country, String postal_Code)
{
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.phone = phone;
		this.contact_Person_Name = contact_Person_Name;
		this.contact_Person_Phone = contact_Person_Phone;
		this.status = status;
		this.address_Type = address_Type;
		this.address_Line1 = address_Line1;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postal_Code = postal_Code;
	}
	 
	 

}
