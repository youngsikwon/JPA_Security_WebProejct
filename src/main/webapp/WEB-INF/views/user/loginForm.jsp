<%@ page language="java" contentType="text/html; charset-utf-8" pageEncoding="utf-8" %>


<%@ include file="../layout/header.jsp"%>

<div class="container">
    <form>
        <div class="form-group">
            <label for="email">username</label>
            <input type="username" class="form-control" placeholder="ENTER username" id="username">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" placeholder="Enter password" id="password">
        </div>
    </form>
    <button id="btn-login" class="btn btn-primary">로그인</button>

</div>
<script src="/blog/js/user/user.js"></script>
<%@ include file="../layout/footer.jsp"%>
<br/>
