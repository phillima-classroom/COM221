package br.unifei.imc.framework.gerador;

import br.unifei.imc.framework.anotacoes.Ignorar;
import br.unifei.imc.framework.anotacoes.Nome;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Gerador {

    public static Map<String,Object> gerarMapa(Object obj){

        Map<String,Object> mapa = new HashMap<>();

        Class<?> clazz = obj.getClass();

        for(Field field : clazz.getDeclaredFields()){
            field.setAccessible(true);
            String nomeMembro = null;
            Object valor = null;
            if(field.isAnnotationPresent(Ignorar.class))
                continue;
            if(field.isAnnotationPresent(Nome.class)){
                Nome nome = field.getAnnotation(Nome.class);
                nomeMembro = nome.value();
            }else
                nomeMembro = field.getName();
            try{
                valor = field.get(obj);
            }catch (Exception e){
                e.printStackTrace();
            }
            mapa.put(nomeMembro,valor);

        }

        return mapa;

    }

}
