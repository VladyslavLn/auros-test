package auros.test.dao;

import auros.test.model.KPac;
import java.util.List;

public interface KPacDao {
    KPac save(KPac kpac);

    List<KPac> getAll();

    void delete(Long id);
}
