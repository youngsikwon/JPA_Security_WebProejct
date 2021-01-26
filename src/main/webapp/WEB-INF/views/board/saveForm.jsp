<%@ page language="java" contentType="text/html; charset-utf-8" pageEncoding="utf-8" %>


<%@ include file="../layout/header.jsp"%>

<div class="container">
    <form>
        <div class="form-group">
            <label for="title">Titme</label>
            <input type="text"  class="form-control " placeholder="ENTER title" id="title">
        </div>
        <div class="form-group">
            <label for="content">Content</label>
            <textarea class="form-control summernote" rows="5" id="content"></textarea>
        </div>
    </form>
    <button id="btn-save" class="btn btn-primary">등록</button>
</div>

<script>
    $('.summernote').summernote({
        tabsize: 2,
        height: 300
    });
</script>
<script src="/js/user/board.js"></script>
<%@ include file="../layout/footer.jsp"%>
<br/>
