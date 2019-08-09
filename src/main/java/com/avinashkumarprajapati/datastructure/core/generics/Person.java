package com.avinashkumarprajapati.datastructure.core.generics;

public interface Person {
    <T> T personalInfo(T t);
}


/*
or another method of doing this
public interface Person<T> {
    T personalInfo(T t);
}*/
