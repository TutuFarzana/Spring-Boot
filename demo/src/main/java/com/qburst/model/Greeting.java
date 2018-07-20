package com.qburst.model;

import java.io.Serializable;

public class Greeting implements Serializable {
    private String greeting;

    public Greeting(String greeting) {
        this.greeting = greeting;
    }

    public Greeting() {
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
