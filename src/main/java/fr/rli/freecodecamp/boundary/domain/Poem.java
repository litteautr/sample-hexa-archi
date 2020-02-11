package fr.rli.freecodecamp.boundary.domain;

import java.util.Objects;

public class Poem {
    private String[] verses;

    public Poem(String text) {
        Objects.requireNonNull(text);
        this.verses = text.split("\\r?\\n");
    }

    public String[] getVerses() {
        return verses;
    }

    @Override
    public String toString() {
        final String newline = System.getProperty("line.separator");
        return String.join(newline, verses);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((verses == null) ? 0 : verses.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Poem other = (Poem) obj;
        if (verses == null) {
            if (other.verses != null)
                return false;
        } else if (!verses.equals(other.verses))
            return false;
        return true;
    }
}