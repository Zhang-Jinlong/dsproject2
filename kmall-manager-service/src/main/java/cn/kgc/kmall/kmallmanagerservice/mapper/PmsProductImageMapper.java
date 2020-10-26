package cn.kgc.kmall.kmallmanagerservice.mapper;

import cn.kgc.kmall.bean.PmsProductImage;
import cn.kgc.kmall.bean.PmsProductImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductImageMapper {
    int countByExample(PmsProductImageExample example);

    int deleteByExample(PmsProductImageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductImage record);

    int insertSelective(PmsProductImage record);

    List<PmsProductImage> selectByExample(PmsProductImageExample example);

    PmsProductImage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductImage record, @Param("example") PmsProductImageExample example);

    int updateByExample(@Param("record") PmsProductImage record, @Param("example") PmsProductImageExample example);

    int updateByPrimaryKeySelective(PmsProductImage record);

    int updateByPrimaryKey(PmsProductImage record);

    int insertBatch(@Param("spuId") Long spuId, @Param("spuImageList") List<PmsProductImage> spuImageList);
}