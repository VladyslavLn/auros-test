package auros.test.dao.impl;

import auros.test.dao.KPacKPacSetDao;
import auros.test.model.KPac;
import auros.test.model.KPacSet;
import java.util.List;
import java.util.stream.Collectors;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KPacKPacSetDaoImpl implements KPacKPacSetDao {
    private final DataSource dataSource;
    private final JdbcTemplate jdbcTemplate;

    public KPacKPacSetDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(KPacSet kpacSet) {
        String query = "INSERT INTO k_pac_k_pac_sets (k_pac_id, k_pac_set_id) VALUES (?, ?);";
        List<Long> kpacIdList = kpacSet.getKpacList().stream()
                .map(KPac::getId)
                .collect(Collectors.toList());
        Long kpacSetId = kpacSet.getId();
        for (Long kpacId: kpacIdList) {
            jdbcTemplate.update(query, kpacId, kpacSetId);
        }
    }

    @Override
    public List<KPac> getAllById(Long id) {
        return jdbcTemplate.query("SELECT kp.id AS id, kp.title AS title, "
                        + "kp.description AS description, kp.creationDate AS creationDate "
                        + "FROM k_pac_k_pac_sets kpkps JOIN k_pacs kp on kp.id = kpkps.k_pac_id "
                        + "WHERE k_pac_set_id = ?;",
                new Object[] {id}, new BeanPropertyRowMapper<>(KPac.class));
    }
}
