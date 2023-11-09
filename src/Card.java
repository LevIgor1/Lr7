import java.util.Date;

public class Card {
    double money;
    static int countCard = 0;
    CardType Type;
    char[] number;
    Date dateEnd;
    char[] CVV;
    char[] PIN;

    public Card() {
        money = 0;
        countCard++;
        Type = CardType.Visa;
        dateEnd = new Date();
        number = new char[17];
        FillChar(number);
        CVV = new char[4];
        FillChar(CVV);
        PIN = new char[5];
        FillChar(PIN);
    }

    private void FillChar(char[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i] = '0';
        }
    }

    public Card(CardType CT, char[] number, Date dateEnd, char[] CVV, char[] PIN, double money) {
        this.money = money;
        countCard++;
        Type = CT;
        this.number = number;
        this.dateEnd = dateEnd;
        this.CVV = CVV;
        this.PIN = PIN;

    }
    public void setMoney(double money){
        this.money = money;
    }
    public void setType(CardType CT) {
        Type = CT;
    }

    public void setNumber(char[] number) {
        if (this.number.length == number.length)
            this.number = number;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setCVV(char[] CVV) {
        if (this.CVV.length == CVV.length)
            this.CVV = CVV;
    }

    public void setPIN(char[] PIN) {
        if (this.PIN.length == PIN.length)
            this.PIN = PIN;
    }
    public double getMoney(){ return money; }
    public CardType getType() {
        return Type;
    }

    public char[] setNumber() {
        return number;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public char[] getCVV() {
        return CVV;
    }

    public char[] getPIN() {
        return PIN;
    }

    public static int getCountCard() {
        return countCard;
    }

    public String toString() {
        String numberCard = "Номер картки: ";
        for (int i = 0; i < 16; i++) {
            if ((i + 1) % 4 == 0) {
                numberCard += " ";
            } else
                numberCard += number[i];
        }
        String date_end = "Придатна до: " + dateEnd.getMonth() + "/" + dateEnd.getYear();
        String TypeCard = "Тип картки: ";
        switch (Type) {
            case Visa -> TypeCard += "Visa";
            case MasterCart -> TypeCard += "MasterCart";
        }
        return numberCard + "\n" + date_end + "\n" + TypeCard;
    }
}
