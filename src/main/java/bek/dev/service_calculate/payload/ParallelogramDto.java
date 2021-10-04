package bek.dev.service_calculate.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ParallelogramDto {

    @NotNull(message = "the sideA must not be empty")
    private double parallelogramSideA;
    @NotNull(message = "the sideB must not be empty")
    private double parallelogramSideB;
    private double angleBetweenAB;//(optional)
    private double height;//(optional)

    public ParallelogramDto(double parallelogramSideA, double parallelogramSideB, double angleBetweenAB) {
        parallelogramSideA = parallelogramSideA;
        parallelogramSideB = parallelogramSideB;
        this.angleBetweenAB = angleBetweenAB;
    }


}
