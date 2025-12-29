package com.cohortHomework.week_1.implementations;

import com.cohortHomework.week_1.Flavour;
import com.cohortHomework.week_1.intefaces.Syrup;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(name = "cake.syrup", havingValue = "strawberry")
@Component
public class StrawberrySyrupImpl implements Syrup {

    @Override
    public Flavour getSyrupType() {
        return Flavour.STRAWBERRY;
    }
}
