package bek.dev.service_calculate.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrapezoidDto {

    @NotNull(message = "the TrapezoidSideA must not be empty")
    private double trapezoidSideA;
    @NotNull(message = "the TrapezoidSideB must not be empty")
    private double trapezoidSideB;
    @NotNull(message = "the TrapezoidSideC must not be empty")
    private double trapezoidSideC;
    @NotNull(message = "the TrapezoidSideD must not be empty")
    private double trapezoidSideD;


    public TrapezoidDto(double trapezoidSideA, double trapezoidSideB, double trapezoidSideC, double trapezoidSideD) {
        this.trapezoidSideA = trapezoidSideA;
        this.trapezoidSideB = trapezoidSideB;
        this.trapezoidSideC = trapezoidSideC;
        this.trapezoidSideD = trapezoidSideD;
    }


}
