package org.yourcart.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.User;


@WebFilter(filterName = "CheckLogout", urlPatterns = {"/login.jsp"})
public class CheckLogout implements Filter {

    public CheckLogout() {
    }

   
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        
        User user = (User) ((HttpServletRequest) request).getSession().getAttribute("LoginUser");
        //SEE : when remove this line it work wrong
        //System.out.println(user.getUserName());
        if (user == null) { //if user logged out
            System.out.println("not login");
            chain.doFilter(request, response);
        } else {
            //redirect to index page
            System.out.println("loinnnnns");
            ((HttpServletResponse) response).sendRedirect("index.jsp");
        }
    }

    /**
     * Destroy method for this filter
     */
    @Override
    public void destroy() {
    }

    /**
     * Init method for this filter
     *
     * @param filterConfig
     */
    @Override
    public void init(FilterConfig filterConfig) {

    }

}
