package br.com.mfsdevsystem.blogServer.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mfsdevsystem.blogServer.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {

	List<Comment> findByPostId(Long postId);
	
}
