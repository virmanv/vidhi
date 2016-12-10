/**
 * Send_ZIP_ZIPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mymobileapi.www.api5;

public class Send_ZIP_ZIPResponse  implements java.io.Serializable {
    private byte[] send_ZIP_ZIPResult;

    public Send_ZIP_ZIPResponse() {
    }

    public Send_ZIP_ZIPResponse(
           byte[] send_ZIP_ZIPResult) {
           this.send_ZIP_ZIPResult = send_ZIP_ZIPResult;
    }


    /**
     * Gets the send_ZIP_ZIPResult value for this Send_ZIP_ZIPResponse.
     * 
     * @return send_ZIP_ZIPResult
     */
    public byte[] getSend_ZIP_ZIPResult() {
        return send_ZIP_ZIPResult;
    }


    /**
     * Sets the send_ZIP_ZIPResult value for this Send_ZIP_ZIPResponse.
     * 
     * @param send_ZIP_ZIPResult
     */
    public void setSend_ZIP_ZIPResult(byte[] send_ZIP_ZIPResult) {
        this.send_ZIP_ZIPResult = send_ZIP_ZIPResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Send_ZIP_ZIPResponse)) return false;
        Send_ZIP_ZIPResponse other = (Send_ZIP_ZIPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.send_ZIP_ZIPResult==null && other.getSend_ZIP_ZIPResult()==null) || 
             (this.send_ZIP_ZIPResult!=null &&
              java.util.Arrays.equals(this.send_ZIP_ZIPResult, other.getSend_ZIP_ZIPResult())));
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
        if (getSend_ZIP_ZIPResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSend_ZIP_ZIPResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSend_ZIP_ZIPResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Send_ZIP_ZIPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", ">Send_ZIP_ZIPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_ZIP_ZIPResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", "Send_ZIP_ZIPResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
