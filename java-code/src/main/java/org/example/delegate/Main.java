package org.example.delegate;

/**
 * Created by jyh1004 on 2023-04-10
 */

public class Main {

    public static void main(String[] args) {
        TravelPlanner person = new Person2("Alice");
        TravelPlanDelegator travelPlanDelegatorForPerson = new BasicTravelPlanDelegator(person);
        person.여행계획하기();

        TravelPlanner travelPlanCompany = new TravelPlanCompany();
        TravelPlanDelegator travelPlanDelegatorForCompany = new BasicTravelPlanDelegator(travelPlanCompany);
        travelPlanCompany.여행계획하기();
    }
}
