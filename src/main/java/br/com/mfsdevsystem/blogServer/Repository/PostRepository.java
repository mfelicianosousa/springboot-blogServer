package br.com.mfsdevsystem.blogServer.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mfsdevsystem.blogServer.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	
	List<Post> findAllByNameContaining(String name);
	
}
