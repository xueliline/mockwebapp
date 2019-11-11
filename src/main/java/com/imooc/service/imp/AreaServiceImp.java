package com.imooc.service.imp;

import com.imooc.dao.AreaDao;
import com.imooc.entity.Area;
import com.imooc.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaServiceImp implements AreaService {
    @Autowired
private AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
