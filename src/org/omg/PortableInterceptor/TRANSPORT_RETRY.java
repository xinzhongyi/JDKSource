package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/TRANSPORT_RETRY.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u77/6540/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Sunday, March 20, 2016 10:02:51 PM PDT
*/

public interface TRANSPORT_RETRY
{

  /**
   * Indicates a Transport Retry reply status. One possible value for 
   * <code>RequestInfo.reply_status</code>.
   * @see RequestInfo#reply_status
   * @see SUCCESSFUL
   * @see SYSTEM_EXCEPTION
   * @see USER_EXCEPTION
   * @see LOCATION_FORWARD
   */
  public static final short value = (short)(4);
}
