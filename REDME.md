## КАК
`./gradlew build`

`java -jar ./build/libs/spring-boot-gradle-kotlin-demo.jar`

**Важно!** Работает на Java 8, не работает на 10. Видимо, проблемы с модульной системой: начинают не находиться классы.

## ЧТО

* [http://localhost:8080/](http://localhost:8080/) - Привет, мир!
* [http://localhost:8080/rest](http://localhost:8080/rest) - qwerty Aa
* [http://localhost:8080/rest?name=yandex](http://localhost:8080/rest?name=yandex) - qwerty yandex
* [http://localhost:8080/rest-kotlin](http://localhost:8080/rest-kotlin) - zxcvb qqq
* [http://localhost:8080/rest-kotlin?name=tyndex](http://localhost:8080/rest-kotlin?name=tyndex) - zxcvb tyndex
* [http://localhost:8080/cats](http://localhost:8080/cats) - список котов (исходно пустой, h2 же)
* [http://localhost:8080/add-cat?name=mars](http://localhost:8080/add-cat?name=mars) - добавляет в БД кота с именем Mars, не дает ответа
* [http://localhost:8080/add-cat](http://localhost:8080/add-cat) - НЕЛЬЗЯ! имя - обязательный параметр
* [http://localhost:8080/add-cat?name=хренов](http://localhost:8080/add-cat?name=хренов) - добавляет в БД кота с именем Хренов, не дает ответа
* [http://localhost:8080/cats](http://localhost:8080/cats) - [{"id":1,"name":"Mars"},{"id":2,"name":"Хренов"}]
