public class DeckOfCards {
//Program to shuffle and distribute deck of cards
    public void shuffle(String[][] card){               //Method for shuffling cards
        String temp;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                int row = (int)Math.floor(Math.random() * 3);
                int column = (int)Math.floor(Math.random() * 8);
                temp=card[i][j];
                card[i][j] = card[row][column];
                card[row][column] = temp;
            }
        }
        for (int i = 0; i < 4; i++) {                    //displaying shuffled cards
            System.out.print("Player"+ (i+1) + ": ");
            for (int j = 0; j < 13; j++) {
                System.out.print(card[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        String[][] cards={
            {"2C","3C","4C","5C","6C","7C","8C","9C","10C","jack(C)","queen(C)","king(C)","ace(C)"},
            {"2D","3D","4D","5D","6D","7D","8D","9D","10D","jack(D)","queen(D)","king(D)","ace(D)"},
            {"2H","3H","4H","5H","6H","7H","8H","9H","10H","jack(H)","queen(H)","king(H)","ace(H)"},
            {"2S","3S","4S","5S","6S","7S","8S","9S","10S","jack(S)","queen(S)","king(S)","ace(S)"}
        };
        System.out.println("\n");
        deckOfCards.shuffle(cards);
    }
}