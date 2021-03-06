// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * (out) A template for an SMS notification message.
 * 
 */
@RootElement(name = "NotificationMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
public class NotificationMessageType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MessageBody")
	@Order(value=0)
	public String messageBody;	
	
	@Element(name = "EIAS")
	@Order(value=1)
	public String eias;	
	
    
}