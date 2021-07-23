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

@WebFilter(filterName = "CheckAdmin",urlPatterns = {"/admin/*"})
public class CheckAdmin implements Filter {

    public CheckAdmin() {
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        User user = (User) ((HttpServletRequest) request).getSession().getAttribute("LoginUser");

        if (user != null && user.getRole().equalsIgnoreCase("admin")) {
            chain.doFilter(request, response);
        } else {
            ((HttpServletResponse) response).sendRedirect("../login.jsp");
        }

    }

    /**
     * Destroy method for this filter
     */
    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

}
