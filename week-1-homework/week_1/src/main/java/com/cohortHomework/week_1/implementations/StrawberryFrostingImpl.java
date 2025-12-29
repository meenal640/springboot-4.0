package com.cohortHomework.week_1.implementations;

import com.cohortHomework.week_1.Flavour;
import com.cohortHomework.week_1.intefaces.Frosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
//cake.frosting
@ConditionalOnProperty(name = "cake.frosting", havingValue = "strawberry")
@Component
public class StrawberryFrostingImpl implements Frosting {

    @Override
    public Flavour getFrostingType() {

        return Flavour.STRAWBERRY;
    }
}
