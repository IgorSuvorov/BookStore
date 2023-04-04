package com.example.bookstore.repository;
import com.example.bookstore.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Igor Suvorov
 */
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
