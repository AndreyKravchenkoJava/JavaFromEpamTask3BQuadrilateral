package com.company;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<Quadrilateral> quadrilaterals = new ArrayList<>();
        quadrilaterals.add(new Quadrilateral(new Length(5), new Length(5), new Length(5), new Length(5), new Length(5), new Length(5), "Квадрат"));
        quadrilaterals.add(new Quadrilateral(new Length(6), new Length(6), new Length(6), new Length(6), new Length(6), new Length(6), "Квадрат"));
        quadrilaterals.add(new Quadrilateral(new Length(9), new Length(9), new Length(9), new Length(9), new Length(9), new Length(9), "Квадрат"));
        quadrilaterals.add(new Quadrilateral(new Length(7), new Length(3), new Length(7), new Length(3), new Length(9), new Length(9), "Прямоугольник"));
        quadrilaterals.add(new Quadrilateral(new Length(2), new Length(6), new Length(2), new Length(6), new Length(8), new Length(8), "Прямоугольник"));
        quadrilaterals.add(new Quadrilateral(new Length(8), new Length(9), new Length(8), new Length(9), new Length(6), new Length(6), "Прямоугольник"));
        quadrilaterals.add(new Quadrilateral(new Length(3), new Length(3), new Length(3), new Length(3), new Length(4), new Length(6), "Ромб"));
        quadrilaterals.add(new Quadrilateral(new Length(6), new Length(6), new Length(6), new Length(6), new Length(7), new Length(9), "Ромб"));
        quadrilaterals.add(new Quadrilateral(new Length(7), new Length(6), new Length(2), new Length(3), new Length(2), new Length(4), "Произвольный"));
        quadrilaterals.add(new Quadrilateral(new Length(4), new Length(7), new Length(4), new Length(7), new Length(6), new Length(5), "Произвольный"));

        int square = QuadrilateralUtil.getQuantitySquare(quadrilaterals);
        System.out.println("Квадратов: " + square);

        int rectangle = QuadrilateralUtil.getQuantityRectangle(quadrilaterals);
        System.out.println("Прямоугольник: " + rectangle);

        int rhombus = QuadrilateralUtil.getQuantityRhombus(quadrilaterals);
        System.out.println("Ромб: " + rhombus);

        int arbitrary = QuadrilateralUtil.getQuantityArbitrary(quadrilaterals);
        System.out.println("Произвольный: " + arbitrary);

        List<Quadrilateral> squa = QuadrilateralUtil.findSquare(quadrilaterals);
        List<Quadrilateral> squaMax = QuadrilateralUtil.findQuadrilateralMaxPerimetr(squa);
        double squaMaxS = QuadrilateralUtil.getPerimetr(squaMax.get(0));
        System.out.println("Максимальный периметр у квадратов: " + squaMaxS);

        List<Quadrilateral> rect = QuadrilateralUtil.findQuadrilateralMaxSquare(quadrilaterals);
        List<Quadrilateral> rectMax = QuadrilateralUtil.findQuadrilateralMaxSquare(rect);
        double rectMaxS = QuadrilateralUtil.getSquareWithRectangle(rectMax.get(0));
        System.out.println("Максимальная площадь у прямоугольников: " + rectMaxS);
    }
}
