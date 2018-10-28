package Level3Chekpoint;

public class Animation2D extends Animation implements Drawable{

	public void draw() {
		System.out.println("drawing");
	}

	public static void main(String[] args) {
		Animation2D animation = new Animation2D();
		animation.draw();
		System.out.println(getFramerate());
	}
}
