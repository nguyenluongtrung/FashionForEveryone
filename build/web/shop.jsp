<%-- 
    Document   : shop
    Created on : 17 Feb, 2023, 7:54:08 AM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Male_Fashion Template">
        <meta name="keywords" content="Male_Fashion, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Male-Fashion | Template</title>

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
              rel="stylesheet">

        <!-- Css Styles -->
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
        <link rel="stylesheet" href="css/nice-select.css" type="text/css">
        <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>

    <body>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>

        <!-- Offcanvas Menu Begin -->
        <div class="offcanvas-menu-overlay"></div>
        <div class="offcanvas-menu-wrapper">
            <div class="offcanvas__option">
                <div class="offcanvas__links">
                    <a href="#">Sign in</a>
                    <a href="#">FAQs</a>
                </div>
                <div class="offcanvas__top__hover">
                    <span>Usd <i class="arrow_carrot-down"></i></span>
                    <ul>
                        <li>USD</li>
                        <li>EUR</li>
                        <li>USD</li>
                    </ul>
                </div>
            </div>
            <div class="offcanvas__nav__option">
                <a href="#" class="search-switch"><img src="img/icon/search.png" alt=""></a>
                <a href="#"><img src="img/icon/heart.png" alt=""></a>
                <a href="#"><img src="img/icon/cart.png" alt=""> <span>0</span></a>
                <div class="price">$0.00</div>
            </div>
            <div id="mobile-menu-wrap"></div>
            <div class="offcanvas__text">
                <p>Free shipping, 30-day return or refund guarantee.</p>
            </div>
        </div>
        <!-- Offcanvas Menu End -->

        <!-- Header Section Begin -->
        <jsp:include page="header.jsp"></jsp:include>
            <!-- Header Section End -->

            <!-- Breadcrumb Section Begin -->
            <section class="breadcrumb-option">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="breadcrumb__text">
                                <h4>Shop</h4>
                                <div class="breadcrumb__links">
                                    <a href="./index.html">Home</a>
                                    <span>Shop</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- Breadcrumb Section End -->

            <!-- Shop Section Begin -->
            <section class="shop spad">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3">
                            <div class="shop__sidebar">
                                <div class="shop__sidebar__search">
                                    <form action="search-product-by-name" method="get">
                                        <input type="text" placeholder="Search by name..." name="name">
                                        <button type="submit"><span class="icon_search"></span></button>
                                    </form>
                                </div>
                                <div class="shop__sidebar__accordion">
                                    <div class="accordion" id="accordionExample">
                                        <div class="card">
                                            <div class="card-heading">
                                                <a data-toggle="collapse" data-target="#collapseOne">Categories</a>
                                            </div>
                                            <div id="collapseOne" class="collapse show" data-parent="#accordionExample">
                                                <div class="card-body">
                                                    <div class="shop__sidebar__categories">
                                                        <ul class="nice-scroll">
                                                            <li><a href="search-product-by-category?id=${-1}">Men</a></li>
                                                        <li><a href="search-product-by-category?id=${-2}">Women</a></li>
                                                        <li><a href="search-product-by-category?id=${1}">Bags for male</a></li>
                                                        <li><a href="search-product-by-category?id=${2}">Bags for female</a></li>
                                                        <li><a href="search-product-by-category?id=${5}">Shoes for male</a></li>
                                                        <li><a href="search-product-by-category?id=${6}">Shoes for female</a></li>
                                                        <li><a href="search-product-by-category?id=${7}">Shirts for male</a></li>
                                                        <li><a href="search-product-by-category?id=${8}">Shirts for female</a></li>
                                                        <li><a href="search-product-by-category?id=${3}">Dresses for female</a></li>
                                                        <li><a href="search-product-by-category?id=${4}">Pants for male</a></li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card">
                                        <div class="card-heading">
                                            <a data-toggle="collapse" data-target="#collapseThree">Filter Price</a>
                                        </div>
                                        <div id="collapseThree" class="collapse show" data-parent="#accordionExample">
                                            <div class="card-body">
                                                <div class="shop__sidebar__price">
                                                    <ul>
                                                        <li><a href="search-product-by-price?from=${100000}&to=${200000}">100 000 VND - 200 000 VND</a></li>
                                                        <li><a href="search-product-by-price?from=${200000}&to=${300000}">200 000 VND - 300 000 VND</a></li>
                                                        <li><a href="search-product-by-price?from=${300000}&to=${400000}">300 000 VND - 400 000 VND</a></li>
                                                        <li><a href="search-product-by-price?from=${400000}&to=${500000}">400 000 VND - 500 000 VND</a></li>
                                                        <li><a href="search-product-by-price?from=${500000}&to=${-1}">500 000 VND+</a></li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card">
                                        <div class="card-heading">
                                            <a data-toggle="collapse" data-target="#collapseFour">Size</a>
                                        </div>
                                        <div id="collapseFour" class="collapse show" data-parent="#accordionExample">
                                            <div class="card-body">
                                                <div class="shop__sidebar__size">
                                                    <a href="search-product-by-size?size=${'s'}">
                                                        <label for="s">S
                                                        </label>
                                                    </a>
                                                    <a href="search-product-by-size?size=${'m'}">
                                                        <label for="m">M
                                                        </label>
                                                    </a>
                                                    <a href="search-product-by-size?size=${'xl'}">
                                                        <label for="xl">XL
                                                        </label>
                                                    </a>
                                                    <a href="search-product-by-size?size=${'2xl'}">
                                                        <label for="2xl">2XL
                                                        </label>
                                                    </a>
                                                    <a href="search-product-by-size?size=${'3xl'}">
                                                        <label for="3xl">3XL
                                                        </label>
                                                    </a>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card">
                                        <div class="card-heading">
                                            <a data-toggle="collapse" data-target="#collapseFive">Colors</a>
                                        </div>
                                        <div id="collapseFive" class="collapse show" data-parent="#accordionExample">
                                            <div class="card-body">
                                                <div class="shop__sidebar__color">
                                                    <a href="search-product-by-color?color=${'black'}">
                                                        <label class="c-1" for="sp-1">
                                                        </label>
                                                    </a>
                                                    <a href="search-product-by-color?color=${'blue'}">
                                                        <label class="c-2" for="sp-2">
                                                        </label>
                                                    </a>
                                                    <a href="search-product-by-color?color=${'brown'}">
                                                        <label class="c-3" for="sp-3">
                                                        </label>
                                                    </a>
                                                    <a href="search-product-by-color?color=${'gold'}">
                                                        <label class="c-4" for="sp-4">

                                                        </label>
                                                    </a>
                                                    <a href="search-product-by-color?color=${'gray'}">
                                                        <label class="c-5" for="sp-5">

                                                        </label>
                                                    </a>
                                                    <a href="search-product-by-color?color=${'green'}">
                                                        <label class="c-6" for="sp-6" >

                                                        </label>
                                                    </a>
                                                    <a href="search-product-by-color?color=${'pink'}">
                                                        <label class="c-7" for="sp-7">

                                                        </label>
                                                    </a>
                                                    <a href="search-product-by-color?color=${'purple'}">
                                                        <label class="c-8" for="sp-8">

                                                        </label>
                                                    </a>
                                                    <a href="search-product-by-color?color=${'white'}">
                                                        <label class="c-9" for="sp-9">

                                                        </label>
                                                    </a>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-9">
                        <div class="shop__product__option">
                            <div class="row">
                                <div class="col-lg-6 col-md-6 col-sm-6">
                                    <div class="shop__product__option__left">
                                        <p>Showing <b><%= request.getAttribute("products-size")%></b> results</p>
                                    </div>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6">
                                    <form action="sort-by-price" method="post">
                                        <div class="shop__product__option__right">
                                            <p>Sort by Price:</p>
                                            <select onchange="" name="option">
                                                <option value="1">Low To High</option>
                                                <option value="0">High To Low</option>
                                            </select>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <c:forEach items="${products}" var="c">
                                <div class="col-lg-4 col-md-6 col-sm-6">
                                    <div class="product__item">
                                        <a href="product-details?id=${c.productID}">
                                            <div class="product__item__pic set-bg" data-setbg="${c.imageURL}">
                                            </div>
                                        </a>

                                        <div class="product__item__text">
                                            <h6>${c.productName}</h6>
                                            <a href="add-to-cart?productID=${c.productID}&quantity=${1}" class="add-cart">+ Add To Cart</a>
                                            <div class="rating">
                                                <i class="fa fa-star-o"></i>
                                                <i class="fa fa-star-o"></i>
                                                <i class="fa fa-star-o"></i>
                                                <i class="fa fa-star-o"></i>
                                                <i class="fa fa-star-o"></i>
                                            </div>
                                            <h5>${c.price}</h5>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="product__pagination">
                                    <c:forEach begin="1" end="${pageNumber}" step="1" var="i">
                                        <a class="${i == tag ? 'active' : ''}" href="paging?index=${i}&type=${type}&id=${id}&size=${size}&color=${color}&name=${name}&from=${from}&to=${to}">${i}</a>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Shop Section End -->

        <!-- Footer Section Begin -->
        <jsp:include page="footer.jsp"></jsp:include>
        <!-- Footer Section End -->

        <!-- Search Begin -->
        <div class="search-model">
            <div class="h-100 d-flex align-items-center justify-content-center">
                <div class="search-close-switch">+</div>
                <form class="search-model-form">
                    <input type="text" id="search-input" placeholder="Search here.....">
                </form>
            </div>
        </div>
        <!-- Search End -->

        <!-- Js Plugins -->
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery.nicescroll.min.js"></script>
        <script src="js/jquery.magnific-popup.min.js"></script>
        <script src="js/jquery.countdown.min.js"></script>
        <script src="js/jquery.slicknav.js"></script>
        <script src="js/mixitup.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/main.js"></script>
    </body>

</html>
