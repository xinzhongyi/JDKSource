package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/WrongPolicy.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u77/6540/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Sunday, March 20, 2016 10:02:51 PM PDT
*/

public final class WrongPolicy extends org.omg.CORBA.UserException
{

  public WrongPolicy ()
  {
    super(WrongPolicyHelper.id());
  } // ctor


  public WrongPolicy (String $reason)
  {
    super(WrongPolicyHelper.id() + "  " + $reason);
  } // ctor

} // class WrongPolicy
