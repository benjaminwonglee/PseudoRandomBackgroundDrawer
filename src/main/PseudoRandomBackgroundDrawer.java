package main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class PseudoRandomBackgroundDrawer {

	public PseudoRandomBackgroundDrawer() {
		JFrame frame = new JFrame();
		ShapePanel sp = new ShapePanel(frame);

		JButton circle = setButtonDefaults("Circle");
		sp.add(circle);
		JButton ellipse = setButtonDefaults("Ellipse");
		sp.add(ellipse);
		JButton hexagon = setButtonDefaults("Hexagon");
		sp.add(hexagon);
		JButton octagon = setButtonDefaults("Octagon");
		sp.add(octagon);
		JButton polygon = setButtonDefaults("Polygon");
		sp.add(polygon);
		JButton rectangle = setButtonDefaults("Rectangle");
		sp.add(rectangle);
		JButton square = setButtonDefaults("Square");
		sp.add(square);
		JButton star = setButtonDefaults("Star");
		sp.add(star);
		JButton triangle = setButtonDefaults("Triangle");
		sp.add(triangle);
		
		frame.add(sp);
		setFrameProperties(frame);
	}

	public Border buttonWithLabel(String label) {
		Border border = new Border() {
			@Override
			public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
				g.setColor(new Color(140, 0, 0));
				g.setFont(new Font("Arial", 1, 25));
				g.drawString(label, width / 2 - (g.getFontMetrics().stringWidth(label) / 2), height / 2 + 8);
			}

			@Override
			public boolean isBorderOpaque() {
				return false;
			}

			@Override
			public Insets getBorderInsets(Component c) {
				return new Insets(0, 0, 0, 0);
			}

		};
		return border;
	}

	private JButton setButtonDefaults(String shape) {
		JButton button = new JButton();
		button.setPreferredSize(new Dimension(150, 100));
		Border onOffBorder = buttonWithLabel(shape);
		button.setBorder(onOffBorder);
		return button;
	}

	private void setFrameProperties(JFrame frame) {
		frame.setTitle("PseudoRandomBackgroundDrawer");
		frame.setPreferredSize(new Dimension(1500, 1000));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null); // Center frame after pack
		frame.setVisible(true);
	}

	public static void main(String args[]) {
		new PseudoRandomBackgroundDrawer();
	}
}