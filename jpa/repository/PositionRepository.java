package cn.springlogic.ad.jpa.repository;

import cn.springlogic.ad.jpa.entity.Position;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by admin on 2017/4/15.
 */
@Configuration
@RepositoryRestResource(path="ad:position")
public interface PositionRepository extends JpaRepository<Position,Integer>{


}
