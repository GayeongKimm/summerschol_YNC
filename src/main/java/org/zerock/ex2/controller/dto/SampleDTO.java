package org.zerock.ex2.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class SampleDTO {
    private String name;
    private int age;

}
