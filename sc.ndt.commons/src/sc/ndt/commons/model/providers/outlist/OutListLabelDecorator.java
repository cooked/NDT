package sc.ndt.commons.model.providers.outlist;

import org.eclipse.jface.viewers.IDecorationContext;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.LabelDecorator;
import org.eclipse.swt.graphics.Image;

public class OutListLabelDecorator extends LabelDecorator {

	//private final ImageDescriptor warningImageDescriptor = Activator.getImageDescriptor("icons/bullet_error.png");
	private Image decoratedImage = null;

	@Override
	public Image decorateImage(Image image, Object element, IDecorationContext context) {
		/*if (element instanceof ViewModel && !((ViewModel) element).isActive()) {
			if (decoratedImage == null) {
				decoratedImage = new DecorationOverlayIcon(image, warningImageDescriptor, IDecoration.BOTTOM_RIGHT)
				        .createImage();
			}
			return decoratedImage;
		}*/
		return null;
	}

	@Override
	public void dispose() {
		decoratedImage.dispose();
		decoratedImage = null;
	}

	@Override
	public String decorateText(String text, Object element,
			IDecorationContext context) {
		return null;
	}

	@Override
	public boolean prepareDecoration(Object element, String originalText,
			IDecorationContext context) {
		return false;
	}

	@Override
	public Image decorateImage(Image image, Object element) {
		return null;
	}

	@Override
	public String decorateText(String text, Object element) {
		return null;
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
	}
}