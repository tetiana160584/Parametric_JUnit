package testData;

public enum Language {
    UKRAINIAN("ua"),
    RUSSIAN("ru"),
    ENGLISH("en");

    private String lang;

    Language(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
