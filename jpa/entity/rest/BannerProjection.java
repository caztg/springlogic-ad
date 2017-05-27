package cn.springlogic.ad.jpa.entity.rest;

import cn.springlogic.ad.jpa.entity.Banner;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fitcooker.app.AppDataPreFixSerializer;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by admin on 2017/5/10.
 */
@Projection(name = "bannerinfo", types = {Banner.class})
public interface BannerProjection {

    int getId();

    String getTitle();

    String getLink();

    @JsonSerialize(using = AppDataPreFixSerializer.class)
    String getImage();

}
