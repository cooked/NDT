package sc.ndt.commons.model.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class AddTowerNodeHandler extends AbstractHandler {
	  @Override
	  public Object execute(ExecutionEvent event) throws ExecutionException {
	    /*IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
	    IWorkbenchPage page = window.getActivePage();
	    View view = (View) page.findView(View.ID);
	    ISelection selection = view.getSite().getSelectionProvider()
	        .getSelection();

	    if (selection != null && selection instanceof IStructuredSelection) {
	      List<Person> persons = ModelProvider.INSTANCE.getPersons();
	      IStructuredSelection sel = (IStructuredSelection) selection;

	      for (Iterator<Person> iterator = sel.iterator(); iterator.hasNext();) {
	        Person person = iterator.next();
	        persons.remove(person);
	      }
	      view.getViewer().refresh();
	    }*/
	    return null;
	} 
}