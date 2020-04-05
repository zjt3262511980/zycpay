package com.service;

import java.util.List;

import com.domian.Menu;



public interface MenuService {
 public List<Menu> findMenusByPid(Integer pid);
}
