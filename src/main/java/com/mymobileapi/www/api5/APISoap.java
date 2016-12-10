/**
 * APISoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mymobileapi.www.api5;

public interface APISoap extends java.rmi.Remote {
    public java.lang.String credits_STR(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.Credits_DSResponseCredits_DSResult credits_DS(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.Send_STR_DSResponseSend_STR_DSResult send_STR_DS(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String send_STR_STR(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String send_DS_STR(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.Send_DS_STRData data) throws java.rmi.RemoteException;
    public byte[] send_ZIP_ZIP(java.lang.String username, java.lang.String password, byte[] data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.Send_DS_DSResponseSend_DS_DSResult send_DS_DS(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.Send_DS_DSData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.Sent_STR_DSResponseSent_STR_DSResult sent_STR_DS(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String sent_STR_STR(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String sent_DS_STR(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.Sent_DS_STRData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.Sent_DS_DSResponseSent_DS_DSResult sent_DS_DS(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.Sent_DS_DSData data) throws java.rmi.RemoteException;
    public byte[] sent_STR_ZIP(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public byte[] sent_DS_ZIP(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.Sent_DS_ZIPData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.Reply_STR_DSResponseReply_STR_DSResult reply_STR_DS(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String reply_STR_STR(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String reply_DS_STR(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.Reply_DS_STRData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.Reply_DS_DSResponseReply_DS_DSResult reply_DS_DS(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.Reply_DS_DSData data) throws java.rmi.RemoteException;
    public byte[] reply_STR_ZIP(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public byte[] reply_DS_ZIP(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.Reply_DS_ZIPData data) throws java.rmi.RemoteException;
    public byte[] doc_DS_ZIP(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.Doc_DS_ZIPData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.ShortCode_STR_DSResponseShortCode_STR_DSResult shortCode_STR_DS(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String shortCode_STR_STR(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String shortCode_DS_STR(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.ShortCode_DS_STRData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.ShortCode_DS_DSResponseShortCode_DS_DSResult shortCode_DS_DS(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.ShortCode_DS_DSData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.ShortCode_Update_STR_DSResponseShortCode_Update_STR_DSResult shortCode_Update_STR_DS(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String shortCode_Update_STR_STR(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String shortCode_Update_DS_STR(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.ShortCode_Update_DS_STRData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.ShortCode_Update_DS_DSResponseShortCode_Update_DS_DSResult shortCode_Update_DS_DS(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.ShortCode_Update_DS_DSData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.ShortCode_Get_STR_DSResponseShortCode_Get_STR_DSResult shortCode_Get_STR_DS(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String shortCode_Get_STR_STR(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String shortCode_Get_DS_STR(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.ShortCode_Get_DS_STRData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.ShortCode_Get_DS_DSResponseShortCode_Get_DS_DSResult shortCode_Get_DS_DS(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.ShortCode_Get_DS_DSData data) throws java.rmi.RemoteException;
    public byte[] shortCode_Get_STR_ZIP(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public byte[] shortCode_Get_DS_ZIP(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.ShortCode_Get_DS_ZIPData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.ShortCode_Count_DS_DSResponseShortCode_Count_DS_DSResult shortCode_Count_DS_DS(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.ShortCode_Count_DS_DSData data) throws java.rmi.RemoteException;
    public java.lang.String shortCode_Count_DS_STR(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.ShortCode_Count_DS_STRData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.ShortCode_Count_STR_DSResponseShortCode_Count_STR_DSResult shortCode_Count_STR_DS(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String shortCode_Count_STR_STR(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.Groups_List_STR_DSResponseGroups_List_STR_DSResult groups_List_STR_DS(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String groups_List_STR_STR(java.lang.String username, java.lang.String password, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String groups_List_DS_STR(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.Groups_List_DS_STRData data) throws java.rmi.RemoteException;
    public com.mymobileapi.www.api5.Groups_List_DS_DSResponseGroups_List_DS_DSResult groups_List_DS_DS(java.lang.String username, java.lang.String password, com.mymobileapi.www.api5.Groups_List_DS_DSData data) throws java.rmi.RemoteException;
}
