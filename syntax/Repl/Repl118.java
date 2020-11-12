package Repl;

public class Repl118 {

    void  censorLetter(String word, char letter) {
        word = word.replace(letter, '*');

        System.out.println(word);
    }

    public static void main(String[] args) {
        Repl118 task= new Repl118();
        task.censorLetter("computer science",'e');
        task.censorLetter("trick or treat",'t');
    }
    }
