// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * User data related to notifications.
 * 
 */
public class NotificationUserDataType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SMSSubscription")
	@Order(value=0)
	public SMSSubscriptionType smsSubscription;	
	
	@Element(name = "SummarySchedule")
	@Order(value=1)
	public List<SummaryEventScheduleType> summarySchedule;	
	
	@Element(name = "ExternalUserData")
	@Order(value=2)
	public String externalUserData;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}