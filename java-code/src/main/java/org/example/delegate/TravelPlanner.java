package org.example.delegate;

/**
 * Created by jyh1004 on 2023-04-10
 */

public interface TravelPlanner {
    void 여행계획하기();

    void setDelegator(TravelPlanDelegator delegator);
}
