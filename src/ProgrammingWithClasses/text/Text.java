package ProgrammingWithClasses.text;

public class Text {

    Word heading;
    Sentence text;

    public Text(Word word, Sentence sentence) {
        this.heading = word;
        this.text = sentence;
    }

    public void addText(Sentence sentence) {
        this.text.setSentenceString(this.text.getSentenceString() + (" " + sentence.getSentenceString()));
    }

    public void showText() {
        System.out.println(text.getSentenceString());
    }

    public void showHeading() {
        System.out.println("Заголовок текста - " + heading.getWord());
    }
}
