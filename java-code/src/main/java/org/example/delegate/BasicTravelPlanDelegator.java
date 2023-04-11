package org.example.delegate;

/**
 * Created by jyh1004 on 2023-04-10
 */

public class BasicTravelPlanDelegator implements TravelPlanDelegator {

    private TravelPlanner travelPlanner;

    public BasicTravelPlanDelegator(TravelPlanner travelPlanner) {
        this.travelPlanner = travelPlanner;
    }

    @Override
    public void 여행계획하기() {
        System.out.println("== 여행 계획 시작! -> " + travelPlanner.getName() + " ==");
        비행기예약();
        숙소예약();
        차량렌탈();
        System.out.println("== 여행 계획 완료 ==");
    }

    private void 비행기예약() {
        System.out.println("비행기예약 완료!");
    }

    private void 숙소예약() {
        System.out.println("숙소예약 완료!");
    }

    private void 차량렌탈() {
        System.out.println("차량렌탈 완료!");
    }
}
