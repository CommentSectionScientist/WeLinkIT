package de.ossi.welinkit;

import java.util.List;

public class _1_Wrapper {
    private final List<String> ausBg;
    private final List<String> ausAbEnt;

    private _1_Wrapper(List<String> ausBg, List<String> ausAbEnt){
        this.ausAbEnt=ausAbEnt;
        this.ausBg=ausBg;
    }
    public static WrapperBuilder mitBetraegenAusAbEnt(List<String> ausAbEnt){
        return new WrapperBuilder(ausAbEnt);
    }

    public static final class WrapperBuilder{
        private final List<String> ausAbEnt;
        WrapperBuilder(List<String> ausAbEnt){
            this.ausAbEnt=ausAbEnt;
        }
        public _1_Wrapper mitBetraegenAusBg(List<String> ausBg){
            return new _1_Wrapper(this.ausAbEnt, ausBg);
        }
    }

    public static void main(String[] args) {
        _1_Wrapper wrapper = _1_Wrapper.mitBetraegenAusAbEnt(List.of("AbEnt"))
                                       .mitBetraegenAusBg(List.of("AusBg"));
        System.out.println("mitBetraegenAusAbEnt: " + wrapper.ausAbEnt);
        System.out.println("mitBetraegenAusBg: " + wrapper.ausBg);
    }
}