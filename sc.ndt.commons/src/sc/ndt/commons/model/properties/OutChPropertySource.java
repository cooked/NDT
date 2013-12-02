package sc.ndt.commons.model.properties;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import sc.ndt.commons.model.OutCh;

public class OutChPropertySource implements IPropertySource {

	private static final String PROPERTY_SIZE = "size";

	private static final String PROPERTY_TEXT = "tex";
	
	OutCh ch;
	private IPropertyDescriptor[] propertyDescriptors;
	
	public OutChPropertySource(OutCh ch) {
		super();
		this.ch = ch;
	}

	@Override
	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if (propertyDescriptors == null) {
            
            PropertyDescriptor sizeDescriptor = new PropertyDescriptor(PROPERTY_SIZE, "Size");
            // set a custom label provider for a point
            sizeDescriptor.setLabelProvider(new LabelProvider() {
               public String getText(Object element) {
                  Point point = (Point)element;
                  StringBuffer buf = new StringBuffer();
                  buf.append("Height:");
                  buf.append(point.y);
                  buf.append("  ");
                  buf.append("Width:");
                  buf.append(point.x);
	              return buf.toString();
               }
            });
            sizeDescriptor.setCategory("Button");
			
            PropertyDescriptor textDescriptor = new TextPropertyDescriptor(PROPERTY_TEXT,"Text");
            textDescriptor.setCategory("Label");

            propertyDescriptors = new IPropertyDescriptor[] {
               sizeDescriptor,   // Read-only (instance of PropertyDescriptor)
               textDescriptor};
            }
            return propertyDescriptors;
	}

	@Override
	public Object getPropertyValue(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPropertySet(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		// TODO Auto-generated method stub

	}

}
