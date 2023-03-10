package de.ossi.welinkit;

import java.time.LocalDateTime;
import java.util.List;

public class _7_Nesting {

    record Kind(String name, String vorname, LocalDateTime geburtsdatum) {}

    record Person(String name, String vorname, LocalDateTime geburtsdatum, boolean hatZahlung, List<Kind> kinder) {}

    public boolean isPersonRelevant(Person person) {
        if (person.hatZahlung) {
            if (person.vorname.startsWith("A") && person.name.startsWith("A")) {
                for (Kind kind : person.kinder()) {
                    if (kind.vorname.startsWith("A")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
