// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Indicates the success or failure of the attempt to leave feedback for the buyer,
 * change the paid status in My eBay, and/or change the shipped status in My eBay.
 * <br><br>
 * Applies to half.com.
 * <br><br>
 * <br><br>
 * When CompleteSale is applied to a specified order (by specifying OrderID), it
 * also applies to the child transactions associated with the order. An OrderID
 * cannot be used with half.com items.
 * 
 */
@RootElement(name = "CompleteSaleResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class CompleteSaleResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    
}