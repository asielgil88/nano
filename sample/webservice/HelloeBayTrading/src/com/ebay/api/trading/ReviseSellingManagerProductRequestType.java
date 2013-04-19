// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Revises a Selling Manager product.
 * <br><br>
 * This call is subject to change without notice; the
 * deprecation process is inapplicable to this call.
 * 
 */
@RootElement(name = "ReviseSellingManagerProductRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ReviseSellingManagerProductRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellingManagerProductDetails")
	@Order(value=0)
	public SellingManagerProductDetailsType sellingManagerProductDetails;	
	
	@Element(name = "SellingManagerFolderDetails")
	@Order(value=1)
	public SellingManagerFolderDetailsType sellingManagerFolderDetails;	
	
	@Element(name = "DeletedField")
	@Order(value=2)
	public List<String> deletedField;	
	
	@Element(name = "SellingManagerProductSpecifics")
	@Order(value=3)
	public SellingManagerProductSpecificsType sellingManagerProductSpecifics;	
	
    
}