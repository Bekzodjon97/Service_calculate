package bek.dev.service_calculate.controller;

import bek.dev.service_calculate.payload.*;
import bek.dev.service_calculate.service.FigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("figure")
public class FigureController {

    @Autowired
    FigureService figureService;

    @GetMapping("square")
    public HttpEntity<Result> square(@Valid @RequestBody SquareDto squareDto){
        Result result=figureService.calculateAreaAndPerimeterOfSquare(squareDto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("rectangle")
    public HttpEntity<Result> rectangle(@Valid @RequestBody RectangleDto rectangleDto){
        Result result=figureService.calculateAreaAndPerimeterOfRectangle(rectangleDto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("triangle")
    public HttpEntity<Result> triangle(@Valid @RequestBody TriangleDto triangleDto){
        Result result=figureService.calculateAreaAndPerimeterOfTriangle(triangleDto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("circle")
    public HttpEntity<Result> circle(@Valid @RequestBody CircleDto circleDto){
        Result result=figureService.calculateAreaAndPerimeterOfCircle(circleDto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("parallelogram")
    public HttpEntity<Result> parallelogram(@Valid @RequestBody ParallelogramDto parallelogramDto){
        Result result=figureService.calculateAreaAndPerimeterOfParallelogram(parallelogramDto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("trapezoid")
    public HttpEntity<Result> trapezoid(@Valid @RequestBody TrapezoidDto trapezoidDto){
        Result result=figureService.calculateAreaAndPerimeterOfTrapezoid(trapezoidDto);
        return ResponseEntity.ok(result);
    }


}
