package src.ObjectCustomization.Traits;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Upgrade {
    int cost;
    String description;
}
