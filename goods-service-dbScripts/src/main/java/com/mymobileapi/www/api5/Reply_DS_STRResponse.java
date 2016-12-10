/**
 * Reply_DS_STRResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mymobileapi.www.api5;

public class Reply_DS_STRResponse  implements java.io.Serializable {
    private java.lang.String reply_DS_STRResult;

    public Reply_DS_STRResponse() {
    }

    public Reply_DS_STRResponse(
           java.lang.String reply_DS_STRResult) {
           this.reply_DS_STRResult = reply_DS_STRResult;
    }


    /**
     * Gets the reply_DS_STRResult value for this Reply_DS_STRResponse.
     * 
     * @return reply_DS_STRResult
     */
    public java.lang.String getReply_DS_STRResult() {
        return reply_DS_STRResult;
    }


    /**
     * Sets the reply_DS_STRResult value for this Reply_DS_STRResponse.
     * 
     * @param reply_DS_STRResult
     */
    public void setReply_DS_STRResult(java.lang.String reply_DS_STRResult) {
        this.reply_DS_STRResult = reply_DS_STRResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reply_DS_STRResponse)) return false;
        Reply_DS_STRResponse other = (Reply_DS_STRResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reply_DS_STRResult==null && other.getReply_DS_STRResult()==null) || 
             (this.reply_DS_STRResult!=null &&
              this.reply_DS_STRResult.equals(other.getReply_DS_STRResult())));
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
        if (getReply_DS_STRResult() != null) {
            _hashCode += getReply_DS_STRResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reply_DS_STRResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", ">Reply_DS_STRResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reply_DS_STRResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", "Reply_DS_STRResult"));
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
