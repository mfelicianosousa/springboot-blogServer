package br.com.mfsdevsystem.blogServer.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.mfsdevsystem.blogServer.Repository.CommentRepository;
import br.com.mfsdevsystem.blogServer.Repository.PostRepository;
import br.com.mfsdevsystem.blogServer.entity.Comment;
import br.com.mfsdevsystem.blogServer.entity.Post;
import jakarta.persistence.EntityNotFoundException;

@Service
public class CommentServiceImpl implements CommentService {

	private CommentRepository commentRepository;
	private PostRepository postRepository;

	public CommentServiceImpl(CommentRepository commentRepository, PostRepository postRepository) {
		this.commentRepository = commentRepository;
		this.postRepository = postRepository;
	}
	
	public Comment createComment(Long postId, String postedBy, String content) {
		Optional<Post> optionalPost = postRepository.findById(postId);
		if (optionalPost.isPresent()) {
			Comment comment = new Comment();
			comment.setPost(optionalPost.get());
			comment.setContent(content);
			comment.setPostedBy(postedBy);
			comment.setCreatedAt(new Date());
			
			return commentRepository.save(comment);
			
		} else {
			throw new EntityNotFoundException("Post not Found");
		}
	}
	
	public List<Comment> getCommentsByPostId(Long postId){
		return commentRepository.findByPostId(postId);
	}

	
	
	
}
