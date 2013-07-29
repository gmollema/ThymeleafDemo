#ThymeleafDemo

This is a movie catalog web application demo based on the ThymeLeaf framework and Spring 3 MVC.

###Examples
Five examples are included, which can be retrieved by checking out the branch names
(for example: git checkout -d example1).

<dl>
  <dt>example1</dt>
  <dd>Static html pages containing static data. The movie home and list pages are included.</dd>
</dl>  
<dl>
  <dt>example2</dt>
  <dd>The movie home and list pages will show the same static data offline, but when application is run it will show dynamic data instead.</dd>
</dl>  
<dl>
  <dt>example3</dt>
  <dd>An example of template fragmentation. The page footer is put into a separate fragment and is included in the movie home and list page.</dd>
</dl>  
<dl>
  <dt>example4</dt>
  <dd>A movie new/update page has been added to demonstrate the creation of a form add its validation.</dd>
</dl>  
<dl>
  <dt>example5</dt>
  <dd>Added a view resolver for jsp pages and a movie counter jsp page demonstrating that the regular servlet engine and Thymeleaf engine can run side by side.</dd>
</dl>  

###Run the code
* Build the code: mvn clean install
* Start Tomcat and deploy the war from target folder to the webapp dir of Tomcat.
* Open the web app on url: http://localhost:8080/ThymeleafDemo-1.0
