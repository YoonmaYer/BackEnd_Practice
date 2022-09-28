package com.project5.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Getter // 선언된 모든 필드의 get메소드를 생성
@RequiredArgsConstructor // 선언된 모든 final필드가 포함된 생성자를 생성
public class HelloResponseDto {

    private  final String name;
    private  final int amount;
}
