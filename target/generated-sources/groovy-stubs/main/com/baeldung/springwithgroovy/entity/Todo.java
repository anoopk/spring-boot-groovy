package com.baeldung.springwithgroovy.entity;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.net.*;
import groovy.lang.*;
import groovy.util.*;

@javax.persistence.Entity() @javax.persistence.Table(name="todo") public class Todo
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
@groovy.transform.Generated() @groovy.transform.Internal() @java.beans.Transient() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Integer getId() { return (java.lang.Integer)null;}
public  void setId(java.lang.Integer value) { }
public  java.lang.String getTask() { return (java.lang.String)null;}
public  void setTask(java.lang.String value) { }
public  java.lang.Boolean getIsCompleted() { return (java.lang.Boolean)null;}
public  java.lang.Boolean isIsCompleted() { return (java.lang.Boolean)null;}
public  void setIsCompleted(java.lang.Boolean value) { }
}
