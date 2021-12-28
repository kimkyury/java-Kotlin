package com.kgyury.practice.springboot.domain.posts;

import com.kgyury.practice.springboot.domain.posts.Posts;
import com.kgyury.practice.springboot.domain.posts.PostsRepository;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterEach; // 1, Junit5를 위해 org.junit.After로부터 대체
import org.junit.jupiter.api.Test;  // 1. Junit5을 위해 org.junit.Test로부터 대체
import org.junit.jupiter.api.extension.ExtendWith; // 1. Junit5를 위해 runner.RunWith로부터 대체
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension; // 1. junit5를 위해 junit4.SpringRunner로부터 대체
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @AfterEach
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("mandarining0918@gmail.com")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}
