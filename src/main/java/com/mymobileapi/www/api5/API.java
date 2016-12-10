/**
 * API.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mymobileapi.www.api5;

public interface API extends javax.xml.rpc.Service {
    public java.lang.String getAPISoapAddress();

    public com.mymobileapi.www.api5.APISoap getAPISoap() throws javax.xml.rpc.ServiceException;

    public com.mymobileapi.www.api5.APISoap getAPISoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
