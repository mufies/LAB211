/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1;

import java.util.ArrayList;
import java.util.List;


public class SolvingEquation {

    private float a, b, c;

    public SolvingEquation(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public SolvingEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    

    
    
    public boolean oddNum(float a)
    {
        return a%2!=0;
    }
    
    public boolean evenNum(float a)
    {
        return a%2==0;
    }
    
    public boolean perfectSquares(float a) {
        
        if (a >= 0) {
                int sqrt = (int) Math.sqrt(a);
                if (sqrt * sqrt == a) {
                    return true;
                }
            }
        return false;
      
}
   

    public List<Float> calculateEquation() {
        if (a == 0) {
            if (b == 0) {
                return new ArrayList<>();
            } else {
                return null;
            }
        }

        List<Float> result = new ArrayList<>();
        result.add(-b / a);
        return result;
    }

public List<Float> calculateQuadraticEquation() {
    List<Float> roots = new ArrayList<>();
    float discriminant = b * b - 4.0f * a * c;

    if (discriminant > 0.0f) {
        float r1 = (-b + (float) Math.sqrt(discriminant)) / (2.0f * a);
        float r2 = (-b - (float) Math.sqrt(discriminant)) / (2.0f * a);
        roots.add(r1);
        roots.add(r2);
    } else if (discriminant == 0) {
        float r1 = -b / (2 * a);
        roots.add(r1);
    }

    return roots.isEmpty() ? null : roots;
}




    
    
    
    

}
