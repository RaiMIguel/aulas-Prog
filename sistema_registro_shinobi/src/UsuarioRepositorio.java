import java.util.List;
import java.util.ArrayList;

public class UsuarioRepositorio {
private List<Shinobi> shinobis = new ArrayList<>();

public void toAdd(Shinobi shinobi){
    shinobis.add(shinobi);
}
public List<Shinobi> listUsers() {
    return List.copyOf(shinobis);}
}
