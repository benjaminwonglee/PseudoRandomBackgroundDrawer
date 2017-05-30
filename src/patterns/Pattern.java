package patterns;

import java.awt.Rectangle;

public interface Pattern {

	public int xInCanvas();

	public int yInCanvas();

	public int getWidth();

	public void setHeight(int height);

	public int getHeight();

	public void setWidth(int width);

	public int getXCursor();

	public void setXCursor(int xCursor);

	public int getYCursor();

	public void setYCursor(int yCursor);

	public Rectangle getCanvasSize();

	public void setCanvasSize(Rectangle canvasSize);
}