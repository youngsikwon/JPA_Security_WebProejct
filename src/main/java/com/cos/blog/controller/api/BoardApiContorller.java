package com.cos.blog.controller.api;


import com.cos.blog.config.auth.PrincipalDetail;
import com.cos.blog.dto.ResponseDto;
import com.cos.blog.model.Board;
import com.cos.blog.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardApiContorller {

    @Autowired
    private BoardService boardService;

    @GetMapping("/api/board")
    public ResponseDto<Integer> save(@RequestBody Board board,
                                     @AuthenticationPrincipal PrincipalDetail principal){
        boardService.saveForm(board, principal.getUser());
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }
}
