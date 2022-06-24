# :eyes: About project:
### Entities description:
#### K-PAC (Knowledge Package) - an entity that stores the contents of any knowledge. It contains the next fields:

- `ID` - unique numeric field, the occurrence of K-PAC
- `Title` - character string (up to 250 characters)
- `Description` - character string (up to 2000 characters), information about the contents of
  K-PAC.
- `Creation date` - a string in the format DD-MM-YYYY, the date when K-PAC was created.
#### K-PAC Set is an entity that can contain multiple K-PAC entities. It contains the next fields:
- `ID` - unique numeric field, the occurrence of the K-PAC Set.
- `Title` - a character string (up to 250 characters).
### Entities relations:
- Every K-PAC set can contain multiple K-PACs, every K-PAC can be included in several K-PAC sets.

# :abacus: Technologies used:
- Java 8+
- Spring (JDBC, MVC).
- Lombok
- [Maven](https://maven.apache.org/)
- Database - [MySQL](https://www.mysql.com/) 5.7+
- Server - [Apache Tomcat](http://tomcat.apache.org/)
- IDE - IntelliJ IDEA
- JSP,JSTL

# :computer: If you want to run this project on your computer, you need:
1. To have or install MySQL and Apache Tomcat 9.0.50
2. Clone this project:
```bash
git clone https://github.com/VladyslavLn/auros-test.git
```
3. Configure `dbProperties` file from `resources` directory to create connection to db:
```java
      db.url=jdbc:mysql://localhost:3306/YOUR_DB
      db.driver=com.mysql.cj.jdbc.Driver
      db.user=YOUR_USERNAME
      db.password=YOUR_PASSWORD
```
4. Add Tomcat configuration to your project. Use `/` as your Tomcat application context
5. Add [Lombok](https://projectlombok.org/setup/overview) plugin to your IDE
6. Run `schema.sql` - SQL script to create DB schema.
7. Run `data.sql` - SQL script to fill DB with test data.

After all these steps you will be able to run this project locally.