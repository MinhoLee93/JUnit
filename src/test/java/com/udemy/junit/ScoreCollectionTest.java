package com.udemy.junit;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ScoreCollectionTest {

    @Test
    public void answersArithmeticMeanOfTwoNumbers(){
        // 준비
        ScoreCollection collection = new ScoreCollection();
        collection.add(()->5);
        collection.add(()->7);

        // 실행
        int actualResult = collection.arithmeticMean();

        // 단언
        assertEquals(actualResult, 7);
    }

}
