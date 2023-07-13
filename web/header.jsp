
<%@page import="model.Account"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header class="header">
    <div class="container">
        <div class="row">
            <div class="col-lg-2 col-md-2">
                <div class="header__logo">
                    <a href="./index.jsp"><img src="img/logo.png" alt=""></a>
                </div>
            </div>
            <div class="col-lg-7 col-md-7">
                <nav class="header__menu mobile-menu">
                    <ul>
                        <li><a href="home-control">Home</a></li>
                        <li><a href="list-products-shopping">Shop</a></li>
                        <li><a href="add-to-cart">Shopping Cart</a></li>
                        <li><a href="testimonial">Testimonials</a></li>
                            <c:if test="${sessionScope.account.role=='SE'}">
                            <li><a href="manager-menu.jsp">Seller page</a></li>
                            </c:if>
                            <c:if test="${sessionScope.account.role=='AD'}">
                            <li><a href="dashboard">Admin page</a></li>
                            </c:if>
                            <c:if test="${sessionScope.account.role=='US'}">
                            <li><a href="./feedback.jsp">Feedback</a></li>
                            </c:if>

                    </ul>
                </nav>
            </div>
            <div class="col-lg-3 col-md-3">
                <div class="header__nav__option">
                    <c:if test="${sessionScope.account != null}">
                        <a href="update-account">My account</a>
                        <a href="logout">Log out</a>
                        <c:if test="${sessionScope.account.role == 'US'}">
                            <a href="see-reply-feedbacks?accountID=${sessionScope.account.accountID}"><img style="height: 27px; width: 27px" src="https://cdn-icons-png.flaticon.com/512/3239/3239958.png"></a>
                        </c:if>
                    </c:if>
                    <c:if test="${sessionScope.account == null}">
                        <a href="login">Sign in</a>
                        <a href="signup">Join now</a>
                    </c:if>
                </div>
            </div>
        </div>
        <div class="canvas__open"><i class="fa fa-bars"></i></div>
    </div>
</header>
