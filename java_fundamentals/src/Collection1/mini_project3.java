package Collection1;

import java.util.*;

class Card {
    private String symbol;
    private int number;

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }
}

public class mini_project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> uniqueSymbols = new HashSet<>();
        List<Card> cardList = new ArrayList<>();

        while (uniqueSymbols.size() < 4) {
            System.out.println("Enter a card : ");
            String symbol = scanner.nextLine();
            int number = Integer.parseInt(scanner.nextLine());

           
            if (!uniqueSymbols.contains(symbol)) {
                uniqueSymbols.add(symbol);
                cardList.add(new Card(symbol, number));
            }
        }

        
        cardList.sort(Comparator.comparing(Card::getSymbol));

        System.out.println("Four symbols gathered in " + (uniqueSymbols.size() + (cardList.size() - uniqueSymbols.size())) + " cards.");
        System.out.println("Cards in Set are :");

        for (Card card : cardList) {
            System.out.println(card.getSymbol() + " " + card.getNumber());
        }

        scanner.close();
    }
}
