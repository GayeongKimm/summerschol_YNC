package org.zerock.ex2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.zerock.ex2.controller.dto.SampleDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController //ResponseBody + Controller
@RequestMapping("/sample") //main rout(sample/)
@Slf4j
//http://localhost:8080/sample/
public class SampleController{
    //GET(조회), POST(추가), PUT(수정), DELETE(삭제)

    @GetMapping("/ex01")
    public String ex01() {
        return "ex01";
    }

    @GetMapping("/ex02")
    public String ex02(){
        return "ex02";
    }

    //localhost:8080/sample/ex03?name=kim&age=20
        @GetMapping("/ex03")
        public void ex03(
                @RequestParam(
                        value = "name",
                        required = false,
                        defaultValue = "Kim") String name,
        @RequestParam("age") int age
    ) {
            log.info("name : {}, age : {}", name, age);
        }

        // /sample/memo/1/
    @GetMapping("/memo/{mno}/{bno}")
    public void ex04(
            @PathVariable("mno") long mno,
            @PathVariable("mno") long bno
    ){
        log.info("ex04.......mno: {}", mno);
//        log.info("ex04..... mno" +mno);
    }

    @GetMapping()
    public void ex04(){
    }

    @GetMapping("/memo/{id}/exist")
    public void ex04(@PathVariable("id")String id){
            log.info("member id : {}", id);
    }

    //localhost:8080/ex03?
    @PostMapping("/ex05")
    public void ex05(
            @RequestBody SampleDTO dto){
        log.info(".......ex05 : {}", dto);
    }

    @GetMapping("/list")
    public List<SampleDTO> ex06(){
        List<SampleDTO> list = new ArrayList<>();
        IntStream.rangeClosed(1, 20).forEach(i -> {
            SampleDTO dto = SampleDTO.builder()
                    .name("Test" + i)
                    .age(20 + i)
                    .build();
            list.add(dto);
        });
        IntStream.rangeClosed(1, 20)
                .mapToObj(i -> SampleDTO.builder()
                            .name("Test" + i)
                            .age(20 + i)
                            .build()).collect((Collectors.toList()));
        return list;
    }
//    @PutMapping
//    @DeleteMapping




}
