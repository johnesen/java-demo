package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface PostRepository extends JpaRepository<Post, Long>{

    List<Post> findAllByUserOrderByCreatedDataDesc(User user);

    List<Post> findAllByOrderByCreatedDateDesc();

    Optional<Post> findPostByIdAndUsr(Long id, User user);

}
