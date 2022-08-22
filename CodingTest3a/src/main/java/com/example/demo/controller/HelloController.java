/*1)Write an application using SpringMVC with SpringBoot.



You need to read data dynamically from Customer (customerid,customername,customerphone,customeraddress,customerloginid,customerpassword)

 and then display on webpage.*/
package com.example.demo.controller;



import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloController {

 @RequestMapping("/data")

 public String outputDetail(@RequestParam("cid") String cid,@RequestParam("cname") String cname,@RequestParam("cphone") String cphone,@RequestParam("cadd") String cadd,@RequestParam("clid") String clid,@RequestParam("cpass") String cpass,Model m)

 {


     m.addAttribute("customerid", cid);
     m.addAttribute("customername", cname);
     m.addAttribute("customerphone", cphone);
     m.addAttribute("customeraddress", cadd);
     m.addAttribute("customerloginid", clid);
     m.addAttribute("customerpassword", cpass);

 return "hello";

 }

 @RequestMapping("/customer")

 public String inputDetail()

 {

 return "xy";

 }

}