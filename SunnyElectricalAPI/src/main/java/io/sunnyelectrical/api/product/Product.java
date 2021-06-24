package io.sunnyelectrical.api.product;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product",schema="SalesLT")
public class Product {
	
	@Id
	@Column(name="ProductID")
	private Long productId;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="productnumber")	
	private String productNumber;
	
	@Column(name="Color")
	private String color;
	
	@Column(name="standardcost")
	private String standardCost;
	
	@Column(name="listprice")
	private String listPrice;
	
	@Column(name="Size")
	private String size;
	
	@Column(name="Weight")
	private Double weight;	
	
	@Column(name="productcategoryid")
	private Long productCategoryId;
	
	@Column(name="productmodelid")
	private Long productModelId;
	
	@Column(name="sellstartdate")
	private Timestamp sellStartDate;
	
	@Column(name="sellenddate")
	private Timestamp sellEndDate;
	
	@Column(name="discontinueddate")
	private Timestamp discontinuedDate;
	
	@Column(name="thumbnailphoto")
	private byte[] thumbNailPhoto;
	
	@Column(name="thumbnailphotofilename")
	private String thumbnailPhotoFileName;
	
	@Column(name="rowguid")
	private String rowguid;
	
	@Column(name="modifieddate")
	private Timestamp modifiedDate;

	

	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the productNumber
	 */
	public String getProductNumber() {
		return productNumber;
	}

	/**
	 * @param productNumber the productNumber to set
	 */
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @return the standardCost
	 */
	public String getStandardCost() {
		return standardCost;
	}

	/**
	 * @param standardCost the standardCost to set
	 */
	public void setStandardCost(String standardCost) {
		this.standardCost = standardCost;
	}

	/**
	 * @return the listPrice
	 */
	public String getListPrice() {
		return listPrice;
	}

	/**
	 * @param listPrice the listPrice to set
	 */
	public void setListPrice(String listPrice) {
		this.listPrice = listPrice;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	/**
	 * @return the productCategoryId
	 */
	public Long getProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * @param productCategoryId the productCategoryId to set
	 */
	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	/**
	 * @return the productModelId
	 */
	public Long getProductModelId() {
		return productModelId;
	}

	/**
	 * @param productModelId the productModelId to set
	 */
	public void setProductModelId(Long productModelId) {
		this.productModelId = productModelId;
	}

	/**
	 * @return the sellStartDate
	 */
	public Timestamp getSellStartDate() {
		return sellStartDate;
	}

	/**
	 * @param sellStartDate the sellStartDate to set
	 */
	public void setSellStartDate(Timestamp sellStartDate) {
		this.sellStartDate = sellStartDate;
	}

	/**
	 * @return the sellEndDate
	 */
	public Timestamp getSellEndDate() {
		return sellEndDate;
	}

	/**
	 * @param sellEndDate the sellEndDate to set
	 */
	public void setSellEndDate(Timestamp sellEndDate) {
		this.sellEndDate = sellEndDate;
	}

	/**
	 * @return the discontinuedDate
	 */
	public Timestamp getDiscontinuedDate() {
		return discontinuedDate;
	}

	/**
	 * @param discontinuedDate the discontinuedDate to set
	 */
	public void setDiscontinuedDate(Timestamp discontinuedDate) {
		this.discontinuedDate = discontinuedDate;
	}

	/**
	 * @return the thumbNailPhoto
	 */
	public byte[] getThumbNailPhoto() {
		return thumbNailPhoto;
	}

	/**
	 * @param thumbNailPhoto the thumbNailPhoto to set
	 */
	public void setThumbNailPhoto(byte[] thumbNailPhoto) {
		this.thumbNailPhoto = thumbNailPhoto;
	}

	/**
	 * @return the thumbnailPhotoFileName
	 */
	public String getThumbnailPhotoFileName() {
		return thumbnailPhotoFileName;
	}

	/**
	 * @param thumbnailPhotoFileName the thumbnailPhotoFileName to set
	 */
	public void setThumbnailPhotoFileName(String thumbnailPhotoFileName) {
		this.thumbnailPhotoFileName = thumbnailPhotoFileName;
	}

	/**
	 * @return the rowguid
	 */
	public String getRowguid() {
		return rowguid;
	}

	/**
	 * @param rowguid the rowguid to set
	 */
	public void setRowguid(String rowguid) {
		this.rowguid = rowguid;
	}

	/**
	 * @return the modifiedDate
	 */
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
