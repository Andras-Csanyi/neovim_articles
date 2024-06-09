package com.example.demo.controller;

import com.example.demo.model.WhateverResult;
import com.example.demo.model.WhateverSuccess;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WhateverController {

    @QueryMapping("getWhatever")
    public WhateverResult success() {
        return WhateverSuccess.builder().setId("1").setName("name").build();
    }

}
