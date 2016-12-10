/**
 * Send_STR_DSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mymobileapi.www.api5;

public class Send_STR_DSResponse  implements java.io.Serializable {
    private com.mymobileapi.www.api5.Send_STR_DSResponseSend_STR_DSResult send_STR_DSResult;

    public Send_STR_DSResponse() {
    }

    public Send_STR_DSResponse(
           com.mymobileapi.www.api5.Send_STR_DSResponseSend_STR_DSResult send_STR_DSResult) {
           this.send_STR_DSResult = send_STR_DSResult;
    }


    /**
     * Gets the send_STR_DSResult value for this Send_STR_DSResponse.
     * 
     * @return send_STR_DSResult
     */
    public com.mymobileapi.www.api5.Send_STR_DSResponseSend_STR_DSResult getSend_STR_DSResult() {
        return send_STR_DSResult;
    }


    /**
     * Sets the send_STR_DSResult value for this Send_STR_DSResponse.
     * 
     * @param send_STR_DSResult
     */
    public void setSend_STR_DSResult(com.mymobileapi.www.api5.Send_STR_DSResponseSend_STR_DSResult send_STR_DSResult) {
        this.send_STR_DSResult = send_STR_DSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Send_STR_DSResponse)) return false;
        Send_STR_DSResponse other = (Send_STR_DSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.send_STR_DSResult==null && other.getSend_STR_DSResult()==null) || 
             (this.send_STR_DSResult!=null &&
              this.send_STR_DSResult.equals(other.getSend_STR_DSResult())));
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
        if (getSend_STR_DSResult() != null) {
            _hashCode += getSend_STR_DSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Send_STR_DSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", ">Send_STR_DSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_STR_DSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", "Send_STR_DSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", ">>Send_STR_DSResponse>Send_STR_DSResult"));
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
