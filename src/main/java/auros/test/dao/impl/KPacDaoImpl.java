package auros.test.dao.impl;

import auros.test.dao.KPacDao;
import auros.test.model.KPac;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Objects;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class KPacDaoImpl implements KPacDao {
    private final DataSource dataSource;
    private final JdbcTemplate jdbcTemplate;

    public KPacDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<KPac> getAll() {
        return jdbcTemplate.query("SELECT * FROM k_pacs", new BeanPropertyRowMapper<>(KPac.class));
    }

    @Override
    public KPac save(KPac kpac) {
        String query = "INSERT INTO k_pacs (title, description, creationDate) VALUES (?, ?, ?);";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection
                    .prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, kpac.getTitle());
            ps.setString(2, kpac.getDescription());
            ps.setString(3, kpac.getCreationDate());
            return ps;
        }, keyHolder);
        kpac.setId(Objects.requireNonNull(keyHolder.getKey()).longValue());
        return kpac;
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM k_pacs WHERE id = ?;", id);
    }
}
