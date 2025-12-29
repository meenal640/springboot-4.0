package com.cohortHomework.week_1.intefaces;

import com.cohortHomework.week_1.Flavour;
import org.springframework.stereotype.Component;

@Component
public interface Frosting {
    Flavour getFrostingType();
}
