package com.travelsky.mapper;

import com.travelsky.domain.Notice;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface NoticeMapper extends Mapper<Notice> {

    @Select("select * from notice where id = 1 order by create_time")
    Notice selectNewest();
}
