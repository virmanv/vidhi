/**
 * ShortCode_Get_DS_DSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mymobileapi.www.api5;

public class ShortCode_Get_DS_DSResponse  implements java.io.Serializable {
    private com.mymobileapi.www.api5.ShortCode_Get_DS_DSResponseShortCode_Get_DS_DSResult shortCode_Get_DS_DSResult;

    public ShortCode_Get_DS_DSResponse() {
    }

    public ShortCode_Get_DS_DSResponse(
           com.mymobileapi.www.api5.ShortCode_Get_DS_DSResponseShortCode_Get_DS_DSResult shortCode_Get_DS_DSResult) {
           this.shortCode_Get_DS_DSResult = shortCode_Get_DS_DSResult;
    }


    /**
     * Gets the shortCode_Get_DS_DSResult value for this ShortCode_Get_DS_DSResponse.
     * 
     * @return shortCode_Get_DS_DSResult
     */
    public com.mymobileapi.www.api5.ShortCode_Get_DS_DSResponseShortCode_Get_DS_DSResult getShortCode_Get_DS_DSResult() {
        return shortCode_Get_DS_DSResult;
    }


    /**
     * Sets the shortCode_Get_DS_DSResult value for this ShortCode_Get_DS_DSResponse.
     * 
     * @param shortCode_Get_DS_DSResult
     */
    public void setShortCode_Get_DS_DSResult(com.mymobileapi.www.api5.ShortCode_Get_DS_DSResponseShortCode_Get_DS_DSResult shortCode_Get_DS_DSResult) {
        this.shortCode_Get_DS_DSResult = shortCode_Get_DS_DSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShortCode_Get_DS_DSResponse)) return false;
        ShortCode_Get_DS_DSResponse other = (ShortCode_Get_DS_DSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shortCode_Get_DS_DSResult==null && other.getShortCode_Get_DS_DSResult()==null) || 
             (this.shortCode_Get_DS_DSResult!=null &&
              this.shortCode_Get_DS_DSResult.equals(other.getShortCode_Get_DS_DSResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getShortCode_Get_DS_DSResult() != null) {
            _hashCode += getShortCode_Get_DS_DSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShortCode_Get_DS_DSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", ">ShortCode_Get_DS_DSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortCode_Get_DS_DSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", "ShortCode_Get_DS_DSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", ">>ShortCode_Get_DS_DSResponse>ShortCode_Get_DS_DSResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
