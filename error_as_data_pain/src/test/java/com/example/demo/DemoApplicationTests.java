package com.example.demo;

import com.example.demo.model.WhateverResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.AutoConfigureGraphQl;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.graphql.test.tester.HttpGraphQlTester;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

    @Autowired
    private HttpGraphQlTester tester;

    @Test
    void contextLoads() {
        var result = tester.documentName("getWhatever")
        .execute()
        .path("data.getWhatever")
        .entity(WhateverResult.class)
        .get();
    }

}
