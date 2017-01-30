# Getting started

* This project is implementation of simple web crawler using Jsoup library for the requirements mentioned in [https://github.com/buildit/org-design/blob/master/Recruitment/Exercises/engineering_lead.md]([https://github.com/buildit/org-design/blob/master/Recruitment/Exercises/engineering_lead.md)
* It is developed using TDD approach.

# Assumptions
* There are multiple libraries available in java which can used for web crawling most popular seemed Jsoup and crawler4j.
* Jsoup was chosen due to its simplicty of use and its popularity over crawler4j.Also Jsoup is more active compared to crawler4j.

# Prerequisites
* This project will require below software to execute.
1. Apache Maven 3.3.9(This version is not specifically required).
2. Create folder structure where this project will be checked out for  e.g C:/var/log
3. JDK 1.7 or higher.
4. You need to set MAVEN_HOME and JAVA_HOME variable in your host environment variables where you need to run the program.
5. Also you need to set PATH variable of your host environment variable.

# Project build instructions
* Ensure prerequisites are fulfilled as mentioned above.
* Checkout the project using git repository URL [https://github.com/nitinprabhu/web-crawler.git](https://github.com/nitinprabhu/web-crawler.git)
* Execute command `mvn clean compile assembly:single` from command line by navigating to project root folder where pom.xml file is present.
* This command will download all dependencies from Maven Repository and will create a executable jar file named web-crawler-1.0-jar-with-dependencies.jar(fat jar file with all dependencies).
* Execute `mvn clean install` from command line to ensure all the test cases are passing.
* To execute the application run below command

`java -cp target/web-crawler-1.0-jar-with-dependencies.jar  com.wipro.digital.application.WebCrawlerApplication`

* You might see some log4j info messages as below

`Nitin-Prabhu:web-crawler nitinprabhu$ java -cp target/web-crawler-1.0-jar-with-dependencies.jar  com.wipro.digital.application.WebCrawlerApplication 
log4j:WARN No appenders could be found for logger (com.wipro.digital.crawler.impl.JsoupWebCrawler).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.`

* Output of the application will be text file named crawleroutputurllist.txt containing all the urls for http://wiprodigital.com
* Log file can be found at /var/log/webcrawler.log

# Future enhancements
* User interface can be provided to user to enter url to be crawled.We can use Spring MVC for this purpose.
* Configuration can be added for maximum number of pages to crawl,depth of crawling and number of seconds after which we can another request to crawl the same url.
* Power Mock can be used to mock Jsoup for exception handling scenarios.
