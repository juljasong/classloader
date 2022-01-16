package me.whiteship.p2;

import org.junit.Assert;
import org.junit.Test;

public class MoimTest{

    @Test
    public void isFull() throws Exception {
        //given
        Moim moim = new Moim();
        //when
        moim.maxNumberOfAttendees = 100;
        moim.numberOfEnrollment = 10;
        //then
        Assert.assertFalse(moim.isEnrollmentFull());
    }

}