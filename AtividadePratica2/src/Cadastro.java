import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Escolinha> listaCidadãos = new ArrayList<>();

    public static void cadastrar(Escolinha funcionario) {
        listaCidadãos.add(funcionario);
    }

    public static List<Escolinha> getListaCidadãos() {
        return listaCidadãos;
    }

    public static void clear() {
        listaCidadãos.clear();
    }

    public static Escolinha buscar(int matricula) {

        
        for (Escolinha temp : listaCidadãos) {

            
            if (temp.getMatricula() == matricula) {

                
                return temp;
            }

        }
        
        return null; 

    }

}
