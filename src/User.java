import java.util.Date;

public class User {
    String SFP;
    Date Birth;
    Card[] Cards;

    public User() {
        SFP = "";
        Birth = new Date();
        Cards = new Card[1];
        Cards[0] = new Card();
    }

    public User(String name, Date birth, Card[] cards) {
        SFP = name;
        Birth = birth;
        Cards = cards;
    }

    public User(User user) {
        SFP = user.SFP;
        Birth = user.Birth;
        Cards = user.Cards;
    }

    public void setName(String name) {
        SFP = name;
    }

    public void setBirth(Date birth) {
        Birth = birth;
    }

    public void setCards(Card[] cards) {
        Cards = new Card[cards.length];
        Cards = cards;
    }

    public String getName() {
        return SFP;
    }

    public Date getBirth() {
        return Birth;
    }

    public Card[] getCards() {
        return Cards;
    }

    public void append(Card card) {
        Card[] tmp = new Card[Cards.length + 1];
        for (int i = 0; i < Cards.length; i++) {
            tmp[i] = Cards[i];
        }
        tmp[Cards.length] = card;
        Cards = tmp;
    }

    public boolean buyTovar(double Price, char[] PIN) {
        if (PIN.length == 17)
            for (int i = 0; i < Cards.length; i++) {
                if (Price <= Cards[i].money && Cards[i].PIN == PIN) {
                    Cards[i].money -= Price;
                    return true;
                }
            }
        return false;
    }

    public boolean buyInternet(double Price, char[] CVV) {
        if (CVV.length == 4)
            for (int i = 0; i < Cards.length; i++) {
                if (Price <= Cards[i].money && Cards[i].CVV == CVV) {
                    Cards[i].money -= Price;
                    return true;
                }
            }
        return false;
    }

    public String toString() {
        String Client = "Клієнт: " + SFP;
        String date = "Дата народження: " + Birth.getMonth() + "/" + Birth.getDay() + "/" + Birth.getYear();
        String infoCards = "Картки:\n\n";
        for (int i = 0; i < Cards.length; i++) {
            infoCards += Cards[i].toString();
            if (i != Cards.length - 1) {
                infoCards += ",\n";
            }
            infoCards += "\n";
        }
        return Client + "\n" + date + "\n" + infoCards;
    }
}
