package auros.test.convertor;

import auros.test.model.KPac;
import java.beans.PropertyEditorSupport;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class KPacEditor extends PropertyEditorSupport {
    private final List<KPac> kpacList;

    @Override
    public void setAsText(String id) throws IllegalArgumentException {
        KPac kpac;
        for (KPac element: kpacList) {
            if (element.getId() == Long.parseLong(id)) {
                this.setValue(element);
                return;
            }
        }
        this.setValue(null);
    }
}
