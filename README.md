<p align="center"> 
<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/logo.png"/>
</p>

# Table Content
- Introduction
- Chapter 01
   - Introduction
   - Monolothic
   - Microservice
   - conclusion
- Chapter 02: GO-Conv System
   - Introduction
   - Abstraction of Go-conv System
   - services of Go-conv System
   - Architecture of Go-conv System
   - Tools & technologies used in Go-conv System
   - conclusion
- Chapter 03 



># Introduction
<p>    In last years we see a huge growing in the web application architecture, we see the big company invent some architecture like SOA, Microservice.
In fact, all architecture use philosophy behind the wall. Where Each Architecture has advantages and disadvantages. But the Microservice has become the most useful case today, it has great impact in economy part of any system.</p>

<p align="center"> 
<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/Introduction-4.jpg"/>
</p>

- ## Introduction 
<p>
As we have mentioned in the global Introduction there are many architecture used in web application field , in the past all web application was named MONOLOTHIC (client side + server side+data storage ) there is no decoupling of services ,
But with the research works of the architecture we are now in the Microservice
Architecture
</p>

- ## Monolothic
<p>
   a monolithic application describes a single-tiered software application in which the user interface and data access code are combined into a single program from a single platform.
</p>

- ## Microservice
<p>
   Microservices is an architectural style in which large complex software applications are broken down into a collection of independent, loosely coupled services
</p>

<p>
   To clear the vision we provide the following the image to understand the deference between Monolothic and Microservice 
</p>

<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/Slide3.JPG"/>

- ## conclusion

<p>
   We have discussed in this chapter some basic concept of web application architecture in the next chapter we will go further
   inside our cloud solution
</p>

<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/chapter2.jpg"/>

- ## Introduction

<p>
   In this chapter we will represent GO-Conv system and the services that it provides, also the architecture chosen as Microservices and deferent tools and technologies that used to develop it.
</p>

- ## Abstraction of Go-conv System 

<p>
    Our architecture of GO-Conv system represent two parts, the first one represent UI and the second part represent Microservices where any user can interact with our cloud solution to explore our services like convert any type of files (Images , Audios , Text ...).
</p>

- ### UI

<p>
   We provide bith web and mobile application where the user can connect to our cloud services and consume it.   
</p>

- ### Microservices

<p>
   We have many Microservices running inside a cloud provider, The Following image represent our system in general case.
</p>

<p align="center"> 
<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/abstraction.JPG"/>
</p>

- ## services of Go-conv System
<p>
   The image below represent the abstraction layer of the system , what we provide for users 
</p>

<p align="center"> 
<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/Slide2.JPG"/>
</p>

- ## Architecture of Go-conv System

<p>
    Like any web application we can find 2 huge part Fron-end and Back-end 
</p>

<p align="center"> 
<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/Slide4.JPG"/>
</p>

<p>
   The following image represent the Global architecture of our System 
</p>

<p align="center"> 
<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/Slide5.JPG"/>
</p>

- ## Model Data

In our implementation we have chosen Mysql database to store any data in our cloud solution 

we have used Spring framework as solution technology in this project , as we know this framework has multiple module to deal with databases where we can manipulate the data base without any difficult , those modules like spring data render the relational database as object database where the developers have to focus on the business logic of the application
The image below represent how Micoservices interact with databases


<p align="center"> 
<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/Screenshot%20from%202018-11-20%2019-52-34.png"/>
</p>


- ## Usage Scenario Example

The Image below represent study case example 

<p align="center"> 
<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/Screenshot%20from%202018-11-20%2022-18-17.png"/>
</p>


- ## Tools & technologies used in Go-conv System
<p align="center"> 
<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/Screenshot%20from%202018-11-07%2001-07-29.png"/>
</p>

<p align="center"> 
<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/Screenshot%20from%202018-11-07%2001-10-00.png"/>
</p>

<p align="center"> 
<img src="https://github.com/tarfa-info/micro-service-user/blob/master/images/Screenshot%20from%202018-11-07%2001-07-50.png"/>
</p>
