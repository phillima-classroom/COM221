package br.unifei.imc.fabrica;

import br.unifei.imc.asteroides.Asteroide;
import br.unifei.imc.asteroides.TipoAsteroide;

public abstract class FabricaAsteroide {


    protected double dificuldade;

    public final Asteroide devolveAsteroide(TipoAsteroide tipoAsteroide){

        Asteroide ast = null;

        ast = criaAsteroide(tipoAsteroide);
        ast.inicializa();
        return ast;

    }

    abstract Asteroide criaAsteroide(TipoAsteroide tipoAsteroide);

}