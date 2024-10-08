package evolvability.thesis.orchestrator.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO {
    private List<DataTypeDTO> dataTypes;

    private List<StationDTO> stations;

    private MeasurementsDTO measurements;
}
