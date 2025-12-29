package com.cohortHomework.week_1;

import com.cohortHomework.week_1.intefaces.Frosting;
import com.cohortHomework.week_1.intefaces.Syrup;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CakeBaker {


    private final Syrup syrup;
    private final Frosting frosting;



    public void bake() {
        System.out.println("syrup=" + syrup.getSyrupType() +
                ", frosting=" + frosting.getFrostingType() );

    }
}
