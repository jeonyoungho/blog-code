package org.example.delegate;

/**
 * Created by jyh1004 on 2023-04-10
 */

public class BasicTravelPlanDelegator implements TravelPlanDelegator {

    public BasicTravelPlanDelegator(TravelPlanner planner) {
        planner.setDelegator(this);
    }

    @Override
    public void 비행기예약() {
        System.out.println("비행기예약 완료!");
    }

    @Override
    public void 숙소예약() {
        System.out.println("숙소예약 완료!");
    }

    @Override
    public void 차량렌탈() {
        System.out.println("차량렌탈 완료!");
    }
}
