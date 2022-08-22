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

 public String outputDetail(@RequestParam("customerid") int cid,@RequestParam("customername") String cname,@RequestParam("customerphone") double cphone,@RequestParam("customeraddress") String cadd,@RequestParam("customerloginid") String clid,@RequestParam("customerpassword") int cpass,Model m)

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