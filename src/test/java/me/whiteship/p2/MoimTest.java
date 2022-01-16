package me.whiteship.p2;

import org.junit.Assert;
import org.junit.Test;

public class MoimTest {

    // 코드 커버리지 : 테스트 코드가 실 코드를 얼마나 커버하는가 (얼만큼 테스트 했는가)
    @Test
    public void isNotFull() throws Exception {
        //given
        Moim moim = new Moim();
        //when
        moim.maxNumberOfAttendees = 100;
        moim.numberOfEnrollment = 10;
        //then
        Assert.assertFalse(moim.isEnrollmentFull());
    }
    //mvn clean verify -> target/site/index.html에 결과 반영

    @Test
    public void isFull() throws Exception {
        //given
        Moim moim = new Moim();
        //when
        moim.maxNumberOfAttendees = 100;
        moim.numberOfEnrollment = 100;
        //then
        Assert.assertTrue(moim.isEnrollmentFull());
    }

}
