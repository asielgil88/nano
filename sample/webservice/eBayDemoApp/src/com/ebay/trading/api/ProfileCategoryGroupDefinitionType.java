// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>PaymentProfileCategoryGroup</b>, <b>
 * ReturnPolicyProfileCategoryGroup</b>, and <b>ShippingProfileCategoryGroup</b>
 * fields, which are all returned in the <b>GetCategoryFeature</b> response if these
 * Business Policies profile types apply to the category. Each of these fields is returned as an
 * empty element.
 * 
 */
public class ProfileCategoryGroupDefinitionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@AnyElement
	@Order(value=0)
	public List<Object> any;	
	
    
}