<%@ page language="java" contentType="text/html; charset-utf-8" pageEncoding="utf-8" %>


<%@ include file="../layout/header.jsp"%>

<div class="container">
    <form action="/action_page.php">
        <div class="form-group">
            <label for="email">username</label>
            <input type="username" class="form-control" placeholder="ENTER username" id="username">
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" class="form-control" placeholder="Enter email" id="email">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" placeholder="Enter password" id="password">
        </div>
        <button type="submit" class="btn btn-primary">로그인</button>
    </form>

</div>

<%@ include file="../layout/footer.jsp"%>
<br/>
