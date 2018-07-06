package com.maritree.zuul;

import com.maritree.zuul.common.response.Result;
import org.junit.Test;

public class ResultTest {
    @Test
    public void resultTest() {
        System.out.println(Result.genFailResult("jhas").toString());
    }
}
