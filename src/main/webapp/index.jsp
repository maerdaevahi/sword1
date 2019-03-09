<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Signin Template for Bootstrap</title>
    <script src="${pageContext.request.contextPath}/static/jquery.min.js"></script>
	<style type="text/css">
		body {
		  padding-top: 40px;
		  padding-bottom: 40px;
		  background-color: #eee;
		}
		
		.form-signin {
		  max-width: 330px;
		  padding: 15px;
		  margin: 0 auto;
		}
		.form-signin .form-signin-heading,
		.form-signin .checkbox {
		  margin-bottom: 10px;
		}
		.form-signin .checkbox {
		  font-weight: normal;
		}
		.form-signin .form-control {
		  position: relative;
		  height: auto;
		  -webkit-box-sizing: border-box;
		     -moz-box-sizing: border-box;
		          box-sizing: border-box;
		  padding: 10px;
		  font-size: 16px;
		}
		.form-signin .form-control:focus {
		  z-index: 2;
		}
		.form-signin input[type="email"] {
		  margin-bottom: -1px;
		  border-bottom-right-radius: 0;
		  border-bottom-left-radius: 0;
		}
		.form-signin input[type="password"] {
		  margin-bottom: 10px;
		  border-top-left-radius: 0;
		  border-top-right-radius: 0;
		}
	</style>
  </head>
  <body>
  	<script>
  	$(function() {
  		var mode = 0;
  		$('#btn1').click(function() {
	  		$.ajax({
	  			type: 'post',
	  			url: mode == 1 ? '${pageContext.request.contextPath}/user/register' : '${pageContext.request.contextPath}/user/login',
	  			data: $('form').serialize(),
	  			success: function(e) {
	  				if (mode == 0) {
	  					window.location.href = "${pageContext.request.contextPath}/" + e;	  					
	  				} else {
		  				e = eval("(" + e + ")");
	  					alert("恭喜你注册成功，请确认后重新登录");
	  					window.location.href = "${pageContext.request.contextPath}/" + e.data;
	  				}
	  			}
	  		});
  		});
  		$('#btn0').click(function() {
  			++mode;
  			mode %= 2;
  			if (mode == 1)
  				$('#btn1').html('register');
  			else
  				$('#btn1').html('login');
  		});
  		$('#btn0').click();
  		$('#btn0').click();
  	});
  	</script>
    <div class="container">
       <span>${sessionScope.msg}</span>
      <form class="form-signin">
        username:<input type="text" name="username"></input><br/>
        password<input type="password" name="password"></input><br/>
        male<input type="radio" name="sex" value="1"></input>
        female<input type="radio" name="sex" value="0"></input><br/>
        age<input type="text" name="age"></input><br/>
        address<input type="text" name="address"></input><br/>
        title<input type="text" name="title"></input><br/>
        <button id="btn0" type="button">switch</button><br/>
        <button id="btn1" type="button">register</button><br/>
      </form>
    </div>
  </body>
</html>
