                                                         PROJECT    SYNOPSIS

OBJECTIVE: The objective of the project is to create a 3 teir website using ( collection framework, mvc, servlet,html,mysql and Dao architecture).

ABOUT WEBSITE - website name is HomeGuest_1.com which are created for users who want to give their home on rent . so this website will suggest them the perfect trusted peoples based on their choice . they can filter peoples on the basis of caste,city and amount budget.
(As in india people give their first preference to the people of their caste!).

1 (HTML) - Their are 5 html pages first one is index.html which is the begining of website where introduction of website is given through this page there are 4 html pages connected.This page consist of 2 images also. html forms and hyperlink are used on this page.
Second html page is insert.html where the person who want to give home on rent they will enter their information.
Third html page is caste.html where users can enter the caste of customer they want.
Fourth html page is city.html where users can enter the city of customer they want.
Fifth html page is amount.html where users can enter the amount budget they want.

2 DAO (Data access object) architecture - The data is completely secured by private variables and with the the use of setter getter the data access is only possible in object form which is the most secured form. Nobody can change or manipulate the variables . DAO architecture consist of 3 classes model class which consist of all setter - getter methods , Dao class which contains all the functions and another class is of sql connectivity.

3 MYSQL - Mysql database is used in this project which is connected with Dao architecture using Mycon.java class present in connection package. Here static object of Connection class helps to directly get the connection with the help of class name. my sql jdbc connectivity is used here and my sql jar file is added.Different mysql commands are used in this project. PreparedStatement interface and resultSet is used here for the processing of mysql query.

4 MVC (Model View Controller) - MVC architecture is used in this project where model is record class which consists of all the set and get methods. View in this architecture is web browser which is supported by server TOMCAT APACHE. Controller here consists of all the servlets which are connected with web browser and database.

5. SERVLETS - Servlets are placed in controller package . They can be run with the help of web server TOMCAT APACHE. This project consists of 3 Servlets. insertservlet which takes the input and save the data to the data base.caste servlet which takes the prefered caste of user as a input and fetch the output from database and prints on web. city servlet which takes the prefered city of user as a input and fetch the output from database and prints on web. amount servlet which takes the prefered amount budget of user as a input and fetch the output from database and prints on web. 

6. Collection-Framework - Here comes the logic part array-list is used here because there are multiple objects of the prefered choice so array list is used here for the collection of objects.
