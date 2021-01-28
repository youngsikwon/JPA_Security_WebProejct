package com.cos.blog.controller.api;

import com.cos.blog.config.auth.PrincipalDetail;
import com.cos.blog.dto.ResponseDto;
import com.cos.blog.model.User;
import com.cos.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserApiController {

	@Autowired
	private UserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;



	@PostMapping("/auth/joinProc")
	public ResponseDto<Integer> save(@RequestBody User user) { // username, password, email
		System.out.println("UserApiController : save 호출됨");
		userService.회원가입(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1); // 자바오브젝트를 JSON으로 변환해서 리턴 (Jackson)
	}

	@PutMapping("/user")
	public ResponseDto<Integer> update(@RequestBody User user,
									   @AuthenticationPrincipal PrincipalDetail principal,
									   HttpSession session){
		userService.회원수정(user);
		// 여기서는 트랜잭션이 종료되기 떄문에 DB에 값은 변경이 됐음.
		//하지만 세션값은 변경되지 않은 상태이기 떄문에 직접 세션 값을 변경 해야함.
		Authentication authentication =
				new UsernamePasswordAuthenticationToken(principal, null, principal.getAuthorities());
		 SecurityContext securityContext = SecurityContextHolder.getContext();
		 SecurityContextHolder.getContext().setAuthentication(authentication);
		 session.setAttribute("SPRING_SECURITY_CONETXT", securityContext);

		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
	}


}
