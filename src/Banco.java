public class Banco implements IBanco {

    private int fondos;

    public Banco(int fondos){
        this.fondos = fondos;
    }

    @Override
    public void depositar(Dinero dinero) {
        fondos += dinero.getMonto();
        System.out.println("Se deposito " + dinero.getMonto() + " bolivianos");
    }

    @Override
    public void retiro(Dinero dinero) {
        if(fondos >= dinero.getMonto()){
            System.out.println("Se retiro " + dinero.getMonto() + " bolivianos");
        }else{
            System.out.println("No hay fondos necesarios para realiar el retiro");
        }

    }
}
