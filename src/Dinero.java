public class Dinero {

    private Moneda moneda;
    private int monto;

    public Dinero(Moneda moneda, int monto) {
        this.moneda = moneda;
        this.monto = monto;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }


}
