package ru.imbabot.Lesson3.Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private Map<String, List<Person>> map;

    public Phonebook(){
        map = new HashMap<>();
    }

    public void add(Person person){
        List<Person> current = map.get(person.getLastName());
        if (current == null){
            current = new ArrayList<>();
            map.put(person.getLastName(), current);
        }
        current.add(person);
    }

    public List<Person> get(String lastname){
        List<Person> list = new ArrayList<>();

        for (Map.Entry<String, List<Person>> m : map.entrySet()){
            if (m.getKey().equals(lastname)){
                list = m.getValue();
            }
        }

        return list;
    }
}
