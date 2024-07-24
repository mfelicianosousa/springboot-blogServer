package br.com.mfsdevsystem.blogServer.Service;

import java.util.List;

import br.com.mfsdevsystem.blogServer.entity.Comment;

public interface CommentService {
	
	Comment createComment(Long postId, String postedBy, String content);
	List<Comment> getCommentsByPostId(Long postId);
	
}
