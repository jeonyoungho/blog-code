package org.example.delegate;

/**
 * Created by jyh1004 on 2023-04-10
 */

public class Person {

    private String name;
    private TravelPlanDelegator delegator;

    public Person(String name) {
        this.name = name;
    }

    public void 여행계획하기() {
        비행기예약();
        숙소예약();
        차량렌탈();
    }

    private void 비행기예약() {
        // ...
    }

    private void 숙소예약() {
        // ...
    }

    private void 차량렌탈() {
        // ...
    }
}
