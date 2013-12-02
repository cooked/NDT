package sc.ndt.editor.fast.ui.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IViewLayout;

import sc.ndt.editor.fast.ui.views.ViewQuickChart;

public class FASTPerspectiveAnalysis implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout page) {
		
		page.setEditorAreaVisible(true);
        page.setFixed(true);
        
        page.addStandaloneView(ViewQuickChart.ID, false, IPageLayout.TOP, 0.3f, IPageLayout.ID_EDITOR_AREA);
        IViewLayout view = page.getViewLayout(ViewQuickChart.ID);
        view.setCloseable(false);
        view.setMoveable(false);
        
     }

}
