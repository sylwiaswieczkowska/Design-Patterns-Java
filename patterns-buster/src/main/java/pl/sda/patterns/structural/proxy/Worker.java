package pl.sda.patterns.structural.proxy;

import lombok.Getter;


abstract class Worker implements ReadyToMakeCoffee {

    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
