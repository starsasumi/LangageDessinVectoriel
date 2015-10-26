package model;

import java.awt.Color;

/**
 * 
 * Figures taken from http://www.w3schools.com/svg/ for SVG files
 * Rectangle, Circle, Ellipse, Line, Polyline, Polygone, Path
 *
 */
public interface ShapesProperties {

	public void setColor();
	public Color getColor();
	public String getXML(Pencil pencil);
	
	
}