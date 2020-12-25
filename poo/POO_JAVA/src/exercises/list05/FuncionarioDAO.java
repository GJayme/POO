package exercises.list05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FuncionarioDAO implements GenericDAO<Funcionario, String>{

    private static Map<String, Funcionario> dbFuncionario = new HashMap<>();

    @Override
    public boolean insert(Funcionario object) {
        if(object == null) {
            return false;
        }
        if(dbFuncionario.containsKey(object.getCpf())) {
            return false;
        }

        dbFuncionario.put(object.getCpf(), object);
        return true;
    }

    @Override
    public Funcionario findOne(String key) {
        if(key == null) {
            return null;
        }

        return dbFuncionario.get(key);
    }

    @Override
    public List<Funcionario> findAll() {
        List<Funcionario> allFuncionarios = new ArrayList<>(dbFuncionario.values());

        // Poderia ter feito com FOR tambem.
//        for (Map.Entry<String, Funcionario> entry : dbFuncionario.entrySet()) {
//            allFuncionarios.add(entry.getValue());
//        }
        return allFuncionarios;
    }

    @Override
    public boolean update(Funcionario object) {
        if(object == null) {
            return false;
        }
        if (!dbFuncionario.containsKey(object.getCpf())) {
            return false;
        }

        Funcionario result = dbFuncionario.replace(object.getCpf(), object);
        return result != null;
    }

    @Override
    public boolean remove(String key) {
        if(key == null) {
            return false;
        }
        if (!dbFuncionario.containsKey(key)) {
            return false;
        }

        Funcionario result = dbFuncionario.remove(key);
        return result != null;
    }
}
