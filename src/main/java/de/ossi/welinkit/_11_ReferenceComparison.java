package de.ossi.welinkit;

public class _11_ReferenceComparison {

    public static final Integer REGELBEDARF = 12;
    public static final Integer KINDERGELD = 4711;


    public static void main(String[] args) {

        Leistungsart regelbedarf = new Leistungsart(12);
        Leistungsart kindergeld = new Leistungsart(4711);

        System.out.printf("regelbedarf: %s%n",regelbedarf.leistungsartNr == REGELBEDARF);
        System.out.printf("kindergeld: %s%n",kindergeld.leistungsartNr == KINDERGELD);
    }

    record Leistungsart(Integer leistungsartNr){}
}
