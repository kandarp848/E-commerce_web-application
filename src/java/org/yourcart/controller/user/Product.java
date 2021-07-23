
package org.yourcart.controller.user;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.model.ProductModel;

/**
 * handle display product and recommend products
 */
@WebServlet(name = "Product", urlPatterns = {"/Product"})
public class Product extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int productID = Integer.parseInt(request.getParameter("id"));
        ProductModel productModel = new ProductModel();
        org.yourcart.beans.Product product = productModel.getProduct(productID);
        
        //no product with this id 
        if(product==null){
            response.sendRedirect("404.jsp");
        }else{
             //assigns it on request
            request.setAttribute("product", product);
            
            //get recommended product
            ArrayList<org.yourcart.beans.Product> recommeendedItem = productModel.getRecommeendedItem(product.getCategory(), productID);
            request.setAttribute("recomed", recommeendedItem);
            
            request.getRequestDispatcher("/product-details.jsp").forward(request, response);
        }
        
       
    }

    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
