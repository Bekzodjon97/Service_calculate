package bek.dev.service_calculate.service;

import bek.dev.service_calculate.payload.*;
import org.springframework.stereotype.Service;

@Service
public class FigureService {
    public Result calculateAreaAndPerimeterOfSquare(SquareDto squareDto) {
        return new Result(Math.pow(squareDto.getSquareSide(), 2), squareDto.getSquareSide() * 4,"Successfully",true);
    }

    public Result calculateAreaAndPerimeterOfRectangle(RectangleDto rectangleDto) {
        return new Result(rectangleDto.getRectangularSideA() * rectangleDto.getRectangularSideB(), (rectangleDto.getRectangularSideA() + rectangleDto.getRectangularSideB()) * 2,"Successfully",true);
    }

    public Result calculateAreaAndPerimeterOfTriangle(TriangleDto triangleDto) {
        if (triangleDto.getTriangleSideC() >= (triangleDto.getTriangleSideB() + triangleDto.getTriangleSideA()) ||
                triangleDto.getTriangleSideB() >= (triangleDto.getTriangleSideA() + triangleDto.getTriangleSideC()) ||
                triangleDto.getTriangleSideA() >= (triangleDto.getTriangleSideC() + triangleDto.getTriangleSideB())) {
            return new Result("The triangle is wrong",false);
        }
        if (triangleDto.getAngleBetweenAB() > 0) {
            double side = Math.sqrt(Math.pow(triangleDto.getTriangleSideA(), 2) + Math.pow(triangleDto.getTriangleSideB(), 2) - 2 * triangleDto.getTriangleSideA() * triangleDto.getTriangleSideB() * Math.cos(Math.toRadians(triangleDto.getAngleBetweenAB())));
            return new Result(Math.sin(Math.toRadians(triangleDto.getAngleBetweenAB())) * triangleDto.getTriangleSideA() * triangleDto.getTriangleSideB() / 2, triangleDto.getTriangleSideB() + triangleDto.getTriangleSideA() + side,"Successfully",true);
        }
        double halfPerimeter = (triangleDto.getTriangleSideA() + triangleDto.getTriangleSideC() + triangleDto.getTriangleSideB()) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - triangleDto.getTriangleSideA()) * (halfPerimeter - triangleDto.getTriangleSideB()) * (halfPerimeter - triangleDto.getTriangleSideC()));
        return new Result(area, halfPerimeter * 2,"Successfully",true);
    }

    public Result calculateAreaAndPerimeterOfCircle(CircleDto circleDto) {
        return new Result(Math.PI * Math.pow(circleDto.getRadius(), 2), 2 * circleDto.getRadius() * Math.PI,"Successfully",true);
    }

    public Result calculateAreaAndPerimeterOfParallelogram(ParallelogramDto parallelogramDto) {
        if (parallelogramDto.getHeight() > 0) {
            return new Result(parallelogramDto.getHeight() * parallelogramDto.getParallelogramSideA(), 2 * (parallelogramDto.getParallelogramSideB() * parallelogramDto.getParallelogramSideA()),"Successfully",true);
        }
        double area = parallelogramDto.getParallelogramSideB() * parallelogramDto.getParallelogramSideA() * Math.sin(Math.toRadians(parallelogramDto.getAngleBetweenAB()));
        return new Result(area, 2 * (parallelogramDto.getParallelogramSideB() * parallelogramDto.getParallelogramSideA()),"Successfully",true);
    }

    public Result calculateAreaAndPerimeterOfTrapezoid(TrapezoidDto trapezoidDto) {
        double perimeter = trapezoidDto.getTrapezoidSideA() + trapezoidDto.getTrapezoidSideB() + trapezoidDto.getTrapezoidSideC() + trapezoidDto.getTrapezoidSideD();
        double area = (trapezoidDto.getTrapezoidSideA() + trapezoidDto.getTrapezoidSideB()) / 2 * Math.sqrt(Math.pow(trapezoidDto.getTrapezoidSideC(), 2) - Math.pow(((Math.pow(trapezoidDto.getTrapezoidSideA() - trapezoidDto.getTrapezoidSideB(), 2) + Math.pow(trapezoidDto.getTrapezoidSideC(), 2) - Math.pow(trapezoidDto.getTrapezoidSideD(), 2)) / 2 * (trapezoidDto.getTrapezoidSideA()) - trapezoidDto.getTrapezoidSideB()), 2));
        return new Result(area, perimeter,"Successfully",true);
    }
}
