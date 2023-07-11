package cl.samf.individual_mvp_7;

public class Presentador {
    private Modelo modelo;

    private IviewPresentador iviewPresentador;

    public Presentador(IviewPresentador iviewPresentador) {
        this.iviewPresentador = iviewPresentador;

        modelo = new Modelo();
    }


    public void evaluarContrasena(String password){
        int nivelFuerza = modelo.validarclave(password);

        if (nivelFuerza==Modelo.DEBIL){
            this.iviewPresentador.mostrarDebil();

        }else if (nivelFuerza==Modelo.MEDIA){
            this.iviewPresentador.mostrarMedio();

        }else if(nivelFuerza == Modelo.FUERTE){
            this.iviewPresentador.mostrarFuerte();

        }else{
            this.iviewPresentador.mostrarError();
        }
    }

}
