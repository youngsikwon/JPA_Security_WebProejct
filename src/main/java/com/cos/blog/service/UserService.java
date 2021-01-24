package com.cos.blog.service;


import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//spring이 컴포넌트 스캔을 통해서 bean에 등록 해줌 IoC를 해준다
@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    @Transactional
    public void join(User user) {
    userRepository.save(user);
}


}
//    @Transactional(readOnly = true) // select할 떄 트랜잭션 시작, 해당 서비스 종료시에 트랜잭션 종료(정합성)
//    public User login(User user){
//        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
//}
