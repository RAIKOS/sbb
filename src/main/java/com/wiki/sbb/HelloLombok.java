package com.wiki.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class HelloLombok {

	private final int lombok;
    private final String hello;

    public static void main(String[] args) {
    	HelloLombok helloLombok = new HelloLombok(5, "aaaaaaaaaa");
    	
        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}