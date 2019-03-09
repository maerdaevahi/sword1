<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap 实例</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 	<link href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <div class="jumbotron">
    <h1>我的第一个 Bootstrap 页面</h1>
    <p>重置窗口大小，查看响应式效果！</p> 
  </div>
  <div class="row">
    <div class="col-sm-4">
      <h3>第一列</h3>
      <p>学的不仅是技术，更是梦想！</p>
      <p>再牛逼的梦想,也抵不住你傻逼似的坚持！</p>
    </div>
    <div class="col-sm-4">
      <h3>第二列</h3>
      <p>学的不仅是技术，更是梦想！</p>
      <p>再牛逼的梦想,也抵不住你傻逼似的坚持！</p>
    </div>
    <div class="col-sm-4">
      <h3>第三列</h3>        
      <p>学的不仅是技术，更是梦想！</p>
      <p>再牛逼的梦想,也抵不住你傻逼似的坚持！</p>
    </div>
  </div>
  <div class="table-responsive">          
 <table class="table table-striped table-bordered">
   <thead>
     <tr>
       <th>#</th>
       <th>Name</th>
       <th>Street</th>
     </tr>
   </thead>
   <tbody>
     <tr>
       <td>1</td>
       <td>Anna Awesome</td>
       <td>Broome Street</td>
     </tr>
     <tr>
       <td>2</td>
       <td>Debbie Dallas</td>
       <td>Houston Street</td>
     </tr>
     <tr>
       <td>3</td>
       <td>John Doe</td>
       <td>Madison Street</td>
     </tr>
   </tbody>
 </table>
</div>
  
</div>
</body>
</html>
