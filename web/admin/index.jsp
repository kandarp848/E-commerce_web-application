
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%-- include slider file --%> 


<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>

<jsp:include page="AdminIndex"/>


    <div class="col-sm-9 padding-right">
        <p>Online Users : ${onlineUser} </p>
        <div class="features_items">
           <div class="col-sm-4">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <i class="fa fa-shopping-bag fa-5x" aria-hidden="true" ></i>
                            <h2>Product details</h2>

                            <a href="AdminProductServlet" class="btn btn-default my_btn"><i class="fa fa-shopping-bag"></i> products</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>Here you can view Products , add or delete them</h2>
                                <a href="AdminProductServlet" class="btn btn-default my_btn"><i class="fa fa-shopping-bag" ></i> products</a>

                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <i class="fa fa-user-circle fa-5x" aria-hidden="true" ></i>
                            <h2>Users details</h2>

                            <a href="AdminUserServlet" class="btn btn-default my_btn"><i class=" fa fa-user-circle"></i> Users</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>Here you can view Users , add or delete them</h2>
                                <a href="AdminUserServlet" class="btn btn-default my_btn"><i class="fa fa-user-circle" ></i> Users</a>

                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <i class="fa fa-pie-chart fa-5x" aria-hidden="true" ></i>
                            <h2>Categories</h2>

                            <a href="AdminCategoryServlet" class="btn btn-default my_btn"><i class=" fa fa-pie-chart "></i> Categories</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>Here you can view Categories , add or delete them </h2>
                                <a href="AdminCategoryServlet" class="btn btn-default my_btn"><i class="fa fa-pie-chart" ></i> Categories</a>

                            </div>
                        </div>

                    </div>
                </div>
            </div> 
            
            <div class="col-sm-4">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <i class="fa fa-sort fa-5x" aria-hidden="true" ></i>
                            <h2>Slider</h2>

                            <a href="SlidersShow" class="btn btn-default my_btn"><i class=" fa fa-sort "></i> Slider</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>Here you can choose which products will appear in the slider </h2>
                                <a href="SlidersShow" class="btn btn-default my_btn"><i class="fa fa-sort" ></i> Slider</a>

                            </div>
                        </div>

                    </div>
                </div>
            </div>
            
            
 
            
            </div>

      
    </div>
</section>


<%-- include footer file --%> 
<%@include file="footer.jsp" %>