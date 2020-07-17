package org.frc1073.toolbox.util;
import org.frc1073.toolbox.util.Vec2D;

/**
 * main use for poses is to transform data 
 */
public class Pose {

    public Vec2D  position;
    public double angle;

    public Pose() {
        position = new Vec2D();
        angle = 0.0;
    }

    public Pose(Vec2D position, double angle){
        this.position = new Vec2D(position);
        this.angle = angle;
    }

    public Pose(Pose pose) {
        this.position = new Vec2D(pose.position);
        this.angle = pose.angle;
    }

    // translates the pose (point) by a vector in world coordinates
    public void translate(Vec2D delta) {
        this.position.accumulate(delta);
    }

    // rotates the pose by a given angle
    public void rotate(double angle){
        this.angle += angle;
        // TODO: Wrap the angle.
    }

    // Translate a pose by a world vector then then rotate it.
    public void transform(Vec2D delta, double angle) {
        translate(delta);
        rotate(angle);
    }

    //changing sensor coordinates to something that's usbale in the real world in "world coordinates"
    public void localToWorld(Vec2D local, Vec2D world) {
        world.assign(local);
        world.rotate(angle);
        world.accumulate(position);
    }

    // changing real world points/data to be "local" or using sensor coordaintes and relativity
    public void worldToLocal(Vec2D world, Vec2D local) {
        local.sub(world, position);
        local.rotate(-angle);
    }
}