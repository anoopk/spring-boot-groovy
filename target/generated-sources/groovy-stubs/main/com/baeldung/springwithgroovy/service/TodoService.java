package com.baeldung.springwithgroovy.service;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.net.*;
import groovy.lang.*;
import groovy.util.*;

public interface TodoService
 {
;
 java.util.List<com.baeldung.springwithgroovy.entity.Todo> findAll();
 com.baeldung.springwithgroovy.entity.Todo findById(java.lang.Integer todoId);
 com.baeldung.springwithgroovy.entity.Todo saveTodo(com.baeldung.springwithgroovy.entity.Todo todo);
 com.baeldung.springwithgroovy.entity.Todo updateTodo(com.baeldung.springwithgroovy.entity.Todo todo);
 com.baeldung.springwithgroovy.entity.Todo deleteTodo(java.lang.Integer todoId);
}
