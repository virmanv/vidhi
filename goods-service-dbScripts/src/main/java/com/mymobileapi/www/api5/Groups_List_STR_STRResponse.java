/**
 * Groups_List_STR_STRResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mymobileapi.www.api5;

public class Groups_List_STR_STRResponse  implements java.io.Serializable {
    private java.lang.String groups_List_STR_STRResult;

    public Groups_List_STR_STRResponse() {
    }

    public Groups_List_STR_STRResponse(
           java.lang.String groups_List_STR_STRResult) {
           this.groups_List_STR_STRResult = groups_List_STR_STRResult;
    }


    /**
     * Gets the groups_List_STR_STRResult value for this Groups_List_STR_STRResponse.
     * 
     * @return groups_List_STR_STRResult
     */
    public java.lang.String getGroups_List_STR_STRResult() {
        return groups_List_STR_STRResult;
    }


    /**
     * Sets the groups_List_STR_STRResult value for this Groups_List_STR_STRResponse.
     * 
     * @param groups_List_STR_STRResult
     */
    public void setGroups_List_STR_STRResult(java.lang.String groups_List_STR_STRResult) {
        this.groups_List_STR_STRResult = groups_List_STR_STRResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Groups_List_STR_STRResponse)) return false;
        Groups_List_STR_STRResponse other = (Groups_List_STR_STRResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groups_List_STR_STRResult==null && other.getGroups_List_STR_STRResult()==null) || 
             (this.groups_List_STR_STRResult!=null &&
              this.groups_List_STR_STRResult.equals(other.getGroups_List_STR_STRResult())));
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
        if (getGroups_List_STR_STRResult() != null) {
            _hashCode += getGroups_List_STR_STRResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Groups_List_STR_STRResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", ">Groups_List_STR_STRResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groups_List_STR_STRResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mymobileapi.com/api5", "Groups_List_STR_STRResult"));
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
