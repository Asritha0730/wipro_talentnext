package Collection1;

import java.util.*;

class Cards {
    private String symbol;
    private int number;

    public Cards(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}

public class mini_project4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, List<Cards>> cardMap = new TreeMap<>(); 

        System.out.println("Enter Number of Cards:");
        int n = Integer.parseInt(s.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");
            String symbol = s.nextLine().trim().toLowerCase();
            int number = Integer.parseInt(s.nextLine().trim());

            Cards card = new Cards(symbol, number);

            
            cardMap.computeIfAbsent(symbol, k -> new ArrayList<>()).add(card);
        }

        System.out.println("Distinct Symbols are :");
        for (String symbol : cardMap.keySet()) {
            System.out.print(symbol + " ");
        }
        System.out.println();

        for (String symbol : cardMap.keySet()) {
            List<Cards> cards = cardMap.get(symbol);
            int sum = 0;

            System.out.println("Cards in " + symbol + " Symbol");
            for (Cards c : cards) {
                System.out.println(c);
                sum += c.getNumber();
            }
            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
        }
    }
}
