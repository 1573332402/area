package com.djw.demo.area.controller;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;@RestController@RequestMapping(value = "/test")public class TestController {    @GetMapping(value = "/test01")    public String test01() {        return "HELLO BOY";    }}