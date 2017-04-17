package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

  public String getFile(@RequestParam String fileId) {

    return "vamshi";
  }

}
