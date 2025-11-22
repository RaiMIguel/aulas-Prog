import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class UsuarioRepositorio {
private List<Shinobi> shinobis = new ArrayList<>();

public void toAdd(Shinobi shinobi){
    shinobis.add(shinobi);
}
public List<Shinobi> listUsers() {
    return List.copyOf(shinobis);
}
public Shinobi toSearchUserId (Long idSearch){
    for (int i = 0; i < shinobis.size(); i++) {
        if (shinobis.get(i).getId().equals(idSearch)) {
            return (shinobis.get(i));
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

    for (int i = 0; i < shinobis.size(); i++) {
        if (shinobis.get(i).getId().equals(shinobi.getId())) {
        shinobis.get(i).setName(shinobi.getName());
        shinobis.get(i).setEmail(shinobi.getEmail());
        shinobis.get(i).setPassword(shinobi.getPassword());
        shinobis.get(i).setabilities(shinobi.getabilities());

        return true;
        }
    }
    return false;
}
}

