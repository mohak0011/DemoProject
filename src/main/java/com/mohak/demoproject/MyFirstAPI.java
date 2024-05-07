package com.mohak.demoproject;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstAPI {

    public  MyFirstAPI()
    {
        
    }

    @RequestMapping("/hello")
    public  String sayHello()
    {
        return "Hello Scaler Class!";
    }

    @RequestMapping("/hello/{name}")
    public  String sayHelloName(@PathVariable("name")String name)
    {
        return "Hello " + name;
    }



    @RequestMapping("/hello/{name}/{times}")
    public  String sayHelloNameTimes(@PathVariable("name")String name,@PathVariable("times")int times)
    {
        String str="";
        for(int i=0;i<times;i++)
        {
            str+= "Hello " + name +" " + (i+1);
            str+= "<br>";
        }
        return  str;
    }
}
