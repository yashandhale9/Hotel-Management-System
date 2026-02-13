package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TestService;

@RestController
@RequestMapping("/test")
public class testAPI {
    @Autowired
    private final TestService testService;

    public testAPI(TestService testService)
    {
        this.testService=testService;
    }
    @GetMapping("")
    public String Hello()
    {
        return ("Hello World!");
    }
    @GetMapping("/hello")
    public String Print()
    {
        return ("Hello World!");
    }
}
