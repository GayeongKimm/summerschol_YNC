package org.zerock.ex2.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@SpringBootTest
class SampleTests {
    @Autowired
    private Restaurant restaurant;

    @Test
    public void test(){
//        restaurant = new Restaurant(); //생성자 (생성자가 없을시엔 null)
//        restaurant.test(); //생성자에 접근
        System.out.println("=========================");
        System.out.println(restaurant);
    }

    @Test
    public void test2(){
        Member member1 = new Member();
        Member member = new Member("홍길동", 20);
        System.out.println(member);

    }

}
