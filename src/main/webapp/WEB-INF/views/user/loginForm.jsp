<%@ page language="java" contentType="text/html; charset-utf-8" pageEncoding="utf-8" %>


<%@ include file="../layout/header.jsp"%>

<div class="container">
    <form action="#" method="post">
        <div class="form-group">
            <label for="username">username</label>
            <input type="username" name="username" class="form-control" placeholder="ENTER username" id="username">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" name="password" class="form-control" placeholder="Enter password" id="password">
        </div>

        <div class="form-group from-check">
            <label class="from-check-label">
                <input class="form-check-input" name="remember" type="checkbox">
            </label>

        </div>

        <button id="btn-login" class="btn btn-primary">로그인</button>
    </form>


</div>
<%@ include file="../layout/footer.jsp"%>
<br/>
