import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        List<Todo> todos = new ArrayList<>();

        Domino domino1 = new Domino(1,5);
        Domino domino2 = new Domino(3,5);
        Domino domino3 = new Domino(5,5);
        Domino domino4 = new Domino(1,6);
        dominoes.add(domino1);
        dominoes.add(domino2);
        dominoes.add(domino3);
        dominoes.add(domino4);

        Todo todo1 = new Todo("Clean","Important",false);
        Todo todo2 = new Todo("Eat","Important",true);
        Todo todo3 = new Todo("Play games","Not Important",false);
        todos.add(todo1);
        todos.add(todo2);
        todos.add(todo3);


        for(Domino domino : dominoes){
            domino.printAllFields();
        }

        for(Todo todo : todos){
            todo.printAllFields();
        }
    }
}
