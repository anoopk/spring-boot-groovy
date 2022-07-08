package com.baeldung.springwithgroovy.service.impl;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.net.*;
import groovy.lang.*;
import groovy.util.*;

@org.springframework.stereotype.Service() public class TodoServiceImpl
  extends java.lang.Object  implements
    com.baeldung.springwithgroovy.service.TodoService,    groovy.lang.GroovyObject {
;
@groovy.transform.Generated() @groovy.transform.Internal() @java.beans.Transient() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  com.baeldung.springwithgroovy.repository.TodoRepository getTodoRepository() { return (com.baeldung.springwithgroovy.repository.TodoRepository)null;}
public  void setTodoRepository(com.baeldung.springwithgroovy.repository.TodoRepository value) { }
@java.lang.Override() public  java.util.List<com.baeldung.springwithgroovy.entity.Todo> findAll() { return (java.util.List<com.baeldung.springwithgroovy.entity.Todo>)null;}
@java.lang.Override() public  com.baeldung.springwithgroovy.entity.Todo findById(java.lang.Integer todoId) { return (com.baeldung.springwithgroovy.entity.Todo)null;}
@java.lang.Override() public  com.baeldung.springwithgroovy.entity.Todo saveTodo(com.baeldung.springwithgroovy.entity.Todo todo) { return (com.baeldung.springwithgroovy.entity.Todo)null;}
@java.lang.Override() public  com.baeldung.springwithgroovy.entity.Todo updateTodo(com.baeldung.springwithgroovy.entity.Todo todo) { return (com.baeldung.springwithgroovy.entity.Todo)null;}
@java.lang.Override() public  com.baeldung.springwithgroovy.entity.Todo deleteTodo(java.lang.Integer todoId) { return (com.baeldung.springwithgroovy.entity.Todo)null;}
}
