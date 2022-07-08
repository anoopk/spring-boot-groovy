package com.baeldung.springwithgroovy.controller;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.net.*;
import groovy.lang.*;
import groovy.util.*;

@org.springframework.web.bind.annotation.RestController() @org.springframework.web.bind.annotation.RequestMapping(value="todo") public class TodoController
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
@groovy.transform.Generated() @groovy.transform.Internal() @java.beans.Transient() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  com.baeldung.springwithgroovy.service.TodoService getTodoService() { return (com.baeldung.springwithgroovy.service.TodoService)null;}
public  void setTodoService(com.baeldung.springwithgroovy.service.TodoService value) { }
@org.springframework.web.bind.annotation.GetMapping() public  java.util.List<com.baeldung.springwithgroovy.entity.Todo> getAllTodoList() { return (java.util.List<com.baeldung.springwithgroovy.entity.Todo>)null;}
@org.springframework.web.bind.annotation.PostMapping() public  com.baeldung.springwithgroovy.entity.Todo saveTodo(@org.springframework.web.bind.annotation.RequestBody() com.baeldung.springwithgroovy.entity.Todo todo) { return (com.baeldung.springwithgroovy.entity.Todo)null;}
@org.springframework.web.bind.annotation.PutMapping() public  com.baeldung.springwithgroovy.entity.Todo updateTodo(@org.springframework.web.bind.annotation.RequestBody() com.baeldung.springwithgroovy.entity.Todo todo) { return (com.baeldung.springwithgroovy.entity.Todo)null;}
@org.springframework.web.bind.annotation.DeleteMapping(value="/{todoId}") public  java.lang.Object deleteTodo(@org.springframework.web.bind.annotation.PathVariable() java.lang.Integer todoId) { return (java.lang.Object)null;}
@org.springframework.web.bind.annotation.GetMapping(value="/{todoId}") public  com.baeldung.springwithgroovy.entity.Todo getTodoById(@org.springframework.web.bind.annotation.PathVariable() java.lang.Integer todoId) { return (com.baeldung.springwithgroovy.entity.Todo)null;}
}
