package com.cos.blog.controller;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
//인증이 안된 사용자들이 출입할 수있는 경로를 /auth.**허용

@Controller
public class UserController {

	@GetMapping("/auth/joinForm")
	public String JoinForm(){
		return "user/joinForm";
	}

	@GetMapping("/auth/loginForm")
	public String loginForm(){
		return "user/loginForm";
	}

	@GetMapping("/auth/kakao/callback")
	public @ResponseBody String kakaoCallback(String code){ // Data를 리턴해주는 컨트롤러 함수

		//POST방식으로 key=value 데이터를 요청
		//라이브러리
		// 1. Retorofit2
		//  2. OkHttp
		//  3. RestTemplate
		//

		// HttpHeader 오브젝트 생성
		RestTemplate rt = new RestTemplate();

		// HttpHeader 오브젝트 생성
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");


		//HttpHeader 오브젝트 생성
		MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
		params.add("grant_type", "authorization_code");
		params.add("client_id","acaef6f67866b0652e0210a865e4c326f");
		params.add("redirect_uri","http://localhost:8000/auth/kakao/callback");
		params.add("Content-type","authorization_code");
		params.add("code", code);

		//HttpHader와 HpptBody를 하나의 오브젝트로 담기
		HttpEntity<MultiValueMap<String, String>> kakaoTokenRequest  =
				new HttpEntity<>(params, headers);

		// Http 요청하기 - Post방식으로 - 그리고 response 변수의 응답 받음.
		ResponseEntity<String> response = rt.exchange(
				"https://kauth.kakao.com/oauth/token",
				HttpMethod.POST,
				kakaoTokenRequest,
				String.class
		);




		return "Kakao Succeess" + response;



	}

	@GetMapping("/user/updateForm")
	public String updateForm(){
		return "user/updateForm";
	}
}

// MIME : appliation/x-www-form-urlencoded;charset=UTF-8(key-value)
//https://kauth.kakao.com/oauth/token
// client : caef6f67866b0652e0210a865e4c326f
//redirect_uri=http://localhost:8000/auth/kakao/callback