package model.presentation.awt;

import model.Shape;
import model.presentation.ShapeState;
import model.specific_path.Circle;

import java.awt.*;

/**
 * Created by Xiaxing SHI on 09/11/15.
 */
public class AWTCircle implements ShapeState {
    private Circle circle;
    private StateDelegate delegate;

    public AWTCircle(Circle circle, StateDelegate delegate) {
        this.delegate = delegate;
        this.circle = circle;
    }

    @Override
    public Object getDrawing() {
        Graphics2D g = delegate.getGraphics2D();

        g.setColor(this.circle.getColor());
        g.fillOval(this.circle.getCenter_x(), this.circle.getCenter_y(), this.circle.getRadius()*2, this.circle.getRadius()*2);

        g.setColor(this.circle.getPencil().getColor());
        g.setStroke(new BasicStroke(this.circle.getPencil().getWidth()));
        g.drawOval(this.circle.getCenter_x(), this.circle.getCenter_y(), this.circle.getRadius()*2, this.circle.getRadius()*2);

        return this;
    }

    @Override
    public void setShape(Shape shape) throws Exception {
        if(shape instanceof Circle){
            this.circle = (Circle) shape;
        }
        else{
            throw new Exception("The shape is not of the right type");
        }
    }
}
