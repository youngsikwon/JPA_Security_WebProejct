<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%@ include file="../layout/header.jsp"%>

<div class="container">
    <button class="btn btn-waring">수정</button>
    <button class="btn btn-danger">삭제</button>
        <div class="form-group">
            <h3>${board.title}</h3>
        </div>
        <div class="form-group">
                <div>${board.content}</div>
        </div>
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
