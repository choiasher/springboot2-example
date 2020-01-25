package kr.airi.asher.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// DAO(Data Access Object)
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
