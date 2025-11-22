import java.util.List;
import java.util.ArrayList;

public class UsuarioRepositorio {
private List<Shinobi> shinobis = new ArrayList<>();

public void toAdd(Shinobi shinobi){
    shinobis.add(shinobi);
}
public List<Shinobi> listUsers() {
    return List.copyOf(shinobis);
}
public Shinobi toSearchUserId (Long idSearch){
    for (Shinobi shinobi : shinobis) {
        if (shinobi.getId().equals(idSearch)) {
            return shinobi;
        }
    }
    return null;
}
public boolean toDelete (long idSearch){

    for (int i = 0; i < shinobis.size(); i++) {
        if (shinobis.get(i).getId() == idSearch) {
            shinobis.remove(i);
            return true;
        }
    }
    return false;
}
public boolean toUpdate(Shinobi shinobi){

    for (Shinobi value : shinobis) {
        if (value.getId().equals(shinobi.getId())) {
            value.setName(shinobi.getName());
            value.setEmail(shinobi.getEmail());
            value.setPassword(shinobi.getPassword());
            value.setabilities(shinobi.getabilities());

            return true;
        }
    }
    return false;
}
}

