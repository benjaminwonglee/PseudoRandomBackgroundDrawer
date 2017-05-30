package patterns;

import java.awt.Rectangle;

public class AlignedPattern implements Pattern {

	private int width;
	private int height;
	private int xCursor;
	private int yCursor;
	private Rectangle canvasSize;

	@Override
	public int xInCanvas() {
		xCursor += width;
		if (xCursor >= canvasSize.getWidth()) {
			if (yInCanvas() != -1) {
				xCursor = getWidth();
			} else {
				// Stop
				return -1;
			}
		}
		return xCursor - getWidth();
	}

	@Override
	public int yInCanvas() {
		if (xCursor >= canvasSize.getWidth()) {
			yCursor += height;
			if (yCursor + height >= canvasSize.height) {
				// Stop
				return -1;
			}
			return yCursor - height;
		}
		return yCursor;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		return 0;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int getXCursor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setXCursor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getYCursor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setYCursor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rectangle getCanvasSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCanvasSize() {
		// TODO Auto-generated method stub
		
	}
}
