package de.ossi.welinkit;

import jersey.repackaged.com.google.common.collect.Lists;

import java.util.List;

public class _9_Imports {
    record Kind() {
    }

    record Person(List<Kind> kinder) {
    }

    Person createPersonMitKind(Kind kind) {
        return new Person(Lists.of(kind));
    }
}
