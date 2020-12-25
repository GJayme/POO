package exercises.list06;

import java.util.*;

public class FuncionarioDAO implements GenericDAO<String, Funcionario>{

    private static Map<String, Funcionario> funcionarios = new LinkedHashMap<>();

    @Override
    public boolean insert(Funcionario type) {
        if (type == null) {
            return false;
        }
        if (funcionarios.containsKey(type.getCpf())) {
            return false;
        }
        funcionarios.put(type.getCpf(), type);
        return true;
    }

    @Override
    public Funcionario findOne(String key) {
        if (key == null) {
            return null;
        }
        return funcionarios.get(key);
    }

    @Override
    public List<Funcionario> findAll() {
        List<Funcionario> result = new ArrayList<>(funcionarios.values());
        return result;
    }

    @Override
    public boolean update(Funcionario type) {
        if (type == null) {
            return false;
        }
        if (!funcionarios.containsKey(type.getCpf())) {
            return false;
        }
        Funcionario result = funcionarios.replace(type.getCpf(), type);
        return result != null;
    }

    @Override
    public boolean remove(String key) {
        if (key == null) {
            return false;
        }
        Funcionario result = funcionarios.remove(key);
        return result != null;
    }
}
