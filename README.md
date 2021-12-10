Home task #20
1. new git repo
2. all best practices (.gitignore, readme etc)
3. base on modules home task #18
4. add web module
5. add spring dispatcher servlet
6. add spring context
7. deploy to servlet container per student 
___
## How to use?
    mvn clean install to build project
    To run environment:  docker-compose up -d
    To run liquibase and fill in database: mvn -pl lecture-20-primary-persistance liquibase:update 
    Copy war file into Tomcat  directory (/webapps)
    Run Tomcat bat file bin/startup.bat
___
