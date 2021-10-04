package bek.dev.service_calculate.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private double area;
    private double perimeter;
    private String message;
    private boolean success;

    public Result(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public Result(String message, boolean success) {
        this.message = message;
        this.success = success;
    }
}
