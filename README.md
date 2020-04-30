                                                         PROJECT    SYNOPSIS

OBJECTIVE: The objective of the project is to create a 3 teir website using ( collection framework, mvc, servlet,html,mysql and Dao architecture).

ABOUT WEBSITE - website name is HomeGuest_1.com which are created for users who want to give their home on rent . so this website will suggest them the perfect trusted peoples based on their choice . they can filter peoples on the basis of caste,city and amount budget.
(As in india people give their first preference to the people of their caste!).
![2 - Copy](https://user-images.githubusercontent.com/64528624/80615113-ead9fb80-8a5c-11ea-8abd-0edeba119577.png)

1 (HTML) - Their are 5 html pages first one is index.html which is the begining of website where introduction of website is given through this page there are 4 html pages connected.This page consist of 2 images also. html forms and hyperlink are used on this page.
![3](https://user-images.githubusercontent.com/64528624/80615717-a7cc5800-8a5d-11ea-9c36-6821f2cf156c.png)

Second html page is insert.html where the person who want to give home on rent they will enter their information.
![4](https://user-images.githubusercontent.com/64528624/80615858-d9452380-8a5d-11ea-8fa7-82fc119f4295.png)

Third html page is caste.html where users can enter the caste of customer they want.
![5](https://user-images.githubusercontent.com/64528624/80615953-f843b580-8a5d-11ea-982b-0668ceb37bf5.png)

Fourth html page is city.html where users can enter the city of customer they want.
![6](https://user-images.githubusercontent.com/64528624/80616025-0bef1c00-8a5e-11ea-92a9-4802bf75e408.png)

Fifth html page is amount.html where users can enter the amount budget they want.
![7](https://user-images.githubusercontent.com/64528624/80616137-25906380-8a5e-11ea-9c68-45cd593e12ea.png)

2 DAO (Data access object) architecture - The data is completely secured by private variables and with the the use of setter getter the data access is only possible in object form which is the most secured form. Nobody can change or manipulate the variables . DAO architecture consist of 3 classes model class which consist of all setter - getter methods , Dao class which contains all the functions and another class is of sql connectivity.
![1](https://user-images.githubusercontent.com/64528624/80616234-48bb1300-8a5e-11ea-87a2-7853cd90bf50.png)


3 MYSQL - Mysql database is used in this project which is connected with Dao architecture using Mycon.java class present in connection package. Here static object of Connection class helps to directly get the connection with the help of class name. my sql jdbc connectivity is used here and my sql jar file is added.Different mysql commands are used in this project. PreparedStatement interface and resultSet is used here for the processing of mysql query.
![Untitled](https://user-images.githubusercontent.com/64528624/80616649-caab3c00-8a5e-11ea-901f-d9a5b6526e11.png)

4 MVC (Model View Controller) - MVC architecture is used in this project where model is record class which consists of all the set and get methods. View in this architecture is web browser which is supported by server TOMCAT APACHE. Controller here consists of all the servlets which are connected with web browser and database.

5. SERVLETS - Servlets are placed in controller package . They can be run with the help of web server TOMCAT APACHE. This project consists of 3 Servlets. insertservlet which takes the input and save the data to the data base.caste servlet which takes the prefered caste of user as a input and fetch the output from database and prints on web. city servlet which takes the prefered city of user as a input and fetch the output from database and prints on web. amount servlet which takes the prefered amount budget of user as a input and fetch the output from database and prints on web. 
![8](https://user-images.githubusercontent.com/64528624/80616376-77d18480-8a5e-11ea-8445-13468693c709.png)
![9](https://user-images.githubusercontent.com/64528624/80616432-87e96400-8a5e-11ea-9636-eba793710940.png)
![10](https://user-images.githubusercontent.com/64528624/80616461-9172cc00-8a5e-11ea-9917-67a002454a9b.png)

6. Collection-Framework - Here comes the logic part array-list is used here because there are multiple objects of the prefered choice so array list is used here for the collection of objects.
![11](https://user-images.githubusercontent.com/64528624/80616526-a51e3280-8a5e-11ea-965f-079c7c9f0bcc.png)
![Activity](https://user-images.githubusercontent.com/64528624/80731755-f3980380-8b28-11ea-9b0c-dcad9d7db850.png)
![class](https://user-images.githubusercontent.com/64528624/80731818-07436a00-8b29-11ea-8e37-c86f8cb388ed.png)
![dataflow](https://user-images.githubusercontent.com/64528624/80731835-090d2d80-8b29-11ea-9c0a-6f906ca47b36.png)
