# Getting started

* This project is implementation of simple web crawler for the requirements mentioned in [https://github.com/buildit/org-design/blob/master/Recruitment/Exercises/engineering_lead.md]([https://github.com/buildit/org-design/blob/master/Recruitment/Exercises/engineering_lead.md)
* It is developed using TDD approach.

# Prerequisites
* This project will require below software to execute
1. Apache Maven 3.3.9(This version is not specifically required).
2. JDK 1.7 or higher.
3. You need to set MAVEN_HOME and JAVA_HOME variable in your host environment variables where you need to run the program.
4. Also you need to set PATH variable of your host environment variable.

# Project build instructions
* Ensure prerequisites are fulfilled as mentioned above.
* Checkout the project using git repository URL [https://github.com/nitinprabhu/web-crawler.git](https://github.com/nitinprabhu/web-crawler.git)
* Execute command `mvn clean compile assembly:single` from command line by navigating to project root folder where pom.xml file is present.
* This command will download all dependencies from Maven Repository and will create a executable jar file named web-crawler-1.0-jar-with-dependencies.jar(fat jar file with all dependencies).
* Execute `mvn clean install` from command line to ensure all the test cases are passing.
* To execute the application run below cpmmand
`java -cp target/web-crawler-1.0-jar-with-dependencies.jar  com.wipro.digital.application.WebCrawlerApplication`
* You might see some log4j info messages as below
`Nitin-Prabhu:web-crawler nitinprabhu$ java -cp target/web-crawler-1.0-jar-with-dependencies.jar  com.wipro.digital.application.WebCrawlerApplication 
log4j:WARN No appenders could be found for logger (com.wipro.digital.crawler.impl.JsoupWebCrawler).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.`
* Output of the application will be text file named crawleroutputurllist.txt containing all the urls for http://wiprodigital.com
* Log file can be found at /var/log/webcrawler.log
