package kr.airi.asher.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() {
        /*
        If multiple tests are performed simultaneously,
        the data remains in the test database, H2,
        which may cause the test to fail at the next test run.
         */
        postsRepository.deleteAll();
    }

    @Test
    public void getAllPostsTest() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder() //Execute insert or update query into table posts
                .title(title)
                .content(content)
                .author("tahun970@airi.kr")
                .build());

        //when
        List<Posts> postsLists = postsRepository.findAll();

        //then
        Posts posts = postsLists.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}
