package org.frc1073.toolbox.util;


/**
 * Vector 2D class represents points and vectors in the plane.
 */
public class Vec3D {

    public double x;
    public double y;
    public double z;

    public Vec3D() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public Vec3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3D(Vec3D b) {
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
    }

    public void makeDirectionVector(double azimuth, double elevation) {
       // Unit vector formula for azimuth & elevation
       x = Math.cos(elevation) * Math.cos(azimuth);
       y = Math.cos(elevation) * Math.sin(azimuth);
       z = Math.sin(elevation);
    }

    public void accumulate(Vec3D b) {
        x += b.x;
        y += b.y;
        z += b.z;
    }

    public void dissipate(Vec3D b) {
        x -= b.x;
        y -= b.y;
        z -= b.z;
    }

    public void negate() {
        x = -x;
        y = -y;
        z = -z;
    }

    public void scale(double s) {
        x *= s;
        y *= s;
        z *= s;
    }

    public void add(Vec3D a, Vec3D b) {
        x = a.x + b.x;
        y = a.y + b.y;
        z = a.z + b.z;
    }

    public void sub(Vec3D a, Vec3D b) {
        x = a.x - b.x;
        y = a.y - b.y;
        z = a.z - b.z;
    }

    public double dot(Vec3D b) {
        return x * b.x + y * b.y + z * b.z;
    }

    public double length() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public void normalize() {
        double len = length();
        if (len > 0.0) {
            x = x/len;
            y = y/len;
            z = z/len;
        } else {
           x = 0.0;
           y = 0.0;
           z = 0.0;
        }
    }

    public double getAzimuth() {
        return Math.atan2(y, x);
    }

    public double getElevation() {
        // Elevation angle equation.
        double len2 = Math.sqrt(x*x + y*y);
        return Math.atan2(z,len2);
    }

}