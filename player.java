package com.qa.treasueGame;

public class player {

	private int x1;
	private int y1;

	public int getX() {
		return x1;
	}

	public void setX(int x) {
		this.x1 = x;
	}

	public int getY() {
		return y1;
	}

	public void setY(int y) {
		this.y1 = y;
	}

	private int y;

	public void compass(int X1, int Y1) {
		if ((X1 - 0) < 0) {
			System.out.println("move " + X1 + "m" + " east");
		}
		if ((X1 - 0) > 0) {
			System.out.println("move " + X1 + "m" + " west");
		}
		if ((Y1 - 0) < 0) {
			System.out.println("move " + Y1 + "m" + " north");
		}
		if ((Y1 - 0 > 0)) {
			System.out.println("move " + Y1 + "m" + " south");
		}
		if (X1 == 0 && Y1 == 0) {
			System.out.println("You Win");
		}
	}

}
