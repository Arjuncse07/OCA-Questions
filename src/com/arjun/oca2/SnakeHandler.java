package com.arjun.oca2;

 class Snake {}
 class Cobra extends Snake {}
 class GardenSnake {}
public class SnakeHandler {
    private Snake snake;
    public void setSnake(Snake snake) { this.snake = snake; }
    public static void main(String[] args) {
        new SnakeHandler().setSnake(new Cobra());
    }
}
