
package asn1;
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
    @ASN1BoxedType ( name = "BugList" )
    public class BugList implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "BugList" , isSetOf = false)
	    private java.util.Collection<BugValueType> value = null; 
    
            public BugList () {
            }
        
            public BugList ( java.util.Collection<BugValueType> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<BugValueType> value) {
                this.value = value;
            }
            
            public java.util.Collection<BugValueType> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<BugValueType>()); 
            }
            
            public void add(BugValueType item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(BugList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            