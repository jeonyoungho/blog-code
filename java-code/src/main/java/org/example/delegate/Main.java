package org.example.delegate;

/**
 * Created by jyh1004 on 2023-04-10
 */

public class Main {

    public static void main(String[] args) {
        Person2 person = new Person2("Alice");
        TravelPlanDelegator travelPlanDelegatorForPerson = new BasicTravelPlanDelegator(person);
        travelPlanDelegatorForPerson.여행계획하기();

        TravelPlanner travelPlanCompany = new TravelPlanCompany("CompanyA");
        TravelPlanDelegator travelPlanDelegatorForCompany = new BasicTravelPlanDelegator(travelPlanCompany);
        travelPlanDelegatorForCompany.여행계획하기();
    }
}
