package cn.springlogic.ad.jpa.repository;

import cn.springlogic.ad.jpa.entity.Banner;
import cn.springlogic.ad.jpa.entity.rest.BannerProjection;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by admin on 2017/4/15.
 */
@Configuration
@RepositoryRestResource(path="ad:banner")
public interface BannerRepository extends JpaRepository<Banner,Integer> {

    /**
     * 根据标题,状态模糊查询,创建时间降序排
     */
     //findByphoneContainsAndNickNameContainsAndEmailContains
     public Page<Banner> findAll(Pageable pageable);


}
