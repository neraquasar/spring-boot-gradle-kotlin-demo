./gradlew build

java -jar ./build/libs/spring-boot-gradle-kotlin-demo.jar



http://localhost:8080/ => Привет, мир!

http://localhost:8080/rest => qwerty Aa

http://localhost:8080/rest?name=yandex => qwerty yandex

http://localhost:8080/rest-kotlin => zxcvb qqq

http://localhost:8080/rest-kotlin?name=tyndex => zxcvb tyndex

http://localhost:8080/cats => список котов (пустой)

http://localhost:8080/add-cat?name=mars => добавляет в БД кота с именем Mars, не дает ответа

http://localhost:8080/add-cat?name=хренов => добавляет в БД кота с именем Хренов, не дает ответа

http://localhost:8080/cats => [{"id":1,"name":"Mars"},{"id":2,"name":"Хренов"}]
