package com.kellydouglass.recyclerviewlinear;

public class Pojo {

    private String codeName;
    private String codeVersion;

    public Pojo(String codeName, String codeVersion) {
        this.codeName = codeName;
        this.codeVersion = codeVersion;
    }

    public String getCodeName() {
        return codeName;
    }

    public String getCodeVersion() {
        return codeVersion;
    }
}
