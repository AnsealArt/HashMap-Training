public class Person {
    String imie, nazwisko;

    Person (String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public java.lang.String toString() { return imie + " " + nazwisko; }
}
