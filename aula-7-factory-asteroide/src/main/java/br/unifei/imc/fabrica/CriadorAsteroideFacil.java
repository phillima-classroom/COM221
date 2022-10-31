package br.unifei.imc.fabrica;

import br.unifei.imc.asteroides.*;

public class CriadorAsteroideFacil extends FabricaAsteroide{
    @Override
    Asteroide criaAsteroide(TipoAsteroide tipoAsteroide) {
        if(tipoAsteroide == TipoAsteroide.ASTEROIDE_FOGO)
            return new AsteroideFogo(dificuldade);
        else if(tipoAsteroide == TipoAsteroide.ASTEROIDE_ELETRICO)
            return new AsteroideEletrico(dificuldade);
        else if(tipoAsteroide == TipoAsteroide.ASTEROIDE_GELO)
            return new AsteroideGelo(dificuldade);
        else
            return new AsteroidePadrao(dificuldade);
    }
}
