package org.frc1073.toolbox.util;

/**
 * Vector 2D class represents points and vectors in the plane.
 */
public class Vec2D {

    public double x;
    public double y;

    public Vec2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Vec2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vec2D(Vec2D b) {
        this.x = b.x;
        this.y = b.y;
    }

    public void assign(Vec2D b) {
        this.x = b.x;
        this.y = b.y;
    }

    public void makeDirectionVector(double angle) {
        x = Math.cos(angle);
        y = Math.sin(angle);
    }

    public void accumulate(Vec2D b) {
        x += b.x;
        y += b.y;
    }

    public void dissipate(Vec2D b) {
        x -= b.x;
        y -= b.y;
    }

    public void negate() {
        x = -x;
        y = -y;
    }

    public void scale(double s) {
        x *= s;
        y *= s;
    }

    public void add(Vec2D a, Vec2D b) {
        x = a.x + b.x;
        y = a.y + b.y;
    }

    public void sub(Vec2D a, Vec2D b) {
        x = a.x - b.x;
        y = a.y - b.y;
    }

    public double dot(Vec2D b) {
        return x * b.x + y * b.y;
    }

    public double length() {
        return Math.sqrt(x*x + y*y);
    }

    public void normalize() {
        double len = length();
        if (len > 0.0) {
            x = x/len;
            y = y/len;
        } else {
           x = 0.0;
           y = 0.0;
        }
    }

    public double getAngle() {
        return Math.atan2(y, x);
    }

    public void rotate(double angle) {
        double xp = x * Math.cos(angle) - y * Math.sin(angle);
        double yp = y * Math.cos(angle) + x * Math.sin(angle);
        x = xp;
        y = yp;
    }

}