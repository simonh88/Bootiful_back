package com;

import com.bootiful.services.AdderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


@SpringBootTest(classes = AdderService.class)
public class AdderServiceSteps {
    @Autowired
    private AdderService adderService;
    private int givenNumber;
    private int base;
    private int sum;


    public int getGivenNumber(){
        return this.givenNumber;
    }
    public void givenBaseAndAdder(int base, int adder) {
        this.base = base;
        adderService.baseNum(base);
        this.givenNumber = adder;
    }

    public void whenAdd(int givenNumber) {
        sum = adderService.add(givenNumber);
    }

    public void summedUp() {
        assertEquals(base + givenNumber, sum);
    }


    public void sumWrong() {
        assertNotEquals(base + givenNumber, sum);
    }



    public void whenAccumulate() {
        sum = adderService.accumulate(givenNumber);
    }
}