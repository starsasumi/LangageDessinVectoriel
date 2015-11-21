package language;

import model.Shape;

import java.util.ArrayList;

/**
 * This defined a data source for a painting.
 *
 * Created by Xiaxing SHI on 21/11/15.
 */
public interface DrawingSource {
    String getName();
    ArrayList<Shape> getShapes();
}
