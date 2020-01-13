package com.udemy.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.closeTo;

public class AssertTest {

    @Test
    public void test_array_is_same(){

        // assert
        assertThat(new String[]{"a","b","C"}, equalTo(new String[]{"a", "b"}));
    }

    @Test
    public void test_list_is_same(){

        // assert
        assertThat(Arrays.asList(new String[]{"a"}), not(equalTo(Arrays.asList(new String[]{"a"}))));
    }

    @Test
    public void test_is_not_null_value(){
        assertThat(null, is(notNullValue()));
        assertThat("my big fat acct", equalTo("my big fat acct"));
    }

    @Test
    public void test_is_close_to(){
        assertThat(2.32*3, closeTo(6.96, 0.0005));
    }


}
