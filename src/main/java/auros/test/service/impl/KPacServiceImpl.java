package auros.test.service.impl;

import auros.test.dao.KPacDao;
import auros.test.model.KPac;
import auros.test.service.KPacService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KPacServiceImpl implements KPacService {
    private final KPacDao kpacDao;

    @Override
    public List<KPac> getAll() {
        return kpacDao.getAll();
    }

    @Override
    public KPac save(KPac kpac) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        kpac.setCreationDate(formatter.format(LocalDate.now()));
        kpacDao.save(kpac);
        return kpac;
    }

    @Override
    public void delete(Long id) {
        kpacDao.delete(id);
    }
}
