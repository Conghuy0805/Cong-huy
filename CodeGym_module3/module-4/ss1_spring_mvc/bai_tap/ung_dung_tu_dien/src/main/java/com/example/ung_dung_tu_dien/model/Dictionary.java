package com.example.ung_dung_tu_dien.model;


public class Dictionary {
    private String english;
    private String vietnamese;

    public Dictionary() {
    }

    public Dictionary(String english, String vietnamese) {
        this.english = english;
        this.vietnamese = vietnamese;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "english='" + english + '\'' +
                ", vietnamese='" + vietnamese + '\'' +
                '}';
    }
}
