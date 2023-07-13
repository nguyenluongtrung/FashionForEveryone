<%-- 
    Document   : manager-menu
    Created on : 4 Mar, 2023, 11:41:16 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <style>
            .demo{ background: #F2F2F2; }
            .form-container{
                background: #ecf0f3;
                font-family: 'Nunito', sans-serif;
                padding: 40px;
                border-radius: 20px;
                box-shadow: 14px 14px 20px #cbced1, -14px -14px 20px white;
            }
            .form-container .form-icon{
                color: #ac40ab;
                font-size: 55px;
                text-align: center;
                line-height: 100px;
                width: 100px;
                height:100px;
                margin: 0 auto 15px;
                border-radius: 50px;
                box-shadow: 7px 7px 10px #cbced1, -7px -7px 10px #fff;
            }
            .form-container .title{
                color: #ac40ab;
                font-size: 25px;
                font-weight: 700;
                text-transform: uppercase;
                letter-spacing: 1px;
                text-align: center;
                margin: 0 0 20px;
            }
            .form-container .form-horizontal .form-group{ margin: 0 0 25px 0; }
            .form-container .form-horizontal .form-group label{
                font-size: 15px;
                font-weight: 600;
                text-transform: uppercase;
            }
            .form-container .form-horizontal .form-control{
                color: #333;
                background: #ecf0f3;
                font-size: 15px;
                height: 50px;
                padding: 20px;
                letter-spacing: 1px;
                border: none;
                border-radius: 50px;
                box-shadow: inset 6px 6px 6px #cbced1, inset -6px -6px 6px #fff;
                display: inline-block;
                transition: all 0.3s ease 0s;
            }
            .form-container .form-horizontal .form-control:focus{
                box-shadow: inset 6px 6px 6px #cbced1, inset -6px -6px 6px #fff;
                outline: none;
            }
            .form-container .form-horizontal .form-control::placeholder{
                color: #808080;
                font-size: 14px;
            }
            .form-container .form-horizontal .btn{
                color: #000;
                background-color: #ac40ab;
                font-size: 15px;
                font-weight: bold;
                text-transform: uppercase;
                width: 100%;
                padding: 12px 15px 11px;
                border-radius: 20px;
                box-shadow: 6px 6px 6px #cbced1, -6px -6px 6px #fff;
                border: none;
                transition: all 0.5s ease 0s;
            }
            .form-container .form-horizontal .btn:hover,
            .form-container .form-horizontal .btn:focus{
                color: #fff;
                letter-spacing: 3px;
                box-shadow: none;
                outline: none;
            }
            .form-container{
                top: 50%;
                left: 50%;
                position: fixed;
                transform: translate(-50%, -50%);
            }
        </style>
    </head>
    <body>
        <div class="form-bg">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-md-offset-4">
                        <div style="width:500px; height:400px" class="form-container">
                            <div class="form-icon"><i class="fa fa-user"></i></div>
                            <h3 class="title">Manager menu</h3>
                            <form class="form-horizontal">  
                                <a href="list-orders" class="btn btn-default">Manage orders</a><br> <br>
                                <a href="list-product" class="btn btn-default">Manage products</a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
