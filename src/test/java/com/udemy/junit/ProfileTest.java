package com.udemy.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProfileTest {

    private Profile profile;
    private BooleanQuestion question;
    private Criteria criteria;

    @BeforeAll
    public void create(){
        profile = new Profile("Bull Hockey, Inc.");
        question =  new BooleanQuestion(1, "Got bonuses?");
        criteria = new Criteria();
    }

    @Test
    public void match_answer_false_when_must_match_criteria_not_met(){

        // answer
        profile.add(new Answer(question, Bool.FALSE));

        // criteria
        criteria.add(new Criterion(new Answer(question, Bool.TRUE), Weight.MustMatch));

        // result
        boolean matches = profile.matches(criteria);

        // assert
        assertFalse(matches);
    }

    @Test
    public void match_answer_true_for_ant_dont_care_criteria(){

        // answer
        profile.add(new Answer(question, Bool.FALSE));

        // criteria
        criteria.add(new Criterion(new Answer(question, Bool.TRUE), Weight.DontCare));

        // result
        boolean matches = profile.matches(criteria);

        // assert
        assertTrue(matches);
    }
}
