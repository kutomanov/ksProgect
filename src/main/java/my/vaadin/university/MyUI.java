package my.vaadin.university;

import javax.servlet.annotation.WebServlet;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("mytheme")
public class MyUI extends UI {
	
	
	
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {
      
    	VerticalLayout layout = new VerticalLayout();
    	Grid grid = new Grid();
    	layout.addComponent(grid);
    	
    	BeanItemContainer<Student> container = new BeanItemContainer<Student>(Student.class);
    	container.addAll(Table.getAllStudents());
    	//System.out.println(container);
    	
    	grid.setContainerDataSource(container);
    	
     	
    	layout.setSpacing(true);
    	layout.setMargin(true);
    	setContent(layout);    	   	
    }
    
    /*public void updateList() {
    	
    }*/

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    
    }
}
