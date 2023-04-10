package org.example.delegate;

/**
 * Created by jyh1004 on 2023-04-10
 */

public class Person2 implements TravelPlanner {
    private String name;
    private TravelPlanDelegator delegator;

    public Person2(String name) {
        this.name = name;
    }

    @Override
    public void setDelegator(TravelPlanDelegator delegator) {
        this.delegator = delegator;
    }

    @Override
    public void 여행계획하기() {
        System.out.println("[Person2] 여행 계획 시작~!");
        delegator.비행기예약();
        delegator.숙소예약();
        delegator.차량렌탈();
    }
}
