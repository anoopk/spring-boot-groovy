package com.baeldung.springwithgroovy.repository;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.net.*;
import groovy.lang.*;
import groovy.util.*;

@org.springframework.stereotype.Repository() public interface TodoRepository
  extends
    org.springframework.data.jpa.repository.JpaRepository<com.baeldung.springwithgroovy.entity.Todo, java.lang.Integer> {
;
}
