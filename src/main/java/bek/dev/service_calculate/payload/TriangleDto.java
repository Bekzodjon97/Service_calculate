package bek.dev.service_calculate.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TriangleDto {

    @NotNull(message = "the triangleSideA must not be empty")
    private double triangleSideA;
    @NotNull(message = "the triangleSideB must not be empty")
    private double triangleSideB;
    private double triangleSideC;// It is not required when the angleBetweenAB is given(optional)
    private double angleBetweenAB;// When the angle between the two sides is given(optional)




    public TriangleDto(double triangleSideA, double triangleSideB, double triangleSideC) {
        this.triangleSideA = triangleSideA;
        this.triangleSideB = triangleSideB;
        this.triangleSideC = triangleSideC;
    }


}
