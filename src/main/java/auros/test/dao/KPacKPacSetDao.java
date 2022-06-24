package auros.test.dao;

import auros.test.model.KPac;
import auros.test.model.KPacSet;
import java.util.List;

public interface KPacKPacSetDao {
    void save(KPacSet kpacSet);

    List<KPac> getAllById(Long id);
}
