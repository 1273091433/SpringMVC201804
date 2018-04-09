package com.zdk.controler;

import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
    @RequestMapping("/age.do")
    @ResponseBody
    public String baseType(@RequestParam("xage") int age){
        return   "age" +age;
    }

    @RequestMapping("/age2.do")
    @ResponseBody
    public String baseType2(Integer age){
        return   "age2:" +age;
    }

    @RequestMapping("/arr.do")
    @ResponseBody
    public String arrType(String [] names){
        StringBuffer buffer = new StringBuffer();

        for (String name : names) {
            buffer.append(name).append(" ");
        }

        return   buffer.toString();
    }




    @RequestMapping("/object.do")
    @ResponseBody
    public String objectType( User user){

        return   user.toString();
    }

    @RequestMapping(value = "/json.do")
    @ResponseBody
    public String jsonType(@RequestBody User user){

        return   user.toString();
    }
}
