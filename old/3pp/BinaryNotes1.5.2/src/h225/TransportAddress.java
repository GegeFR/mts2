
package h225;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1Choice ( name = "TransportAddress" )
    public class TransportAddress implements IASN1PreparedElement {
            

       @ASN1PreparedElement
       @ASN1Sequence ( name = "ipAddress" , isSet = false )
       public static class IpAddressSequenceType implements IASN1PreparedElement {
                @ASN1OctetString( name = "" )
    
            @ASN1SizeConstraint ( max = 4L )
        
        @ASN1Element ( name = "ip", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] ip = null;
                
  @ASN1Integer( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 65535L 
		
	   )
	   
        @ASN1Element ( name = "port", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Integer port = null;
                
  
        
        public byte[] getIp () {
            return this.ip;
        }

        

        public void setIp (byte[] value) {
            this.ip = value;
        }
        
  
        
        public Integer getPort () {
            return this.port;
        }

        

        public void setPort (Integer value) {
            this.port = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_IpAddressSequenceType;
        }

       private static IASN1PreparedElementData preparedData_IpAddressSequenceType = CoderFactory.getInstance().newPreparedElementData(IpAddressSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "ipAddress", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private IpAddressSequenceType ipAddress = null;
                
  

       @ASN1PreparedElement
       @ASN1Sequence ( name = "ipSourceRoute" , isSet = false )
       public static class IpSourceRouteSequenceType implements IASN1PreparedElement {
                @ASN1OctetString( name = "" )
    
            @ASN1SizeConstraint ( max = 4L )
        
        @ASN1Element ( name = "ip", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] ip = null;
                
  @ASN1Integer( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 65535L 
		
	   )
	   
        @ASN1Element ( name = "port", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Integer port = null;
                
  @ASN1OctetString( name = "" )
    
            @ASN1SizeConstraint ( max = 4L )
        
@ASN1SequenceOf( name = "route", isSetOf = false ) 

    
        @ASN1Element ( name = "route", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private java.util.Collection<byte[]>  route = null;
                
  
        
    @ASN1PreparedElement
    @ASN1Choice ( name = "routing" )
    public static class RoutingChoiceType implements IASN1PreparedElement {
            
        @ASN1Null ( name = "strict" ) 
    
        @ASN1Element ( name = "strict", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject strict = null;
                
  
        @ASN1Null ( name = "loose" ) 
    
        @ASN1Element ( name = "loose", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject loose = null;
                
  
        
        public org.bn.types.NullObject getStrict () {
            return this.strict;
        }

        public boolean isStrictSelected () {
            return this.strict != null;
        }

        private void setStrict (org.bn.types.NullObject value) {
            this.strict = value;
        }

        
        public void selectStrict () {
            selectStrict (new org.bn.types.NullObject());
	}
	
        public void selectStrict (org.bn.types.NullObject value) {
            this.strict = value;
            
                    setLoose(null);
                            
        }

        
  
        
        public org.bn.types.NullObject getLoose () {
            return this.loose;
        }

        public boolean isLooseSelected () {
            return this.loose != null;
        }

        private void setLoose (org.bn.types.NullObject value) {
            this.loose = value;
        }

        
        public void selectLoose () {
            selectLoose (new org.bn.types.NullObject());
	}
	
        public void selectLoose (org.bn.types.NullObject value) {
            this.loose = value;
            
                    setStrict(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_RoutingChoiceType;
        }

        private static IASN1PreparedElementData preparedData_RoutingChoiceType = CoderFactory.getInstance().newPreparedElementData(RoutingChoiceType.class);

    }

                
        @ASN1Element ( name = "routing", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private RoutingChoiceType routing = null;
                
  
        
        public byte[] getIp () {
            return this.ip;
        }

        

        public void setIp (byte[] value) {
            this.ip = value;
        }
        
  
        
        public Integer getPort () {
            return this.port;
        }

        

        public void setPort (Integer value) {
            this.port = value;
        }
        
  
        
        public java.util.Collection<byte[]>  getRoute () {
            return this.route;
        }

        

        public void setRoute (java.util.Collection<byte[]>  value) {
            this.route = value;
        }
        
  
        
        public RoutingChoiceType getRouting () {
            return this.routing;
        }

        

        public void setRouting (RoutingChoiceType value) {
            this.routing = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_IpSourceRouteSequenceType;
        }

       private static IASN1PreparedElementData preparedData_IpSourceRouteSequenceType = CoderFactory.getInstance().newPreparedElementData(IpSourceRouteSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "ipSourceRoute", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private IpSourceRouteSequenceType ipSourceRoute = null;
                
  

       @ASN1PreparedElement
       @ASN1Sequence ( name = "ipxAddress" , isSet = false )
       public static class IpxAddressSequenceType implements IASN1PreparedElement {
                @ASN1OctetString( name = "" )
    
            @ASN1SizeConstraint ( max = 6L )
        
        @ASN1Element ( name = "node", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] node = null;
                
  @ASN1OctetString( name = "" )
    
            @ASN1SizeConstraint ( max = 4L )
        
        @ASN1Element ( name = "netnum", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] netnum = null;
                
  @ASN1OctetString( name = "" )
    
            @ASN1SizeConstraint ( max = 2L )
        
        @ASN1Element ( name = "port", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] port = null;
                
  
        
        public byte[] getNode () {
            return this.node;
        }

        

        public void setNode (byte[] value) {
            this.node = value;
        }
        
  
        
        public byte[] getNetnum () {
            return this.netnum;
        }

        

        public void setNetnum (byte[] value) {
            this.netnum = value;
        }
        
  
        
        public byte[] getPort () {
            return this.port;
        }

        

        public void setPort (byte[] value) {
            this.port = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_IpxAddressSequenceType;
        }

       private static IASN1PreparedElementData preparedData_IpxAddressSequenceType = CoderFactory.getInstance().newPreparedElementData(IpxAddressSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "ipxAddress", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private IpxAddressSequenceType ipxAddress = null;
                
  

       @ASN1PreparedElement
       @ASN1Sequence ( name = "ip6Address" , isSet = false )
       public static class Ip6AddressSequenceType implements IASN1PreparedElement {
                @ASN1OctetString( name = "" )
    
            @ASN1SizeConstraint ( max = 16L )
        
        @ASN1Element ( name = "ip", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] ip = null;
                
  @ASN1Integer( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 65535L 
		
	   )
	   
        @ASN1Element ( name = "port", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Integer port = null;
                
  
        
        public byte[] getIp () {
            return this.ip;
        }

        

        public void setIp (byte[] value) {
            this.ip = value;
        }
        
  
        
        public Integer getPort () {
            return this.port;
        }

        

        public void setPort (Integer value) {
            this.port = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_Ip6AddressSequenceType;
        }

       private static IASN1PreparedElementData preparedData_Ip6AddressSequenceType = CoderFactory.getInstance().newPreparedElementData(Ip6AddressSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "ip6Address", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Ip6AddressSequenceType ip6Address = null;
                
  @ASN1OctetString( name = "" )
    
            @ASN1SizeConstraint ( max = 16L )
        
        @ASN1Element ( name = "netBios", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] netBios = null;
                
  @ASN1OctetString( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 1L, 
		
		max = 20L 
		
	   )
	   
        @ASN1Element ( name = "nsap", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] nsap = null;
                
  
        @ASN1Element ( name = "nonStandardAddress", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NonStandardParameter nonStandardAddress = null;
                
  
        
        public IpAddressSequenceType getIpAddress () {
            return this.ipAddress;
        }

        public boolean isIpAddressSelected () {
            return this.ipAddress != null;
        }

        private void setIpAddress (IpAddressSequenceType value) {
            this.ipAddress = value;
        }

        
        public void selectIpAddress (IpAddressSequenceType value) {
            this.ipAddress = value;
            
                    setIpSourceRoute(null);
                
                    setIpxAddress(null);
                
                    setIp6Address(null);
                
                    setNetBios(null);
                
                    setNsap(null);
                
                    setNonStandardAddress(null);
                            
        }

        
  
        
        public IpSourceRouteSequenceType getIpSourceRoute () {
            return this.ipSourceRoute;
        }

        public boolean isIpSourceRouteSelected () {
            return this.ipSourceRoute != null;
        }

        private void setIpSourceRoute (IpSourceRouteSequenceType value) {
            this.ipSourceRoute = value;
        }

        
        public void selectIpSourceRoute (IpSourceRouteSequenceType value) {
            this.ipSourceRoute = value;
            
                    setIpAddress(null);
                
                    setIpxAddress(null);
                
                    setIp6Address(null);
                
                    setNetBios(null);
                
                    setNsap(null);
                
                    setNonStandardAddress(null);
                            
        }

        
  
        
        public IpxAddressSequenceType getIpxAddress () {
            return this.ipxAddress;
        }

        public boolean isIpxAddressSelected () {
            return this.ipxAddress != null;
        }

        private void setIpxAddress (IpxAddressSequenceType value) {
            this.ipxAddress = value;
        }

        
        public void selectIpxAddress (IpxAddressSequenceType value) {
            this.ipxAddress = value;
            
                    setIpAddress(null);
                
                    setIpSourceRoute(null);
                
                    setIp6Address(null);
                
                    setNetBios(null);
                
                    setNsap(null);
                
                    setNonStandardAddress(null);
                            
        }

        
  
        
        public Ip6AddressSequenceType getIp6Address () {
            return this.ip6Address;
        }

        public boolean isIp6AddressSelected () {
            return this.ip6Address != null;
        }

        private void setIp6Address (Ip6AddressSequenceType value) {
            this.ip6Address = value;
        }

        
        public void selectIp6Address (Ip6AddressSequenceType value) {
            this.ip6Address = value;
            
                    setIpAddress(null);
                
                    setIpSourceRoute(null);
                
                    setIpxAddress(null);
                
                    setNetBios(null);
                
                    setNsap(null);
                
                    setNonStandardAddress(null);
                            
        }

        
  
        
        public byte[] getNetBios () {
            return this.netBios;
        }

        public boolean isNetBiosSelected () {
            return this.netBios != null;
        }

        private void setNetBios (byte[] value) {
            this.netBios = value;
        }

        
        public void selectNetBios (byte[] value) {
            this.netBios = value;
            
                    setIpAddress(null);
                
                    setIpSourceRoute(null);
                
                    setIpxAddress(null);
                
                    setIp6Address(null);
                
                    setNsap(null);
                
                    setNonStandardAddress(null);
                            
        }

        
  
        
        public byte[] getNsap () {
            return this.nsap;
        }

        public boolean isNsapSelected () {
            return this.nsap != null;
        }

        private void setNsap (byte[] value) {
            this.nsap = value;
        }

        
        public void selectNsap (byte[] value) {
            this.nsap = value;
            
                    setIpAddress(null);
                
                    setIpSourceRoute(null);
                
                    setIpxAddress(null);
                
                    setIp6Address(null);
                
                    setNetBios(null);
                
                    setNonStandardAddress(null);
                            
        }

        
  
        
        public NonStandardParameter getNonStandardAddress () {
            return this.nonStandardAddress;
        }

        public boolean isNonStandardAddressSelected () {
            return this.nonStandardAddress != null;
        }

        private void setNonStandardAddress (NonStandardParameter value) {
            this.nonStandardAddress = value;
        }

        
        public void selectNonStandardAddress (NonStandardParameter value) {
            this.nonStandardAddress = value;
            
                    setIpAddress(null);
                
                    setIpSourceRoute(null);
                
                    setIpxAddress(null);
                
                    setIp6Address(null);
                
                    setNetBios(null);
                
                    setNsap(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TransportAddress.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            