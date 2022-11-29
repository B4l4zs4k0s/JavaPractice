import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> unordered = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        List<Domino> ordered = new ArrayList<>();
        orderDominoes(unordered,ordered);
        System.out.println(ordered);
    }


    private static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;

        //    System.out.println(findSingle(dominoes));
    }

    private static void orderDominoes(List<Domino> unordered, List<Domino> ordered) {
        while (!unordered.isEmpty()) {
            if (ordered.isEmpty()) {
                ordered.add(getLastDomino(unordered));
                unordered.remove(getLastDomino(ordered));
                continue;
            }
            for (Domino domino : unordered) {
                if (domino.getLeftSide() == getLastDomino(ordered).getRightSide()) {
                    ordered.add(domino);
                    unordered.remove(domino);
                    break;
                }
            }
        }
    }

    private static Domino getLastDomino(List<Domino> orderedDominoes) {
        return orderedDominoes.get(orderedDominoes.size() - 1);
    }
}

