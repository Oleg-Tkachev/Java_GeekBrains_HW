package src;
import java.util.HashMap;
import java.util.Iterator;

/**
      Чтоб написать immutable неизменяемый класс, нужно следовать простым пунктам:
          Сделать класс финальным
          Сделать все поля приватными и создать только геттеры к ним.
          Сделать все mutable поля final, чтобы установить значение можно было только один раз
          Инициализировать все поля через конструктор
          Выполнить глубокое копирование

*/
public final class Immutable {

    private final int age;

    private final String name;

    private final HashMap<String, String> addresses;

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }


     //Клонируем объект перед тем, как вернуть его.


    public HashMap<String, String> getAddresses() {
        return (HashMap<String, String>) addresses.clone();
    }


     // В конструкторе выполняем глубокое копирование для mutable объектов.

    public Immutable(int age, String name, HashMap<String, String> addresses) {
        System.out.println("Выполняем глубокое копирование в конструкторе");
        this.age = age;
        this.name = name;
        HashMap<String, String> temporaryMap = new HashMap<>();
        String key;
        Iterator<String> iterator = addresses.keySet().iterator();
        while (iterator.hasNext()) {
            key = iterator.next();
            temporaryMap.put(key, addresses.get(key));
        }
        this.addresses = temporaryMap;
    }
}
