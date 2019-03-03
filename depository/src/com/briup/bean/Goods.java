package com.briup.bean;
public class Goods {
     private int id;
     private String goodsid;
     private String name;
     private String address;
     private String num;
     private String sort;
     private String price;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	
	public String getAddress() {
		return address;
	}
	/**
	 * @return the goodsid
	 */
	public String getGoodsid() {
		return goodsid;
	}
	/**
	 * @param goodsid the goodsid to set
	 */
	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the number
	 */
	public String getNum() {
		return num;
	}
	/**
	 * @param number the number to set
	 */
	public void setNum(String num) {
		this.num = num;
	}
	/**
	 * @return the sort
	 */
	public String getSort() {
		return sort;
	}
	/**
	 * @param sort the sort to set
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Goods [id=" + id + ", goodsid=" + goodsid + ", name=" + name + ", address=" + address + ", num=" + num
				+ ", sort=" + sort + ", price=" + price + "]";
	}
     
}
