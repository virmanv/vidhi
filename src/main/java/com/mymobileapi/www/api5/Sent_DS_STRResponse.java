/**
 * Sent_DS_STRResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mymobileapi.www.api5;

public class Sent_DS_STRResponse  implements java.io.Serializable {
    private java.lang.String sent_DS_STRResult;

    public Sent_DS_STRResponse() {
    }

    public Sent_DS_STRResponse(
           java.lang.String sent_DS_STRResult) {
           this.sent_DS_STRResult = sent_DS_STRResult;
    }


    /**
     * Gets the sent_DS_STRResult value for this Sent_DS_STRResponse.
     * 
     * @return sent_DS_STRResult
     */
    public java.lang.String getSent_DS_STRResult() {
        return sent_DS_STRResult;
    }


    /**
     * Sets the sent_DS_STRResult value for this Sent_DS_STRResponse.
     * 
     * @param sent_DS_STRResult
     */
    public void setSent_DS_STRResult(java.lang.String sent_DS_STRResult) {
        this.sent_DS_STRResult = sent_DS_STRResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sent_DS_STRResponse)) return false;
        Sent_DS_STRResponse other = (Sent_DS_STRResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sent_DS_STRResult==null && other.getSent_DS_STRResult()==null) || 
             (this.sent_DS_STRResult!=null &&
              this.sent_DS_STRResult.equals(other.getSent_DS_STRResult())));
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
        if (getSent_DS_STRResult() != null) {
            _hashCode += getSent_DS_STRResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sent_DS_STRResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", ">Sent_DS_STRResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sent_DS_STRResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", "Sent_DS_STRResult"));
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
