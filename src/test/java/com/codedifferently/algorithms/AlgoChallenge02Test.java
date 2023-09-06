package com.codedifferently.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoChallenge02Test {

    @Test
    public void testOne(){
        AlgoChallenge02 algoChallenge02 = new AlgoChallenge02();

        String expected = "Wmxqn";
        String actual = algoChallenge02.encrypt("Kaleb", 12);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        AlgoChallenge02 algoChallenge02 = new AlgoChallenge02();

        String expected = "Yfwnv";
        String actual = algoChallenge02.encrypt("Tariq", 5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        AlgoChallenge02 algoChallenge02 = new AlgoChallenge02();

        String expected = "KhoorZruog";
        String actual = algoChallenge02.encrypt("HelloWorld", 3);

        Assertions.assertEquals(expected,actual);
    }



}
