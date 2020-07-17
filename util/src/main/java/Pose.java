package org.frc1073.toolbox.util;
import org.frc1073.toolbox.util.Vec2D;

/**
 * main use for poses is to transform data 
 */
public class Pose {

    public Vec2D position;
    public double angle;

    public Pose(Vec2D position, double angle){

    }

    //translates the pose (point) by a vector
    public void translate(Vec2D position, double angle) {

    }

    //rotates the pose by 
    public void rotate(Vec2D position, double angle){

    }

    //changing sensor coordinates to something that's usbale in the real world in "world coordinates"
    public void localToWorld(Vec2D position, double angle){

    }

    //changing real world points/data to be "local" or using sensor coordaintes and relativity
    public void worldToLocal(Vec2D position, double angle){

    }
}