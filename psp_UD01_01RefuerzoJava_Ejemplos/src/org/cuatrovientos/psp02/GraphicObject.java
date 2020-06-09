package org.cuatrovientos.psp02;

public abstract class GraphicObject {
	// declare fields
    int x, y;
    // declare nonabstract methods
    void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    abstract void draw();
    abstract void resize();
}
