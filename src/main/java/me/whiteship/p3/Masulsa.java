package me.whiteship.p3;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

import java.io.File;

public class Masulsa {

    public static void main(String[] args) {

        // 바이트 코드 조작 By Byte Buddy
//        try {
//            new ByteBuddy().redefine(Moja.class)
//                    .method(ElementMatchers.named("pullOut")).intercept(FixedValue.value("Rabbit!"))
//                    .make().saveIn(new File("E:\\Dropbox\\eclipse-workspace\\classloader\\target\\classes\\"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // 따로따로 실행해줘야 함
       System.out.println(new Moja().pullOut());
    }

}
