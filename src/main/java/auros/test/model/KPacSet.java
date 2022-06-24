package auros.test.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KPacSet {
    private Long id;
    private String title;
    private List<KPac> kpacList;
}
