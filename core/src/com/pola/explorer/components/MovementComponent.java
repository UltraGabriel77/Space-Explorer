package com.pola.explorer.components;

import com.badlogic.ashley.core.Component;

public class MovementComponent implements Component {
    public float speed;

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
