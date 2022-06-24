package auros.test.dao;

import auros.test.model.KPacSet;
import java.util.List;

public interface KPacSetDao {
    KPacSet save(KPacSet kpacSet);

    List<KPacSet> getAll();

    void delete(Long id);

    KPacSet getById(Long id);
}
