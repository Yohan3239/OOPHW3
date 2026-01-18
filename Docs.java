public class Docs {
    private String text;

    public Memento save() {
        return new Memento(text);
    }
    public void restore(Memento memento) {
        this.text = memento.getSavedText();
    }
}