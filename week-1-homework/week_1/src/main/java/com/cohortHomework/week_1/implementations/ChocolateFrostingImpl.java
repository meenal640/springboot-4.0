package com.cohortHomework.week_1.implementations;

import com.cohortHomework.week_1.Flavour;
import com.cohortHomework.week_1.intefaces.Frosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.frosting", havingValue = "chocolate")
public class ChocolateFrostingImpl implements Frosting {


    @Override
    public Flavour getFrostingType() {
        return Flavour.CHOCOLATE;
    }
}
