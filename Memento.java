class Memento {
    private final String savedText;

    public Memento(String textToSave) {
        this.savedText = textToSave;
    }

    public String getSavedText() {
        return savedText;
    }
}