package auros.test.service;

import auros.test.model.KPac;
import java.util.List;

public interface KPacService {
    KPac save(KPac kpac);

    List<KPac> getAll();

    void delete(Long id);
}
