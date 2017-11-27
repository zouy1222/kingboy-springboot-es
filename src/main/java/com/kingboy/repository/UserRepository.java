package com.kingboy.repository;

import com.kingboy.repository.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/11/27 下午10:10
 * @desc 用户仓库.
 */
public interface UserRepository extends ElasticsearchRepository<User, Long>{

    List<User> findByUsername(String username);

}
