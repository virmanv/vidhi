/**
 * Reply_STR_STRResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mymobileapi.www.api5;

public class Reply_STR_STRResponse  implements java.io.Serializable {
    private java.lang.String reply_STR_STRResult;

    public Reply_STR_STRResponse() {
    }

    public Reply_STR_STRResponse(
           java.lang.String reply_STR_STRResult) {
           this.reply_STR_STRResult = reply_STR_STRResult;
    }


    /**
     * Gets the reply_STR_STRResult value for this Reply_STR_STRResponse.
     * 
     * @return reply_STR_STRResult
     */
    public java.lang.String getReply_STR_STRResult() {
        return reply_STR_STRResult;
    }


    /**
     * Sets the reply_STR_STRResult value for this Reply_STR_STRResponse.
     * 
     * @param reply_STR_STRResult
     */
    public void setReply_STR_STRResult(java.lang.String reply_STR_STRResult) {
        this.reply_STR_STRResult = reply_STR_STRResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reply_STR_STRResponse)) return false;
        Reply_STR_STRResponse other = (Reply_STR_STRResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reply_STR_STRResult==null && other.getReply_STR_STRResult()==null) || 
             (this.reply_STR_STRResult!=null &&
              this.reply_STR_STRResult.equals(other.getReply_STR_STRResult())));
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
        if (getReply_STR_STRResult() != null) {
            _hashCode += getReply_STR_STRResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reply_STR_STRResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", ">Reply_STR_STRResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reply_STR_STRResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", "Reply_STR_STRResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
