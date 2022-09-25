package br.unifei.imc.observer;

public interface Observavel {


    void registrar(Observador obs);
    void cancelarRegistro(Observador obs);
    void notificaAssinantes();

}
