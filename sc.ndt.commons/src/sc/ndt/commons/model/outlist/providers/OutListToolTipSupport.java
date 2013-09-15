package sc.ndt.commons.model.outlist.providers;

import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;

import sc.ndt.commons.model.OutBlock;
import sc.ndt.commons.model.OutCh;

//ToolTipSupport class
public class OutListToolTipSupport extends ColumnViewerToolTipSupport {

	public OutListToolTipSupport(ColumnViewer viewer, int style, boolean manualActivation) {
		super(viewer, style, manualActivation);
	}

	protected Composite createViewerToolTipContentArea(Event event,
			ViewerCell cell, Composite parent) {	

		Composite tooltip = new Composite(parent,SWT.NONE);

		GridLayout l = new GridLayout(1,false);
		l.horizontalSpacing=0;
		l.marginWidth=0;
		l.marginHeight=0;
		l.verticalSpacing=5;
		tooltip.setLayout(l);

		Image image = getImage(event);
		Image bgImage = getBackgroundImage(event);
		String text = getText(event);
		Color fgColor = getForegroundColor(event);
		Color bgColor = getBackgroundColor(event);
		Font font = getFont(event);

		if(cell.getElement() instanceof OutCh) {

			OutCh ch = (OutCh)cell.getElement();

			CLabel label = new CLabel(tooltip, getStyle(event));

			GridData gd_treeTower = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
			gd_treeTower.widthHint = 100;
			gd_treeTower.heightHint = 100;
			parent.setLayoutData(label);

			if (text != null) {
				label.setText(text);
			}
			if (image != null) {
				label.setImage(image);
			}

			if (fgColor != null) {
				label.setForeground(fgColor);
			}

			if (bgColor != null) {
				label.setBackground(bgColor);
			}

			if (bgImage != null) {
				label.setBackgroundImage(image);
			}

			if (font != null) {
				label.setFont(font);
			}

			CLabel label_1 = new CLabel(tooltip, getStyle(event));
			label_1.setText(ch.convention);

			label_1.setSize(100, 100);

			CLabel label_2 = new CLabel(tooltip, getStyle(event));
			label_2.setText(ch.other[0]);

		} else if(cell.getElement() instanceof OutBlock) {
			OutBlock ob = (OutBlock)cell.getElement();
			ob.getAvailableNames();
			
			CLabel label = new CLabel(tooltip, getStyle(event));
			label.setText(ob.getAvailableNames());
					
		}

		return tooltip;

	}

	public boolean isHideOnMouseDown() {
		return false;
	}

	public static void enableFor(ColumnViewer viewer) {
		new OutListToolTipSupport(viewer, ToolTip.NO_RECREATE, false);
	}
}
