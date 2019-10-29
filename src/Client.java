public class Client {
    public static void main(String[] args){
        Cajero cajero = new Cajero(1000);

        Dinero dol = new Dinero(Moneda.Dolar, 200);
        Dinero bol = new Dinero(Moneda.Boliviano, 100);
        Dinero yen = new Dinero(Moneda.Yen, 150);
        Dinero eur = new Dinero(Moneda.Euro, 50);

        cajero.depositar(dol);
        cajero.depositar(bol);
        cajero.retiro(yen);
        cajero.retiro(eur);
        cajero.retiro(bol);

    }
}
