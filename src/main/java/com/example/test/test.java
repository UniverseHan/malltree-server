package com.example.test;

public class test {

    private final long id;
    private final String content;
    private final int age;

    public test(long id, String content, Integer age) {
        this.id = id;
        this.content = content;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    public Integer getAge() {
    	return age;
    }

}
