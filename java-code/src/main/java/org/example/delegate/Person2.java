package org.example.delegate;

/**
 * Created by jyh1004 on 2023-04-10
 */

public class Person2 implements TravelPlanner {
    private String name;

    public Person2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
