package com.gmail.tsikalenko.nikita;

public class Vector3d {
	private double x;
	private double y;
	private double z;

	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3d() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public Vector3d sum(Vector3d vector) {
		Vector3d newVector = new Vector3d(this.getX() + vector.getX(), this.getY() + vector.getY(),
				this.getZ() + vector.getZ());
		return newVector;
	}

	public double scalar(Vector3d vector) {
		return this.getX() * vector.getX() + this.getY() * vector.getY() + this.getZ() * vector.getZ();
	}
	
	public Vector3d vector(Vector3d vector) {
		Vector3d newVector = new Vector3d(this.getY()*vector.getZ() - this.getZ()*vector.getY(), 
				this.getZ()*vector.getX() - this.getZ()*vector.getX(),
				this.getX()*vector.getY() + this.getY()*vector.getX());
		return newVector;
	}
}
