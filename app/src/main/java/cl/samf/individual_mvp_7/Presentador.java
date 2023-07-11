package cl.samf.individual_mvp_7;

public class Presentador {
    private Modelo modelo;

    public void evaluarContrasena(String password){
        int nivelFuerza = modelo.validarclave(password);

        if (nivelFuerza==Modelo.DEBIL){

        }else if (nivelFuerza==Modelo.MEDIA){

        }else if(nivelFuerza == Modelo.FUERTE){

        }else{

        }
    }

}
