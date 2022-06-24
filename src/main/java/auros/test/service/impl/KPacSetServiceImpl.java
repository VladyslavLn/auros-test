package auros.test.service.impl;

import auros.test.dao.KPacKPacSetDao;
import auros.test.dao.KPacSetDao;
import auros.test.model.KPacSet;
import auros.test.service.KPacSetService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KPacSetServiceImpl implements KPacSetService {
    private final KPacSetDao kpacSetDao;
    private final KPacKPacSetDao kpacKpacSetDao;

    @Override
    public KPacSet save(KPacSet kpacSet) {
        kpacSet = kpacSetDao.save(kpacSet);
        if (kpacSet.getKpacList() != null) {
            kpacKpacSetDao.save(kpacSet);
        }
        return kpacSet;
    }

    @Override
    public List<KPacSet> getAll() {
        return kpacSetDao.getAll();
    }

    @Override
    public void delete(Long id) {
        kpacSetDao.delete(id);
    }

    @Override
    public KPacSet getById(Long id) {
        KPacSet kpacSet = kpacSetDao.getById(id);
        kpacSet.setKpacList(kpacKpacSetDao.getAllById(id));
        return kpacSet;
    }
}
