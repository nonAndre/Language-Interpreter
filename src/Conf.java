import value.ExpValue;

import java.util.HashMap;
import java.util.Map;

public class Conf {

    //Variabili create all'interno di funzioni
    public final Map<String, ExpValue<?>> insideFunctions = new HashMap<>();

    public void updateInsF (String varName, ExpValue<?> expValue) {
        insideFunctions.put(varName, expValue);
    }

    public ExpValue<?> getInsF (String varName) {
        return insideFunctions.get(varName);
    }

    public boolean containsInsF (String varName) {
        return insideFunctions.containsKey(varName);
    }


    //Variabili create non all'esterno di funzioni
    private final Map<String, ExpValue<?>> map = new HashMap<>();

    public boolean contains(String id) {
        return map.containsKey(id);
    }

    public ExpValue<?> get(String id) {
        return map.get(id);
    }

    public void update(String id, ExpValue<?> v) {
        map.put(id, v);
    }


    //Mappa che registra il nome della funzione e il suo contenuto (ctx)

    public final Map<String,langParser.FuncContext> functions = new HashMap<>();

    public boolean functionExists(String id) {return functions.containsKey(id);}

    public void registerFunction(String id, langParser.FuncContext ctx) {functions.put(id, ctx);}


}
