package behavioral.State;

public class Word implements State {
    Sentence sentence;

    public Word(Sentence sentence) {
        this.sentence = sentence;
    }

    @Override
    public String getName() {
        return "\'Word\'";
    }

    @Override
    public String next() {
        return "space";
    }

    @Override
    public String toString() {
        return "word";
    }
}
