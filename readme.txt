Cucumber + pg factory model


#How to run code:
1.
mvn test -Dcucumber.options="--tags @home"
mvn test -Dcucumber.options="--tags @srp"
mvn test -Dcucumber.options="--tags @critical"
mvn test -Dcucumber.options="--tags @test"
mvn test -Dcucumber.options="--tags @testassert"

2. using feature file (right click)


#Reports:
will get generated inside :  /target/reports/

#Issue:
1. wait.until() throwing exception when running through command line
https://github.com/SeleniumHQ/selenium/issues/3606 
https://stackoverflow.com/questions/43179497/webdriverwait-until-no-longer-available-in-selenium-java-3-2-and-selenium-java-3


#References:
https://cucumber.io/blog/2015/07/08/polymorphic-step-definitions


#todo:
run framework on jenkin with cucumber reports



