package com.cos.blog.service;


import com.cos.blog.model.Board;
import com.cos.blog.model.User;
import com.cos.blog.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BoardService {


    @Autowired
    BoardRepository boardRepository;


    @Transactional
    public void saveForm(Board board, User user) {
        board.setCount(0);
        board.setUser(user);
        boardRepository.save(board);
}

    public Page<Board> boardList(Pageable pageable){
        return boardRepository.findAll(pageable);
    }



}
//    @Transactional(readOnly = true) // select할 떄 트랜잭션 시작, 해당 서비스 종료시에 트랜잭션 종료(정합성)
//    public User login(User user){
//        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
//}
