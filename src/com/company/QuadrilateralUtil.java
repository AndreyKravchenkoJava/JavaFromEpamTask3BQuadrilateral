package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class QuadrilateralUtil {

    public QuadrilateralUtil() {

    }

    public static double getPerimetr (Quadrilateral quadrilateral) {
        double perimetr = quadrilateral.getA().getX() + quadrilateral.getB().getX() + quadrilateral.getC().getX() + quadrilateral.getD().getX();
        return perimetr;
    }

    public static double getSquareWithRectangle (Quadrilateral quadrilateral) {
        double square = quadrilateral.getA().getX() * quadrilateral.getB().getX();
        return square;
    }

    public static int getQuantitySquare (List<Quadrilateral> quadrilaterals) {
        int square = 0;
        for (Quadrilateral quadrilateral : quadrilaterals) {
            if (Objects.equals(quadrilateral.getTypeOfQuadrilateral(), "Квадрат")) {
                square++;
            }
        }
        return square;
    }

    public static int getQuantityRectangle (List<Quadrilateral> quadrilaterals) {
        int rectangle = 0;
        for (Quadrilateral quadrilateral : quadrilaterals) {
            if (Objects.equals(quadrilateral.getTypeOfQuadrilateral(), "Прямоугольник")) {
                rectangle++;
            }
        }
        return rectangle;
    }

    public static int getQuantityRhombus (List<Quadrilateral> quadrilaterals) {
        int rhombus = 0;
        for (Quadrilateral quadrilateral : quadrilaterals) {
            if (Objects.equals(quadrilateral.getTypeOfQuadrilateral(), "Ромб")) {
                rhombus++;
            }
        }
        return rhombus;
    }

    public static int getQuantityArbitrary (List<Quadrilateral> quadrilaterals) {
        int arbitrary = 0;
        for (Quadrilateral quadrilateral : quadrilaterals) {
            if (Objects.equals(quadrilateral.getTypeOfQuadrilateral(), "Произвольный")) {
                arbitrary++;
            }
        }
        return arbitrary;
    }

    public static List<Quadrilateral> findSquare (List<Quadrilateral> quadrilaterals) {
        List<Quadrilateral> result = new ArrayList<>();
        for (Quadrilateral quadrilateral : quadrilaterals) {
            if (Objects.equals(quadrilateral.getTypeOfQuadrilateral(), "Квадрат")) {
                result.add(quadrilateral);
            }
        }
        return result;
    }


    public static List<Quadrilateral> findRectangle (List<Quadrilateral> quadrilaterals) {
        List<Quadrilateral> result = new ArrayList<>();
        for (Quadrilateral quadrilateral : quadrilaterals) {
            if (Objects.equals(quadrilateral.getTypeOfQuadrilateral(), "Прямоугольник")) {
                result.add(quadrilateral);
            }
        }
        return result;
    }


    public static List<Quadrilateral> findRhombus (List<Quadrilateral> quadrilaterals) {
        List<Quadrilateral> result = new ArrayList<>();
        for (Quadrilateral quadrilateral : quadrilaterals) {
            if (Objects.equals(quadrilateral.getTypeOfQuadrilateral(), "Ромб")) {
                result.add(quadrilateral);
            }
        }
        return result;
    }


    public static List<Quadrilateral> findArbitrary (List<Quadrilateral> quadrilaterals) {
        List<Quadrilateral> result = new ArrayList<>();
        for (Quadrilateral quadrilateral : quadrilaterals) {
            if (Objects.equals(quadrilateral.getTypeOfQuadrilateral(), "Произвольный")) {
                result.add(quadrilateral);
            }
        }
        return result;
    }

    public static List<Quadrilateral> findQuadrilateralMaxPerimetr (List<Quadrilateral> quadrilaterals) {
        List<Quadrilateral> result = new ArrayList<>();
        double max = 0;
        for (int i = 0; i < quadrilaterals.size(); i++) {
            if (getPerimetr(quadrilaterals.get(i)) > max) {
                max = getPerimetr(quadrilaterals.get(i));
            }
        }
        for (int i = 0; i < quadrilaterals.size(); i++) {
            if (getPerimetr(quadrilaterals.get(i)) ==  max) {
                result.add(quadrilaterals.get(i));
            }
        }
        return result;
    }

    public static List<Quadrilateral> findQuadrilateralMinPerimetr (List<Quadrilateral> quadrilaterals) {
        List<Quadrilateral> result = new ArrayList<>();
        double min = 2000000;
        for (int i = 0; i < quadrilaterals.size(); i++) {
            if (getPerimetr(quadrilaterals.get(i)) < min) {
                min = getPerimetr(quadrilaterals.get(i));
            }
        }
        for (int i = 0; i < quadrilaterals.size(); i++) {
            if (getPerimetr(quadrilaterals.get(i)) == 0) {
                result.add(quadrilaterals.get(i));
            }
        }
        return result;
    }

    public static List<Quadrilateral> findQuadrilateralMaxSquare (List<Quadrilateral> quadrilaterals) {
        List<Quadrilateral> result = new ArrayList<>();
        double max = 0;
        for (int i = 0; i < quadrilaterals.size(); i++) {
            if (getSquareWithRectangle(quadrilaterals.get(i)) > max) {
                max = getSquareWithRectangle(quadrilaterals.get(i));
            }
        }
        for (int i = 0; i < quadrilaterals.size(); i++) {
            if (getSquareWithRectangle(quadrilaterals.get(i)) == max) {
                result.add(quadrilaterals.get(i));
            }
        }
        return result;
    }

    public static List<Quadrilateral> findQuadrilateralWithMinSquare (List<Quadrilateral> quadrilaterals) {
        List<Quadrilateral> result = new ArrayList<>();
        double min = 2000000;
        for (int i = 0; i < quadrilaterals.size(); i++) {
            if (getSquareWithRectangle(quadrilaterals.get(i)) < min) {
                min = getSquareWithRectangle(quadrilaterals.get(i));
            }
        }
        for (int i = 0; i < quadrilaterals.size(); i++) {
            if (getSquareWithRectangle(quadrilaterals.get(i)) == 0) {
                result.add(quadrilaterals.get(i));
            }
        }
        return result;
    }
}
