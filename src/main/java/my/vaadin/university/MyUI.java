package my.vaadin.university;

import java.util.ArrayList;
import java.util.Collection;

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
	
	Grid grid = new Grid();
	
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {
      
    	VerticalLayout layout = new VerticalLayout();
    	
    	layout.addComponent(grid);
    	
    	setContent(grid);
    	    	
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
