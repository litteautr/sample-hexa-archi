package fr.rli.freecodecamp.command;

public class AskForPoem {
    private String language;

    public AskForPoem(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}