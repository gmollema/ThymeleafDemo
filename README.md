ThymeleafDemo
=============

This is a movie catalog demo based on the ThymeLeaf framework and Spring 3 MVC.

Five examples are included which can be retrieved by checking out the following branch names (for example: git checkout -d example1)

example1: Static html pages containing static data. The home page and the move list page are included.

example2: The home and list page will show the same static data offline, but when application is run it will show dynamic data instead.

example3: An example of fragmentation. The page footer is put into a separate fragment and included in the home and list page.

example4: A new/update page has been added to demonstrate the creation of a form add its validation once it is submitted.

example5: Added a view resolver for jsp pages demonstrating that the regular servlet engine and Thymeleaf engine can run side by side.


Build the code - mvn clean install
Deploy the war to Tomcat and open app on url: http://localhost:8080/ThymeleafDemo-1.0
