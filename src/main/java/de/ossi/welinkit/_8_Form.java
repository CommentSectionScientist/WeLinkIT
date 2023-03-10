package de.ossi.welinkit;

public class _8_Form {

    record Person(String name, String vorname) {
    }

    public boolean hatPerson_Name(Person person) {  // CamelCase vs snake_case
        return !org.apache.commons.lang3.StringUtils.isEmpty(person.name());  // -> StringUtils.isNotEmpty
    }
}
