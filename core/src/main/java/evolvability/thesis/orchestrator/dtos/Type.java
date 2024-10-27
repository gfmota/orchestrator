package evolvability.thesis.orchestrator.dtos;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Type {
    ARRAY("array");

    @JsonValue
    private final String value;

    public boolean isArray() {
        return this == ARRAY;
    }
}
