public class Cajero implements IBanco {

    private Banco banco = null;
    private int fondos;

    public Cajero(int fondos){
        this.fondos = fondos;
    }

    @Override
    public void depositar(Dinero dinero) {
        if(banco == null) banco = new Banco(fondos);

        switch (dinero.getMoneda()){
            case Boliviano:
                banco.depositar(dinero);
                break;
            case Dolar:
                depositoFallido("Dolar", 6.96);
                break;
            case Yen:
                depositoFallido("Yen", 0.06313);
                break;
            case Euro:
                depositoFallido("Euro", 7.62087);
                break;
                default:
                    break;
        }
    }

    @Override
    public void retiro(Dinero dinero) {
        if(banco == null) banco = new Banco(fondos);

        switch (dinero.getMoneda()){
            case Boliviano:
                banco.retiro(dinero);
                break;
            case Dolar:
                retiroFallido("Dolar", 6.96);
                break;
            case Yen:
                retiroFallido("Yen", 0.06313);
                break;
            case Euro:
                retiroFallido("Euro", 7.62087);
                break;
            default:
                break;
        }
    }

    private void depositoFallido(String moneda, double conversion){
        System.out.println("No se puede realizar el deposito con la moneda: " + moneda +", solo en Bolivianos. Tipo de cambio: " + conversion);
    }

    private void retiroFallido(String moneda, double conversion){
        System.out.println("No se puede realizar el retiro con la moneda: " + moneda +", solo en Bolivianos. Tipo de cambio: " + conversion);
    }
}
