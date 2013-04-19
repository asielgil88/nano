// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>Charity</b> container, which consists of all details
 * related to a nonprofit charity organization.
 * 
 */
public class CharityInfoType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Name")
	@Order(value=0)
	public String name;	
	
	@Element(name = "Mission")
	@Order(value=1)
	public String mission;	
	
	@Element(name = "LogoURL")
	@Order(value=2)
	public String logoURL;	
	
	@Element(name = "Status")
	@Order(value=3)
	public CharityStatusCodeType status;	
	
	@Element(name = "SearchableString")
	@Order(value=4)
	public String searchableString;	
	
	@Element(name = "CharityRegion")
	@Order(value=5)
	public Integer charityRegion;	
	
	@Element(name = "CharityDomain")
	@Order(value=6)
	public List<Integer> charityDomain;	
	
	@Element(name = "CharityID")
	@Order(value=7)
	public String charityID;	
	
	@Element(name = "LogoURLSelling")
	@Order(value=8)
	public String logoURLSelling;	
	
	@Element(name = "DisplayLogoSelling")
	@Order(value=9)
	public Boolean displayLogoSelling;	
	
	@Element(name = "DisplayNameInCheckout")
	@Order(value=10)
	public Boolean displayNameInCheckout;	
	
	@Element(name = "Description")
	@Order(value=11)
	public String description;	
	
	@Element(name = "ShowMultipleDonationAmountInCheckout")
	@Order(value=12)
	public Boolean showMultipleDonationAmountInCheckout;	
	
	@Element(name = "ExternalID")
	@Order(value=13)
	public String externalID;	
	
	@Element(name = "PopularityIndex")
	@Order(value=14)
	public Integer popularityIndex;	
	
	@Element(name = "EIN")
	@Order(value=15)
	public String ein;	
	
	@Element(name = "NonProfitSecondName")
	@Order(value=16)
	public String nonProfitSecondName;	
	
	@Element(name = "NonProfitAddress")
	@Order(value=17)
	public List<NonProfitAddressType> nonProfitAddress;	
	
	@Element(name = "NonProfitSocialAddress")
	@Order(value=18)
	public List<NonProfitSocialAddressType> nonProfitSocialAddress;	
	
	@AnyElement
	@Order(value=19)
	public List<Object> any;	
	
	@Attribute  
	@Order(value=20)
	public String id;	
	
    
}