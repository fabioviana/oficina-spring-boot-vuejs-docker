FROM adoptopenjdk/openjdk12

COPY target/*.jar ./backend.jar

CMD java -Dspring.data.mongodb.host=mongo -jar backend.jar