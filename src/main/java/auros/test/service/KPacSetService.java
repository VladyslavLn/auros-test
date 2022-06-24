package auros.test.service;

import auros.test.model.KPacSet;
import java.util.List;

public interface KPacSetService {
    KPacSet save(KPacSet kpacSet);

    List<KPacSet> getAll();

    void delete(Long id);

    KPacSet getById(Long id);
}
