package br.com.mfsdevsystem.blogServer.Service;

import java.util.List;

import br.com.mfsdevsystem.blogServer.entity.Post;

public interface PostService {

	Post savePost(Post post);
	List<Post> getAllPosts();
	Post getPostById(Long postId);
	void likePost(Long postId);
	List<Post> searchByName(String name);
}
