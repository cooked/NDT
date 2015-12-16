package sc.ndt.commons.model.providers.airfoils;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import sc.ndt.commons.Activator;
import sc.ndt.commons.model.AirfoilFile;
import sc.ndt.commons.model.OutCh;

//LabelProvider class
public class AirfoilListLabelProvider extends ColumnLabelProvider implements IStyledLabelProvider {

	// see 
	// http://richclientplatform.blogspot.it/2007/05/plugin-your-images.html
	AbstractUIPlugin plugin = Activator.getDefault();
	ImageRegistry imageRegistry = plugin.getImageRegistry();
	Image img_ch 	= imageRegistry.get(Activator.IMG_OUT_CH_ID);
	Image img_chd 	= imageRegistry.get(Activator.IMG_OUT_CHD_ID);
	Image img_blk 	= imageRegistry.get(Activator.IMG_OUT_BLK_ID);
	
	@Override
	public StyledString getStyledText(Object element) {
		return new StyledString(getText(element));
	}

	@Override
	public String getToolTipText(Object element) {
		if (element instanceof OutCh)
			return ((OutCh)element).desc;
		return super.getToolTipText(null);
	}


	@Override
	public Color getToolTipBackgroundColor(Object object) {
		//if (labelProvider instanceof CellLabelProvider) {
		//	return ((CellLabelProvider) labelProvider)
		//			.getToolTipBackgroundColor(object);
		//}
		return super.getToolTipBackgroundColor(object);
	}

	@Override
	public int getToolTipDisplayDelayTime(Object object) {
		//if (labelProvider instanceof CellLabelProvider) {
		//	return ((CellLabelProvider) labelProvider)
		//			.getToolTipDisplayDelayTime(object);
		//}
		return super.getToolTipDisplayDelayTime(object);
	}

	@Override
	public Font getToolTipFont(Object object) {
		//if (labelProvider instanceof CellLabelProvider) {
		//	return ((CellLabelProvider) labelProvider)
		//			.getToolTipFont(object);
		//}
		return super.getToolTipFont(object);
	}

	@Override
	public Color getToolTipForegroundColor(Object object) {
		//if (labelProvider instanceof CellLabelProvider) {
		//	return ((CellLabelProvider) labelProvider)
		//			.getToolTipForegroundColor(object);
		//}
		return super.getToolTipForegroundColor(object);
	}

	@Override
	public Image getToolTipImage(Object object) {
		//if (labelProvider instanceof CellLabelProvider) {
		//	return ((CellLabelProvider) labelProvider)
		//			.getToolTipImage(object);
		//}
		return super.getToolTipImage(object);
	}

	@Override
	public Point getToolTipShift(Object object) {
		//if (labelProvider instanceof CellLabelProvider) {
		//	return ((CellLabelProvider) labelProvider)
		//			.getToolTipShift(object);
		//}
		return super.getToolTipShift(object);
	}

	@Override
	public int getToolTipStyle(Object object) {
		//if (labelProvider instanceof CellLabelProvider) {
		//	return ((CellLabelProvider) labelProvider)
		//			.getToolTipStyle(object);
		//}
		return super.getToolTipStyle(object);
	}

	@Override
	public int getToolTipTimeDisplayed(Object object) {
		//if (labelProvider instanceof CellLabelProvider) {
		//	return ((CellLabelProvider) labelProvider)
		//			.getToolTipTimeDisplayed(object);
		//}
		return super.getToolTipTimeDisplayed(object);
	}

	@Override
	public boolean useNativeToolTip(Object object) {
		//if (labelProvider instanceof CellLabelProvider) {
		//	return ((CellLabelProvider) labelProvider)
		//			.useNativeToolTip(object);
		//}
		return super.useNativeToolTip(object);
	}

	/*public int getToolTipDisplayDelayTime(Object object) {
		return 2000;
	}

	public int getToolTipTimeDisplayed(Object object) {
		return 5000;
	}*/
	
	@Override
	public void update(ViewerCell cell) {

		StyledString styledString = new StyledString();

		Object e  = cell.getElement();
		if(e instanceof AirfoilFile) {

			AirfoilFile af = (AirfoilFile)cell.getElement();

			//styledString.append(af.name);
			styledString.append(af.getLocation(), StyledString.DECORATIONS_STYLER );

			//cell.setImage( img_blk );
			cell.setText(styledString.getString());
			cell.setStyleRanges(styledString.getStyleRanges());

		} else if(e instanceof OutCh) {

			OutCh ch = (OutCh)cell.getElement();

			styledString.append(ch.name);

			cell.setText(styledString.getString());
			if(ch.isAvailable()) {
				cell.setForeground(cell.getControl().getDisplay().getSystemColor(SWT.COLOR_BLACK));
				cell.setImage(img_ch);
			} else {
				cell.setForeground(cell.getControl().getDisplay().getSystemColor(SWT.COLOR_DARK_GRAY));
				cell.setImage(img_chd);
			}
			cell.setStyleRanges(styledString.getStyleRanges());
		}

	}

}
