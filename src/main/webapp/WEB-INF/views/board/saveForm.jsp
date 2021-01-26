<%@ page language="java" contentType="text/html; charset-utf-8" pageEncoding="utf-8" %>


<%@ include file="../layout/header.jsp"%>

<div class="container">
    <form>
        <div class="form-group">
            <label for="title">titile</label>
            <input type="text"  class="form-control" placeholder="ENTER title" id="username">
        </div>
        <div class="form-group">
            <label for="content">content</label>
            <textarea class="form-control" rows="5" id="content"></textarea>
        </div>


        <button id="btn-save" class="btn btn-primary">등록</button>
    </form>
</div>

<%@ include file="../layout/footer.jsp"%>
<br/>
