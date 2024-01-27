package healthy.lifestyle.backend.nutrition.dto;

import healthy.lifestyle.backend.workout.dto.HttpRefResponseDto;
import java.util.List;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class NutritionResponseDto {
    private long id;
    private String title;
    private String description;
    private boolean isCustom;

    private List<HttpRefResponseDto> httpRefs;
    private NutritionTypeResponseDto type;
}
