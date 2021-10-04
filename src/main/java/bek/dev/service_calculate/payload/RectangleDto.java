package bek.dev.service_calculate.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RectangleDto {

    @NotNull(message = "the sideA must not be empty")
    private double rectangularSideA;
    @NotNull(message = "the sideB must not be empty")
    private double rectangularSideB;

}
