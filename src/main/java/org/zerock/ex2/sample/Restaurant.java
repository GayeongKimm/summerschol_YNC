package org.zerock.ex2.sample;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
//@AllArgsConstructor //(Restaurant)안에 있는 생성자에게 주입이 이루어짐.
//@NoArgsConstructor //
@RequiredArgsConstructor //필여한거만 쓸거임
public class Restaurant {
    private final Chef chef;
    private Guest guest;

//    @Autowired//필드주입
//    private Chef chef;
//    //new Restaurant();
//
//    @Autowired //생성자 주입
//    public Restaurant(Chef chef){
//        this.chef = chef;
//    }
}

//public class Restaurant {
//    public void test(){
//        System.out.println("test!");
//    }

//
//}
